package com.google.kotlin.section6

fun main(args: Array<String>) {

    val myLambda: ( Int, Int ) -> Int = { x: Int, y: Int -> x + y }
    addition(2, 5, myLambda)
    addition(2, 5, { x: Int, y: Int -> x + y }) // OR.. same as above
    addition(2, 5) { x: Int, y: Int -> x + y }  // OR.. same as above

    val anotherLambda: ( Int, Int ) -> Unit = { a: Int, b: Int -> println(a + b) }
    add(3, 6, anotherLambda)
    add(3, 6, { a: Int, b: Int -> println(a + b) }) // OR.. same as above
    add(3, 6) { a: Int, b: Int -> println(a + b) }  // OR.. same as above
}

fun addition(a: Int, b: Int, myFunc: ( Int, Int ) -> Int) {

    var sum = myFunc(a, b)        // x + y = a + b
    println(sum)
}

fun add(a: Int, b: Int, myFunc: ( Int, Int ) -> Unit) {
    myFunc(a, b)    // println(a + b) = println( 9 )
}
