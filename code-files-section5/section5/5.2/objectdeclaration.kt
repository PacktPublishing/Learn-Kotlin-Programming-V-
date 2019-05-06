package com.google.kotlin.section5

fun main(args: Array<String>) {

    val radius = 4
    println(Maths.pi * radius * radius)

    println(Maths.findArea(6, 2))

    println(Maths.findPerimeter(6, 2))

}

open class Trigonometry {

    open fun findPerimeter(l: Int, b: Int): Int {
        return 2 * ( l + b )
    }
}


object Maths: Trigonometry() {

    val pi = 3.14               // Static variable

    fun findArea(l: Int, b: Int): Int {     // Static function
        return l * b
    }

    override fun findPerimeter(l: Int, b: Int): Int {
        println("We are inside Maths object declaration")
        return super.findPerimeter(l, b)
    }
}
