package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val image: ImageView = findViewById(R.id.imageView)
        val diceImage = when(diceValue){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(diceImage)
        image.contentDescription = diceValue.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..6).random()
    }
}