package com.example.myapplication.Practice

fun main()
{
    val ans:String?= readLine()  // elvis operator ?
    println(ans)
    val age :Int? = ans?.toIntOrNull()  // safe call operator ?.
    if(age!=null)
        println(age)
    else
        println("Invalid")


//    try {
//        val age :Int? = ans?.toInt()
//        if(age!=null)
//            println(age)
//        else
//            println("Invalid")
//    }
//    catch (e:NumberFormatException)
//    {
//        println("C. Invalid")
//    }

}