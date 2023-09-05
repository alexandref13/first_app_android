package com.ale.firstappandroid.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ale.firstappandroid.R
import com.ale.firstappandroid.model.Product

class FetchProductsAdapter(
    private val context: Context,
    private val products: List<Product>
) : RecyclerView.Adapter<FetchProductsAdapter.ViewHolder>() {

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {

        fun create(product: Product){
            val name = itemView.findViewById<TextView>(R.id.name)
            name.text = product.name

            val description = itemView.findViewById<TextView>(R.id.description)
            description.text = product.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.product_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]

        holder.create(product)
    }

    override fun getItemCount(): Int {
        return products.size
    }

}
