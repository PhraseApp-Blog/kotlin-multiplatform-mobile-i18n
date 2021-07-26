package com.example.pl.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pl.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
        val tx = Greeting().getMyString().toString(context = this)


        val translation: TextView = findViewById(R.id.translation)
        translation.text = tx
    }
}
