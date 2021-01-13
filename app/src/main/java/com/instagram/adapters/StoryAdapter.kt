package com.instagram.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.instagram.R
import com.instagram.models.StoryModel
import de.hdodenhof.circleimageview.CircleImageView

class StoryAdapter(var listStories: List<StoryModel>, var mContext: Context) : RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.insta_story_card, parent, false)
        return StoryViewHolder(view, mContext, listStories)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val story = listStories[position]
        holder.story.setImageResource(story.dailyPhoto)
        holder.name.text = story.name
    }

    override fun getItemCount(): Int {
        return listStories.size
    }

    inner class StoryViewHolder(itemView: View, mContext: Context, list: List<StoryModel>) : RecyclerView.ViewHolder(itemView) {
        var story: CircleImageView
        var name: TextView
        var mContext: Context
        var list: List<StoryModel>

        init {
            story = itemView.findViewById(R.id.imgInstaStory)
            name = itemView.findViewById(R.id.tvStoryBy)
            this.mContext = mContext
            this.list = list
            itemView.setOnClickListener {
                val story = list[adapterPosition]
                Toast.makeText(mContext, "" + story.name, Toast.LENGTH_SHORT).show()
            }
        }
    }
}