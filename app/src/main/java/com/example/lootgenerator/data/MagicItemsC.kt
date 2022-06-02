package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListCName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsC.magicItems["superior potion of healing"]?.name.toString()
        in 16..22 -> MagicItemsC.magicItems["4th level spell scroll"]?.name.toString()
        in 23..27 -> MagicItemsC.magicItems["+2 ammunition"]?.name.toString()
        in 28..32 -> MagicItemsC.magicItems["potion of clairvoyance"]?.name.toString()
        in 33..37 -> MagicItemsC.magicItems["potion of diminution"]?.name.toString()
        in 38..42 -> MagicItemsC.magicItems["potion of gaseous form"]?.name.toString()
        in 43..47 -> MagicItemsC.magicItems["potion of frost giant strength"]?.name.toString()
        in 48..52 -> MagicItemsC.magicItems["potion of stone giant strength"]?.name.toString()
        in 53..57 -> MagicItemsC.magicItems["potion of heroism"]?.name.toString()
        in 58..62 -> MagicItemsC.magicItems["potion of invulnerability"]?.name.toString()
        in 63..67 -> MagicItemsC.magicItems["potion of mind reading"]?.name.toString()
        in 68..72 -> MagicItemsC.magicItems["5th level spell scroll"]?.name.toString()
        in 73..75 -> MagicItemsC.magicItems["elixir of health"]?.name.toString()
        in 76..78 -> MagicItemsC.magicItems["oil of etherealness"]?.name.toString()
        in 79..81 -> MagicItemsC.magicItems["potion of fire giant strength"]?.name.toString()
        in 82..84 -> MagicItemsC.magicItems["quaal's feather token"]?.name.toString()
        in 85..87 -> MagicItemsC.magicItems["scroll of protection"]?.name.toString()
        in 88..89 -> MagicItemsC.magicItems["bag of beans"]?.name.toString()
        in 90..91 -> MagicItemsC.magicItems["bead of force"]?.name.toString()
        92 -> MagicItemsC.magicItems["chime of opening"]?.name.toString()
        93 -> MagicItemsC.magicItems["decanter of endless water"]?.name.toString()
        94 -> MagicItemsC.magicItems["eyes of minute seeing"]?.name.toString()
        95 -> MagicItemsC.magicItems["folding boat"]?.name.toString()
        96 -> MagicItemsC.magicItems["heward's handy haversack"]?.name.toString()
        97 -> MagicItemsC.magicItems["horseshoes of speed"]?.name.toString()
        98 -> MagicItemsC.magicItems["necklace of fireballs"]?.name.toString()
        99 -> MagicItemsC.magicItems["periapt of health"]?.name.toString()
        else -> MagicItemsC.magicItems["sending stones"]?.name.toString()
    }

    return result
}

fun rollListCDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsC.magicItems["superior potion of healing"]?.description.toString()
        in 16..22 -> MagicItemsC.magicItems["4th level spell scroll"]?.description.toString()
        in 23..27 -> MagicItemsC.magicItems["+2 ammunition"]?.description.toString()
        in 28..32 -> MagicItemsC.magicItems["potion of clairvoyance"]?.description.toString()
        in 33..37 -> MagicItemsC.magicItems["potion of diminution"]?.description.toString()
        in 38..42 -> MagicItemsC.magicItems["potion of gaseous form"]?.description.toString()
        in 43..47 -> MagicItemsC.magicItems["potion of frost giant strength"]?.description.toString()
        in 48..52 -> MagicItemsC.magicItems["potion of stone giant strength"]?.description.toString()
        in 53..57 -> MagicItemsC.magicItems["potion of heroism"]?.description.toString()
        in 58..62 -> MagicItemsC.magicItems["potion of invulnerability"]?.description.toString()
        in 63..67 -> MagicItemsC.magicItems["potion of mind reading"]?.description.toString()
        in 68..72 -> MagicItemsC.magicItems["5th level spell scroll"]?.description.toString()
        in 73..75 -> MagicItemsC.magicItems["elixir of health"]?.description.toString()
        in 76..78 -> MagicItemsC.magicItems["oil of etherealness"]?.description.toString()
        in 79..81 -> MagicItemsC.magicItems["potion of fire giant strength"]?.description.toString()
        in 82..84 -> MagicItemsC.magicItems["quaal's feather token"]?.description.toString()
        in 85..87 -> MagicItemsC.magicItems["scroll of protection"]?.description.toString()
        in 88..89 -> MagicItemsC.magicItems["bag of beans"]?.description.toString()
        in 90..91 -> MagicItemsC.magicItems["bead of force"]?.description.toString()
        92 -> MagicItemsC.magicItems["chime of opening"]?.description.toString()
        93 -> MagicItemsC.magicItems["decanter of endless water"]?.description.toString()
        94 -> MagicItemsC.magicItems["eyes of minute seeing"]?.description.toString()
        95 -> MagicItemsC.magicItems["folding boat"]?.description.toString()
        96 -> MagicItemsC.magicItems["heward's handy haversack"]?.description.toString()
        97 -> MagicItemsC.magicItems["horseshoes of speed"]?.description.toString()
        98 -> MagicItemsC.magicItems["necklace of fireballs"]?.description.toString()
        99 -> MagicItemsC.magicItems["periapt of health"]?.description.toString()
        else -> MagicItemsC.magicItems["sending stones"]?.description.toString()
    }

    return result
}

object MagicItemsC {
    val magicItems = mapOf<String, MagicItem>(
        "superior potion of healing" to
                /**
                 * target for auto rolls
                 */
                MagicItem(
                    name = "Superior Potion of Healing",
                    description = "\n\tYou regain 8d4 + 8 hit points when you drink this " +
                            "potion. The potion's red liquid glimmers when agitated."
                ),
        /**
         * target for spell lists
         */
        "4th level spell scroll" to
                MagicItem(
                    name = "4th Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written " +
                            "in a mystical cipher. If the spell is on your class’s spell list, " +
                            "you can read the scroll and cast its spell without providing any " +
                            "material components. Otherwise, the scroll is unintelligible. " +
                            "Casting the spell by reading the scroll requires the spell’s normal " +
                            "casting time. Once the spell is cast, the words on the scroll fade, " +
                            "and it crumbles to dust. If the casting is interrupted, the scroll " +
                            "is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level " +
                            "than you can normally cast, you must make an ability check using " +
                            "your spellcasting ability to determine whether you cast it " +
                            "successfully. The DC equals 14. On a failed check, the spell " +
                            "disappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 4th level spell. The spell's saving " +
                            "throw DC is 15 and attack bonus is +7." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells " +
                            "in spellbooks can be copied. When a spell is copied from a spell " +
                            "scroll, the copier must succeed on an Intelligence (Arcana) check " +
                            "with a DC equal to 14. If the check succeeds, the spell is " +
                            "successfully copied. Whether the check succeeds or fails, the " +
                            "spell scroll is destroyed."
                ),
        "+2 ammunition" to
                MagicItem(
                    name = "+2 Ammunition",
                    description = "\n\tYou have a +2 bonus to attack and damage rolls made with " +
                            "this piece of magic ammunition. Once it hits a target, the " +
                            "ammunition is no longer magical."
                ),
        "potion of clairvoyance" to
                MagicItem(
                    name = "Potion of Clairvoyance",
                    description = "\n\tWhen you drink this potion, you gain the effect of the " +
                            "clairvoyance spell. An eyeball bobs in this yellowish liquid but " +
                            "vanishes when the potion is opened."
                ),
        /**
         * target for auto rolls
         */
        "potion of diminution" to
                MagicItem(
                    name = "Potion of Diminution",
                    description = "\n\tWhen you drink this potion, you gain the \"reduce\" effect " +
                            "of the enlarge/reduce spell for 1d4 hours (no concentration " +
                            "required). The red in the potion's liquid continuously contracts " +
                            "to a tiny bead and then expands to color the clear liquid around " +
                            "it. Shaking the bottle fails to interrupt this process."
                ),
        "potion of gaseous form" to
                MagicItem(
                    name = "Potion of Gaseous Form",
                    description = "\n\tWhen you drink this potion, you gain the effect of the " +
                            "gaseous form spell for 1 hour (no concentration required) or until " +
                            "you end the effect as a bonus action. This potion's container seems " +
                            "to hold fog that moves and pours like water."
                ),
        "potion of frost giant strength" to
                MagicItem(
                    name = "Potion of Frost Giant Strength",
                    description = "\n\tWhen you drink this potion, your Strength score changes " +
                            "to 23 for 1 hour. The potion has no effect on you if your Strength " +
                            "is equal to or greater than that score." +
                            "\n\tThis potion's transparent liquid has floating in it a sliver " +
                            "of fingernail from a frost giant."
                ),
        "potion of stone giant strength" to
                MagicItem(
                    name = "Potion of Stone Giant Strength",
                    description = "\n\tWhen you drink this potion, your Strength score changes to " +
                            "23 for 1 hour. The potion has no effect on you if your Strength is " +
                            "equal to or greater than that score." +
                            "\n\tThis potion's transparent liquid has floating in it a sliver of " +
                            "fingernail from a stone giant."
                ),
        "potion of heroism" to
                MagicItem(
                    name = "Potion of Heroism",
                    description = "\n\tFor 1 hour after drinking it, you gain 10 temporary hit " +
                            "points that last for 1 hour. For the same duration, you are under " +
                            "the effect of the bless spell (no concentration required). This " +
                            "blue potion bubbles and steams as if boiling."
                ),
        "potion of invulnerability" to
                MagicItem(
                    name = "Potion of Invulnerability",
                    description = "\n\tFor 1 minute after you drink this potion, you have " +
                            "resistance to all damage. The potion's syrupy liquid looks like " +
                            "liquefied iron. "
                ),
        "potion of mind reading" to
                MagicItem(
                    name = "Potion of Mind Reading",
                    description = "\n\tWhen you drink this potion, you gain the effect of the " +
                            "detect thoughts spell (save DC 13). The potion's dense, purple " +
                            "liquid has an ovoid cloud of pink floating in it."
                ),
        /**
         * target for spell list
         */
        "5th level spell scroll" to
                MagicItem(
                    name = "5th Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written " +
                            "in a mystical cipher. If the spell is on your class’s spell list, " +
                            "you can read the scroll and cast its spell without providing any " +
                            "material components. Otherwise, the scroll is unintelligible. " +
                            "Casting the spell by reading the scroll requires the spell’s normal " +
                            "casting time. Once the spell is cast, the words on the scroll fade, " +
                            "and it crumbles to dust. If the casting is interrupted, the scroll " +
                            "is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level " +
                            "than you can normally cast, you must make an ability check using " +
                            "your spellcasting ability to determine whether you cast it " +
                            "successfully. The DC equals 15. On a failed check, the spell " +
                            "disappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 5th level spell. The spell's saving " +
                            "throw DC is 17 and attack bonus is +9." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells " +
                            "in spellbooks can be copied. When a spell is copied from a spell " +
                            "scroll, the copier must succeed on an Intelligence (Arcana) check " +
                            "with a DC equal to 15. If the check succeeds, the spell is " +
                            "successfully copied. Whether the check succeeds or fails, the spell " +
                            "scroll is destroyed."
                ),
        "elixir of health" to
                MagicItem(
                    name = "Elixir of Health",
                    description = "\n\tWhen you drink this potion, it cures any disease " +
                            "afflicting you, and it removes the blinded, deafened, paralyzed, " +
                            "and poisoned conditions. The clear red liquid has tiny bubbles of " +
                            "light in it."
                ),
        "oil of etherealness" to
                MagicItem(
                    name = "Oil of Etherealness",
                    description = "\n\tBeads of this cloudy gray oil form on the outside of its " +
                            "container and quickly evaporate. The oil can cover a Medium or " +
                            "smaller creature, along with the equipment it's wearing and carrying " +
                            "(one additional vial is required for each size category above " +
                            "Medium). Applying the oil takes 10 minutes. The affected creature " +
                            "then gains the effect of the etherealness spell for 1 hour."
                ),
        "potion of fire giant strength" to
                MagicItem(
                    name = "Potion of Fire Giant Strength",
                    description = "\n\tWhen you drink this potion, your Strength score changes " +
                            "to 25 for 1 hour. The potion has no effect on you if your Strength " +
                            "is equal to or greater than that score. This potion's transparent " +
                            "liquid has floating in it a sliver of fingernail from a fire giant."
                ),
        /**
         * target for table and auto rolling
         */
        "quaal's feather token" to
                MagicItem(
                    name = "Quaal's Feather Token",
                    description = "\n\tThis tiny object looks like a feather. Different types " +
                            "of feather tokens exist, each with a different single-use effect. " +
                            "The DM chooses the kind of token or determines it randomly." +
                            "\n\td100\tFeather Token" +
                            "\n\t01-20\tAnchor" +
                            "\n\t21-35\tBird" +
                            "\n\t36-50\tFan" +
                            "\n\t51-65\tSwan Boat" +
                            "\n\t66-90\tTree" +
                            "\n\t91-00\tWhip" +
                            "\n\tAnchor. You can use an action to touch the token to a boat or " +
                            "ship. For the next 24 hours, the vessel can't be moved by any " +
                            "means. Touching the token to the vessel again ends the effect. When " +
                            "the effect ends, the token disappears." +
                            "\n\tBird. You can use an action to toss the token 5 feet into the " +
                            "air. The token disappears and an enormous, multicolored bird takes " +
                            "its place. The bird has the statistics of a roc, but it obeys your " +
                            "simple commands and can't attack. It can carry up to 500 pounds " +
                            "while flying at its maximum speed (16 miles an hour for a maximum " +
                            "of 144 miles per day, with a one-hour rest for every 3 hours of " +
                            "flying), or 1,000 pounds at half that speed. The bird disappears " +
                            "after flying its maximum distance for a day or if it drops to 0 hit " +
                            "points. You can dismiss the bird as an action." +
                            "\n\tFan. If you are on a boat or ship, you can use an action to toss " +
                            "the token up to 10 feet in the air. The token disappears, and a " +
                            "giant flapping fan takes its place. The fan floats and creates a " +
                            "wind strong enough to fill the sails of one ship, increasing its " +
                            "speed by 5 miles per hour for 8 hours. You can dismiss the fan as " +
                            "an action." +
                            "\n\tSwan Boat. You can use an action to touch the token to a body " +
                            "of water at least 60 feet in diameter. The token disappears, and a " +
                            "50-foot-long, 20-foot- wide boat shaped like a swan takes its place. " +
                            "The boat is self-propelled and moves across water at a speed of 6 " +
                            "miles per hour. You can use an action while on the boat to command " +
                            "it to move or to turn up to 90 degrees. The boat can carry up to " +
                            "thirty-two Medium or smaller creatures. A Large creature counts as " +
                            "four Medium creatures, while a Huge creature counts as nine. The " +
                            "boat remains for 24 hours and then disappears. You can dismiss the " +
                            "boat as an action." +
                            "\n\tTree. You must be outdoors to use this token. You can use an " +
                            "action to touch it to an unoccupied space on the ground. The token " +
                            "disappears, and in its place a nonmagical oak tree springs into " +
                            "existence. The tree is 60 feet tall and has a 5-foot-diameter trunk, " +
                            "and its branches at the top spread out in a 20-foot radius." +
                            "\n\tWhip. You can use an action to throw the token to a point " +
                            "within 10 feet of you. The token disappears, and a floating whip " +
                            "takes its place. You can then use a bonus action to make a melee " +
                            "spell attack against a creature within 10 feet of the whip, with an " +
                            "attack bonus of +9. On a hit, the target takes 1d6 + 5 force damage." +
                            "\n\tAs a bonus action on your turn, you can direct the whip to fly " +
                            "up to 20 feet and repeat the attack against a creature within 10 " +
                            "feet of it. The whip disappears after 1 hour, when you use an action " +
                            "to dismiss it, or when you are incapacitated or die."
                ),
        /**
         * target for table and auto rolls
         */
        "scroll of protection" to
                MagicItem(
                    name = "Scroll of Protection",
                    description = "\n\tEach scroll of protection works against a specific type of " +
                            "creature chosen by the DM or determined randomly by rolling on the " +
                            "following table." +
                            "\n\td100\tCreature Type" +
                            "\n\t01-10\tAberrations" +
                            "\n\t11-20\tBeasts" +
                            "\n\t21-30\tCelestials" +
                            "\n\t31-40\tElementals" +
                            "\n\t41-50\tFey" +
                            "\n\t51-75\tFiends" +
                            "\n\t76-80\tPlants" +
                            "\n\t81-00\tUndead" +
                            "\n\tUsing an action to read the scroll encloses you in a invisible " +
                            "barrier that extends from you to form a 5-foot-radius, 10-foot-high " +
                            "cylinder. For 5 minutes, this barrier prevents creatures of the " +
                            "specified type from entering or affecting anything within " +
                            "the cylinder." +
                            "\n\tThe cylinder moves with you and remains centered on you. " +
                            "However, if you move in such a way that a creature of the specified " +
                            "type would be inside the cylinder, the effect ends." +
                            "\n\tA creature can attempt to overcome the barrier by using an " +
                            "action to make a DC 15 Charisma check. On a success, the creature " +
                            "ceases to be affected by the barrier."
                ),
        /**
         * target for table and auto rolls
         */
        "bag of beans" to
                MagicItem(
                    name = "Bag of Beans",
                    description = "\n\tInside this heavy cloth bag are 3d4 dry beans. The bag " +
                            "weighs 1/2 pound plus 1/4 pound for each bean it contains." +
                            "\n\tIf you dump the bag's contents out on the ground, they explode " +
                            "in a 10-foot radius, extending from the beans. Each creature in the " +
                            "area, including you, must make a DC 15 Dexterity saving throw, " +
                            "taking 5d4 fire damage on a failed save, or half as much damage on " +
                            "a successful one. The fire ignites flammable objects in the area " +
                            "that aren't being worn or carried." +
                            "\n\tIf you remove a bean from the bag, plant it in dirt or sand, " +
                            "and then water it, the bean produces an effect 1 minute later from " +
                            "the ground where it was planted. The GM can choose an effect from " +
                            "the following table, determine it randomly, or create an effect." +
                            "\n\td100\tEffect" +
                            "\n\t01\t5d4 toadstools sprout. If a creature eats a toadstool, roll " +
                            "any die. On an odd roll, the eater must succeed on a DC 15 " +
                            "Constitution saving throw or take 5d6 poison damage and become " +
                            "poisoned for 1 hour. On an even roll, the eater gains 5d6 temporary " +
                            "hit points for 1 hour." +
                            "\n\t02-10\tA geyser erupts and spouts water, beer, berry juice, tea, " +
                            "vinegar, wine, or oil (GM's choice) 30 feet into the air for " +
                            "1d12 rounds." +
                            "\n\t11-20\tA treant sprouts. There's a 50 percent chance that the " +
                            "treant is chaotic evil and attacks." +
                            "\n\t21-30\tAn animate, immobile stone statue in your likeness rises. " +
                            "It makes verbal threats against you. If you leave it and others come " +
                            "near, it describes you as the most heinous of villains and directs " +
                            "the newcomers to find and attack you. If you are on the same plane " +
                            "of existence as the statue, it knows where you are. The statue " +
                            "becomes inanimate after 24 hours." +
                            "\n\t31-40\tA campfire with blue flames springs forth and burns for " +
                            "24 hours (or until it is extinguished)." +
                            "\n\t41-50\t1d6 + 6 shriekers sprout" +
                            "\n\t51-60\t1d4 + 8 bright pink toads crawl forth. Whenever a toad " +
                            "is touched, it transforms into a Large or smaller monster of the " +
                            "GM's choice. The monster remains for 1 minute, then disappears in a " +
                            "puff of bright pink smoke." +
                            "\n\t61-70\tA hungry bulette burrows up and attacks." +
                            "\n\t71-80\tA fruit tree grows. It has 1d10 + 20 fruit, 1d8 of which " +
                            "act as randomly determined magic potions, while one acts as an " +
                            "ingested poison of the GM's choice. The tree vanishes after 1 hour. " +
                            "Picked fruit remains, retaining any magic for 30 days." +
                            "\n\t81-90\tA nest of 1d4 + 3 eggs springs up. Any creature that eats " +
                            "an egg must make a DC 20 Constitution saving throw. On a successful " +
                            "save, a creature permanently increases its lowest ability score by " +
                            "1, randomly choosing among equally low scores. On a failed save, " +
                            "the creature takes 10d6 force damage from an internal " +
                            "magical explosion." +
                            "\n\t91-99\tA pyramid with a 60-foot‐square base bursts upward. " +
                            "Inside is a sarcophagus containing a mummy lord. The pyramid is " +
                            "treated as the mummy lord's lair, and its sarcophagus contains " +
                            "treasure of the GM's choice." +
                            "\n\t00\tA giant beanstalk sprouts, growing to a height of the GM's " +
                            "choice. The top leads where the GM chooses, such as to a great view, " +
                            "a cloud giant's castle, or a different plane of existence."
                ),
        /**
         * target for auto rolls
         */
        "bead of force" to
                MagicItem(
                    name = "Bead of Force",
                    description = "\n\tThis small black sphere measures 3/4 of an inch in " +
                            "diameter and weighs an ounce. Typically, 1d4 + 4 beads of force " +
                            "are found together." +
                            "\n\tYou can use an action to throw the bead up to 60 feet. The " +
                            "bead explodes on impact and is destroyed. Each creature within a " +
                            "10-foot radius of where the bead landed must succeed on a DC 15 " +
                            "Dexterity saving throw or take 5d4 force damage. A sphere of " +
                            "transparent force then encloses the area for 1 minute. Any creature " +
                            "that failed the save and is completely within the area is trapped " +
                            "inside this sphere. Creatures that succeeded on the save, or are " +
                            "partially within the area, are pushed away from the center of the " +
                            "sphere until they are no longer inside it. Only breathable air can " +
                            "pass through the sphere's wall. No attack or other effect can." +
                            "\n\tAn enclosed creature can use its action to push against the " +
                            "sphere's wall, moving the sphere up to half the creature's walking " +
                            "speed. The sphere can be picked up, and its magic causes it to " +
                            "weigh only 1 pound, regardless of the weight of creatures inside."
                ),
        "chime of opening" to
                MagicItem(
                    name = "Chime of Opening",
                    description = "\n\tThis hollow metal tube measures about 1 foot long and " +
                            "weighs 1 pound. You can strike it as an action, pointing it at an " +
                            "object within 120 feet of you that can be opened, such as a door, " +
                            "lid, or lock. The chime issues a clear tone, and one lock or latch " +
                            "on the object opens unless the sound can't reach the object. If no " +
                            "locks or latches remain, the object itself opens." +
                            "\n\tThe chime can be used ten times. After the tenth time, it " +
                            "cracks and becomes useless."
                ),
        /**
         * target for auto roll and tables
         */
        "decanter of endless water" to
                MagicItem(
                    name = "Decanter of Endless Water",
                    description = "\n\tThis stoppered flask sloshes when shaken, as if it " +
                            "contains water. The decanter weighs 2 pounds." +
                            "\n\tYou can use an action to remove the stopper and speak one of " +
                            "three command words, whereupon an amount of fresh water or salt " +
                            "water (your choice) pours out of the flask. The water stops pouring " +
                            "out at the start of your next turn. Choose from the following options:" +
                            "\n\t\"Stream\" produces 1 gallon of water." +
                            "\n\t\"Fountain\" produces 5 gallons of water." +
                            "\n\t\"Geyser\" produces 30 gallons of water that gushes forth in a " +
                            "geyser 30 feet long and 1 foot wide. As a bonus action while holding " +
                            "the decanter, you can aim the geyser at a creature you can see " +
                            "within 30 feet of you. The target must succeed on a DC 13 Strength " +
                            "saving throw or take 1d4 bludgeoning damage and fall prone. Instead " +
                            "of a creature, you can target an object that isn't being worn or " +
                            "carried and that weighs no more than 200 pounds. The object is " +
                            "either knocked over or pushed up to 15 feet away from you."
                ),
        "eyes of minute seeing" to
                MagicItem(
                    name = "Eyes of Minute Seeing",
                    description = "\n\tThese crystal lenses fit over the eyes. While wearing " +
                            "them, you can see much better than normal out to a range of 1 foot. " +
                            "You have advantage on Intelligence (Investigation) checks that rely " +
                            "on sight while searching an area or studying an object within that range."
                ),
        "folding boat" to
                MagicItem(
                    name = "Folding Boat",
                    description = "\n\tThis object appears as a wooden box that measures 12 " +
                            "inches long, 6 inches wide, and 6 inches deep. It weighs 4 pounds " +
                            "and floats. It can be opened to store items inside. This item also " +
                            "has three command words, each requiring you to use an action to " +
                            "speak it." +
                            "\n\tOne command word causes the box to unfold into a boat 10 feet " +
                            "long, 4 feet wide, and 2 feet deep. The boat has one pair of oars, " +
                            "an anchor, a mast, and a lateen sail. The boat can hold up to four " +
                            "Medium creatures comfortably." +
                            "\n\tThe second command word causes the box to unfold into a ship 24 " +
                            "feet long, 8 feet wide, and 6 feet deep. The ship has a deck, rowing " +
                            "seats, five sets of oars, a steering oar, an anchor, a deck cabin, " +
                            "and a mast with a square sail. The ship can hold fifteen Medium " +
                            "creatures comfortably." +
                            "\n\tWhen the box becomes a vessel, its weight becomes that of a " +
                            "normal vessel its size, and anything that was stored in the box " +
                            "remains in the boat." +
                            "\n\tThe third command word causes the folding boat to fold back " +
                            "into a box, provided that no creatures are aboard. Any objects in " +
                            "the vessel that can't fit inside the box remain outside the box as " +
                            "it folds. Any objects in the vessel that can fit inside the box do so."
                ),
        "heward's handy haversack" to
                MagicItem(
                    name = "Heward's Handy Haversack",
                    description = "\n\tThis backpack has a central pouch and two side pouches, " +
                            "each of which is an extradimensional space. Each side pouch can " +
                            "hold up to 20 pounds of material, not exceeding a volume of 2 cubic " +
                            "feet. The large central pouch can hold up to 8 cubic feet or 80 " +
                            "pounds of material. The backpack always weighs 5 pounds, regardless " +
                            "of its contents." +
                            "\n\tPlacing an object in the haversack follows the normal rules " +
                            "for interacting with objects. Retrieving an item from the haversack " +
                            "requires you to use an action. When you reach into the haversack " +
                            "for a specific item, the item is always magically on top." +
                            "\n\tThe haversack has a few limitations. If it is overloaded, or if " +
                            "a sharp object pierces it or tears it, the haversack ruptures and " +
                            "is destroyed. If the haversack is destroyed, its contents are lost " +
                            "forever, although an artifact always turns up again somewhere. If " +
                            "the haversack is turned inside out, its contents spill forth, " +
                            "unharmed, and the haversack must be put right before it can be " +
                            "used again. If a breathing creature is placed within the haversack, " +
                            "the creature can survive for up to 10 minutes, after which time it " +
                            "begins to suffocate." +
                            "\n\tPlacing the haversack inside an extradimensional space created " +
                            "by a bag of holding, portable hole, or similar item instantly " +
                            "destroys both items and opens a gate to the Astral Plane. The gate " +
                            "originates where the one item was placed inside the other. Any " +
                            "creature within 10 feet of the gate is sucked through it and " +
                            "deposited in a random location on the Astral Plane. The gate then " +
                            "closes. The gate is one-way only and can't be reopened."
                ),
        "horseshoes of speed" to
                MagicItem(
                    name = "Horseshoes of Speed",
                    description = "\n\tThese iron horseshoes come in a set of four. While all " +
                            "four shoes are affixed to the hooves of a horse or similar creature, " +
                            "they increase the creature's walking speed by 30 feet."
                ),
        /**
         * target for auto rolls
         */
        "necklace of fireballs" to
                MagicItem(
                    name = "Necklace of Fireballs",
                    description = "\n\tThis necklace has 1d6 + 3 beads hanging from it. You can " +
                            "use an action to detach a bead and throw it up to 60 feet away. When " +
                            "it reaches the end of its trajectory, the bead detonates as a " +
                            "3rd-level fireball spell (save DC 15)." +
                            "\n\tYou can hurl multiple beads, or even the whole necklace, as one " +
                            "action. When you do so, increase the level of the fireball by 1 for " +
                            "each bead beyond the first."
                ),
        "periapt of health" to
                MagicItem(
                    name = "Periapt of Health",
                    description = "\n\tYou are immune to contracting any disease while you wear " +
                            "this pendant. If you are already infected with a disease, the " +
                            "effects of the disease are suppressed while you wear the pendant."
                ),
        "sending stones" to
                MagicItem(
                    name = "Sending Stones",
                    description = "\n\tSending Stones come in pairs, with each smooth stone " +
                            "carved to match the other so the pairing is easily recognized. " +
                            "While you touch one stone, you can use an action to cast the " +
                            "sending spell from it. The target is the bearer of the other " +
                            "stone. If no creature bears the other stone, you know that fact " +
                            "as soon as you use the stone and don't cast the spell." +
                            "\n\tOnce sending is cast through the stones, they can't be used " +
                            "again until the next dawn. If one of the stones in a pair is " +
                            "destroyed, the other one becomes nonmagical. "
                )
    )
}