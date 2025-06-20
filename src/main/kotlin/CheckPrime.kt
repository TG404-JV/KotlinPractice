package com.tg.practice

fun isPrime(number : Int ): Boolean
{
    var factorCount = 0;
    for (i in 1..number)
    {
        if (i%2==0)
        {
            factorCount++
        }
    }

    return factorCount == 2
}

fun  main()
{
    println("Enter The Number")
    val GetRes = if (isPrime(readln().toInt())) "Number Is Prime" else "Number Is Not Prime"
    println(GetRes)
}