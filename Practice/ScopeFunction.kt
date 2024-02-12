package com.example.myapplication.Practice

// scope function is used to do some operations on object within a scope
// reduce boilerplate code

// 5 scope functions: let run apply with also

// let also --> it
// apply run with --> this

// context object are the objects on which scope functions operate
// it and this are keyword which is used to access the context object and operate the scope functions

// apply also --> return context object
// let run with --> return lambda result

// let --> perform operations on non null object
// run --> perform operations on an object and return a result within a specific scope
// apply --> used to alter the properties of context object, it returns the modified object
// also --> unlike apply it returns the original context object
// with --> with(object)

data class ScopeFunctionPerson(var name: String, var age: Int)

fun main() {
    // Run
    val person1 = ScopeFunctionPerson("Alice", 30)
    val resultRun = run {
        person1.name = "Bob"
        person1.age + 5
    }
    println("Run: $person1, Result: $resultRun")

    // With
    val person2 = ScopeFunctionPerson("Charlie", 25)
    val resultWith = with(person2) {
        name = "Dave"
        age + 5
    }
    println("With: $person2, Result: $resultWith")

    // Apply
    val person3 = ScopeFunctionPerson("Eve", 35)
    val resultApply = person3.apply {
        name = "Frank"
        age += 5
    }
    println("Apply: $resultApply")

    // Let
    val person4 = ScopeFunctionPerson("Grace", 40)
    val resultLet = person4.let {
        it.name = "Helen"
        it.age + 5
    }
    println("Let: $person4, Result: $resultLet")

    // Also
    val person5 = ScopeFunctionPerson("Ivy", 45)
    val resultAlso = person5.also {
        it.name = "Jack"
        it.age += 5
    }
    println("Also: $resultAlso")
}
