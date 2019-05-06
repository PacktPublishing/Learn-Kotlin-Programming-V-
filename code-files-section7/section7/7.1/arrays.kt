package com.google.kotlin.section7

fun main(args: Array<String>) {

    // Arrays Tutorial

    // Elements:    0   0   54  0   0
    // Index:       0   1   2   3   4

    var numbers = Array<Int>(5) { 0 }   // Fixed Size, Mutable ( READ and WRITE  )

    numbers[2] = 54
    numbers[4] = 31

    for (num in numbers) {
        println(num)
    }

    // OR
    println()

    for (index in 0..numbers.size - 1) {
        println(numbers[index])
    }
}