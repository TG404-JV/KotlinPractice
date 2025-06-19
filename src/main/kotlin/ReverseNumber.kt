package com.tg.practice

// Function to reverse a number
fun getReverseNum(number: Int): Any {
    var n = number       // Store the original number in a variable
    var rev = 0          // This will hold the reversed number, starting from 0

    // Loop runs until n becomes 0
    while (n > 0) {
        rev = rev * 10 + (n % 10) // Take the last digit of n and add it to rev
        n = n / 10                // Remove the last digit from n
    }

    return rev  // Return the reversed number
}

fun main() {
    // Ask the user to enter a number
    println("Enter The Number")

    val num = readln().toInt()            // Read user input and convert it to an integer
    val reverseNum = getReverseNum(num)   // Call the reverse function and store the result
    println("Reverse Number is $reverseNum")  // Print the reversed number
}
