package com.example.myapplication.Practice


//we don't need to use open because
// it is obvious that abstract class will surely be inherited to its child class so that
// we can do implementation of abstract function
abstract class AbstractDemo {
    // use abstract keyword to declare abstract class
    // in abstract class one of the function should be abstract
    // if any function in the class is defined as abstract then the class should be abstract
    abstract fun abs()
    // abstract function don't have body
    fun func()
    {
        println("base abstract class")
    }
}

class Child :AbstractDemo()
{
    // in abstract class we declare one abstract function
    // and in base class we have to define that abstract function to be error free
    // or else we have to make that child class as abstract we don't want to define abstract method from base class
    override fun abs() {
        println("abstract fun of child class")
    }
    fun hello11(){
        println("non abstract function of child class ")
    }
}

fun main()
{
    //we can't access abstract class using objects
    // val obj = AbstractDemo() // will give error
    val obj=Child()
    obj.abs()
    obj.func()
    obj.hello11()
}