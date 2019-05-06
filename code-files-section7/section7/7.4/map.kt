package com.google.kotlin.section7

fun main(args: Array<String>) {

    // WAP to find out the square of all numbers

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val mySquaredNums = myNumbers.map { it * it }   // OR { num -> num * num }
    for (x in mySquaredNums) {
        println(x)
    }

    println()

    // WAP to find out the square of all numbers that are smaller than 10

    val mySmallSquaredNums = myNumbers.filter { it < 10 }
                                        .map { it * it }
    for (num in mySmallSquaredNums) {
        println(num)
    }
}