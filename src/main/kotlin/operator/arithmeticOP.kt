package com.tg.practice.operator

import kotlin.math.pow

fun main() {
    // Taking user input
    print("Enter the first number: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Enter the second number: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    println("Choose an operation (+, -, *, /, %, pow, max, min): ")
    val op = readLine()

    when (op) {
        "+" -> {
            println("Using '+' operator: ${num1 + num2}")
            println("Using plus() function: ${num1.plus(num2)}")
        }
        "-" -> {
            println("Using '-' operator: ${num1 - num2}")
            println("Using minus() function: ${num1.minus(num2)}")
        }
        "*" -> {
            println("Using '*' operator: ${num1 * num2}")
            println("Using times() function: ${num1.times(num2)}")
        }
        "/" -> {
            if (num2 != 0) {
                println("Using '/' operator: ${num1 / num2}")
                println("Using div() function: ${num1.div(num2)}")
            } else {
                println("Cannot divide by zero!")
            }
        }
        "%" -> {
            println("Using '%' operator (modulus): ${num1 % num2}")
            println("Using mod() function: ${num1.mod(num2)}")
        }
        "pow" -> {
            println("Using power (num1^num2): ${num1.toDouble().pow(num2.toDouble())}")
        }
        "max" -> {
            println("Maximum of both numbers: ${maxOf(num1, num2)}")
        }
        "min" -> {
            println("Minimum of both numbers: ${minOf(num1, num2)}")
        }
        else -> {
            println("Invalid operator selected.")
        }
    }
}
