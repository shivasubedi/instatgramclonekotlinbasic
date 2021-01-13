package com.instagram.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.instagram.R
import com.instagram.models.PostModel
import de.hdodenhof.circleimageview.CircleImageView

class PostAdapter(private val list: List<PostModel>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.insta_post_card, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = list[position]
        holder.tvUsername.text = post.postBy
        holder.tvCaption.text = post.caption
        holder.imgProfilePicPost.setImageResource(post.authorPic)
        holder.imgPost.setImageResource(post.post)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgProfilePicPost: CircleImageView
        var imgPost: ImageView
        var tvUsername: TextView
        var tvCaption: TextView

        init {
            imgProfilePicPost = itemView.findViewById(R.id.imgProfilePicPost)
            imgPost = itemView.findViewById(R.id.imgPost)
            tvCaption = itemView.findViewById(R.id.tvCaption)
            tvUsername = itemView.findViewById(R.id.tvUsername)
        }
    }
}