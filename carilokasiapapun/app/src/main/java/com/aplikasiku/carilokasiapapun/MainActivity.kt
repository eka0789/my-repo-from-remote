package com.aplikasiku.carilokasiapapun

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    
    lateinit var mButtonMap :Button
    lateinit var mEdtSearch :EditText
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mButtonMap = findViewById(R.id.mapBtn)
        mEdtSearch = findViewById(R.id.lokasiEdt)
        
        mButtonMap.setOnClickListener { 
            val mUriIntent= Uri.parse("geo:0,0?q=${mEdtSearch.text.toString()}")
            val mMapIntent= Intent(Intent.ACTION_VIEW,mUriIntent)
            mMapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mMapIntent)
        }
    }
}

