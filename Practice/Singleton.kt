package com.example.myapplication.Practice

// ensures that a class has only one instance and provides a global point of access to that instance
// we don't need to create object

// object keyword is used before class declaration
object Singleton {
    // Properties and methods of the singleton go here
    var data: String = "Initial data"

    fun printData() {
        println("Data: $data")
    }
}

fun main() {
    // Accessing the singleton instance
    Singleton.printData() // Output: Data: Initial data

    // Modifying data through the singleton instance
    Singleton.data = "Modified data"
    Singleton.printData() // Output: Data: Modified data
}
