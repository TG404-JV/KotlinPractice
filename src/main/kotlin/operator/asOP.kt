package com.tg.practice.operator

// Create an alias for java.util.ArrayList as FoodList
import java.util.ArrayList as FoodList

fun main() {
    // Kotlin-style list (not using alias)
    val list = arrayListOf<String>("Pizza", "Burger", "Pasta")

    // Java-style list using alias
    val food: FoodList<String> = FoodList()
    food.add("Biryani")
    food.add("Noodles")

    println("Kotlin list: $list")
    println("Java list using alias (FoodList): $food")
}
