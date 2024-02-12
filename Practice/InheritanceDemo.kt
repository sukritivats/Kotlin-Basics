package com.example.myapplication.Practice

open class InheritanceDemo (private val price:Int,  // to make this class inheritable we have to use open keyword
                       private val color:String)
{
    fun makeCoffee()
    {
        println("coffee is ready ")
    }
}
class child(private val price:Int, private val color:String):InheritanceDemo(price,color){
    fun baseFun()
    {
        println("in derived class")
        makeCoffee()
    }
}
fun main()
{
    val obj = child(1003,"Brown")
    obj.makeCoffee()
    obj.baseFun()
}