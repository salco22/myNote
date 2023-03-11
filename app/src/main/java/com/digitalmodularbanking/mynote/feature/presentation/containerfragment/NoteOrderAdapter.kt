package com.digitalmodularbanking.mynote.feature.presentation.containerfragment

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalmodularbanking.mynote.databinding.OrderItemBinding

class NoteOrderAdapter(private val listener: OrderAdapterListener) : RecyclerView.Adapter<NoteOrderAdapter.ViewHolder>() {

    private val elementList = arrayListOf<OrderElement>()

    inner class ViewHolder(private val binding: OrderItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(element: OrderElement){
            with(binding.order){

                text = element.text

                setOnClickListener {
                    listener.order(1)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = OrderItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(elementList[position])
    }

    override fun getItemCount(): Int = elementList.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateElement(newElements: ArrayList<OrderElement>){

        elementList.clear()
        elementList.addAll(newElements)
        notifyDataSetChanged()
    }
}

data class OrderElement(
    val text: String
)

interface OrderAdapterListener{
    fun order(id: Int)
}