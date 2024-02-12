package com.example.myapplication.Practice


// denoted by the operator fun invoke() declaration inside a class.
class Multiplier(private val factor: Int) {
    operator fun invoke(number: Int): Int {
        return number * factor
    }
}

fun main() {
    val multiplyBy2 = Multiplier(2)

    // Using the object as a function
    val result = multiplyBy2(5) // Equivalent to: multiplyBy2.invoke(5)
    println(result) // Output: 10
}
