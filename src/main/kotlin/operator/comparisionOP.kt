package com.tg.practice.operator

/* In Kotlin Comparison Operator Are Same As In Other Programming Languages */
fun main()
{
    println("Enter The First Number")
    val a : Int = readln().toIntOrNull() ?:0

    println("Enter The Second Number")
    val b : Int = readln().toIntOrNull() ?:0

    println(a>b)
    println(a<b)
    println(a>=b)
    println(a<=b)

    println(if (a>10 && b>50)"How Are You" else "Fine")

}