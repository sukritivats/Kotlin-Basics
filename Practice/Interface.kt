package com.example.myapplication.Practice


// interface is used to implement abstraction and polymorphism
// allow us to define common behaviour that can be shared among multiple classes
// interfaces declare only abstract methods, properties
interface MyInterface {
    fun myFunction()
    val property: Int
}

class MyClass : MyInterface {
    override fun myFunction() {
        // Implementation goes here
    }

    override val property: Int = 42 // Implementing the property
}


fun main() {
    val obj: MyInterface = MyClass()
    obj.myFunction() // Calls the implementation in MyClass
    println(obj.property) // Accesses the property implemented in MyClass
}
