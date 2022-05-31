package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListBName(magicRoll: Int): String? {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsB.magicItems["greater potion of healing"]?.name.toString()
        in 16..22 -> MagicItemsB.magicItems["potion of fire breath"]?.name.toString()
        in 23..29 -> MagicItemsB.magicItems["potion of resistance"]?.name.toString()
        in 30..34 -> MagicItemsB.magicItems["+1 ammunition"]?.name.toString()
        in 35..39 -> MagicItemsB.magicItems["potion of animal friendship"]?.name.toString()
        in 40..44 -> MagicItemsB.magicItems["potion of hill giant strength"]?.name.toString()
        in 45..49 -> MagicItemsB.magicItems["potion of growth"]?.name.toString()
        in 50..54 -> MagicItemsB.magicItems["potion of water breathing"]?.name.toString()
        in 55..59 -> MagicItemsB.magicItems["2nd level spell scroll"]?.name.toString()
        in 60..64 -> MagicItemsB.magicItems["3rd level spell scroll"]?.name.toString()
        in 65..67 -> MagicItemsB.magicItems["bag of holding"]?.name.toString()
        in 68..70 -> MagicItemsB.magicItems["keoghtom's ointment"]?.name.toString()
        in 71..73 -> MagicItemsB.magicItems["oil of slipperiness"]?.name.toString()
        in 74..75 -> MagicItemsB.magicItems["dust of disappearance"]?.name.toString()
        in 76..77 -> MagicItemsB.magicItems["dust of dryness"]?.name.toString()
        in 78..79 -> MagicItemsB.magicItems["dust of sneezing and choking"]?.name.toString()
        in 80..81 -> MagicItemsB.magicItems["elemental gem"]?.name.toString()
        in 82..83 -> MagicItemsB.magicItems["philter of love"]?.name.toString()
        84 -> MagicItemsB.magicItems["alchemy jug"]?.name.toString()
        85 -> MagicItemsB.magicItems["cap of water breathing"]?.name.toString()
        86 -> MagicItemsB.magicItems["cloak of the manta ray"]?.name.toString()
        87 -> MagicItemsB.magicItems["driftglobe"]?.name.toString()
        88 -> MagicItemsB.magicItems["goggles of night"]?.name.toString()
        89 -> MagicItemsB.magicItems["helm of comprehending languages"]?.name.toString()
        90 -> MagicItemsB.magicItems["immovable rod"]?.name.toString()
        91 -> MagicItemsB.magicItems["lantern of revealing"]?.name.toString()
        92 -> MagicItemsB.magicItems["mariner's armor"]?.name.toString()
        93 -> MagicItemsB.magicItems["mithral armor"]?.name.toString()
        94 -> MagicItemsB.magicItems["potion of poison"]?.name.toString()
        95 -> MagicItemsB.magicItems["ring of swimming"]?.name.toString()
        96 -> MagicItemsB.magicItems["robe of useful items"]?.name.toString()
        97 -> MagicItemsB.magicItems["rope of climbing"]?.name.toString()
        98 -> MagicItemsB.magicItems["saddle of the cavalier"]?.name.toString()
        99 -> MagicItemsB.magicItems["wand of magic detection"]?.name.toString()
        else -> MagicItemsB.magicItems["wand of secrets"]?.name.toString()
    }

    return result
}

fun rollListBDescription(magicRoll: Int): String? {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsB.magicItems["greater potion of healing"]?.description.toString()
        in 16..22 -> MagicItemsB.magicItems["potion of fire breath"]?.description.toString()
        in 23..29 -> MagicItemsB.magicItems["potion of resistance"]?.description.toString()
        in 30..34 -> MagicItemsB.magicItems["+1 ammunition"]?.description.toString()
        in 35..39 -> MagicItemsB.magicItems["potion of animal friendship"]?.description.toString()
        in 40..44 -> MagicItemsB.magicItems["potion of hill giant strength"]?.description.toString()
        in 45..49 -> MagicItemsB.magicItems["potion of growth"]?.description.toString()
        in 50..54 -> MagicItemsB.magicItems["potion of water breathing"]?.description.toString()
        in 55..59 -> MagicItemsB.magicItems["2nd level spell scroll"]?.description.toString()
        in 60..64 -> MagicItemsB.magicItems["3rd level spell scroll"]?.description.toString()
        in 65..67 -> MagicItemsB.magicItems["bag of holding"]?.description.toString()
        in 68..70 -> MagicItemsB.magicItems["keoghtom's ointment"]?.description.toString()
        in 71..73 -> MagicItemsB.magicItems["oil of slipperiness"]?.description.toString()
        in 74..75 -> MagicItemsB.magicItems["dust of disappearance"]?.description.toString()
        in 76..77 -> MagicItemsB.magicItems["dust of dryness"]?.description.toString()
        in 78..79 -> MagicItemsB.magicItems["dust of sneezing and choking"]?.description.toString()
        in 80..81 -> MagicItemsB.magicItems["elemental gem"]?.description.toString()
        in 82..83 -> MagicItemsB.magicItems["philter of love"]?.description.toString()
        84 -> MagicItemsB.magicItems["alchemy jug"]?.description.toString()
        85 -> MagicItemsB.magicItems["cap of water breathing"]?.description.toString()
        86 -> MagicItemsB.magicItems["cloak of the manta ray"]?.description.toString()
        87 -> MagicItemsB.magicItems["driftglobe"]?.description.toString()
        88 -> MagicItemsB.magicItems["goggles of night"]?.description.toString()
        89 -> MagicItemsB.magicItems["helm of comprehending languages"]?.description.toString()
        90 -> MagicItemsB.magicItems["immovable rod"]?.description.toString()
        91 -> MagicItemsB.magicItems["lantern of revealing"]?.description.toString()
        92 -> MagicItemsB.magicItems["mariner's armor"]?.description.toString()
        93 -> MagicItemsB.magicItems["mithral armor"]?.description.toString()
        94 -> MagicItemsB.magicItems["potion of poison"]?.description.toString()
        95 -> MagicItemsB.magicItems["ring of swimming"]?.description.toString()
        96 -> MagicItemsB.magicItems["robe of useful items"]?.description.toString()
        97 -> MagicItemsB.magicItems["rope of climbing"]?.description.toString()
        98 -> MagicItemsB.magicItems["saddle of the cavalier"]?.description.toString()
        99 -> MagicItemsB.magicItems["wand of magic detection"]?.description.toString()
        else -> MagicItemsB.magicItems["wand of secrets"]?.description.toString()
    }

    return result
}

object MagicItemsB {
    val magicItems = mapOf<String, MagicItem>(
        "greater potion of healing" to
                MagicItem(
                    name = "Greater Potion of Healing",
                    description = "\n\tYou regain 4d4 + 4 hit points when you drink this potion. The potion's red " +
                            "\n\tliquid glimmers when agitated."
                ),
        "potion of fire breath" to
                MagicItem(
                    name = "Potion of Fire Breath",
                    description = "\n\tAfter drinking this potion, you can use a bonus action to exhale fire at " +
                            "\n\ta target within 30 feet of you. The target must make a DC 13 Dexterity saving throw," +
                            "\n\ttaking 4d6 fire damage on a failed save, or half as much damage on a successful " +
                            "\n\tone. The effect ends after you exhale the fire three times or when 1 hour " +
                            "\n\thas passed." +
                            "\n\tThis potion's orange liquid flickers, and smoke fills the top of the container" +
                            "\n\tand wafts out whenever it is opened."
                ),
        "potion of resistance" to
                MagicItem(
                    name = "Potion of Resistance",
                    description = "\n\tWhen you drink this potion, you gain resistance to one type of damage for" +
                            "\n\t1 hour. The DM chooses the type or determines it randomly from the options below." +
                            "\n\td10" +
                            "\tDamage Type\n" +
                            "\t1\tAcid\n" +
                            "\t2\tCold\n" +
                            "\t3\tFire\n" +
                            "\t4\tForce\n" +
                            "\t5\tLightning\n" +
                            "\t6\tNecrotic\n" +
                            "\t7\tPoison\n" +
                            "\t8\tPsychic\n" +
                            "\t9\tRadiant\n" +
                            "\t10\tThunder"
                ),
        "+1 ammunition" to
                MagicItem(
                    name = "+1 Ammunition",
                    description = "\n\tYou have a +1 bonus to attack and damage rolls made with this piece " +
                            "\n\tof magic ammunition. Once it hits a target, the ammunition is no longer magical."
                ),
        "potion of animal friendship" to
                MagicItem(
                    name = "Potion of Animal Friendship",
                    description = "\n\tWhen you drink this potion, you can cast the animal friendship spell " +
                            "\n\t(save DC 13) for 1 hour at will. Agitating this muddy liquid brings little bits " +
                            "\n\tinto view: a fish scale, a hummingbird tongue, a cat claw, or a squirrel hair."
                ),
        "potion of hill giant strength" to
                MagicItem(
                    name = "Potion of Hill Giant Strength",
                    description = "\n\tWhen you drink this potion, your Strength score changes to 21 for 1 hour. " +
                            "\n\tThe potion has no effect on you if your Strength is equal to or greater " +
                            "\n\tthan that score." +
                            "\n\tThis potion's transparent liquid has floating in it a sliver of " +
                            "\n\tfingernail from a hill giant."
                ),
        "potion of growth" to
                MagicItem(
                    name = "Potion of Growth",
                    description = "\n\tWhen you drink this potion, you gain the \"enlarge\" effect of " +
                            "\n\tthe enlarge/reduce spell for 1d4 hours (no concentration required). " +
                            "\n\tThe red in the potion's liquid continuously expands from a tiny bead to " +
                            "\n\tcolor the clear liquid around it and then contracts. Shaking the bottle fails " +
                            "\n\tto interrupt this process."
                ),
        "potion of water breathing" to
                MagicItem(
                    name = "Potion of Water Breathing",
                    description = "\n\tYou can breathe underwater for 1 hour after drinking this potion. " +
                            "\n\tIts cloudy green fluid smells of the sea and has a jellyfish-like bubble " +
                            "\n\tfloating in it."
                ),
        "2nd level spell scroll" to
                MagicItem(
                    name = "2nd Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written in a mystical cipher. " +
                            "\n\tIf the spell is on your class’s spell list, you can read the scroll and cast its spell " +
                            "\n\twithout providing any material components. Otherwise, the scroll is unintelligible. " +
                            "\n\tCasting the spell by reading the scroll requires the spell’s normal casting time. Once " +
                            "\n\tthe spell is cast, the words on the scroll fade, and it crumbles to dust. If the casting" +
                            "\n\tis interrupted, the scroll is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level than you can normally " +
                            "\n\tcast, you must make an ability check using your spellcasting ability to determine " +
                            "\n\twhether you cast it successfully. The DC equals 12. On a failed check, the spell " +
                            "\n\tdisappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 2nd level spell. The spell's saving throw DC is 13 and attack " +
                            "\n\tbonus is +5." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can be " +
                            "\n\tcopied. When a spell is copied from a spell scroll, the copier must succeed on an " +
                            "\n\tIntelligence (Arcana) check with a DC equal to 12. If the check succeeds, the spell is " +
                            "\n\tsuccessfully copied. Whether the check succeeds or fails, the spell scroll is destroyed."
                ),
        "3rd level spell scroll" to
                MagicItem(
                    name = "3rd Level Spell Scroll",
                    description = "\n\tA spell scroll bears the words of a single spell, written in a mystical " +
                            "\n\tcipher. If the spell is on your class’s spell list, you can read the scroll and " +
                            "\n\tcast its spell without providing any material components. Otherwise, the scroll " +
                            "\n\tis unintelligible. Casting the spell by reading the scroll requires the spell’s " +
                            "\n\tnormal casting time. Once the spell is cast, the words on the scroll fade, and it " +
                            "\n\tcrumbles to dust. If the casting is interrupted, the scroll is not lost." +
                            "\n\tIf the spell is on your class’s spell list but of a higher level than you can " +
                            "\n\tnormally cast, you must make an ability check using your spellcasting ability to " +
                            "\n\tdetermine whether you cast it successfully. The DC equals 13. On a failed check, " +
                            "\n\tthe spell disappears from the scroll with no other effect." +
                            "\n\tThis scroll contains a 3rd level spell. The spell's saving throw DC is 15 and " +
                            "\n\tattack bonus is +7." +
                            "\n\tA wizard spell on a spell scroll can be copied just as spells in spellbooks can " +
                            "\n\tbe copied. When a spell is copied from a spell scroll, the copier must succeed " +
                            "\n\ton an Intelligence (Arcana) check with a DC equal to 13. If the check succeeds, " +
                            "\n\tthe spell is successfully copied. Whether the check succeeds or fails, the spell " +
                            "\n\tscroll is destroyed."
                ),
        "bag of holding" to
                MagicItem(
                    name = "Bag of Holding",
                    description = "\n\tThis bag has an interior space considerably larger than its outside " +
                            "\n\tdimensions, roughly 2 feet in diameter at the mouth and 4 feet deep. The bag can " +
                            "\n\thold up to 500 pounds, not exceeding a volume of 64 cubic feet. The bag weighs 15 " +
                            "\n\tpounds, regardless of its contents. Retrieving an item from the bag requires an " +
                            "\n\taction. If the bag is overloaded, pierced, or torn, it ruptures and is " +
                            "\n\tdestroyed, and its contents are scattered in the Astral Plane. If the bag is " +
                            "\n\tturned inside out, its contents spill forth, unharmed, but the bag must be " +
                            "\n\tput right before it can be used again. Breathing creatures inside the bag " +
                            "\n\tcan survive up to a number of minutes equal to 10 divided by the number of " +
                            "\n\tcreatures (minimum 1 minute), after which time they begin to suffocate." +
                            "\n\tPlacing a bag of holding inside an extradimensional space created by a " +
                            "\n\thandy haversack, portable hole, or similar item instantly destroys both " +
                            "\n\titems and opens a gate to the Astral Plane. The gate originates where the " +
                            "\n\tone item was placed inside the other. Any creature within 10 feet of the " +
                            "\n\tgate is sucked through it to a random location on the Astral Plane. The gate " +
                            "\n\tthen closes. The gate is one-way only and can’t be reopened."
                ),
        "keoghtom's ointment" to
                MagicItem(
                    name = "Keoghtom's Ointment",
                    description = "\n\tThis glass jar, 3 inches in diameter, contains 1d4 + 1 doses of a " +
                            "\n\tthick mixture that smells faintly of aloe. The jar and its contents " +
                            "\n\tweigh 1/2 pound." +
                            "\n\tAs an action, one dose of the ointment can be swallowed or applied to " +
                            "\n\tthe skin. The creature that receives it regains 2d8 + 2 hit points, ceases " +
                            "\n\tto be poisoned, and is cured of any disease."
                ),
        "oil of slipperiness" to
                MagicItem(
                    name = "Oil of Slipperiness",
                    description = "\n\tThis sticky black unguent is thick and heavy in the container, but " +
                            "\n\tit flows quickly when poured. The oil can cover a Medium or smaller " +
                            "\n\tcreature, along with the equipment it's wearing and carrying (one " +
                            "\n\tadditional vial is required for each size category above Medium). " +
                            "\n\tApplying the oil takes 10 minutes. The affected creature then gains the " +
                            "\n\teffect of a freedom of movement spell for 8 hours." +
                            "\n\tAlternatively, the oil can be poured on the ground as an action, where " +
                            "\n\tit covers a 10-foot square, duplicating the effect of the grease spell " +
                            "\n\tin that area for 8 hours."
                ),
        "dust of disappearance" to
                MagicItem(
                    name = "Dust of Disappearance",
                    description = "\n\tFound in a small packet, this powder resembles very fine sand. There " +
                            "\n\tis enough of it for one use. When you use an action to throw the dust into " +
                            "\n\tthe air, you and each creature and object within 10 feet of you become " +
                            "\n\tinvisible for 2d4 minutes. The duration is the same for all subjects, and the " +
                            "\n\tdust is consumed when its magic takes effect. If a creature affected by the " +
                            "\n\tdust attacks or casts a spell, the invisibility ends for that creature."
                ),
        "dust of dryness" to
                MagicItem(
                    name = "Dust of Dryness",
                    description = "\n\tThis small packet contains 1d6 + 4 pinches of dust. You can use " +
                            "\n\tan action to sprinkle a pinch of it over water. The dust turns a cube of " +
                            "\n\twater 15 feet on a side into one marble-sized pellet, which floats or rests " +
                            "\n\tnear where the dust was sprinkled. The pellet's weight is negligible." +
                            "\n\tSomeone can use an action to smash the pellet against a hard surface, causing " +
                            "\n\tthe pellet to shatter and release the water the dust absorbed. Doing so ends " +
                            "\n\tthat pellet's magic." +
                            "\n\tAn elemental composed mostly of water that is exposed to a pinch of the " +
                            "\n\tdust must make a DC 13 Constitution saving throw, taking 10d6 necrotic damage " +
                            "\n\ton a failed save, or half as much damage on a successful one."
                ),
        "dust of sneezing and choking" to
                MagicItem(
                    name = "Dust of Sneezing and Choking",
                    description = "\n\tFound in a small container, this powder resembles very fine sand. " +
                            "\n\tIt appears to be dust of disappearance, and an identify spell reveals it to " +
                            "\n\tbe such. There is enough of it for one use.\n" +
                            "\n\tWhen you use an action to throw a handful of the dust into the air, " +
                            "\n\tyou and each creature that needs to breathe within 30 feet of you must " +
                            "\n\tsucceed on a DC 15 Constitution saving throw or become unable to breathe, " +
                            "\n\twhile sneezing uncontrollably. A creature affected in this way is incapacitated " +
                            "\n\tand suffocating. As long as it is conscious, a creature can repeat the saving " +
                            "\n\tthrow at the end of each of its turns, ending the effect on it on a success. " +
                            "\n\tThe lesser restoration spell can also end the effect on a creature."
                ),
        "elemental gem" to
                MagicItem(
                    name = "Elemental Gem",
                    description = "\n\tThis gem contains a mote of elemental energy. When you use an " +
                            "\n\taction to break the gem, an elemental is summoned as if you had cast the " +
                            "\n\tconjure elemental spell, and the gem's magic is lost. The type of gem determines " +
                            "\n\tthe elemental summoned by the spell." +
                            "\n\tGem\tSummoned Elemental" +
                            "\n\tBlue Sapphire\tAir Elemental" +
                            "\n\tYellow Diamond\tEarth Elemental" +
                            "\n\tRed Corundum\tFire Elemental" +
                            "\n\tEmerald\tWater Elemental"
                ),
        "philter of love" to
                MagicItem(
                    name = "Philter of Love",
                    description = "\n\tThe next time you see a creature within 10 minutes after drinking " +
                            "\n\tthis philter, you become charmed by that creature for 1 hour. If the creature " +
                            "\n\tis of a species and gender you are normally attracted to, you regard it as your " +
                            "\n\ttrue love while you are charmed. This potion's rose-hued, effervescent liquid " +
                            "\n\tcontains one easy-to-miss bubble shaped like a heart."
                ),
        "alchemy jug" to
                MagicItem(
                    name = "Alchemy Jug",
                    description = "\n\tThis ceramic jug appears to be able to hold a gallon of liquid and " +
                            "\n\tweighs 12 pounds whether full or empty. Sloshing sounds can be heard from " +
                            "\n\twithin the jug when it is shaken, even if the jug is empty." +
                            "\n\tYou can use an action and name one liquid from the table below to cause " +
                            "\n\tthe jug to produce the chosen liquid. Afterward, you can uncork the jug as " +
                            "\n\tan action and pour that liquid out, up to 2 gallons per minute. The maximum " +
                            "\n\tamount of liquid the jug can produce depends on the liquid you named." +
                            "\n\tOnce the jug starts producing a liquid, it can't produce a different one, or " +
                            "\n\tmore of one that has reached its maximum, until the next dawn." +
                            "\n\tLiquid\tMax Amount" +
                            "\n\tAcid\t8 ounces" +
                            "\n\tBasic poison\t1/2 ounce" +
                            "\n\tBeer\t4 gallons" +
                            "\n\tHoney\t1 gallon" +
                            "\n\tMayonnaise\t2 gallons" +
                            "\n\tOil\tquart" +
                            "\n\tVinegar\t2 gallons" +
                            "\n\tWater, fresh\t8 gallons" +
                            "\n\tWater, salt\t12 gallons" +
                            "\n\tWine\t1 gallon"
                ),
        "cap of water breathing" to
                MagicItem(
                    name = "Cap of Water Breathing",
                    description = "\n\tWhile wearing this cap underwater, you can speak its command word as " +
                            "\n\tan action to create a bubble of air around your head. It allows you to breathe " +
                            "\n\tnormally underwater. This bubble stays with you until you speak the command " +
                            "\n\tword again, the cap is removed, or you are no longer underwater."
                ),
        "cloak of the manta ray" to
                MagicItem(
                    name = "Cloak of the Manta Ray",
                    description = "\n\tWhile wearing this cloak with its hood up, you can breathe underwater, " +
                            "\n\tand you have a swimming speed of 60 feet. Pulling the hood up or down " +
                            "\n\trequires an action."
                ),
        "driftglobe" to
                MagicItem(
                    name = "Driftglobe",
                    description = "\n\tThis small sphere of thick glass weighs 1 pound. If you are within 60 feet of " +
                            "\n\tit, you can speak its command word and cause it to emanate the light or daylight spell." +
                            "\n\tOnce used, the daylight effect can't be used again until the next dawn." +
                            "\n\tYou can speak another command word as an action to make the illuminated globe rise " +
                            "\n\tinto the air and float no more than 5 feet off the ground. The globe hovers in this " +
                            "\n\tway until you or another creature grasps it. If you move more than 60 feet from the " +
                            "\n\thovering globe, it follows you until it is within 60 feet of you. It takes the shortest" +
                            "\n\troute to do so. If prevented from moving, the globe sinks gently to the ground and " +
                            "\n\tbecomes inactive, and its light winks out. "
                ),
        "goggles of night" to
                MagicItem(
                    name = "Goggles of Night",
                    description = "\n\tWhile wearing these dark lenses, you have darkvision out to a range " +
                            "\n\tof 60 feet. If you already have darkvision, wearing the goggles increases " +
                            "\n\tits range by 60 feet."
                ),
        "helm of comprehending languages" to
                MagicItem(
                    name = "Helm of Comprehending Languages",
                    description = "\n\tWhile wearing this helm, you can use an action to cast the comprehend " +
                            "\n\tlanguages spell from it at will."
                ),
        "immovable rod" to
                MagicItem(
                    name = "Immovable Rod",
                    description = "\n\tThis flat iron rod has a button on one end. You can use an action to " +
                            "\n\tpress the button, which causes the rod to become magically fixed in place. " +
                            "\n\tUntil you or another creature uses an action to push the button again, the " +
                            "\n\trod doesn't move, even if it is defying gravity. The rod can hold up to 8,000 " +
                            "\n\tpounds of weight. More weight causes the rod to deactivate and fall. A creature " +
                            "\n\tcan use an action to make a DC 30 Strength check, moving the fixed rod up to " +
                            "\n\t10 feet on a success."
                ),
        "lantern of revealing" to
                MagicItem(
                    name = "Lantern of Revealing",
                    description = "\n\tWhile lit, this hooded lantern burns for 6 hours on 1 pint of oil, " +
                            "\n\tshedding bright light in a 30-foot radius and dim light for an additional 30 " +
                            "\n\tfeet. Invisible creatures and objects are visible as long as they are in the " +
                            "\n\tlantern's bright light. You can use an action to lower the hood, reducing the " +
                            "\n\tlight to dim light in a 5-foot radius."
                ),
        "mariner's armor" to
                MagicItem(
                    name = "Mariner's Armor",
                    description = "\n\tWhile wearing this armor, you have a swimming speed equal to your " +
                            "\n\twalking speed. In addition, whenever you start your turn underwater with 0 " +
                            "\n\thit points, the armor causes you to rise 60 feet toward the surface. The " +
                            "\n\tarmor is decorated with fish and shell motifs." +
                            "\n\tApplicable Armor:" +
                            "\n\tName\tType\tAC\tStrength\tStealth" +
                            "\n\tPadded\tMedium\t 11 + Dex modifier\t --\t Disadvantage" +
                            "\n\tLeather\tMedium\t 11 + Dex modifier\t --\t --" +
                            "\n\tStudded Leather\tMedium\t 12 + Dex modifier\t --\t --" +
                            "\n\tHide\tMedium\t 12 + Dex modifier (max 2)\t --\t --" +
                            "\n\tChain Shirt\tMedium\t 13 + Dex modifier (max 2)\t --\t --" +
                            "\n\tScale Mail\tMedium\t 14 + Dex modifier (max 2)\t --\t Disadvantage" +
                            "\n\tBreastplate\tMedium\t 14 + Dex modifier (max 2)\t --\t --" +
                            "\n\tHalf Plate\tMedium\t 15 + Dex modifier (max 2)\t --\tDisadvantage" +
                            "\n\tRing Mail\tHeavy\t 14\t --\t Disadvantage" +
                            "\n\tChain Mail\tHeavy\t 16\t Strength 13\t Disadvantage" +
                            "\n\tSplint\tHeavy\t 17\t Strength 15\t Disadvantage" +
                            "\n\tPlate\tHeavy\t 18\t Strength 15\t Disadvantage"
                ),
        "mithral armor" to
                MagicItem(
                    name = "Mithral Armor",
                    description = "\n\tMithral is a light, flexible metal. A mithral chain shirt or breastplate " +
                            "\n\tcan be worn under normal clothes." +
                            "\n\tIf the armor normally imposes disadvantage on Dexterity (Stealth) checks or " +
                            "\n\thas a Strength requirement, the mithral version of the armor doesn't." +
                            "\n\tApplicable Armor:" +
                            "\n\tName\tType\tAC\tStrength\tStealth" +
                            "\n\tChain Shirt\tMedium\t 13 + Dex modifier (max 2)\t --\t --" +
                            "\n\tScale Mail\tMedium\t 14 + Dex modifier (max 2)\t --\t Disadvantage" +
                            "\n\tBreastplate\tMedium\t 14 + Dex modifier (max 2)\t --\t --" +
                            "\n\tHalf Plate\tMedium\t 15 + Dex modifier (max 2)\t --\tDisadvantage" +
                            "\n\tRing Mail\tHeavy\t 14\t --\t Disadvantage" +
                            "\n\tChain Mail\tHeavy\t 16\t Strength 13\t Disadvantage" +
                            "\n\tSplint\tHeavy\t 17\t Strength 15\t Disadvantage" +
                            "\n\tPlate\tHeavy\t 18\t Strength 15\t Disadvantage"
                ),
        "potion of poison" to
                MagicItem(
                    name = "Potion of Poison",
                    description = "\n\tThis concoction looks, smells, and tastes like a potion of healing " +
                            "\n\tor other beneficial potion. However, it is actually poison masked by illusion " +
                            "\n\tmagic. An identify spell reveals its true nature." +
                            "\n\tIf you drink it, you take 3d6 poison damage, and you must succeed on a " +
                            "\n\tDC 13 Constitution saving throw or be poisoned. At the start of each of your " +
                            "\n\tturns while you are poisoned in this way, you take 3d6 poison damage. At the " +
                            "\n\tend of each of your turns, you can repeat the saving throw. On a successful save, " +
                            "\n\tthe poison damage you take on your subsequent turns decreases by 1d6. The poison " +
                            "\n\tends when the damage decreases to 0."
                ),
        "ring of swimming" to
                MagicItem(
                    name = "Ring of Swimming",
                    description = "\n\tYou have a swimming speed of 40 feet while wearing this ring."
                ),
        "robe of useful items" to
                MagicItem(
                    name = "Robe of Useful Items",
                    description = "\n\tThis robe has cloth patches of various shapes and colors covering it. " +
                            "\n\tWhile wearing the robe, you can use an action to detach one of the patches, " +
                            "\n\tcausing it to become the object or creature it represents. Once the last patch " +
                            "\n\tis removed, the robe becomes an ordinary garment." +
                            "\n\tThe robe has two of each of the following patches:" +
                            "\n\tDagger" +
                            "\n\tBullseye lantern (filled and lit)" +
                            "\n\tSteel mirror" +
                            "\n\t10-foot pole" +
                            "\n\tHempen rope (50 feet, coiled)" +
                            "\n\tSack" +
                            "\n\tIn addition, the robe has 4d4 other patches. The GM chooses the patches or " +
                            "\n\tdetermines them randomly." +
                            "\n\td100\tPatch" +
                            "\n\t01-08\tBag of 100 gp" +
                            "\n\t09-15\tSilver coffer (1 foot long, 6 inches wide and deep) worth 500 gp" +
                            "\n\t16-22\tIron door (up to 10 feet wide and 10 feet high, barred on one side of " +
                            "\n\tyour choice), which you can place in an opening you can reach; it conforms to fit " +
                            "\n\tthe opening, attaching and hinging itself" +
                            "\n\t23-30\t10 gems worth 100 gp each" +
                            "\n\t31-44\tWooden ladder (24 feet long)" +
                            "\n\t45-51\tA riding horse with saddle bags" +
                            "\n\t52-59\tPit (a cube 10 feet on a side), which you can place on the ground within " +
                            "\n\t10 feet of you" +
                            "\n\t60-68\tPotion of healing (4)" +
                            "\n\t69-75\tRowboat (12 feet long)" +
                            "\n\t76-83\tSpell scroll containing one spell of 1st to 3rd level" +
                            "\n\t84-90\tMastiff (2)" +
                            "\n\t91-96\tWindow (2 feet by 4 feet, up to 2 feet deep), which you can place on a " +
                            "\n\tvertical surface you can reach" +
                            "\n\t97-00\tPortable ram"
                ),
        "rope of climbing" to
                MagicItem(
                    name = "Rope of Climbing",
                    description = "\n\tThis 60-foot length of silk rope weighs 3 pounds and can hold up to " +
                            "\n\t3,000 pounds. If you hold one end of the rope and use an action to speak the " +
                            "\n\tcommand word, the rope animates. As a bonus action, you can command the other " +
                            "\n\tend to move toward a destination you choose. That end moves 10 feet on your turn " +
                            "\n\twhen you first command it and 10 feet on each of your turns until reaching its " +
                            "\n\tdestination, up to its maximum length away, or until you tell it to stop. You can " +
                            "\n\talso tell the rope to fasten itself securely to an object or to unfasten itself, " +
                            "\n\tto knot or unknot itself, or to coil itself for carrying." +
                            "\n\tIf you tell the rope to knot, large knots appear at 1- foot intervals along the " +
                            "\n\trope. While knotted, the rope shortens to a 50-foot length and grants advantage " +
                            "\n\ton checks made to climb it." +
                            "\n\tThe rope has AC 20 and 20 hit points. It regains 1 hit point every 5 minutes as " +
                            "\n\tlong as it has at least 1 hit point. If the rope drops to 0 hit points, it " +
                            "\n\tis destroyed."
                ),
        "saddle of the cavalier" to
                MagicItem(
                    name = "Saddle of the Cavalier",
                    description = "\n\tWhile in this saddle on a mount, you can't be dismounted against your " +
                            "\n\twill if you're conscious, and attack rolls against the mount have disadvantage."
                ),
        "wand of magic detection" to
                MagicItem(
                    name = "Wand of Magic Detection",
                    description = "\n\tThis wand has 3 charges. While holding it, you can expend 1 charge as " +
                            "\n\tan action to cast the detect magic spell from it. The wand regains 1d3 expended " +
                            "\n\tcharges daily at dawn."
                ),
        "wand of secrets" to
                MagicItem(
                    name = "Wand of Secrets",
                    description = "\n\tThe wand has 3 charges. While holding it, you can use an action to " +
                            "\n\texpend 1 of its charges, and if a secret door or trap is within 30 feet of you, " +
                            "\n\tthe wand pulses and points at the one nearest to you. The wand regains 1d3 " +
                            "\n\texpended charges daily at dawn."
                )
    )
}