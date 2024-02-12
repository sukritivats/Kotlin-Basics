package com.example.myapplication.Practice

//Data classes automatically generate equals(), hashCode(), toString(), and copy() methods
// based on the properties declared in the primary constructor.
// This saves developers from writing these methods manually,
// reducing boilerplate code and the risk of errors.


data class Person(val name: String, val age: Int)
// this data class is used to store data only

fun main()
{

    val person1 = Person("Alice", 30)
    val person2 = Person("Alice", 30)
    println(person1 == person2)

    val person3 = Person("Bob", 25)
    println(person3.hashCode())

    val person4 = Person("Charlie", 35)
    println(person4.toString())

    val person5 = Person("David", 40)
    val person6 = person5.copy(age = 45)
    println(person5) // Output: Person(name=David, age=40)
    println(person6)

}
