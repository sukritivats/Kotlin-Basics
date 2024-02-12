package com.example.myapplication.Practice


// allows you to define methods and properties
// that can be accessed directly on the class itself, similar to static members
class CompanionObjectMyClass {
    companion object {
        fun create(): MyClass {
            return MyClass()
        }

        val PI = 3.14
    }
}

fun main() {
    val obj = CompanionObjectMyClass.create() // Using a factory method
    println(CompanionObjectMyClass.PI) // Accessing a constant
}
