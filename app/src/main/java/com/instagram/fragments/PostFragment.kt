package com.instagram.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.instagram.R
import com.instagram.activities.MainActivity
import com.instagram.adapters.PostAdapter
import com.instagram.adapters.StoryAdapter

class PostFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var rvStories: RecyclerView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_post, container, false)
        recyclerView = view.findViewById(R.id.postRecyclerView)
        rvStories = view.findViewById(R.id.rvStories)
        val postAdapter = PostAdapter(MainActivity.listPosts)
        this.recyclerView?.setAdapter(postAdapter)
        this.recyclerView?.setLayoutManager(LinearLayoutManager(context))
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter = context?.let { StoryAdapter(MainActivity.listStories, it) }
        this.rvStories?.setAdapter(adapter)
        this.rvStories?.setLayoutManager(layoutManager)
        return view
    }
}