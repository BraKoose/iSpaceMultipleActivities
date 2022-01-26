package com.koose.ispacemultipleactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.koose.ispacemultipleactivities.activity.secondActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn_5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_5 = findViewById(R.id.button5)
        val img: String = ""
        btn_5.setOnClickListener {
            val intent = Intent(this, secondActivity::class.java)
            intent.putExtra("img", img)
            startActivity(intent)
        }

    }
}