package com.vmh.a7minworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vmh.a7minworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarExercise)

        if(supportActionBar!= null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding.toolbarExercise.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}