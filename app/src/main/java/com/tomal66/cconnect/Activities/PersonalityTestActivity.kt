package com.tomal66.cconnect.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tomal66.cconnect.R

class PersonalityTestActivity : AppCompatActivity() {
    private lateinit var nextBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personality_test)
        nextBtn = findViewById(R.id.nextBtn)
        nextBtn.setOnClickListener(){
            val intent = Intent(this, InterestsActivity::class.java)
            startActivity(intent)
        }
    }
}