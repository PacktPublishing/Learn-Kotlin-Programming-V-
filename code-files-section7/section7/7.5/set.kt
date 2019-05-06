package com.google.kotlin.section7

fun main(args: Array<String>) {

    // "Set" contains unique elements

    // Immutable Set
    val mySet = setOf<Int>(34, 12, 6, 2, 5, 9, 9, 9, 8)    // Fixed Size,  Immutable. READ Only
    for (num in mySet) {
        println(num)
    }

    // Mutable Set: No Fixed Size, READ and WRITE both
    var myMutableSet: MutableSet<Int> = mutableSetOf<Int>(34, 12, 6, 2, 5, 9, 9, 9, 8)
    myMutableSet.add(90)

    myMutableSet.remove(12)
    for (num in myMutableSet) {
        println(num)
    }

}