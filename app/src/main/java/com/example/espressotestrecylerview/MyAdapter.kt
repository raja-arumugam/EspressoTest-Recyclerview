package com.example.espressotestrecylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.espressotestrecylerview.databinding.ItemListLayoutBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    var list = listOf<Gadgetlist>()

    class MyViewHolder(val binding: ItemListLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemListLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.tvName.text = list.get(position).productname
        holder.binding.tvAmount.text = "Rs." + list.get(position).amount.toString()
        holder.binding.tvBrand.text = list.get(position).brand
        holder.binding.tvColor.text = list.get(position).color
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(listOf: List<Gadgetlist>) {
        list = listOf
    }


}