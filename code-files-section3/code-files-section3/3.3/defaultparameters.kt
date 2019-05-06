package com.google.kotlin.section3

fun main(args: Array<String>) {

    // WAP to find volume of cuboid ( length * breadth * height )
    val result = findVolume(30, 10, 100)
    println("The volume is $result")
}

fun findVolume(length: Int, breadth: Int, height: Int = 5): Int {

    return length * breadth * height
}