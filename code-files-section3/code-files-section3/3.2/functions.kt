package com.google.kotlin.section3

fun main(args: Array<String>) {

    // Add two numbers a = 2 and b = 5
    val r1 = add(2, 5)
    println("The result is $r1")


    // Add two numbers x = 10 and y = 30
    val r2 = add(10, 30)
    println("The result is $r2")
}

fun add(p: Int, q: Int): Int {

    return p + q
}
