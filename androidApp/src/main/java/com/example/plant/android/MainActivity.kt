package com.example.plant.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plant.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tx = Greeting().getMyString().toString(context = this)

        val tv: TextView = findViewById(R.id.text_view)
        val translation: TextView = findViewById(R.id.translation)
        translation.text = tx
        tv.text = greet()
    }
}
