package com.example.comp3074_lab2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // tracking the current input of the value that is displayed on the screen
    private var count = 0
    //
    private var step = 1 // adds by 1 so it can go 2 4 6 8 etc.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.calculatorCount)
        val btnMinus = findViewById<Button>(R.id.buttonMinus)
        val btnPlus = findViewById<Button>(R.id.buttonPlus)
        val btnReset = findViewById<Button>(R.id.buttonReset)
        val btnStep = findViewById<Button>(R.id.buttonStep)
        // updates the textview for the screen to show the current count value
        fun updateDisplay() {
            tvCount.text = count.toString()
        }
// add button: increases the count by 1
        btnPlus.setOnClickListener {
            count += step
            updateDisplay()
        }
        // subtract button: decreases button by 1
        btnMinus.setOnClickListener {
            count -= step
            updateDisplay()
        }
// reset button: puts the counter back to 0
        btnReset.setOnClickListener {
            count = 0
            step = 1
            updateDisplay()
        }
// step button: toggles between 1 and 2 for steps
        btnStep.setOnClickListener {
            step = if (step == 1) 2 else 1
        }
    }
}