package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //object
    var customMenus=CustomMenus()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var showPopup=findViewById<Button>(R.id.button)
        
        showPopup.setOnClickListener {
            customMenus.customMenus(this,it)
        }
    }
}