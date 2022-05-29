package com.example.lootgenerator.tables

import com.example.lootgenerator.data.*
import com.example.lootgenerator.functions.diceRoll

fun individualTable(numberOfMonsters: Int, challengeRating: Int) {
    var diceResult = 0

    while (diceResult < numberOfMonsters) {
        val tableResult = diceRoll(1, 100)

        when {
            /**
             * CR 0-4 individual loot table
             */
            tableResult <= 30 && challengeRating in 0..4 ->
                copper += diceRoll(5, 6)
            tableResult in 31..60 && challengeRating in 0..4 ->
                silver += diceRoll(4, 6)
            tableResult in 61..70 && challengeRating in 0..4 ->
                electrum += diceRoll(3, 6)
            tableResult in 71..95 && challengeRating in 0..4 ->
                gold += diceRoll(3, 6)
            tableResult in 95..100 && challengeRating in 0..4 ->
                platinum += diceRoll(1, 6)

            /**
             * Cr 5-10 individual loot table
             */
            tableResult <= 30 && challengeRating in 5..10 -> {
                copper += (diceRoll(4, 6) * 100)
                electrum += (diceRoll(1, 6) * 10)
            }
            tableResult in 31..60 && challengeRating in 5..10 -> {
                silver += (diceRoll(6, 6) * 10)
                gold += (diceRoll(2, 6) * 10)
            }
            tableResult in 61..70 && challengeRating in 5..10 -> {
                electrum += (diceRoll(3, 6) * 10)
                gold += (diceRoll(2, 6) * 10)
            }
            tableResult in 71..95 && challengeRating in 5..10 ->
                gold += (diceRoll(4, 6) * 10)
            tableResult in 96..100 && challengeRating in 5..10 -> {
                gold += (diceRoll(2, 6) * 10)
                platinum += diceRoll(3, 6)
            }

            /**
             * Cr 11-16 individual loot table
             */
            tableResult <= 20 && challengeRating in 11..16 -> {
                silver += (diceRoll(4, 6) * 100)
                gold += (diceRoll(1, 6) * 100)
            }
            tableResult in 21..35 && challengeRating in 11..16 -> {
                electrum += (diceRoll(1, 6) * 100)
                gold += (diceRoll(1, 6) * 100)
            }
            tableResult in 36..75 && challengeRating in 11..16 -> {
                gold += (diceRoll(2, 6) * 100)
                platinum += (diceRoll(1, 6) * 10)
            }
            tableResult in 76..100 && challengeRating in 11..16 -> {
                gold += (diceRoll(2, 6) * 100)
                platinum += (diceRoll(2, 6) * 10)
            }

            /**
             * Cr 17+ individual loot table
             */
            tableResult <= 15 && challengeRating in 17..30 -> {
                electrum += (diceRoll(2, 6) * 1000)
                gold += (diceRoll(8, 6) * 100)
            }
            tableResult in 16..55 && challengeRating in 17..30 -> {
                gold += (diceRoll(1, 6) * 1000)
                platinum += (diceRoll(1, 6) * 100)
            }
            else -> {
                gold += (diceRoll(1, 6) * 1000)
                platinum += (diceRoll(2, 6) * 100)
            }
        }

        diceResult++
    }
}