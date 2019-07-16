package com.yt.ktdemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews();

    }

    private fun initViews() {
        var btn_scanner = findViewById<Button>(R.id.main_btn_scanner)
    }
}
