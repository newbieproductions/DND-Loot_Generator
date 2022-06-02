package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListDName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..20 -> MagicItemsD.magicItems["supreme potion of healing"]?.name.toString()
        in 21..30 -> MagicItemsD.magicItems["potion of invisibility"]?.name.toString()
        in 31..40 -> MagicItemsD.magicItems["potion of speed"]?.name.toString()
        in 41..50 -> MagicItemsD.magicItems["6th level spell scroll"]?.name.toString()
        in 51..57 -> MagicItemsD.magicItems["7th level spell scroll"]?.name.toString()
        in 58..62 -> MagicItemsD.magicItems["+3 ammunition"]?.name.toString()
        in 63..67 -> MagicItemsD.magicItems["oil of sharpness"]?.name.toString()
        in 68..72 -> MagicItemsD.magicItems["potion of flying"]?.name.toString()
        in 73..77 -> MagicItemsD.magicItems["potion of cloud giant strength"]?.name.toString()
        in 78..82 -> MagicItemsD.magicItems["potion of longevity"]?.name.toString()
        in 82..87 -> MagicItemsD.magicItems["potion of Vitality"]?.name.toString()
        in 88..92 -> MagicItemsD.magicItems["8th level spell scroll"]?.name.toString()
        in 93..95 -> MagicItemsD.magicItems["horseshoes of a zephyr"]?.name.toString()
        in 96..98 -> MagicItemsD.magicItems["nolzur's marvelous pigments"]?.name.toString()
        99 -> MagicItemsD.magicItems["bag of devouring"]?.name.toString()
        else -> MagicItemsD.magicItems["portable hole"]?.name.toString()
    }

    return result
}

fun rollListDDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..20 -> MagicItemsD.magicItems["supreme potion of healing"]?.description.toString()
        in 21..30 -> MagicItemsD.magicItems["potion of invisibility"]?.description.toString()
        in 31..40 -> MagicItemsD.magicItems["potion of speed"]?.description.toString()
        in 41..50 -> MagicItemsD.magicItems["6th level spell scroll"]?.description.toString()
        in 51..57 -> MagicItemsD.magicItems["7th level spell scroll"]?.description.toString()
        in 58..62 -> MagicItemsD.magicItems["+3 ammunition"]?.description.toString()
        in 63..67 -> MagicItemsD.magicItems["oil of sharpness"]?.description.toString()
        in 68..72 -> MagicItemsD.magicItems["potion of flying"]?.description.toString()
        in 73..77 -> MagicItemsD.magicItems["potion of cloud giant strength"]?.description.toString()
        in 78..82 -> MagicItemsD.magicItems["potion of longevity"]?.description.toString()
        in 82..87 -> MagicItemsD.magicItems["potion of Vitality"]?.description.toString()
        in 88..92 -> MagicItemsD.magicItems["8th level spell scroll"]?.description.toString()
        in 93..95 -> MagicItemsD.magicItems["horseshoes of a zephyr"]?.description.toString()
        in 96..98 -> MagicItemsD.magicItems["nolzur's marvelous pigments"]?.description.toString()
        99 -> MagicItemsD.magicItems["bag of devouring"]?.description.toString()
        else -> MagicItemsD.magicItems["portable hole"]?.description.toString()
    }

    return result
}

object MagicItemsD {
    val magicItems = mapOf<String, MagicItem>(
        /**
         * target for auto rolls
         */
        "supreme potion of healing" to MagicItem(
            name = "Supreme Potion of Healing",
            description = "\n\tYou regain 10d4 + 20 hit points when you drink this potion. The " +
                    "potion's red liquid glimmers when agitated."
        ),
        "potion of invisibility" to MagicItem(
            name = "Potion of Invisibility",
            description = "\n\tThis potion's container looks empty but feels as though it holds " +
                    "liquid. When you drink it, you become invisible for 1 hour. Anything you " +
                    "wear or carry is invisible with you. The effect ends early if you attack " +
                    "or cast a spell."
        ),
        "potion of speed" to MagicItem(
            name = "Potion of Speed",
            description = "\n\tWhen you drink this potion, you gain the effect of the haste " +
                    "spell for 1 minute (no concentration required). The potion's yellow fluid " +
                    "is streaked with black and swirls on its own."
        ),
        /**
         * target for spell lists
         */
        "6th level spell scroll" to MagicItem(
            name = "6th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a " +
                    "mystical cipher. If the spell is on your class’s spell list, you can read " +
                    "the scroll and cast its spell without providing any material components. " +
                    "Otherwise, the scroll is unintelligible. Casting the spell by reading the " +
                    "scroll requires the spell’s normal casting time. Once the spell is cast, the " +
                    "words on the scroll fade, and it crumbles to dust. If the casting is " +
                    "interrupted, the scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than " +
                    "you can normally cast, you must make an ability check using your " +
                    "spellcasting ability to determine whether you cast it successfully. The " +
                    "DC equals 16. On a failed check, the spell disappears from the scroll with " +
                    "no other effect." +
                    "\n\tThis scroll contains a 6th level spell. The spell's saving throw DC is " +
                    "17 and attack bonus is +9." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in " +
                    "spellbooks can be copied. When a spell is copied from a spell scroll, the " +
                    "copier must succeed on an Intelligence (Arcana) check with a DC equal to 16. " +
                    "If the check succeeds, the spell is successfully copied. Whether the check " +
                    "succeeds or fails, the spell scroll is destroyed."
        ),
        /**
         * target for spell list
         */
        "7th level spell scroll" to MagicItem(
            name = "7th Level Spell Scroll",
            description = "\n\tA spell scroll bears the words of a single spell, written in a " +
                    "mystical cipher. If the spell is on your class’s spell list, you can read " +
                    "the scroll and cast its spell without providing any material components. " +
                    "Otherwise, the scroll is unintelligible. Casting the spell by reading the " +
                    "scroll requires the spell’s normal casting time. Once the spell is cast, the " +
                    "words on the scroll fade, and it crumbles to dust. If the casting is " +
                    "interrupted, the scroll is not lost." +
                    "\n\tIf the spell is on your class’s spell list but of a higher level than " +
                    "you can normally cast, you must make an ability check using your " +
                    "spellcasting ability to determine whether you cast it successfully. The " +
                    "DC equals 17. On a failed check, the spell disappears from the scroll " +
                    "with no other effect." +
                    "\n\tThis scroll contains a 7th level spell. The spell's saving throw DC " +
                    "is 18 and attack bonus is +10." +
                    "\n\tA wizard spell on a spell scroll can be copied just as spells in " +
                    "spellbooks can be copied. When a spell is copied from a spell scroll, " +
                    "the copier must succeed on an Intelligence (Arcana) check with a DC equal " +
                    "to 17. If the check succeeds, the spell is successfully copied. Whether " +
                    "the check succeeds or fails, the spell scroll is destroyed."
        ),
        "+3 ammunition" to MagicItem(
            name = "+3 Ammunition",
            description = "\n\tYou have a +3 bonus to attack and damage rolls made with this " +
                    "piece of magic ammunition. Once it hits a target, the ammunition is no " +
                    "longer magical."
        ),
        "oil of sharpness" to MagicItem(
            name = "Oil of Sharpness",
            description = "\n\tThis clear, gelatinous oil sparkles with tiny, ultrathin silver " +
                    "shards. The oil can coat one slashing or piercing weapon or up to 5 pieces " +
                    "of slashing or piercing ammunition. Applying the oil takes 1 minute. For " +
                    "1 hour, the coated item is magical and has a +3 bonus to attack and damage rolls."
        ),
        "potion of flying" to MagicItem(
            name = "Potion of Flying",
            description = "\n\tWhen you drink this potion, you gain a flying speed equal to your " +
                    "walking speed for 1 hour and can hover. If you're in the air when the potion " +
                    "wears off, you fall unless you have some other means of staying aloft. This " +
                    "potion's clear liquid floats at the top of its container and has cloudy " +
                    "white impurities drifting in it."
        ),
        "potion of cloud giant strength" to MagicItem(
            name = "Potion of Cloud Giant Strength",
            description = "\n\tWhen you drink this potion, your Strength score changes to 27 for " +
                    "1 hour. The potion has no effect on you if your Strength is equal to or " +
                    "greater than that score. This potion's transparent liquid has floating in it " +
                    "a sliver of fingernail from a cloud giant."
        ),
        /**
         * target for auto rolls
         */
        "potion of longevity" to MagicItem(
            name = "Potion of Longevity",
            description = "\n\tWhen you drink this potion, your physical age is reduced by " +
                    "1d6 + 6 years, to a minimum of 13 years. Each time you subsequently drink " +
                    "a potion of longevity, there is a 10 percent cumulative chance that you " +
                    "instead age by 1d6 +6 years. Suspended in this amber liquid are a scorpion's " +
                    "tail, an adder's fang, a dead spider, and a tiny heart that, against all " +
                    "reason, is still beating. The ingredients vanish when the potion is opened."
        ),
        "potion of Vitality" to MagicItem(
            name = "Potion of Vitality",
            description = "\n\tWhen you drink this potion, it removes any exhaustion you are " +
                    "suffering and cures any disease or poison affecting you. For the next 24 " +
                    "hours, you regain the maximum number of hit points for any Hit Die you " +
                    "spend. The potion's crimson liquid regularly pulses with dull light, " +
                    "calling to mind a heartbeat."
        ),
        /**
         * target for spell list and auto rolls
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
        "horseshoes of a zephyr" to MagicItem(
            name = "Horseshoes of a Zephyr",
            description = "\n\tThese iron horseshoes come in a set of four. While all four shoes " +
                    "are affixed to the hooves of a horse or similar creature, they allow the " +
                    "creature to move normally while floating 4 inches above the ground. This " +
                    "effect means the creature can cross or stand above non-solid or unstable " +
                    "surfaces, such as water or lava. The creature leaves no tracks and ignores " +
                    "difficult terrain. In addition, the creature can move at normal speed for " +
                    "up to 12 hours a day without suffering exhaustion from a forced march."
        ),
        /**
         * target for auto rolls
         */
        "nolzur's marvelous pigments" to MagicItem(
            name = "Nolzur's Marvelous Pigments",
            description = "\n\tTypically found in 1d4 pots inside a fine wooden box with a " +
                    "brush (weighing 1 pound in total), these pigments allow you to create " +
                    "three-dimensional objects by painting them in two dimensions. The paint " +
                    "flows from the brush to form the desired object as you concentrate on its image." +
                    "\n\tEach pot of paint is sufficient to cover 1,000 square feet of a " +
                    "surface, which lets you create inanimate objects or terrain features--such " +
                    "as a door, a pit, flowers, trees, cells, rooms, or weapons-- that are up " +
                    "to 10,000 cubic feet. It takes 10 minutes to cover 100 square feet." +
                    "\n\tWhen you complete the painting, the object or terrain feature depicted " +
                    "becomes a real, nonmagical object. Thus, painting a door on a wall creates " +
                    "an actual door that can be opened to whatever is beyond. Painting a pit on " +
                    "a floor creates a real pit, and its depth counts against the total area of " +
                    "objects you create." +
                    "\n\tNothing created by the pigments can have a value greater than 25 gp. If " +
                    "you paint an object of greater value (such as a diamond or a pile of gold), " +
                    "the object looks authentic, but close inspection reveals it is made from " +
                    "paste, bone, or some other worthless material." +
                    "\n\tIf you paint a form of energy such as fire or lightning, the energy " +
                    "appears but dissipates as soon as you complete the painting, doing no " +
                    "harm to anything."
        ),
        "bag of devouring" to MagicItem(
            name = "Bag of Devouring",
            description = "\n\tThis bag superficially resembles a bag of holding but is a feeding " +
                    "orifice for a gigantic extradimensional creature. Turning the bag inside " +
                    "out closes the orifice." +
                    "\n\tThe extradimensional creature attached to the bag can sense whatever " +
                    "is placed inside the bag. Animal or vegetable matter placed wholly in the " +
                    "bag is devoured and lost forever. When part of a living creature is placed " +
                    "in the bag, as happens when someone reaches inside it, there is a 50 percent " +
                    "chance that the creature is pulled inside the bag. A creature inside the " +
                    "bag can use its action to try to escape with a successful DC 15 Strength " +
                    "check. Another creature can use its action to reach into the bag to pull a " +
                    "creature out, doing so with a successful DC 20 Strength check (provided it " +
                    "isn't pulled inside the bag first). Any creature that starts its turn " +
                    "inside the bag is devoured, its body destroyed. " +
                    "\n\tInanimate objects can be stored in the bag, which can hold a cubic " +
                    "foot of such material. However, once each day, the bag swallows any " +
                    "objects inside it and spits them out into another plane of existence. " +
                    "The GM determines the time and plane." +
                    "\n\tIf the bag is pierced or torn, it is destroyed, and anything contained " +
                    "within it is transported to a random location on the Astral Plane."
        ),
        "portable hole" to MagicItem(
            name = "Portable Hole",
            description = "\n\tThis fine black cloth, soft as silk, is folded up to the " +
                    "dimensions of a handkerchief. It unfolds into a circular sheet 6 feet " +
                    "in diameter." +
                    "\n\tYou can use an action to unfold a portable hole and place it on or " +
                    "against a solid surface, whereupon the portable hole creates an " +
                    "extradimensional hole 10 feet deep. The cylindrical space within the hole " +
                    "exists on a different plane, so it can’t be used to create open passages. " +
                    "Any creature inside an open portable hole can exit the hole by climbing " +
                    "out of it." +
                    "\n\tYou can use an action to close a portable hole by taking hold of the " +
                    "edges of the cloth and folding it up. Folding the cloth closes the hole, " +
                    "and any creatures or objects within remain in the extradimensional space. " +
                    "No matter what’s in it, the hole weighs next to nothing." +
                    "\n\tIf the hole is folded up, a creature within the hole’s extradimensional " +
                    "space can use an action to make a DC 10 Strength check. On a successful " +
                    "check, the creature forces its way out and appears within 5 feet of the " +
                    "portable hole or the creature carrying it. A breathing creature within a " +
                    "closed portable hole can survive for up to 10 minutes, after which time " +
                    "it begins to suffocate." +
                    "\n\tPlacing a portable hole inside an extradimensional space created by a " +
                    "bag of holding, handy haversack, or similar item instantly destroys both " +
                    "items and opens a gate to the Astral Plane. The gate originates where the " +
                    "one item was placed inside the other. Any creature within 10 feet of the " +
                    "gate is sucked through it and deposited in a random location on the Astral " +
                    "Plane. The gate then closes. The gate is one-way only and can’t be reopened."
        )
    )
}