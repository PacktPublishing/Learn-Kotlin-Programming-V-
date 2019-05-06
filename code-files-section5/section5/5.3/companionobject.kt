package com.google.kotlin.section5

fun main(args: Array<String>) {

    println(School.pi)

    println(School.findArea(20, 10))

}

class School {

    companion object {

        val pi = 3.14               // Static variable

        fun findArea(l: Int, b: Int): Int {     // Static function
            return l * b
        }
    }
}


