package com.example.myapplication.Practice
import kotlin.properties.Delegates

// delegation means to distribute task
// delegation involves implementing class by delegating functionalities to other object

interface Sound {
    fun makeSound()
}

class DogSound : Sound {
    override fun makeSound() {
        println("Woof woof!")
    }
}

class CatSound(sound: Sound) : Sound by sound

class Example {
    var value: String by Delegates.observable("Initial Value") { _, old, new ->
        println("Value changed from $old to $new")
    }
}

fun main() {
    val dog = DogSound()
    val cat = CatSound(dog)

    cat.makeSound() // Output: Woof woof!

    val example = Example()
    example.value = "New Value" // Output: Value changed from Initial Value to New Value

}
