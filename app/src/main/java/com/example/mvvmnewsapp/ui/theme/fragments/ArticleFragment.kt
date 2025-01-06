package com.example.mvvmnewsapp.ui.theme.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.compose.material3.Snackbar
import androidx.fragment.app.Fragment
import com.example.mvvmnewsapp.R
import com.example.mvvmnewsapp.databinding.FragmentArticleBinding
import com.example.mvvmnewsapp.models.Article
import com.example.mvvmnewsapp.ui.theme.NewsActivity
import com.example.mvvmnewsapp.ui.theme.NewsViewModel
import com.google.android.material.snackbar.Snackbar

class ArticleFragment : Fragment(R.layout.fragment_article) {

    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: NewsViewModel
    private var article: Article? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            article = it.getSerializable("article") as? Article
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticleBinding.bind(view)

        viewModel=(activity as NewsActivity).viewModel

        article?.let {
            binding.webView.apply {
                webViewClient = WebViewClient()
                loadUrl(it.url ?: "")
            }
        }

        binding.fab.setOnClickListener{
            article?.let {
                viewModel.saveArticle(it)
            }
            com.google.android.material.snackbar.Snackbar.make(view,"Article Saved Successfully", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

