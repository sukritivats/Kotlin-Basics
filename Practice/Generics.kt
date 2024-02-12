package com.example.myapplication.Practice

// Generics enable us  to create classes, interfaces, and functions
// that can work with any type, providing type safety and flexibility in our code.

class Box<T>(var item: T)

fun main() {
    // Create a Box with Int
    val intBox = Box(42)
    val intValue: Int = intBox.item
    println("Int Box contains: $intValue")

    // Create a Box with String
    val strBox = Box("Hello")
    val strValue: String = strBox.item
    println("String Box contains: $strValue")
}
