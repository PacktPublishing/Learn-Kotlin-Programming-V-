package com.google.kotlin.section6

fun main(args: Array<String>) {

    var result = 0
    println(result) // 0

    val lambda: ( Int, Int) -> Unit = { x, y -> result = x + y }
    addTwoNum(2, 4, lambda)

    println(result) // 6

}

fun addTwoNum(x: Int, y: Int, myFunc: ( Int, Int) -> Unit) {

    myFunc(x, y)      // result = x + y = 2 + 4 = 6
}