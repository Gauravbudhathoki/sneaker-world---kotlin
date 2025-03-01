package com.example.sneakerhead.ui.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sneakerhead.R
import com.example.sneakerhead.databinding.ActivitySignupBinding
import com.example.sneakerhead.viewmodel.UserViewModel

class SignupActivity : AppCompatActivity() {

    lateinit var binding: ActivitySignupBinding

    lateinit var userViewModel: UserViewModel


    lateinit var loadingUtils: LoadingUtils






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}