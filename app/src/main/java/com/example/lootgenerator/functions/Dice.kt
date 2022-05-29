package com.example.lootgenerator.functions

import kotlin.random.Random

fun diceRoll(numberOfRolls: Int, numberOfSides: Int): Int {
    var rolls = 0
    var total = 0

    while (rolls < numberOfRolls) {
        rolls++
        total += Random.nextInt(1, numberOfSides)
    }
    return total
}