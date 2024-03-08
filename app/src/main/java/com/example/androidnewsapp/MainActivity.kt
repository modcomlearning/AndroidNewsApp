package com.example.androidnewsapp
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Your Code From Here
        val politics = findViewById(R.id.politics) as Button
        politics.setOnClickListener {
            //Implicit Intent
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/news/politics"))
            startActivity(x)
        }//end


        val sports = findViewById(R.id.sports) as Button
        sports.setOnClickListener {
            //Implicit Intent
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/sports"))
            startActivity(x)
        }//end

        //Students TODO
        val business = findViewById(R.id.business) as Button
        business.setOnClickListener {
            //Implicit Intent
            val x = Intent(Intent.ACTION_VIEW, Uri.parse("https://nation.africa/kenya/business"))
            startActivity(x)
        }//end

        val viewform = findViewById(R.id.viewform) as Button
        viewform.setOnClickListener {
            //Explicit Intent
            val explicitIntent = Intent(applicationContext, FormActivity::class.java)
            startActivity(explicitIntent)

        }//end
    }

}

