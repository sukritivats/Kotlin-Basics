package com.example.myapplication.Practice


interface OnClickListener {
    fun onClick()
}
interface Runnable{
    fun run()
}

fun main() {
    // Creating an anonymous object implementing OnClickListener interface
    val listener = object : OnClickListener {
        override fun onClick() {
            println("Button clicked")
        }
    }

    // Using the onClick method of the anonymous object
    listener.onClick() // Output: Button clicked

    // Creating an anonymous subclass of Runnable interface
    val runnable = object : Runnable {
        override fun run() {
            println("Executing runnable...")
        }
    }

    // Using the run method of the anonymous class
    runnable.run() // Output: Executing runnable...
}
