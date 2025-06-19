package com.tg.practice

fun getDigitCount(number : Int):Int{

    var count : Int =0
    var num = number // Converting Parameter Number Value Into The Local Variable For Further Modification Because The Variable Type Of Num is Val Which is Constant
    while (num>0)
    {
        /* If We Divide The Number BY 10 Then The Last Index Value Will Get Removed From The Number */
        count++
        num/=10
    }
    return count

}

fun main()
{
    println("Please Enter The Number")
    val num : Int = readln().toInt()  // Reads The Number From User Input
    println("The Length of The Number is ${getDigitCount(num)}")
}