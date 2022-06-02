package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListEName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..30 -> MagicItemsE.magicItems["8th level spell scroll"]?.name.toString()
        in 31..55 -> MagicItemsE.magicItems["potion of storm giant strength"]?.name.toString()
        in 56..70 -> MagicItemsE.magicItems["supreme potion of healing"]?.name.toString()
        in 71..85 -> MagicItemsE.magicItems["9th level spell scroll"]?.name.toString()
        in 86..93 -> MagicItemsE.magicItems["universal solvent"]?.name.toString()
        in 94..98 -> MagicItemsE.magicItems["arrow of slaying"]?.name.toString()
        else -> MagicItemsE.magicItems["sovereign glue"]?.name.toString()
    }

    return result
}

fun rollListEDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..30 -> MagicItemsE.magicItems["8th level spell scroll"]?.description.toString()
        in 31..55 -> MagicItemsE.magicItems["potion of storm giant strength"]?.description.toString()
        in 56..70 -> MagicItemsE.magicItems["supreme potion of healing"]?.description.toString()
        in 71..85 -> MagicItemsE.magicItems["9th level spell scroll"]?.description.toString()
        in 86..93 -> MagicItemsE.magicItems["universal solvent"]?.description.toString()
        in 94..98 -> MagicItemsE.magicItems["arrow of slaying"]?.description.toString()
        else -> MagicItemsE.magicItems["sovereign glue"]?.description.toString()
    }

    return result
}

object MagicItemsE {
    val magicItems = mapOf<String, MagicItem>(
        /**
         * target for auto rolls and magic item list
         */
        "8th level spell scroll" to MagicItem(
            name = "8th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a " +
                    "mystical cipher. If the spell is on your class’s spell list, you can read " +
                    "the scroll and cast its spell without providing any material components. " +
                    "Otherwise, the scroll is unintelligible. Casting the spell by reading the " +
                    "scroll requires the spell’s normal casting time. Once the spell is cast, " +
                    "the words on the scroll fade, and it crumbles to dust. If the casting is " +
                    "interrupted, the scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than " +
                    "you can normally cast, you must make an ability check using your " +
                    "spellcasting ability to determine whether you cast it successfully. The " +
                    "DC equals 18. On a failed check, the spell disappears from the scroll " +
                    "with no other effect." +
                    "\n\tThis scroll contains an 8th level spell. The spell's saving throw DC is " +
                    "18 and attack bonus is +10." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in " +
                    "spellbooks can be copied. When a spell is copied from a spell scroll, the " +
                    "copier must succeed on an Intelligence (Arcana) check with a DC equal to " +
                    "18. If the check succeeds, the spell is successfully copied. Whether the " +
                    "check succeeds or fails, the spell scroll is destroyed."
        ),
        "potion of storm giant strength" to MagicItem(
            name = "Potion of Storm Giant Strength",
            description = "\n\tWhen you drink this potion, your Strength score changes to 29 for " +
                    "1 hour. The potion has no effect on you if your Strength is equal to or " +
                    "greater than that score." +
                    "\n\tThis potion's transparent liquid has floating in it a sliver of " +
                    "fingernail from a storm giant."
        ),
        /**
         * target for auto roll
         */
        "supreme potion of healing" to MagicItem(
            name = "Supreme Potion of Healing",
            description = "\n\tYou regain 10d4 + 20 hit points when you drink this potion. The " +
                    "potion's red liquid glimmers when agitated."
        ),
        /**
         * target for spell list and auto rolls
         */
        "9th level spell scroll" to MagicItem(
            name = "9th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a " +
                    "mystical cipher. If the spell is on your class’s spell list, you can read " +
                    "the scroll and cast its spell without providing any material components. " +
                    "Otherwise, the scroll is unintelligible. Casting the spell by reading the " +
                    "scroll requires the spell’s normal casting time. Once the spell is cast, " +
                    "the words on the scroll fade, and it crumbles to dust. If the casting is " +
                    "interrupted, the scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than " +
                    "you can normally cast, you must make an ability check using your " +
                    "spellcasting ability to determine whether you cast it successfully. The " +
                    "DC equals 19. On a failed check, the spell disappears from the scroll " +
                    "with no other effect." +
                    "\n\tThis scroll contains a 9th level spell. The spell's saving throw DC " +
                    "is 19 and attack bonus is +11." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in " +
                    "spellbooks can be copied. When a spell is copied from a spell scroll, " +
                    "the copier must succeed on an Intelligence (Arcana) check with a DC equal " +
                    "to 19. If the check succeeds, the spell is successfully copied. Whether " +
                    "the check succeeds or fails, the spell scroll is destroyed."
        ),
        "universal solvent" to MagicItem(
            name = "Universal Solvent",
            description = "\n\tThis tube holds milky liquid with a strong alcohol smell. You " +
                    "can use an action to pour the contents of the tube onto a surface within " +
                    "reach. The liquid instantly dissolves up to 1 square foot of adhesive it " +
                    "touches, including sovereign glue."
        ),
        /**
         * target for auto rolls
         */
        "arrow of slaying" to MagicItem(
            name = "Arrow of Slaying",
            description = "\n\tAn arrow of slaying is a magic weapon meant to slay a particular " +
                    "kind of creature. Some are more focused than others; for example, there are " +
                    "both arrows of dragon slaying and arrows of blue dragon slaying. If a " +
                    "creature belonging to the type, race, or group associated with an arrow of " +
                    "slaying takes damage from the arrow, the creature must make a DC 17 " +
                    "Constitution saving throw, taking an extra 6d10 piercing damage on a failed " +
                    "save, or half as much extra damage on a successful one. Once an arrow of " +
                    "slaying deals its extra damage to a creature, it becomes a nonmagical arrow." +
                    "\n\tOther types of magic ammunition of this kind exist, such as bolts of " +
                    "slaying meant for a crossbow, though arrows are most common."
        ),
        /**
         * target for auto rolls
         */
        "sovereign glue" to MagicItem(
            name = "Sovereign glue",
            description = "\n\tThis viscous, milky-white substance can form a permanent adhesive " +
                    "bond between any two objects. It must be stored in a jar or flask that has " +
                    "been coated inside with oil of slipperiness. When found, a container " +
                    "contains 1d6 + 1 ounces." +
                    "\n\tOne ounce of the glue can cover a 1-foot square surface. The glue takes " +
                    "1 minute to set. Once it has done so, the bond it creates can be broken " +
                    "only by the application of universal solvent or oil of etherealness, or " +
                    "with a wish spell."
        )
    )
}