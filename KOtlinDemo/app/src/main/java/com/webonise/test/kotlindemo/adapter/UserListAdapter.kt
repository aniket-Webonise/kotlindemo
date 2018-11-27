package com.webonise.test.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.webonise.test.kotlindemo.R
import com.webonise.test.kotlindemo.model.UserListData
import kotlinx.android.synthetic.main.layout.view.*


class UserListAdapter (val items : ArrayList<UserListData>, val context: Context,val clickListener: (UserListData) -> Unit) : RecyclerView.Adapter<UserListAdapter.ViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.nameTextView?.text=items.get(position).studentName
        holder?.addressTextView?.text=items.get(position).studentAddressa
        holder?.ageTextView?.text=items.get(position).studentAge
        holder?.itemViewClick?.setOnClickListener { clickListener(items.get(position))}


        }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout, parent, false))
    }




    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val nameTextView=view.nameTextView
        val addressTextView=view.addressTextView
        val ageTextView=view.ageTextView
        val itemViewClick=view.itemViewLayout



    }
}