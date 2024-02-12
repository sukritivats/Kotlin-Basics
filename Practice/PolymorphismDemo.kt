package com.example.myapplication.Practice


// to implement polymorphism we have to do inheritance
open class A {
    open fun hello()  // this has to be open to override this function
    {
        println("A")
    }

    fun sum(a:Int,b:Int):Int{
        return a+b
    }
}
class B:A(){
     override fun hello()  // use override keyword
     {
         println("B")
         super.hello()
     }

    fun sum(a:Int,b:Int,c:Int):Int{   //function overloading
        return a+b+c
    }
}
fun main()
{
    val obj = B()
    obj.hello()
    val ans=obj.sum(1,2,8)
    println(ans)
}