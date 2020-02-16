package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_displaytxt.view.*

class NameageAdapter(val dpnameage: ArrayList<Nameage>): RecyclerView.Adapter<NameageAdapter.NameageHolder>() {

   // we create this inner class to provide Viewholder to our RecyclerView.Adapter
    // for this we create a variable of view type and pass it to RecyclerView.ViewHolder
    class NameageHolder(val view:View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameageHolder {
    /* passing the information of our xml layout file so that the LayoutInflator pass the
        information from the Arraylist to the Adapter to inflate the view. */
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_displaytxt,parent,false)
        return NameageHolder(view)
    }

    override fun getItemCount(): Int {
        // to get the size of the Arraylist
        return dpnameage.size

    }

    override fun onBindViewHolder(holder: NameageHolder, position: Int) {

        /*passing the information from he Arraylist to our views on a given position*/
        val binding = dpnameage[position]

        holder.view.TV1.text = binding.Name
        holder.view.TV2.text = binding.Age.toString()
    }
}