package com.example.myapplication.Practice

class ConstrDemo constructor(private var length:Int,   // primary constructor
                             var width:Int=10,   // we can omit the keyword constructor if we dont want to add any access modifiers
                             var height:Int=100)  // private constructor() then var obj = ConstrDemo() will not be accessible outside this class
{
    // init block is just after primary constructor
    // It is used to write logic of primary constructor
    // we can add as many as init block as per necessity
    init {
       println("Prim constr is called")
        println("$length, $width, $height")
       println("Init block is called")
    }

    // secondary constructor is always defined after init block
    // keyword constructor is important
    // in secondary val or var is not written
    // in secondary constructor we have to call primary constructor using this
    constructor(color:String="Red"): this (0,0,0)
    {
       println("seco constr is callled")
        println("$length, $width, $height")
    }
}
fun main()
{
   var obj1= ConstrDemo(1,2,3);  // only prim and init will be called
   var obj = ConstrDemo(); // prima innit seco all will be called
}

// use only primary