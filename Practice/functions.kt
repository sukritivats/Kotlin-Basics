package com.example.myapplication.Practice

fun String.addLength(): Int {
    //Extension
    return 10 + length
}
fun addNumber(numberOne: Int, numberTwo: Int): Int = numberOne + numberTwo  //lambda function
infix fun Int.addSum(numberTwo: Int)  = this + numberTwo //infix function
// 3 key points for infix
// infix keyword imp,  used with extension function, pass only single parameter

fun higher(myFunction :  (Int)-> Int){     // higher order function
    println("Inside Higher Order")
    val result = myFunction(10)
    println("Inside Higher Order result $result")
}

fun main() {

    val name: String = "Sukriti"
    println(name.length)
    println(name.addLength())
    println(addNumber(10, 15))

    5.addSum(10).addSum(15)

    val result = 5 addSum 10 addSum 15

    higher {
        println("Call MyFunction $it")
        return@higher it * 2
    }
    solve()
}

tailrec fun rev() { // tail recursive function
    rev()
}

fun solve()
{
    val a: (Int, Int) -> Int = { a, b -> a + b }
    println(a(1, 9))


    fun filterOddNumbers(num: List<Int>, passedFun: (Int) -> Boolean): List<Int> {
        return (num.filter(passedFun))
    }

    val num = listOf(1, 2, 3, 4, 5, 6)
    val result = filterOddNumbers(num) { it % 2 != 0 }
    println(result)

    fun squareOfNumber(num: List<Int>, sq: (Int) -> Int): List<Int> {
        return num.map(sq)
    }

    val list = listOf(1, 2, 3, 4, 5)
    println(squareOfNumber(list) { it * it })
}



