package com.ale.firstappandroid.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ale.firstappandroid.R
import com.ale.firstappandroid.model.Product
import com.ale.firstappandroid.ui.recyclerview.adapter.FetchProductsAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val products = findViewById<RecyclerView>(R.id.listProduct)

        products.adapter = FetchProductsAdapter(
            context = this, products = listOf(
                Product(
                    name = "Teste",
                    description = "Testando"
                ),
                Product(
                    name = "Teste2",
                    description = "Testando2"
                ),
            )
        )
    }
}