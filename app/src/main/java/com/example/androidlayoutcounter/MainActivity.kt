package com.example.androidlayoutcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.androidlayoutcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val counter: Counter = Counter(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //set frontend counter variable
        binding.counter = counter

        binding.toastButton.setOnClickListener{
            Toast.makeText(applicationContext, counter.count.toString(), Toast.LENGTH_SHORT).show()
        }
        binding.countUpButton.setOnClickListener{
            counter.countUp()
            binding.apply{ invalidateAll() }
        }
        binding.countDownButton.setOnClickListener{
            counter.countDown()
            binding.apply{ invalidateAll() }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run{
            putInt(STATE_COUNT, counter.count)
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        savedInstanceState?.run{
            counter.count = getInt(STATE_COUNT)
        }
    }

    companion object{
        val STATE_COUNT = "counterCount"
    }
}