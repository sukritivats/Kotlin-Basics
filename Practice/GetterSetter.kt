package com.example.myapplication.Practice

class GetterSetter {
    var length:Int=1
    var width:Int=10
    var height:Int=100

    // getters
    // visibility of getters will be as of assigned properties
    // here getter will be public as properties defined above is public
    val volume
        get()=length*width*height

    // setters can't be of val type
    var name:String ="sukku"
        set(value){
            if(value.length<=3)
                println("Invalid")
            else
                field=value
        }

    fun open(){
        println("opened")
    }
    fun close(){
        println("closed")
    }

}
fun main()
{
    var obj = GetterSetter()
    println("${obj.length} is length")
    println("${obj.width} is width")
    println("${obj.height} is height")
    println("${obj.volume} is volume")
 //   println("${obj.name} is name")

    obj.name="Suk"
    println("${obj.name} is name")


    obj.open()
    obj.close()

}