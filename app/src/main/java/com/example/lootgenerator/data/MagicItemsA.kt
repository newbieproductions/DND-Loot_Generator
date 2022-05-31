package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListAName(magicRoll: Int): String? {
    var result = when (magicRoll) {
        in 1..50 -> MagicItemsA.magicItems["potion of healing"]?.name.toString()
        in 51..60 -> MagicItemsA.magicItems["cantrip spell scroll"]?.name.toString()
        in 61..70 -> MagicItemsA.magicItems["potion of climbing"]?.name.toString()
        in 71..90 -> MagicItemsA.magicItems["1st level spell scroll"]?.name.toString()
        in 91..94 -> MagicItemsA.magicItems["2nd level spell scroll"]?.name.toString()
        in 95..98 -> MagicItemsA.magicItems["greater potion of healing"]?.name.toString()
        99 -> MagicItemsA.magicItems["bag of holding"]?.name.toString()
        else -> MagicItemsA.magicItems["driftglobe"]?.name.toString()
    }

    return result
}

fun rollListADescription(magicRoll: Int): String? {
    var result = when (magicRoll) {
        in 1..50 -> MagicItemsA.magicItems["potion of healing"]?.description.toString()
        in 51..60 -> MagicItemsA.magicItems["cantrip spell scroll"]?.description.toString()
        in 61..70 -> MagicItemsA.magicItems["potion of climbing"]?.description.toString()
        in 71..90 -> MagicItemsA.magicItems["1st level spell scroll"]?.description.toString()
        in 91..94 -> MagicItemsA.magicItems["2nd level spell scroll"]?.description.toString()
        in 95..98 -> MagicItemsA.magicItems["greater potion of healing"]?.description.toString()
        99 -> MagicItemsA.magicItems["bag of holding"]?.description.toString()
        else -> MagicItemsA.magicItems["driftglobe"]?.description.toString()
    }

    return result
}

object MagicItemsA {
    val magicItems = mapOf<String, MagicItem>(
        "potion of healing" to
                MagicItem(
                    name = "Potion of Healing",
                    description = "\n\tYou regain 2d4+2 hit points when " +
                            "you drink this potion. The potion’s red liquid glimmers when agitated."
                ),
        "cantrip spell scroll" to
                MagicItem(
                    name = "Cantrip Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. If " +
                            "the spell is on your class’s spell list, you can read the scroll and cast its spell " +
                            "without providing any material components. Otherwise, the scroll is unintelligible. " +
                            "Casting the spell by reading the scroll requires the spell’s normal casting time. Once " +
                            "the spell is cast, the words on the scroll fade, and it crumbles to dust. If the " +
                            "casting is interrupted, the scroll is not lost." +
                            "\n\tThis scroll contains a cantrip. The spell's saving throw DC is 13 and attack bonus is +5."
                ),
        "potion of climbing" to
                MagicItem(
                    name = "Potion of Climbing",
                    description = "\n\tWhen you drink this potion, you gain a climbing speed equal to your walking " +
                            "speed for 1 hour. During this time, you have advantage on Strength (Athletics) checks " +
                            "you make to climb. The potion is separated into brown, silver, and gray layers " +
                            "resembling bands of stone. Shaking the bottle fails to mix the colors."
                ),
        "1st level spell scroll" to
                MagicItem(
                    name = "1st Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. " +
                            "If the spell is on your class’s spell list, you can read the scroll and cast its spell " +
                            "without providing any material components. Otherwise, the scroll is unintelligible." +
                            "Casting the spell by reading the scroll requires the spell’s normal casting time. Once " +
                            "the spell is cast, the words on the scroll fade, and it crumbles to dust. If the casting " +
                            "is interrupted, the scroll is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level than you can normally " +
                            "cast, you must make an ability check using your spellcasting ability to determine " +
                            "whether you cast it successfully. The DC equals 11. On a failed check, the spell " +
                            "disappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 1st level spell. The spell's saving throw DC is 13 and attack " +
                            "bonus is +5." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can be " +
                            "copied. When a spell is copied from a spell scroll, the copier must succeed on an " +
                            "Intelligence (Arcana) check with a DC equal to 11. If the check succeeds, the spell " +
                            "is successfully copied. Whether the check succeeds or fails, the spell scroll is destroyed."
                ),
        "2nd level spell scroll" to
                MagicItem(
                    name = "2nd Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. " +
                            "If the spell is on your class’s spell list, you can read the scroll and cast its spell " +
                            "without providing any material components. Otherwise, the scroll is unintelligible. " +
                            "Casting the spell by reading the scroll requires the spell’s normal casting time. Once " +
                            "the spell is cast, the words on the scroll fade, and it crumbles to dust. If the casting " +
                            "is interrupted, the scroll is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level than you can normally " +
                            "cast, you must make an ability check using your spellcasting ability to determine " +
                            "whether you cast it successfully. The DC equals 12. On a failed check, the spell " +
                            "disappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 2nd level spell. The spell's saving throw DC is 13 and attack " +
                            "bonus is +5." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can be " +
                            "copied. When a spell is copied from a spell scroll, the copier must succeed on an " +
                            "Intelligence (Arcana) check with a DC equal to 12. If the check succeeds, the spell is " +
                            "successfully copied. Whether the check succeeds or fails, the spell scroll is destroyed."
                ),
        "greater potion of healing" to
                MagicItem(
                    name = "Greater Potion of Healing",
                    description = "\n\tYou regain 4d4+4 hit points when you " +
                            "drink this potion. The potion's red liquid glimmers when agitated."
                ),
        "bag of holding" to
                MagicItem(
                    name = "Bag of holding",
                    description = "\n\tThis bag has an interior space considerably larger than its outside dimensions, " +
                            "roughly 2 feet in diameter at the mouth and 4 feet deep. The bag can hold up to 500 " +
                            "pounds, not exceeding a volume of 64 cubic feet. The bag weighs 15 pounds, regardless " +
                            "of its contents. Retrieving an item from the bag requires an action." +
                            "\n\tIf the bag is overloaded, pierced, or torn, it ruptures and is destroyed, and its " +
                            "contents are scattered in the Astral Plane. If the bag is turned inside out, its " +
                            "contents spill forth, unharmed, but the bag must be put right before it can be used " +
                            "again. Breathing creatures inside the bag can survive up to a number of minutes equal " +
                            "to 10 divided by the number of creatures (minimum 1 minute), after which time they " +
                            "begin to suffocate." +
                            "\n\tPlacing a bag of holding inside an extradimensional space created by a handy haversack, " +
                            "portable hole, or similar item instantly destroys both items and opens a gate to the " +
                            "Astral Plane. The gate originates where the one item was placed inside the other. Any " +
                            "creature within 10 feet of the gate is sucked through it to a random location on the " +
                            "Astral Plane. The gate then closes. The gate is one-way only and can’t be reopened."
                ),
        "driftglobe" to
                MagicItem(
                    name = "Driftglobe",
                    description = "\n\tThis small sphere of thick glass weighs 1 pound. If you are within 60 feet of " +
                            "it, you can speak its command word and cause it to emanate the light or daylight spell. " +
                            "Once used, the daylight effect can't be used again until the next dawn." +
                            "\n\tYou can speak another command word as an action to make the illuminated globe rise " +
                            "into the air and float no more than 5 feet off the ground. The globe hovers in this " +
                            "way until you or another creature grasps it. If you move more than 60 feet from the " +
                            "hovering globe, it follows you until it is within 60 feet of you. It takes the shortest " +
                            "route to do so. If prevented from moving, the globe sinks gently to the ground and " +
                            "becomes inactive, and its light winks out."
                )
    )
}