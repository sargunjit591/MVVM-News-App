package com.example.mvvmnewsapp.ui.theme.fragments

import android.os.Bundle
import android.view.View
import androidx.compose.material3.Snackbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmnewsapp.R
import com.example.mvvmnewsapp.adapters.NewsAdapter
import com.example.mvvmnewsapp.databinding.FragmentSavedNewsBinding
import com.example.mvvmnewsapp.databinding.FragmentSearchNewsBinding
import com.example.mvvmnewsapp.models.Article
import com.example.mvvmnewsapp.ui.theme.NewsActivity
import com.example.mvvmnewsapp.ui.theme.NewsViewModel

class SavedNewsFragment:Fragment(R.layout.fragment_saved_news) {
    private var _binding: FragmentSavedNewsBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSavedNewsBinding.bind(view)

        viewModel=(activity as NewsActivity).viewModel
        setupRecyclerView()


        newsAdapter.setOnItemClickListner { article ->
            val bundle = Bundle().apply {
                putSerializable("article", article)
            }

            val articleFragment = ArticleFragment()
            articleFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.flFragment, articleFragment)
                .addToBackStack(null)
                .commit()
        }

        val itemTouchHelperCallback=object :ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position=viewHolder.adapterPosition
                val article=newsAdapter.differ.currentList[position]
                viewModel.deleteArticle(article)
                com.google.android.material.snackbar.Snackbar.make(view,"Successfully deleted article!!!", com.google.android.material.snackbar.Snackbar.LENGTH_LONG).apply {
                        setAction("Undo"){
                            viewModel.saveArticle(article)
                        }
                    show()
                }
            }
        }

        ItemTouchHelper(itemTouchHelperCallback).apply {
            attachToRecyclerView(binding.rvSavedNews)
        }

        viewModel.getSavedNews().observe(viewLifecycleOwner, Observer {articles->
            newsAdapter.differ.submitList(articles)
        })
    }
    private fun setupRecyclerView(){
        newsAdapter= NewsAdapter()
        binding.rvSavedNews.apply{
            adapter=newsAdapter
            layoutManager= LinearLayoutManager(activity)
        }
    }
}