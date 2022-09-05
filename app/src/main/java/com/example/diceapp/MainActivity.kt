package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
//            val toast = Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT)
//            toast.show()
        }
    }

    private fun rollDice() {
        val obj = Dice(6)
        val diceValue = obj.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceValue.toString()

    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..6).random()
    }
}