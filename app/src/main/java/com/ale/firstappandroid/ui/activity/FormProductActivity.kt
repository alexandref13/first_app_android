package com.ale.firstappandroid.ui.activity

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.ale.firstappandroid.R

class FormProductActivity : AppCompatActivity(R.layout.form_product) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nameController = findViewById<EditText>(R.id.name_form)
        val name = nameController.text.toString()

    }
}

