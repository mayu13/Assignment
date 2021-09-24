package com.example.myassignment.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.myassignment.interfaces.Coordinator

class ScorePageCoordinator(private val context: Context) : Coordinator {
    override fun start() {
        val intent = Intent(context, ScorePageActivity::class.java)
        (context as AppCompatActivity).startActivityForResult(intent, 0)
    }
}