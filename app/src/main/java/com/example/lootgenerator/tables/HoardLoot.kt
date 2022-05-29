package com.example.lootgenerator.tables

import com.example.dndlootgenerator.data.*
import com.example.dndlootgenerator.functions.diceRoll
import com.example.lootgenerator.data.*

val magicName = mutableListOf<String>()
val magicDescription = mutableListOf<String>()

fun hoardTable(challengeRating: Int) {

    val tableResult = diceRoll(1, 100)
    var magicResult = diceRoll(1, 100)
    var totalResult = ""
    var magicItemResult = ""
    var gemArtComboList = ""
    var numResult = 0
    var numOfRolls = 0

    if (challengeRating in 0..4) {
        copper += (diceRoll(6, 6) * 100)
        silver += (diceRoll(3, 6) * 100)
        gold += (diceRoll(2, 6) * 10)

        when (tableResult) {
            in 1..6 -> null
            in 7..16 -> tenGems += diceRoll(2, 6)
            in 17..26 -> twentyFiveArt += diceRoll(2, 4)
            in 27..36 -> fiftyGems += diceRoll(2, 6)
            in 37..44 -> {
                tenGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 45..52 -> {
                twentyFiveArt += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 53..60 -> {
                fiftyGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 61..65 -> {
                tenGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 66..70 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 71..75 -> {
                fiftyGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 76..78 -> {
                tenGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 79..80 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 81..85 -> {
                fiftyGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 86..92 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 93..97 -> {
                fiftyGems += diceRoll(2, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 98..99 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            else -> {
                fiftyGems += diceRoll(2, 6)
                while (numOfRolls < 1) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
        }
    }

    if (challengeRating in 5..10) {
        copper += (diceRoll(2, 6) * 100)
        silver += (diceRoll(2, 6) * 1000)
        gold += (diceRoll(6, 6) * 100)
        platinum += (diceRoll(3, 6) * 10)

        when (tableResult) {
            in 0..4 -> null
            in 5..10 -> twentyFiveArt += diceRoll(2, 4)
            in 11..16 -> fiftyGems += diceRoll(3, 6)
            in 17..22 -> oneHundredGems += diceRoll(3, 6)
            in 23..28 -> twoFiftyArt += diceRoll(2, 4)
            in 29..32 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 33..36 -> {
                fiftyGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 37..40 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 41..44 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 45..49 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 50..54 -> {
                fiftyGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 55..59 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 60..63 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 64..66 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 67..69 -> {
                fiftyGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 70..72 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 73..74 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 75..76 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 77..78 -> {
                fiftyGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            79 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            80 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 81..84 -> {
                twentyFiveArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 85..88 -> {
                fiftyGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 89..91 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 92..94 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 95..96 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 97..98 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            99 -> {
                oneHundredGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            else -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
        }
    }

    if (challengeRating in 11..16) {
        gold += (diceRoll(4, 6) * 1000)
        platinum += (diceRoll(5, 6) * 100)

        when (tableResult) {
            in 1..3 -> null
            in 4..6 -> twoFiftyArt += diceRoll(2, 4)
            in 7..9 -> sevenFiftyArt += diceRoll(2, 4)
            in 10..12 -> fiveHundredGems += diceRoll(3, 6)
            in 13..15 -> thousandGems += diceRoll(3, 6)
            in 16..19 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 20..23 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 24..26 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 27..29 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListAName(magicResult)?.let { magicName.add(it) }
                    rollListADescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListBName(magicResult)?.let { magicName.add(it) }
                    rollListBDescription(magicResult)?.let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 30..35 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 36..40 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 41..45 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 46..50 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 51..54 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 55..58 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 59..62 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 63..66 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 67..68 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 69..70 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 71..72 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 73..74 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 75..76 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 77..78 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 79..80 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 81..82 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListFName(magicResult).let { magicName.add(it) }
                    rollListFDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
                numOfRolls = 0
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 83..85 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 86..88 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 89..90 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 91..92 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 93..94 -> {
                twoFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 95..96 -> {
                sevenFiftyArt += diceRoll(2, 4)
                while (numOfRolls < 1) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 97..98 -> {
                fiveHundredGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            else -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < 1) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
        }
    }

    if (challengeRating in 17..30) {
        gold += (diceRoll(12, 6) * 1000)
        platinum += (diceRoll(8, 6) * 1000)

        when (tableResult) {
            in 1..2 -> null
            in 3..5 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 8)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 6..8 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 8)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 9..11 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 8)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 12..14 -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 8)) {
                    rollListCName(magicResult).let { magicName.add(it) }
                    rollListCDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 15..22 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 23..30 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 31..38 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 39..46 -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListDName(magicResult).let { magicName.add(it) }
                    rollListDDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 47..52 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 53..58 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 59..63 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 64..68 -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 6)) {
                    rollListEName(magicResult).let { magicName.add(it) }
                    rollListEDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            69 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            70 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            71 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            72 -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListGName(magicResult).let { magicName.add(it) }
                    rollListGDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 73..74 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 75..76 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 77..78 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 79..80 -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListHName(magicResult).let { magicName.add(it) }
                    rollListHDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 81..85 -> {
                thousandGems += diceRoll(3, 6)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 86..90 -> {
                twentyFiveHundredArt += diceRoll(1, 10)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            in 91..95 -> {
                seventyFiveHundredArt += diceRoll(1, 4)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
            else -> {
                fiveThousandGems += diceRoll(1, 8)
                while (numOfRolls < diceRoll(1, 4)) {
                    rollListIName(magicResult).let { magicName.add(it) }
                    rollListIDescription(magicResult).let { magicDescription.add(it) }
                    numOfRolls++
                    magicResult = diceRoll(1, 100)
                }
            }
        }
    }

    while (numResult < magicName.size) {
        magicItemResult += "\nName: ${magicName[numResult]}"
        magicItemResult += "\nDescription: ${magicDescription[numResult]}\n"
        numResult++
    }

    totalResult += magicItemResult
}