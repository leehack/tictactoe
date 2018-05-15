package com.leehack.tictactoe

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.leehack.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this)[TicTacToeViewModel::class.java]

        viewModel.message = object : MessageInterface {
            override fun showMessage(s: String) {
                Toast.makeText(this@MainActivity, s, Toast.LENGTH_SHORT).show()
            }

        }
        binding.viewModel = viewModel
    }
}
