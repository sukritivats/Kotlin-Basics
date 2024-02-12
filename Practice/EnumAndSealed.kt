package com.example.myapplication.Practice


// Enum classes are set of constants
// These constants are instances of enum class
// this class have their own properties, methods and constructors

enum class Color {
    Red, Blue, Green, Yellow
}

// Sealed classes can have subclasses with properties, methods, and constructors,
// allowing each subclass to encapsulate its own state and behavior.

sealed class Fruits(code : Int)
{
   class Apple(var code:Int)
   class Pine
   class Grapes
}
fun main()
{
    println( ( Fruits.Apple(3) ).code)


    println(Color.Red)
    println(Color.Blue)
    println(Color.Green)
    println(Color.Yellow) // 3 index

    val value = Color.Red
    println(value.ordinal) // 0 index
    println(value.name)

    val ind = Color.values()
    ind.forEach{
        println(it.name)
    }
}
//enum class Direction(val degrees: Int) {
//    NORTH(0) {
//        override fun getInfo(): String {
//            return "Heading North"
//        }
//    },
//    EAST(90) {
//        override fun getInfo(): String {
//            return "Heading East"
//        }
//    },
//    SOUTH(180) {
//        override fun getInfo(): String {
//            return "Heading South"
//        }
//    },
//    WEST(270) {
//        override fun getInfo(): String {
//            return "Heading West"
//        }
//    };
//
//    abstract fun getInfo(): String
//}
