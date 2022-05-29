package com.example.lootgenerator.data

import com.example.dndlootgenerator.model.MagicItem

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
        "8th level spell scroll" to MagicItem(
            name = "8th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. If " +
                    "\n\tthe spell is on your class’s spell list, you can read the scroll and cast its spell without " +
                    "\n\tproviding any material components. Otherwise, the scroll is unintelligible. Casting the " +
                    "\n\tspell by reading the scroll requires the spell’s normal casting time. Once the spell is " +
                    "\n\tcast, the words on the scroll fade, and it crumbles to dust. If the casting is interrupted, " +
                    "\n\tthe scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than you can normally " +
                    "\n\tcast, you must make an ability check using your spellcasting ability to determine whether " +
                    "\n\tyou cast it successfully. The DC equals 18. On a failed check, the spell disappears from " +
                    "\n\tthe scroll with no other effect." +
                    "\n\tThis scroll contains an 8th level spell. The spell's saving throw DC is 18 and " +
                    "\n\tattack bonus is +10." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can be " +
                    "\n\tcopied. When a spell is copied from a spell scroll, the copier must succeed on an " +
                    "\n\tIntelligence (Arcana) check with a DC equal to 18. If the check succeeds, the spell is " +
                    "\n\tsuccessfully copied. Whether the check succeeds or fails, the spell scroll is destroyed."
        ),
        "potion of storm giant strength" to MagicItem(
            name = "Potion of Storm Giant Strength",
            description = "\n\tWhen you drink this potion, your Strength score changes to 29 for 1 hour. The " +
                    "\n\tpotion has no effect on you if your Strength is equal to or greater than that score." +
                    "\n\tThis potion's transparent liquid has floating in it a sliver of fingernail from a storm giant."
        ),
        "supreme potion of healing" to MagicItem(
            name = "Supreme Potion of Healing",
            description = "\n\tYou regain 10d4 + 20 hit points when you drink this potion. The potion's red liquid " +
                    "\n\tglimmers when agitated."
        ),
        "9th level spell scroll" to MagicItem(
            name = "9th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. If the " +
                    "\n\tspell is on your class’s spell list, you can read the scroll and cast its spell without " +
                    "\n\tproviding any material components. Otherwise, the scroll is unintelligible. Casting the " +
                    "\n\tspell by reading the scroll requires the spell’s normal casting time. Once the spell is " +
                    "\n\tcast, the words on the scroll fade, and it crumbles to dust. If the casting is interrupted, " +
                    "\n\tthe scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than you can normally " +
                    "\n\tcast, you must make an ability check using your spellcasting ability to determine whether " +
                    "\n\tyou cast it successfully. The DC equals 19. On a failed check, the spell disappears from " +
                    "\n\tthe scroll with no other effect." +
                    "\n\tThis scroll contains a 9th level spell. The spell's saving throw DC is 19 and " +
                    "\n\tattack bonus is +11." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can be " +
                    "\n\tcopied. When a spell is copied from a spell scroll, the copier must succeed on an " +
                    "\n\tIntelligence (Arcana) check with a DC equal to 19. If the check succeeds, the spell is " +
                    "\n\tsuccessfully copied. Whether the check succeeds or fails, the spell scroll is destroyed."
        ),
        "universal solvent" to MagicItem(
            name = "Universal Solvent",
            description = "\n\tThis tube holds milky liquid with a strong alcohol smell. You can use an action to " +
                    "\n\tpour the contents of the tube onto a surface within reach. The liquid instantly dissolves " +
                    "\n\tup to 1 square foot of adhesive it touches, including sovereign glue."
        ),
        "arrow of slaying" to MagicItem(
            name = "Arrow of Slaying",
            description = "\n\tAn arrow of slaying is a magic weapon meant to slay a particular kind of creature. " +
                    "\n\tSome are more focused than others; for example, there are both arrows of dragon slaying " +
                    "\n\tand arrows of blue dragon slaying. If a creature belonging to the type, race, or group " +
                    "\n\tassociated with an arrow of slaying takes damage from the arrow, the creature must make a " +
                    "\n\tDC 17 Constitution saving throw, taking an extra 6d10 piercing damage on a failed save, or " +
                    "\n\thalf as much extra damage on a successful one." +
                    "\n\tOnce an arrow of slaying deals its extra damage to a creature, it becomes a " +
                    "\n\tnonmagical arrow." +
                    "\n\tOther types of magic ammunition of this kind exist, such as bolts of slaying meant " +
                    "\n\tfor a crossbow, though arrows are most common."
        ),
        "sovereign glue" to MagicItem(
            name = "Sovereign glue",
            description = "\n\tThis viscous, milky-white substance can form a permanent adhesive bond between any " +
                    "\n\ttwo objects. It must be stored in a jar or flask that has been coated inside with oil of " +
                    "\n\tslipperiness. When found, a container contains 1d6 + 1 ounces." +
                    "\n\tOne ounce of the glue can cover a 1-foot square surface. The glue takes 1 minute to set. " +
                    "\n\tOnce it has done so, the bond it creates can be broken only by the application of universal " +
                    "\n\tsolvent or oil of etherealness, or with a wish spell."
        )
    )
}