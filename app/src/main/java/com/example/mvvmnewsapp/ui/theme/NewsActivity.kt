package com.example.mvvmnewsapp.ui.theme

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmnewsapp.R
import com.example.mvvmnewsapp.databinding.ActivityNewsBinding
import com.example.mvvmnewsapp.db.ArticleDatabase
import com.example.mvvmnewsapp.repository.NewsRepository
import com.example.mvvmnewsapp.ui.theme.fragments.BreakingNewsFragment
import com.example.mvvmnewsapp.ui.theme.fragments.SavedNewsFragment
import com.example.mvvmnewsapp.ui.theme.fragments.SearchNewsFragment

class NewsActivity : AppCompatActivity() {

    private lateinit var mBinding:ActivityNewsBinding
    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val newsRepository=NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory=NewsViewModelProviderFactory(application,newsRepository)
        viewModel=ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        val firstFragmentView = BreakingNewsFragment()
        val secondFragmentView = SavedNewsFragment()
        val thirdFragmentView = SearchNewsFragment()

        mBinding.bottomNavigationView.setOnNavigationItemSelectedListener{ it: MenuItem ->
            when (it.itemId) {
                R.id.breakingNewsFragment -> setCurrentFragment(firstFragmentView)
                R.id.savedNewsFragment -> setCurrentFragment(secondFragmentView)
                R.id.searchNewsFragment -> setCurrentFragment(thirdFragmentView)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}