package com.example.pl.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import com.example.pl.Resources
import com.example.pl.Text
import com.google.android.material.slider.Slider
import dev.icerock.moko.resources.desc.desc
import org.example.library.MR
import android.media.AudioManager
import android.widget.SeekBar.OnSeekBarChangeListener


class MainActivity : AppCompatActivity() {

    private val name = "John"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = Text()
        val tv: TextView = findViewById(R.id.text_view)
        val tvQuantity: TextView = findViewById(R.id.text_view_quantity)
        val summary: TextView = findViewById(R.id.text_view_plural)
        val seekbar: SeekBar = findViewById(R.id.seekBar)
        seekbar.progress = 0
        val plural = text.getMyPluralFormattedDesc(0).toString(context = this@MainActivity)
        summary.text = plural
        tvQuantity.text = MR.strings.select_quantity.desc().toString(this)
        val imageView: ImageView = findViewById(R.id.image)
        Resources().getImage()?.let {
            imageView.setImageResource(it.drawableResId)
        }
        seekbar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                val plural = text.getMyPluralFormattedDesc(i).toString(context = this@MainActivity)
                summary.text = plural
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        tv.text = Text().getGreetingWithName(name).toString(this)
    }
}