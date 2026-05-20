package com.sinoptik_.feature_home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sinoptik_.core.exam_practice.LogProvider
import com.sinoptik_.core.network.UserRepository
import com.sinoptik_.feature_home.di.exam_practice.FeatureComponentProvider
import javax.inject.Inject

class FeatureActivity : AppCompatActivity() {

    @Inject
    lateinit var logger: LogProvider

    @Inject
    lateinit var userRepo: UserRepository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as FeatureComponentProvider)
            .provideFeatureComponent()
            .inject(this)

        userRepo.getUsers().forEach { user ->
            logger.log(user.name)

        }

        enableEdgeToEdge()
        setContentView(R.layout.activity_feature)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}