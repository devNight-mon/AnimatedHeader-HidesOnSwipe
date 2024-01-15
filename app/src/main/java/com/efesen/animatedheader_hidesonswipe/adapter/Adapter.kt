package com.efesen.animatedheader_hidesonswipe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.efesen.animatedheader_hidesonswipe.R
import com.efesen.animatedheader_hidesonswipe.model.Item
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by Efe Şen on 9.01.2024.
 */
class Adapter(private val items: List<Item>): RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val thumbImageView = itemView.findViewById<ImageView>(R.id.thumb_image)
        val profileImageView = itemView.findViewById<CircleImageView>(R.id.circleImageView)
        val photoDesc = itemView.findViewById<TextView>(R.id.photo_desc)
        val photographerName = itemView.findViewById<TextView>(R.id.photographer_name)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item  = items[position]

        holder.thumbImageView.setImageResource(item.thumb)
        holder.profileImageView.setImageResource(item.profilePhoto)
        holder.photoDesc.text = item.desc
        holder.photographerName.text = item.photographerName
    }
}