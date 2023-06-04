package com.android.multibuildflavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.multibuildflavor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtFlavor.text = BuildConfig.FLAVOR
        binding.txtApplicationId.text = BuildConfig.APPLICATION_ID
        binding.txtVersionName.text = BuildConfig.VERSION_NAME
        binding.txtIsProduction.text = BuildConfig.IS_PRODUCTION.toString()
        binding.txtBaseUrl.text = BuildConfig.BASE_URL

    }
}