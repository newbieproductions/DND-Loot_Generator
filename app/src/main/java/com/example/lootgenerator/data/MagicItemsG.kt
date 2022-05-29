package com.example.lootgenerator.data

import com.example.dndlootgenerator.model.MagicItem

fun rollListGName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..11 -> MagicItemsG.magicItems["+2 weapon"]?.name.toString()
        in 12..14 -> MagicItemsG.magicItems["figurine of wondrous power"]?.name.toString()
        15 -> MagicItemsG.magicItems["adamantine breastplate"]?.name.toString()
        16 -> MagicItemsG.magicItems["adamantine splint"]?.name.toString()
        17 -> MagicItemsG.magicItems["amulet of health"]?.name.toString()
        18 -> MagicItemsG.magicItems["armor of vulnerability"]?.name.toString()
        19 -> MagicItemsG.magicItems["arrow-catching shield"]?.name.toString()
        20 -> MagicItemsG.magicItems["belt of dwarvenkind"]?.name.toString()
        21 -> MagicItemsG.magicItems["belt of hill giant strength"]?.name.toString()
        22 -> MagicItemsG.magicItems["berserker axe"]?.name.toString()
        23 -> MagicItemsG.magicItems["boots of levitation"]?.name.toString()
        24 -> MagicItemsG.magicItems["boots of speed"]?.name.toString()
        25 -> MagicItemsG.magicItems["bowl of commanding water elementals"]?.name.toString()
        26 -> MagicItemsG.magicItems["bracers of defense"]?.name.toString()
        27 -> MagicItemsG.magicItems["brazier of commanding fire elementals"]?.name.toString()
        28 -> MagicItemsG.magicItems["cape of the mountebank"]?.name.toString()
        29 -> MagicItemsG.magicItems["censer of controlling air elementals"]?.name.toString()
        30 -> MagicItemsG.magicItems["+1 chain mail"]?.name.toString()
        31 -> MagicItemsG.magicItems["chain mail of resistance"]?.name.toString()
        32 -> MagicItemsG.magicItems["+1 chain shirt"]?.name.toString()
        33 -> MagicItemsG.magicItems["chain shirt of resistance"]?.name.toString()
        34 -> MagicItemsG.magicItems["cloak of displacement"]?.name.toString()
        35 -> MagicItemsG.magicItems["cloak of the bat"]?.name.toString()
        36 -> MagicItemsG.magicItems["cube of force"]?.name.toString()
        37 -> MagicItemsG.magicItems["daern's instant fortress"]?.name.toString()
        38 -> MagicItemsG.magicItems["dagger of venom"]?.name.toString()
        39 -> MagicItemsG.magicItems["dimensional shackles"]?.name.toString()
        40 -> MagicItemsG.magicItems["dragon slayer"]?.name.toString()
        41 -> MagicItemsG.magicItems["elven chain"]?.name.toString()
        42 -> MagicItemsG.magicItems["flame tongue"]?.name.toString()
        43 -> MagicItemsG.magicItems["gem of seeing"]?.name.toString()
        44 -> MagicItemsG.magicItems["giant slayer"]?.name.toString()
        45 -> MagicItemsG.magicItems["glamoured studded leather"]?.name.toString()
        46 -> MagicItemsG.magicItems["helm of teleportation"]?.name.toString()
        47 -> MagicItemsG.magicItems["horn of blasting"]?.name.toString()
        48 -> MagicItemsG.magicItems["horn of valhalla"]?.name.toString()
        49 -> MagicItemsG.magicItems["canaith mandolin"]?.name.toString()
        50 -> MagicItemsG.magicItems["cli lyre"]?.name.toString()
        51 -> MagicItemsG.magicItems["ioun stone of awareness"]?.name.toString()
        52 -> MagicItemsG.magicItems["ioun stone of protection"]?.name.toString()
        53 -> MagicItemsG.magicItems["ioun stone of reserve"]?.name.toString()
        54 -> MagicItemsG.magicItems["ioun stone of sustenance"]?.name.toString()
        55 -> MagicItemsG.magicItems["iron bands of bilarro"]?.name.toString()
        56 -> MagicItemsG.magicItems["+1 leather armor"]?.name.toString()
        57 -> MagicItemsG.magicItems["leather armor of resistance"]?.name.toString()
        58 -> MagicItemsG.magicItems["mace of disruption"]?.name.toString()
        59 -> MagicItemsG.magicItems["mace of smiting"]?.name.toString()
        60 -> MagicItemsG.magicItems["mace of terror"]?.name.toString()
        61 -> MagicItemsG.magicItems["mantle of spell resistance"]?.name.toString()
        62 -> MagicItemsG.magicItems["necklace of prayer beads"]?.name.toString()
        63 -> MagicItemsG.magicItems["periapt of proof against poison"]?.name.toString()
        64 -> MagicItemsG.magicItems["ring of animal influence"]?.name.toString()
        65 -> MagicItemsG.magicItems["ring of evasion"]?.name.toString()
        66 -> MagicItemsG.magicItems["ring of feather falling"]?.name.toString()
        67 -> MagicItemsG.magicItems["ring of free action"]?.name.toString()
        68 -> MagicItemsG.magicItems["ring of protection"]?.name.toString()
        69 -> MagicItemsG.magicItems["ring of resistance"]?.name.toString()
        70 -> MagicItemsG.magicItems["ring of spell storing"]?.name.toString()
        71 -> MagicItemsG.magicItems["ring of the ram"]?.name.toString()
        72 -> MagicItemsG.magicItems["ring of x-ray vision"]?.name.toString()
        73 -> MagicItemsG.magicItems["robe of eyes"]?.name.toString()
        74 -> MagicItemsG.magicItems["rod of rulership"]?.name.toString()
        75 -> MagicItemsG.magicItems["+2 rod of the pact keeper"]?.name.toString()
        76 -> MagicItemsG.magicItems["rope of entanglement"]?.name.toString()
        77 -> MagicItemsG.magicItems["+1 scale mail"]?.name.toString()
        78 -> MagicItemsG.magicItems["scale mail of resistance"]?.name.toString()
        79 -> MagicItemsG.magicItems["+2 shield"]?.name.toString()
        80 -> MagicItemsG.magicItems["shield of missile attraction"]?.name.toString()
        81 -> MagicItemsG.magicItems["staff of charming"]?.name.toString()
        82 -> MagicItemsG.magicItems["staff of healing"]?.name.toString()
        83 -> MagicItemsG.magicItems["staff of swarming insects"]?.name.toString()
        84 -> MagicItemsG.magicItems["staff of the woodlands"]?.name.toString()
        85 -> MagicItemsG.magicItems["staff of withering"]?.name.toString()
        86 -> MagicItemsG.magicItems["stone of controlling earth elementals"]?.name.toString()
        87 -> MagicItemsG.magicItems["sun blade"]?.name.toString()
        88 -> MagicItemsG.magicItems["sword of life stealing"]?.name.toString()
        89 -> MagicItemsG.magicItems["sword of wounding"]?.name.toString()
        90 -> MagicItemsG.magicItems["tentacle rod"]?.name.toString()
        91 -> MagicItemsG.magicItems["vicious weapon"]?.name.toString()
        92 -> MagicItemsG.magicItems["wand of binding"]?.name.toString()
        93 -> MagicItemsG.magicItems["wand of enemy detection"]?.name.toString()
        94 -> MagicItemsG.magicItems["wand of fear"]?.name.toString()
        95 -> MagicItemsG.magicItems["wand of fireballs"]?.name.toString()
        96 -> MagicItemsG.magicItems["wand of lightning bolts"]?.name.toString()
        97 -> MagicItemsG.magicItems["wand of paralysis"]?.name.toString()
        98 -> MagicItemsG.magicItems["+2 wand of the war mage"]?.name.toString()
        99 -> MagicItemsG.magicItems["wand of wonder"]?.name.toString()
        else -> MagicItemsG.magicItems["wings of flying"]?.name.toString()
    }

    return result
}

fun rollListGDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..11 -> MagicItemsG.magicItems["+2 weapon"]?.description.toString()
        in 12..14 -> MagicItemsG.magicItems["figurine of wondrous power"]?.description.toString()
        15 -> MagicItemsG.magicItems["adamantine breastplate"]?.description.toString()
        16 -> MagicItemsG.magicItems["adamantine splint"]?.description.toString()
        17 -> MagicItemsG.magicItems["amulet of health"]?.description.toString()
        18 -> MagicItemsG.magicItems["armor of vulnerability"]?.description.toString()
        19 -> MagicItemsG.magicItems["arrow-catching shield"]?.description.toString()
        20 -> MagicItemsG.magicItems["belt of dwarvenkind"]?.description.toString()
        21 -> MagicItemsG.magicItems["belt of hill giant strength"]?.description.toString()
        22 -> MagicItemsG.magicItems["berserker axe"]?.description.toString()
        23 -> MagicItemsG.magicItems["boots of levitation"]?.description.toString()
        24 -> MagicItemsG.magicItems["boots of speed"]?.description.toString()
        25 -> MagicItemsG.magicItems["bowl of commanding water elementals"]?.description.toString()
        26 -> MagicItemsG.magicItems["bracers of defense"]?.description.toString()
        27 -> MagicItemsG.magicItems["brazier of commanding fire elementals"]?.description.toString()
        28 -> MagicItemsG.magicItems["cape of the mountebank"]?.description.toString()
        29 -> MagicItemsG.magicItems["censer of controlling air elementals"]?.description.toString()
        30 -> MagicItemsG.magicItems["+1 chain mail"]?.description.toString()
        31 -> MagicItemsG.magicItems["chain mail of resistance"]?.description.toString()
        32 -> MagicItemsG.magicItems["+1 chain shirt"]?.description.toString()
        33 -> MagicItemsG.magicItems["chain shirt of resistance"]?.description.toString()
        34 -> MagicItemsG.magicItems["cloak of displacement"]?.description.toString()
        35 -> MagicItemsG.magicItems["cloak of the bat"]?.description.toString()
        36 -> MagicItemsG.magicItems["cube of force"]?.description.toString()
        37 -> MagicItemsG.magicItems["daern's instant fortress"]?.description.toString()
        38 -> MagicItemsG.magicItems["dagger of venom"]?.description.toString()
        39 -> MagicItemsG.magicItems["dimensional shackles"]?.description.toString()
        40 -> MagicItemsG.magicItems["dragon slayer"]?.description.toString()
        41 -> MagicItemsG.magicItems["elven chain"]?.description.toString()
        42 -> MagicItemsG.magicItems["flame tongue"]?.description.toString()
        43 -> MagicItemsG.magicItems["gem of seeing"]?.description.toString()
        44 -> MagicItemsG.magicItems["giant slayer"]?.description.toString()
        45 -> MagicItemsG.magicItems["glamoured studded leather"]?.description.toString()
        46 -> MagicItemsG.magicItems["helm of teleportation"]?.description.toString()
        47 -> MagicItemsG.magicItems["horn of blasting"]?.description.toString()
        48 -> MagicItemsG.magicItems["horn of valhalla"]?.description.toString()
        49 -> MagicItemsG.magicItems["canaith mandolin"]?.description.toString()
        50 -> MagicItemsG.magicItems["cli lyre"]?.description.toString()
        51 -> MagicItemsG.magicItems["ioun stone of awareness"]?.description.toString()
        52 -> MagicItemsG.magicItems["ioun stone of protection"]?.description.toString()
        53 -> MagicItemsG.magicItems["ioun stone of reserve"]?.description.toString()
        54 -> MagicItemsG.magicItems["ioun stone of sustenance"]?.description.toString()
        55 -> MagicItemsG.magicItems["iron bands of bilarro"]?.description.toString()
        56 -> MagicItemsG.magicItems["+1 leather armor"]?.description.toString()
        57 -> MagicItemsG.magicItems["leather armor of resistance"]?.description.toString()
        58 -> MagicItemsG.magicItems["mace of disruption"]?.description.toString()
        59 -> MagicItemsG.magicItems["mace of smiting"]?.description.toString()
        60 -> MagicItemsG.magicItems["mace of terror"]?.description.toString()
        61 -> MagicItemsG.magicItems["mantle of spell resistance"]?.description.toString()
        62 -> MagicItemsG.magicItems["necklace of prayer beads"]?.description.toString()
        63 -> MagicItemsG.magicItems["periapt of proof against poison"]?.description.toString()
        64 -> MagicItemsG.magicItems["ring of animal influence"]?.description.toString()
        65 -> MagicItemsG.magicItems["ring of evasion"]?.description.toString()
        66 -> MagicItemsG.magicItems["ring of feather falling"]?.description.toString()
        67 -> MagicItemsG.magicItems["ring of free action"]?.description.toString()
        68 -> MagicItemsG.magicItems["ring of protection"]?.description.toString()
        69 -> MagicItemsG.magicItems["ring of resistance"]?.description.toString()
        70 -> MagicItemsG.magicItems["ring of spell storing"]?.description.toString()
        71 -> MagicItemsG.magicItems["ring of the ram"]?.description.toString()
        72 -> MagicItemsG.magicItems["ring of x-ray vision"]?.description.toString()
        73 -> MagicItemsG.magicItems["robe of eyes"]?.description.toString()
        74 -> MagicItemsG.magicItems["rod of rulership"]?.description.toString()
        75 -> MagicItemsG.magicItems["+2 rod of the pact keeper"]?.description.toString()
        76 -> MagicItemsG.magicItems["rope of entanglement"]?.description.toString()
        77 -> MagicItemsG.magicItems["+1 scale mail"]?.description.toString()
        78 -> MagicItemsG.magicItems["scale mail of resistance"]?.description.toString()
        79 -> MagicItemsG.magicItems["+2 shield"]?.description.toString()
        80 -> MagicItemsG.magicItems["shield of missile attraction"]?.description.toString()
        81 -> MagicItemsG.magicItems["staff of charming"]?.description.toString()
        82 -> MagicItemsG.magicItems["staff of healing"]?.description.toString()
        83 -> MagicItemsG.magicItems["staff of swarming insects"]?.description.toString()
        84 -> MagicItemsG.magicItems["staff of the woodlands"]?.description.toString()
        85 -> MagicItemsG.magicItems["staff of withering"]?.description.toString()
        86 -> MagicItemsG.magicItems["stone of controlling earth elementals"]?.description.toString()
        87 -> MagicItemsG.magicItems["sun blade"]?.description.toString()
        88 -> MagicItemsG.magicItems["sword of life stealing"]?.description.toString()
        89 -> MagicItemsG.magicItems["sword of wounding"]?.description.toString()
        90 -> MagicItemsG.magicItems["tentacle rod"]?.description.toString()
        91 -> MagicItemsG.magicItems["vicious weapon"]?.description.toString()
        92 -> MagicItemsG.magicItems["wand of binding"]?.description.toString()
        93 -> MagicItemsG.magicItems["wand of enemy detection"]?.description.toString()
        94 -> MagicItemsG.magicItems["wand of fear"]?.description.toString()
        95 -> MagicItemsG.magicItems["wand of fireballs"]?.description.toString()
        96 -> MagicItemsG.magicItems["wand of lightning bolts"]?.description.toString()
        97 -> MagicItemsG.magicItems["wand of paralysis"]?.description.toString()
        98 -> MagicItemsG.magicItems["+2 wand of the war mage"]?.description.toString()
        99 -> MagicItemsG.magicItems["wand of wonder"]?.description.toString()
        else -> MagicItemsG.magicItems["wings of flying"]?.description.toString()
    }

    return result
}

object MagicItemsG {
    val magicItems = mapOf<String, MagicItem>(
        "+2 weapon" to MagicItem(
            name = "+2 Weapon",
            description = "\n\tYou have a +2 bonus to attack and damage rolls made with this magic weapon."
        ),
        "figurine of wondrous power" to MagicItem(
            name = "Figurine of Wondrous Power",
            description = "\n\tA figurine of wondrous power is a statuette of a beast small enough to fit in a" +
                    "\n\tpocket. If you use an action to speak the command word and throw the figurine to a point" +
                    "\n\ton the ground within 60 feet of you, the figurine becomes a living creature. If the" +
                    "\n\tspace where the creature would appear is occupied by other creatures or objects, or if" +
                    "\n\tthere isn't enough space for the creature, the figurine doesn't become a creature." +
                    "\n\tThe creature is friendly to you and your companions. It understands your languages and" +
                    "\n\tobeys your spoken commands. If you issue no commands, the creature defends itself but" +
                    "\n\ttakes no other actions." +
                    "\n\tThe creature exists for a duration specific to each figurine. At the end of the duration," +
                    "\n\tthe creature reverts to its figurine form. It reverts to a figurine early if it drops to" +
                    "\n\t0 hit points or if you use an action to speak the command word again while touching it." +
                    "\n\tWhen the creature becomes a figurine again, its property can't be used again until a" +
                    "\n\tcertain amount of time has passed, as specified in the figurine's description." +
                    "\n\tBronze Griffon (Rare). This bronze statuette is of a griffon rampant. It can become a" +
                    "\n\tgriffon for up to 6 hours. Once it has been used, it can't be used again until 5" +
                    "\n\tdays have passed." +
                    "\n\tEbony Fly (Rare). This ebony statuette is carved in the likeness of a horsefly. It can" +
                    "\n\tbecome a giant fly for up to 12 hours and can be ridden as a mount. Once it has been" +
                    "\n\tused, it can't be used again until 2 days have passed." +
                    "\n\tGolden Lions (Rare). These gold statuettes of lions are always created in pairs. You can" +
                    "\n\tuse one figurine or both simultaneously. Each can become a lion for up to 1 hour. Once a" +
                    "\n\tlion has been used, it can't be used again until 7 days have passed." +
                    "\n\tIvory Goats (Rare). These ivory statuettes of goats are always created in sets of three." +
                    "\n\tEach goat looks unique and functions differently from the others. Their properties" +
                    "\n\tare as follows:" +
                    "\n\tThe goat of traveling can become a Large goat with the same statistics as a riding horse." +
                    "\n\tIt has 24 charges, and each hour or portion thereof it spends in beast form costs 1 charge." +
                    "\n\tWhile it has charges, you can use it as often as you wish. When it runs out of charges, it" +
                    "\n\treverts to a figurine and can't be used again until 7 days have passed, when it regains all" +
                    "\n\tits charges." +
                    "\n\tThe goat of travail becomes a giant goat for up to 3 hours. Once it has been used, it can't" +
                    "\n\tbe used again until 30 days have passed." +
                    "\n\tThe goat of terror becomes a giant goat for up to 3 hours. The goat can't attack, but you" +
                    "\n\tcan remove its horns and use them as weapons. One horn becomes a lance, +1, and the other" +
                    "\n\tbecomes a longsword, +2. Removing a horn requires an action, and the weapons disappear and" +
                    "\n\tthe horns return when the goat reverts to figurine form. In addition, the goat radiates a" +
                    "\n\t30-foot-radius aura of terror while you are riding it. Any creature hostile to you that" +
                    "\n\tstarts its turn in the aura must succeed on a DC 15 Wisdom saving throw or be frightened of" +
                    "\n\tthe goat for 1 minute, or until the goat reverts to figurine form. The frightened creature" +
                    "\n\tcan repeat the saving throw at the end of each of its turns, ending the effect on itself on" +
                    "\n\ta success. Once it successfully saves against the effect, a creature is immune to the goat's" +
                    "\n\taura for the next 24 hours. Once the figurine has been used, it can't be used again until" +
                    "\n\t15 days have passed." +
                    "\n\tMarble Elephant (Rare). This marble statuette is about 4 inches high and long. It can become" +
                    "\n\tan elephant for up to 24 hours. Once it has been used, it can't be used again until 7 days" +
                    "\n\thave passed." +
                    "\n\tObsidian Steed (Very Rare). This polished obsidian horse can become a nightmare for up to 24" +
                    "\n\thours. The nightmare fights only to defend itself. Once it has been used, it can't be used" +
                    "\n\tagain until 5 days have passed." +
                    "\n\tIf you have a good alignment, the figurine has a 10 percent chance each time you use it to" +
                    "\n\tignore your orders, including a command to revert to figurine form. If you mount the" +
                    "\n\tnightmare while it is ignoring your orders, you and the nightmare are instantly transported" +
                    "\n\tto a random location on the plane of Hades, where the nightmare reverts to figurine form." +
                    "\n\tOnyx Dog (Rare). This onyx statuette of a dog can become a mastiff for up to 6 hours. The" +
                    "\n\tmastiff has an Intelligence of 8 and can speak Common. It also has darkvision out to a" +
                    "\n\trange of 60 feet and can see invisible creatures and objects within that range. Once it has" +
                    "\n\tbeen used, it can't be used again until 7 days have passed." +
                    "\n\tSerpentine Owl (Rare). This serpentine statuette of an owl can become a giant owl for up to" +
                    "\n\t8 hours. Once it has been used, it can't be used again until 2 days have passed. The owl" +
                    "\n\tcan telepathically communicate with you at any range if you and it are on the same plane" +
                    "\n\tof existence." +
                    "\n\tSilver Raven (Uncommon). This silver statuette of a raven can become a raven for up to" +
                    "\n\t12 hours. Once it has been used, it can't be used again until 2 days have passed. While in" +
                    "\n\traven form, the figurine allows you to cast the animal messenger spell on it at will."
        ),
        "adamantine breastplate" to MagicItem(
            name = "Adamantine Breastplate",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the hardest substances in" +
                    "\n\texistence. While you're wearing it, any critical hit against you becomes a normal hit." +
                    "\n\tThis armor consists of a fitted metal chest piece worn with supple leather. Although it" +
                    "\n\tleaves the legs and arms relatively unprotected, this armor provides good protection for" +
                    "\n\tthe wearer's vital organs while leaving the wearer relatively unencumbered."
        ),
        "adamantine splint" to MagicItem(
            name = "Adamantine Splint",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the hardest substances in" +
                    "\n\texistence. While you're wearing it, any critical hit against you becomes a normal hit." +
                    "\n\tThis armor is made of narrow vertical strips of metal riveted to a backing of leather that" +
                    "\n\tis worn over cloth padding. Flexible chain mail protects the joints."
        ),
        "amulet of health" to MagicItem(
            name = "Amulet of Health",
            description = "\n\tYour Constitution score is 19 while you wear this amulet. It has no effect on you if" +
                    "\n\tyour Constitution is already 19 or higher without it."
        ),
        "armor of vulnerability" to MagicItem(
            name = "Armor of Vulnerability",
            description = "\n\tWhile wearing this armor, you have resistance to one of the following damage types:" +
                    "\n\tbludgeoning, piercing, or slashing. The GM chooses the type or determines it randomly." +
                    "\n\tCurse. This armor is cursed, a fact that is revealed only when an identify spell is cast on" +
                    "\n\tthe armor or you attune to it. Attuning to the armor curses you until you are targeted by" +
                    "\n\tthe remove curse spell or similar magic; removing the armor fails to end the curse. While" +
                    "\n\tcursed, you have vulnerability to two of the three damage types associated with the armor" +
                    "\n\t(not the one to which it grants resistance)."
        ),
        "arrow-catching shield" to MagicItem(
            name = "Arrow-Catching Shield",
            description = "\n\tYou gain a +2 bonus to AC against ranged attacks while you wield this shield. This" +
                    "\n\tbonus is in addition to the shield's normal bonus to AC. In addition, whenever an attacker" +
                    "\n\tmakes a ranged attack against a target within 5 feet of you, you can use your reaction to" +
                    "\n\tbecome the target of the attack instead." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "belt of dwarvenkind" to MagicItem(
            name = "Belt of Dwarvenkind",
            description = "\n\tWhile wearing this belt, you gain the following benefits:" +
                    "\n\tYour Constitution score increases by 2, to a maximum of 20." +
                    "\n\tYou have advantage on Charisma (Persuasion) checks made to interact with dwarves." +
                    "\n\tIn addition, while attuned to the belt, you have a 50 percent chance each day at dawn of" +
                    "\n\tgrowing a full beard if you're capable of growing one, or a visibly thicker beard if you" +
                    "\n\talready have one." +
                    "\n\tIf you aren't a dwarf, you gain the following additional benefits while wearing the belt:" +
                    "\n\tYou have advantage on saving throws against poison, and you have resistance against" +
                    "\n\tpoison damage." +
                    "\n\tYou have darkvision out to a range of 60 feet." +
                    "\n\tYou can speak, read, and write Dwarvish."
        ),
        "belt of hill giant strength" to MagicItem(
            name = "Belt of Hill Giant Strength",
            description = "\n\tWhile wearing this belt, your Strength score changes to 21. The item has no effect on" +
                    "\n\tyou if your Strength without the belt is equal to or greater than 21."
        ),
        "berserker axe" to MagicItem(
            name = "Berserker Axe",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon. In addition," +
                    "\n\twhile you are attuned to this weapon, your hit point maximum increases by 1 for each level" +
                    "\n\tyou have attained." +
                    "\n\tCurse. This axe is cursed, and becoming attuned to it extends the curse to you. As long as" +
                    "\n\tyou remain cursed, you are unwilling to part with the axe, keeping it within reach at all" +
                    "\n\ttimes. You also have disadvantage on attack rolls with weapons other than this one, unless" +
                    "\n\tno foe is within 60 feet of you that you can see or hear." +
                    "\n\tWhenever a hostile creature damages you while the axe is in your possession, you must" +
                    "\n\tsucceed on a DC 15 Wisdom saving throw or go berserk. While berserk, you must use your" +
                    "\n\taction each round to attack the creature nearest to you with the axe. If you can make extra" +
                    "\n\tattacks as part of the Attack action, you use those extra attacks, moving to attack the next" +
                    "\n\tnearest creature after you fell your current target. If you have multiple possible targets," +
                    "\n\tyou attack one at random. You are berserk until you start your turn with no creatures within" +
                    "\n\t60 feet of you that you can see or hear."
        ),
        "boots of levitation" to MagicItem(
            name = "Boots of Levitation",
            description = "\n\tWhile you wear these boots, you can use an action to cast the levitate spell on" +
                    "\n\tyourself at will."
        ),
        "boots of speed" to MagicItem(
            name = "Boots of Speed",
            description = "\n\tWhile you wear these boots, you can use a bonus action and click the boots' heels" +
                    "\n\ttogether. If you do, the boots double your walking speed, and any creature that makes an" +
                    "\n\topportunity attack against you has disadvantage on the attack roll. If you click your heels" +
                    "\n\ttogether again, you end the effect." +
                    "\n\tWhen the boots' property has been used for a total of 10 minutes, the magic ceases to" +
                    "\n\tfunction until you finish a long rest."
        ),
        "bowl of commanding water elementals" to MagicItem(
            name = "Bowl of Commanding Water Elementals",
            description = "\n\tWhile this bowl is filled with water, you can use an action to speak the bowl's" +
                    "\n\tcommand word and summon a water elemental, as if you had cast the conjure elemental spell." +
                    "\n\tThe bowl can't be used this way again until the next dawn." +
                    "\n\tThe bowl is about 1 foot in diameter and half as deep. It weighs 3 pounds and holds about" +
                    "\n\t3 gallons."
        ),
        "bracers of defense" to MagicItem(
            name = "Bracers of Defense",
            description = "\n\tWhile wearing these bracers, you gain a +2 bonus to AC if you are wearing no armor" +
                    "\n\tand using no shield."
        ),
        "brazier of commanding fire elementals" to MagicItem(
            name = "Brazier of Commanding Fire Elementals",
            description = "\n\tWhile a fire burns in this brass brazier, you can use an action to speak the brazier’s" +
                    "\n\tcommand word and summon a fire elemental, as if you had cast the conjure elemental spell. The" +
                    "\n\tbrazier can’t be used this way again until the next dawn." +
                    "\n\tThe brazier weighs 5 pounds."
        ),
        "cape of the mountebank" to MagicItem(
            name = "Cape of the Mountebank",
            description = "\n\tThis cape smells faintly of brimstone. While wearing it, you can use it to cast the" +
                    "\n\tdimension door spell as an action. This property of the cape can't be used again until the" +
                    "\n\tnext dawn." +
                    "\n\tWhen you disappear, you leave behind a cloud of smoke, and you appear in a similar cloud of" +
                    "\n\tsmoke at your destination. The smoke lightly obscures the space you left and the space you" +
                    "\n\tappear in, and it dissipates at the end of your next turn. A light or stronger wind disperses" +
                    "\n\tthe smoke."
        ),
        "censer of controlling air elementals" to MagicItem(
            name = "Censer of Controlling Air Elementals",
            description = "\n\tWhile incense is burning in this censer, you can use an action to speak the censer's" +
                    "\n\tcommand word and summon an air elemental, as if you had cast the conjure elemental spell." +
                    "\n\tThe censer can't be used this way again until the next dawn." +
                    "\n\tThis 6-inch-wide, 1-foot-high vessel resembles a chalice with a decorated lid. It weighs 1" +
                    "\n\tpound."
        ),
        "+1 chain mail" to MagicItem(
            name = "+1 Chain Mail",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, chain mail includes a layer of quilted fabric worn" +
                    "\n\tunderneath the mail to prevent chafing and to cushion the impact of blows. The suit" +
                    "\n\tincludes gauntlets."
        ),
        "chain mail of resistance" to MagicItem(
            name = "Chain Mail of Resistance",
            description = "\n\tYou have resistance to one type of damage while you wear this armor. The DM chooses the" +
                    "\n\ttype or determines it randomly from the options below." +
                    "\n\td10\tDamage Type" +
                    "\n\t1\tAcid" +
                    "\n\t2\tCold" +
                    "\n\t3\tFire" +
                    "\n\t4\tForce" +
                    "\n\t5\tLightning" +
                    "\n\t6\tNecrotic" +
                    "\n\t7\tPoison" +
                    "\n\t8\tPsychic" +
                    "\n\t9\tRadiant" +
                    "\n\t10\tThunder"
        ),
        "+1 chain shirt" to MagicItem(
            name = "+1 Chain Shirt",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, a chain shirt is worn between layers of clothing or" +
                    "\n\tleather. This armor offers modest protection to the wearer's upper body and allows the sound" +
                    "\n\tof the rings rubbing against one another to be muffled by outer layers."
        ),
        "chain shirt of resistance" to MagicItem(
            name = "Chain Shirt of Resistance",
            description = "\n\tYou have resistance to one type of damage while you wear this armor. The DM chooses the" +
                    "\n\ttype or determines it randomly from the options below." +
                    "\n\td10\tDamage Type" +
                    "\n\t1\tAcid" +
                    "\n\t2\tCold" +
                    "\n\t3\tFire" +
                    "\n\t4\tForce" +
                    "\n\t5\tLightning" +
                    "\n\t6\tNecrotic" +
                    "\n\t7\tPoison" +
                    "\n\t8\tPsychic" +
                    "\n\t9\tRadiant" +
                    "\n\t10\tThunder"
        ),
        "cloak of displacement" to MagicItem(
            name = "Cloak of Displacement",
            description = "\n\tWhile you wear this cloak, it projects an illusion that makes you appear to be" +
                    "\n\tstanding in a place near your actual location, causing any creature to have disadvantage" +
                    "\n\ton attack rolls against you. If you take damage, the property ceases to function until the" +
                    "\n\tstart of your next turn. This property is suppressed while you are incapacitated," +
                    "\n\trestrained, or otherwise unable to move."
        ),
        "cloak of the bat" to MagicItem(
            name = "Cloak of the Bat",
            description = "\n\tWhile wearing this cloak, you have advantage on Dexterity (Stealth) checks. In an area" +
                    "\n\tof dim light or darkness, you can grip the edges of the cloak with both hands and use it to" +
                    "\n\tfly at a speed of 40 feet. If you ever fail to grip the cloak's edges while flying in this" +
                    "\n\tway, or if you are no longer in dim light or darkness, you lose this flying speed." +
                    "\n\tWhile wearing the cloak in an area of dim light or darkness, you can use your action to cast" +
                    "\n\tpolymorph on yourself, transforming into a bat. While you are in the form of the bat, you" +
                    "\n\tretain your Intelligence, Wisdom, and Charisma scores. The cloak can't be used this way" +
                    "\n\tagain until the next dawn."
        ),
        "cube of force" to MagicItem(
            name = "Cube of Force",
            description = "\n\tThis cube is about an inch across. Each face has a distinct marking on it that can be" +
                    "\n\tpressed. The cube starts with 36 charges, and it regains 1d20 expended charges daily at dawn." +
                    "\n\tYou can use an action to press one of the cube's faces, expending a number of charges based" +
                    "\n\ton the chosen face, as shown in the Cube of Force Faces table. Each face has a different" +
                    "\n\teffect. If the cube has insufficient charges remaining, nothing happens. Otherwise, a barrier" +
                    "\n\tof invisible force springs into existence, forming a cube 15 feet on a side. The barrier is" +
                    "\n\tcentered on you, moves with you, and lasts for 1 minute, until you use an action to press the" +
                    "\n\tcube's sixth face, or the cube runs out of charges. You can change the barrier's effect by" +
                    "\n\tpressing a different face of the cube and expending the requisite number of charges," +
                    "\n\tresetting the duration." +
                    "\n\tIf your movement causes the barrier to come into contact with a solid object that can't" +
                    "\n\tpass through the cube, you can't move any closer to that object as long as the barrier remains." +
                    "\n\tFace\tCharges\tEffect" +
                    "\n\t1\t1\tGases, wind, and fog can't pass through the barrier." +
                    "\n\t2\t2\tNonliving matter can't pass through the barrier. Walls, floors, and ceilings can pass" +
                    "\n\tthrough at your discretion." +
                    "\n\t3\t3\tLiving matter can't pass through the barrier." +
                    "\n\t4\t4\tSpell effects can't pass through the barrier." +
                    "\n\t5\t5\tNothing can pass through the barrier. Walls, floors, and ceilings can pass through at" +
                    "\n\tyour discretion." +
                    "\n\t6\t0\tThe barrier deactivates." +
                    "\n\tThe cube loses charges when the barrier is targeted by certain spells or comes into contact" +
                    "\n\twith certain spell or magic item effects, as shown in the table below." +
                    "\n\tSpell or item\tCharges Lost" +
                    "\n\tDisintegrate\t1d12" +
                    "\n\tHorn of blasting\t1d10" +
                    "\n\tPasswall\t1d6" +
                    "\n\tPrismatic spray\t1d20" +
                    "\n\tWall of fire\t1d4"
        ),
        "daern's instant fortress" to MagicItem(
            name = "Daern's Instant Fortress",
            description = "\n\tYou can use an action to place this 1-inch metal cube on the ground and speak its" +
                    "\n\tcommand word. The cube rapidly grows into a fortress that remains until you use an action" +
                    "\n\tto speak the command word that dismisses it, which works only if the fortress is empty." +
                    "\n\tThe fortress is a square tower, 20 feet on a side and 30 feet high, with arrow slits on all" +
                    "\n\tsides and a battlement atop it. Its interior is divided into two floors, with a ladder" +
                    "\n\trunning along one wall to connect them. The ladder ends at a trapdoor leading to the roof." +
                    "\n\tWhen activated, the tower has a small door on the side facing you. The door opens only at" +
                    "\n\tyour command, which you can speak as a bonus action. It is immune to the knock spell and" +
                    "\n\tsimilar magic, such as that of a chime of opening." +
                    "\n\tEach creature in the area where the fortress appears must make a DC 15 Dexterity saving" +
                    "\n\tthrow, taking 10d10 bludgeoning damage on a failed save, or half as much damage on a" +
                    "\n\tsuccessful one. In either case, the creature is pushed to an unoccupied space outside but" +
                    "\n\tnext to the fortress. Objects in the area that aren't being worn or carried take this" +
                    "\n\tdamage and are pushed automatically." +
                    "\n\tThe tower is made of adamantine, and its magic prevents it from being tipped over. The" +
                    "\n\troof, the door, and the walls each have 100 hit points, immunity to damage from nonmagical" +
                    "\n\tweapons excluding siege weapons, and resistance to all other damage. Only a wish spell can" +
                    "\n\trepair the fortress (this use of the spell counts as replicating a spell of 8th level or" +
                    "\n\tlower). Each casting of wish causes the roof, the door, or one wall to regain 50 hit points."
        ),
        "dagger of venom" to MagicItem(
            name = "Dagger of Venom",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon." +
                    "\n\tYou can use an action to cause thick, black poison to coat the blade. The poison remains" +
                    "\n\tfor 1 minute or until an attack using this weapon hits a creature. That creature must succeed" +
                    "\n\ton a DC 15 Constitution saving throw or take 2d10 poison damage and become poisoned for 1" +
                    "\n\tminute. The dagger can't be used this way again until the next dawn." +
                    "\n\tProficiency with a dagger allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "dimensional shackles" to MagicItem(
            name = "Dimensional Shackles",
            description = "\n\tYou can use an action to place these shackles on an incapacitated creature. The" +
                    "\n\tshackles adjust to fit a creature of Small to Large size. In addition to serving as" +
                    "\n\tmundane manacles, the shackles prevent a creature bound by them from using any method of" +
                    "\n\textradimensional movement, including teleportation or travel to a different plane of" +
                    "\n\texistence. They don't prevent the creature from passing through an interdimensional portal." +
                    "\n\tYou and any creature you designate when you use the shackles can use an action to remove" +
                    "\n\tthem. Once every 30 days, the bound creature can make a DC 30 Strength (Athletics) check." +
                    "\n\tOn a success, the creature breaks free and destroys the shackles."
        ),
        "dragon slayer" to MagicItem(
            name = "Dragon Slayer",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon." +
                    "\n\tWhen you hit a dragon with this weapon, the dragon takes an extra 3d6 damage. For the purpose" +
                    "\n\tof this weapon, \"dragon\" refers to any creature with the dragon type, including dragon" +
                    "\n\tturtles and wyverns."
        ),
        "elven chain" to MagicItem(
            name = "Elven Chain",
            description = "\n\tYou gain a +1 bonus to AC while you wear this armor. You are considered proficient with" +
                    "\n\tthis armor even if you lack proficiency with medium armor." +
                    "\n\tMade of interlocking metal rings, a chain shirt is worn between layers of clothing or" +
                    "\n\tleather. This armor offers modest protection to the wearer's upper body and allows the sound" +
                    "\n\tof the rings rubbing against one another to be muffled by outer layers."
        ),
        "flame tongue" to MagicItem(
            name = "Flame Tongue",
            description = "\n\tYou can use a bonus action to speak this magic sword's command word, causing flames to" +
                    "\n\terupt from the blade. These flames shed bright light in a 40-foot radius and dim light for" +
                    "\n\tan additional 40 feet. While the sword is ablaze, it deals an extra 2d6 fire damage to any" +
                    "\n\ttarget it hits. The flames last until you use a bonus action to speak the command word again" +
                    "\n\tor until you drop or sheathe the sword."
        ),
        "gem of seeing" to MagicItem(
            name = "Gem of Seeing",
            description = "\n\tThis gem has 3 charges. As an action, you can speak the gem's command word and expend" +
                    "\n\t1 charge. For the next 10 minutes, you have truesight out to 120 feet when you peer" +
                    "\n\tthrough the gem." +
                    "\n\tThe gem regains 1d3 expended charges daily at dawn."
        ),
        "giant slayer" to MagicItem(
            name = "Giant Slayer",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon." +
                    "\n\tWhen you hit a giant with it, the giant takes an extra 2d6 damage of the weapon's type and" +
                    "\n\tmust succeed on a DC 15 Strength saving throw or fall prone. For the purpose of this weapon," +
                    "\n\t\"giant\" refers to any creature with the giant type, including ettins and trolls."
        ),
        "glamoured studded leather" to MagicItem(
            name = "Glamoured Studded Leather",
            description = "\n\tWhile wearing this armor, you gain a +1 bonus to AC. You can also use a bonus action" +
                    "\n\tto speak the armor's command word and cause the armor to assume the appearance of a normal" +
                    "\n\tset of clothing or some other kind of armor. You decide what it looks like, including color," +
                    "\n\tstyle, and accessories, but the armor retains its normal bulk and weight. The illusory" +
                    "\n\tappearance lasts until you use this property again or remove the armor." +
                    "\n\tMade from tough but flexible leather, studded leather is reinforced with close-set rivets" +
                    "\n\tor spikes."
        ),
        "helm of teleportation" to MagicItem(
            name = "Helm of Teleportation",
            description = "\n\tThis helm has 3 charges. While wearing it, you can use an action and expend 1 charge" +
                    "\n\tto cast the teleport spell from it. The helm regains 1d3 expended charges daily at dawn."
        ),
        "horn of blasting" to MagicItem(
            name = "Horn of Blasting",
            description = "\n\tYou can use an action to speak the horn's command word and then blow the horn, which" +
                    "\n\temits a thunderous blast in a 30-foot cone that is audible 600 feet away. Each creature in" +
                    "\n\tthe cone must make a DC 15 Constitution saving throw. On a failed save, a creature takes" +
                    "\n\t5d6 thunder damage and is deafened for 1 minute. On a successful save, a creature takes" +
                    "\n\thalf as much damage and isn't deafened. Creatures and objects made of glass or crystal" +
                    "\n\thave disadvantage on the saving throw and take 10d6 thunder damage instead of 5d6." +
                    "\n\tEach use of the horn's magic has a 20 percent chance of causing the horn to explode. The" +
                    "\n\texplosion deals 10d6 fire damage to the blower and destroys the horn."
        ),
        "horn of valhalla" to MagicItem(
            name = "Horn of Valhalla",
            description = "\n\tYou can use an action to blow this horn. In response, warrior spirits from the" +
                    "\n\tValhalla appear within 60 feet of you. They use the statistics of a berserker. They" +
                    "\n\treturn to Valhalla after 1 hour or when they drop to 0 hit points. Once you use the horn," +
                    "\n\tit can't be used again until 7 days have passed." +
                    "\n\tFour types of horn of Valhalla are known to exist, each made of a different metal. The" +
                    "\n\thorn's type determines how many berserkers answer its summons, as well as the requirement" +
                    "\n\tfor its use. The GM chooses the horn's type or determines it randomly." +
                    "\n\td100\tHorn Type\tBerserkers Summoned\tRequirement" +
                    "\n\t01-40\tSilver\t2d4 + 2\tNone" +
                    "\n\t41-75\tBrass\t3d4 + 3\tProficiency with all simple weapons" +
                    "\n\t76-90\tBronze\t4d4 + 4\tProficiency with all medium armor" +
                    "\n\t91-100\tIron\t5d4 + 5\tProficiency with all martial weapons" +
                    "\n\tIf you blow the horn without meeting its requirement, the summoned berserkers attack you." +
                    "\n\tIf you meet the requirement, they are friendly to you and your companions and follow" +
                    "\n\tyour commands."
        ),
        "canaith mandolin" to MagicItem(
            name = "Canaith Mandolin",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, superior to an" +
                    "\n\tordinary instrument in every way. Seven types of these instruments exist, each named" +
                    "\n\tafter a legendary bard college. A creature that attempts to play the instrument without" +
                    "\n\tbeing attuned to it must succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its spells: Fly, Invisibility," +
                    "\n\tLevitate, Protection from Evil and Good, Cure Wounds (3rd level), Dispel Magic, Protection" +
                    "\n\tfrom Energy (lightning only). Once the instrument has been used to cast a spell, it can’t be" +
                    "\n\tused to cast that spell again until the next dawn. The spells use your spellcasting" +
                    "\n\tability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of its targets to be" +
                    "\n\tcharmed on a failed saving throw, thereby imposing disadvantage on the save. This effect" +
                    "\n\tapplies only if the spell has a somatic or a material component."
        ),
        "cli lyre" to MagicItem(
            name = "Cli Lyre",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, superior to an" +
                    "\n\tordinary instrument in every way. Seven types of these instruments exist, each named after" +
                    "\n\ta legendary bard college. A creature that attempts to play the instrument without being" +
                    "\n\tattuned to it must succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its spells: Fly, Invisibility," +
                    "\n\tLevitate, Protection from Evil and Good, Stone Shape, Wall of Fire, Wind Wall. Once the" +
                    "\n\tinstrument has been used to cast a spell, it can’t be used to cast that spell again until" +
                    "\n\tthe next dawn. The spells use your spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of its targets to be" +
                    "\n\tcharmed on a failed saving throw, thereby imposing disadvantage on the save. This effect" +
                    "\n\tapplies only if the spell has a somatic or a material component."
        ),
        "ioun stone of awareness" to MagicItem(
            name = "Ioun Stone of Awareness",
            description = "\n\tAn Ioun stone is named after Ioun, a god of knowledge and prophecy revered on some" +
                    "\n\tworlds. Many types of Ioun stone exist, each type a distinct combination of shape" +
                    "\n\tand color." +
                    "\n\tWhen you use an action to toss one of these stones into the air, the stone orbits your head" +
                    "\n\tat a distance of 1d3 feet and confers a benefit to you. Thereafter, another creature must" +
                    "\n\tuse an action to grasp or net the stone to separate it from you, either by making a" +
                    "\n\tsuccessful attack roll against AC 24 or a successful DC 24 Dexterity (Acrobatics) check." +
                    "\n\tYou can use an action to seize and stow the stone, ending its effect." +
                    "\n\tA stone has AC 24, 10 hit points, and resistance to all damage. It is considered to be an" +
                    "\n\tobject that is being worn while it orbits your head." +
                    "\n\tAwareness. You can't be surprised while this dark blue rhomboid orbits your head."
        ),
        "ioun stone of protection" to MagicItem(
            name = "Ioun Stone of Protection",
            description = "\n\tAn Ioun stone is named after Ioun, a god of knowledge and prophecy revered on some" +
                    "\n\tworlds. Many types of Ioun stone exist, each type a distinct combination of shape" +
                    "\n\tand color." +
                    "\n\tWhen you use an action to toss one of these stones into the air, the stone orbits your head" +
                    "\n\tat a distance of 1d3 feet and confers a benefit to you. Thereafter, another creature must" +
                    "\n\tuse an action to grasp or net the stone to separate it from you, either by making a" +
                    "\n\tsuccessful attack roll against AC 24 or a successful DC 24 Dexterity (Acrobatics) check." +
                    "\n\tYou can use an action to seize and stow the stone, ending its effect." +
                    "\n\tA stone has AC 24, 10 hit points, and resistance to all damage. It is considered to be an" +
                    "\n\tobject that is being worn while it orbits your head." +
                    "\n\tProtection. You gain a +1 bonus to AC while this dusty rose prism orbits your head."
        ),
        "ioun stone of reserve" to MagicItem(
            name = "Ioun Stone of Reserve",
            description = "\n\tAn Ioun stone is named after Ioun, a god of knowledge and prophecy revered on some" +
                    "\n\tworlds. Many types of Ioun stone exist, each type a distinct combination of shape" +
                    "\n\tand color." +
                    "\n\tWhen you use an action to toss one of these stones into the air, the stone orbits your head" +
                    "\n\tat a distance of 1d3 feet and confers a benefit to you. Thereafter, another creature must" +
                    "\n\tuse an action to grasp or net the stone to separate it from you, either by making a" +
                    "\n\tsuccessful attack roll against AC 24 or a successful DC 24 Dexterity (Acrobatics) check." +
                    "\n\tYou can use an action to seize and stow the stone, ending its effect." +
                    "\n\tA stone has AC 24, 10 hit points, and resistance to all damage. It is considered to be an" +
                    "\n\tobject that is being worn while it orbits your head." +
                    "\n\tReserve. This vibrant purple prism stores spells cast into it, holding them until you use" +
                    "\n\tthem. The stone can store up to 3 levels worth of spells at a time. When found, it contains" +
                    "\n\t1d4−1 levels of stored spells chosen by the GM." +
                    "\n\tAny creature can cast a spell of 1st through 3rd level into the stone by touching it as the" +
                    "\n\tspell is cast. The spell has no effect, other than to be stored in the stone. If the stone" +
                    "\n\tcan't hold the spell, the spell is expended without effect. The level of the slot used to" +
                    "\n\tcast the spell determines how much space it uses." +
                    "\n\tWhile this stone orbits your head, you can cast any spell stored in it. The spell uses the" +
                    "\n\tslot level, spell save DC, spell attack bonus, and spellcasting ability of the original" +
                    "\n\tcaster, but is otherwise treated as if you cast the spell. The spell cast from the stone is" +
                    "\n\tno longer stored in it, freeing up space."
        ),
        "ioun stone of sustenance" to MagicItem(
            name = "Ioun Stone of Sustenance",
            description = "\n\tAn Ioun stone is named after Ioun, a god of knowledge and prophecy revered on some" +
                    "\n\tworlds. Many types of Ioun stone exist, each type a distinct combination of shape" +
                    "\n\tand color." +
                    "\n\tWhen you use an action to toss one of these stones into the air, the stone orbits your head" +
                    "\n\tat a distance of 1d3 feet and confers a benefit to you. Thereafter, another creature must" +
                    "\n\tuse an action to grasp or net the stone to separate it from you, either by making a" +
                    "\n\tsuccessful attack roll against AC 24 or a successful DC 24 Dexterity (Acrobatics) check." +
                    "\n\tYou can use an action to seize and stow the stone, ending its effect." +
                    "\n\tA stone has AC 24, 10 hit points, and resistance to all damage. It is considered to be an" +
                    "\n\tobject that is being worn while it orbits your head." +
                    "\n\tSustenance. You don't need to eat or drink while this clear spindle orbits your head."
        ),
        "iron bands of bilarro" to MagicItem(
            name = "Iron Bands of Bilarro",
            description = "\n\tThis rusty iron sphere measures 3 inches in diameter and weighs 1 pound. You can use" +
                    "\n\tan action to speak the command word and throw the sphere at a Huge or smaller creature you" +
                    "\n\tcan see within 60 feet of you. As the sphere moves through the air, it opens into a" +
                    "\n\ttangle of metal bands." +
                    "\n\tMake a ranged attack roll with an attack bonus equal to your Dexterity modifier plus" +
                    "\n\tyour proficiency bonus. On a hit, the target is restrained until you take a bonus action" +
                    "\n\tto speak the command word again to release it. Doing so, or missing with the attack," +
                    "\n\tcauses the bands to contract and become a sphere once more." +
                    "\n\tA creature, including the one restrained, can use an action to make a DC 20 Strength check" +
                    "\n\tto break the iron bands. On a success, the item is destroyed, and the restrained creature is" +
                    "\n\tfreed. If the check fails, any further attempts made by that creature automatically fail" +
                    "\n\tuntil 24 hours have elapsed." +
                    "\n\tOnce the bands are used, they can't be used again until the next dawn."
        ),
        "+1 leather armor" to MagicItem(
            name = "+1 Leather Armor",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tThe breastplate and shoulder protectors of this armor are made of leather that has been" +
                    "\n\tstiffened by being boiled in oil. The rest of the armor is made of softer and more" +
                    "\n\tflexible materials."
        ),
        "leather armor of resistance" to MagicItem(
            name = "Leather Armor of Resistance",
            description = "\n\tYou have resistance to one type of damage while you wear this armor. The DM chooses the" +
                    "\n\ttype or determines it randomly from the options below." +
                    "\n\td10\tDamage Type" +
                    "\n\t1\tAcid" +
                    "\n\t2\tCold" +
                    "\n\t3\tFire" +
                    "\n\t4\tForce" +
                    "\n\t5\tLightning" +
                    "\n\t6\tNecrotic" +
                    "\n\t7\tPoison" +
                    "\n\t8\tPsychic" +
                    "\n\t9\tRadiant" +
                    "\n\t10\tThunder"
        ),
        "mace of disruption" to MagicItem(
            name = "Mace of Disruption",
            description = "\n\tWhen you hit a fiend or an undead with this magic weapon, that creature takes an" +
                    "\n\textra 2d6 radiant damage. If the target has 25 hit points or fewer after taking this damage," +
                    "\n\tit must succeed on a DC 15 Wisdom saving throw or be destroyed. On a successful save, the" +
                    "\n\tcreature becomes frightened of you until the end of your next turn." +
                    "\n\tWhile you hold this weapon, it sheds bright light in a 20-foot radius and dim light for" +
                    "\n\tan additional 20 feet." +
                    "\n\tProficiency with a mace allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "mace of smiting" to MagicItem(
            name = "Mace of Smiting",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon. The" +
                    "\n\tbonus increases to +3 when you use the mace to attack a construct." +
                    "\n\tWhen you roll a 20 on an attack roll made with this weapon, the target takes an extra 7" +
                    "\n\tbludgeoning damage, or 14 bludgeoning damage if it's a construct. If a construct has 25" +
                    "\n\thit points or fewer after taking this damage, it is destroyed." +
                    "\n\tProficiency with a mace allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "mace of terror" to MagicItem(
            name = "Mace of Terror",
            description = "\n\tThis magic weapon has 3 charges. While holding it, you can use an action and expend 1" +
                    "\n\tcharge to release a wave of terror. Each creature of your choice in a 30-foot radius" +
                    "\n\textending from you must succeed on a DC 15 Wisdom saving throw or become frightened of you" +
                    "\n\tfor 1 minute. While it is frightened in this way, a creature must spend its turns trying to" +
                    "\n\tmove as far away from you as it can, and it can't willingly move to a space within 30 feet of" +
                    "\n\tyou. It also can't take reactions. For its action, it can use only the Dash action or try to" +
                    "\n\tescape from an effect that prevents it from moving. If it has nowhere it can move, the" +
                    "\n\tcreature can use the Dodge action. At the end of each of its turns, a creature can repeat" +
                    "\n\tthe saving throw, ending the effect on itself on a success." +
                    "\n\tThe mace regains 1d3 expended charges daily at dawn." +
                    "\n\tProficiency with a mace allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "mantle of spell resistance" to MagicItem(
            name = "Mantle of Spell Resistance",
            description = "\n\tYou have advantage on saving throws against spells while you wear this cloak."
        ),
        "necklace of prayer beads" to MagicItem(
            name = "Necklace of Prayer Beads",
            description = "\n\tThis necklace has 1d4 + 2 magic beads made from aquamarine, black pearl, or topaz." +
                    "\n\tIt also has many nonmagical beads made from stones such as amber, bloodstone, citrine," +
                    "\n\tcoral, jade, pearl, or quartz. If a magic bead is removed from the necklace, that bead" +
                    "\n\tloses its magic." +
                    "\n\tSix types of magic beads exist. The GM decides the type of each bead on the necklace or" +
                    "\n\tdetermines it randomly. A necklace can have more than one bead of the same type. To use one," +
                    "\n\tyou must be wearing the necklace. Each bead contains a spell that you can cast from it as a" +
                    "\n\tbonus action (using your spell save DC if a save is necessary). Once a magic bead's spell is" +
                    "\n\tcast, that bead can't be used again until the next dawn." +
                    "\n\td20\tBead of...\tSpell" +
                    "\n\t1-6\tBlessing\tBless" +
                    "\n\t7-12\tCuring\tCure wounds (2nd level) or lesser restoration" +
                    "\n\t13-16\tFavor\tGreater restoration" +
                    "\n\t17-18\tSmiting\tBranding smite" +
                    "\n\t19\tSummons\tPlanar ally" +
                    "\n\t20\tWind walking\tWind walk"
        ),
        "periapt of proof against poison" to MagicItem(
            name = "Periapt of Proof against Poison",
            description = "\n\tThis delicate silver chain has a brilliant-cut black gem pendant. While you wear it," +
                    "\n\tpoisons have no effect on you. You are immune to the poisoned condition and have" +
                    "\n\timmunity to poison damage."
        ),
        "ring of animal influence" to MagicItem(
            name = "Ring of Animal Influence",
            description = "\n\tThis ring has 3 charges, and it regains 1d3 expended charges daily at dawn. While" +
                    "\n\twearing the ring, you can use an action to expend 1 of its charges to cast one of the" +
                    "\n\tfollowing spells:" +
                    "\n\tAnimal friendship (save DC 13)" +
                    "\n\tFear (save DC 13), targeting only beasts that have an Intelligence of 3 or lower" +
                    "\n\tSpeak with animals"
        ),
        "ring of evasion" to MagicItem(
            name = "Ring of Evasion",
            description = "\n\tThis ring has 3 charges, and it regains 1d3 expended charges daily at dawn. When you" +
                    "\n\tfail a Dexterity saving throw while wearing it, you can use your reaction to expend 1 of its" +
                    "\n\tcharges to succeed on that saving throw instead."
        ),
        "ring of feather falling" to MagicItem(
            name = "Ring of Feather Falling",
            description = "\n\tWhen you fall while wearing this ring, you descend 60 feet per round and" +
                    "\n\ttake no damage from falling."
        ),
        "ring of free action" to MagicItem(
            name = "Ring of Free Action",
            description = "\n\tWhile you wear this ring, difficult terrain doesn't cost you extra movement. In" +
                    "\n\taddition, magic can neither reduce your speed nor cause you to be paralyzed or restrained."
        ),
        "ring of protection" to MagicItem(
            name = "Ring of Protection",
            description = "\n\tYou gain a +1 bonus to AC and saving throws while wearing this ring."
        ),
        "ring of resistance" to MagicItem(
            name = "Ring of Resistance",
            description = "\n\tYou have resistance to one damage type while wearing this ring. The gem in the ring" +
                    "\n\tindicates the type, which the DM chooses or determines randomly." +
                    "\n\td10\tDamage Type\tGem" +
                    "\n\t1\tAcid\tPearl" +
                    "\n\t2\tCold\tTourmaline" +
                    "\n\t3\tFire\tGarnet" +
                    "\n\t4\tForce\tSapphire" +
                    "\n\t5\tLightning\tCitrine" +
                    "\n\t6\tNecrotic\tJet" +
                    "\n\t7\tPoison\tAmethyst" +
                    "\n\t8\tPsychic\tJade" +
                    "\n\t9\tRadiant\tTopaz" +
                    "\n\t10\tThunder\tSpinel"
        ),
        "ring of spell storing" to MagicItem(
            name = "Ring of Spell Storing",
            description = "\n\tThis ring stores spells cast into it, holding them until the attuned wearer uses them." +
                    "\n\tThe ring can store up to 5 levels worth of spells at a time. When found, it contains 1d6 − 1" +
                    "\n\tlevels of stored spells chosen by the GM." +
                    "\n\tAny creature can cast a spell of 1st through 5th level into the ring by touching the ring" +
                    "\n\tas the spell is cast. The spell has no effect, other than to be stored in the ring. If the" +
                    "\n\tring can't hold the spell, the spell is expended without effect. The level of the slot used" +
                    "\n\tto cast the spell determines how much space it uses." +
                    "\n\tWhile wearing this ring, you can cast any spell stored in it. The spell uses the slot level," +
                    "\n\tspell save DC, spell attack bonus, and spellcasting ability of the original caster, but is" +
                    "\n\totherwise treated as if you cast the spell. The spell cast from the ring is no longer stored" +
                    "\n\tin it, freeing up space."
        ),
        "ring of the ram" to MagicItem(
            name = "Ring of the Ram",
            description = "\n\tThis ring has 3 charges, and it regains 1d3 expended charges daily at dawn. While" +
                    "\n\twearing the ring, you can use an action to expend 1 to 3 of its charges to make a ranged" +
                    "\n\tspell attack against one creature you can see within 60 feet of you. The ring produces a" +
                    "\n\tspectral ram's head and makes its attack roll with a +7 bonus. On a hit, for each charge you" +
                    "\n\tspend, the target takes 2d10 force damage and is pushed 5 feet away from you." +
                    "\n\tAlternatively, you can expend 1 to 3 of the ring's charges as an action to try to break an" +
                    "\n\tobject you can see within 60 feet of you that isn't being worn or carried. The ring makes a" +
                    "\n\tStrength check with a +5 bonus for each charge you spend."
        ),
        "ring of x-ray vision" to MagicItem(
            name = " Ring of X-ray Vision",
            description = "\n\tWhile wearing this ring, you can use an action to speak its command word. When you" +
                    "\n\tdo so, you can see into and through solid matter for 1 minute. This vision has a radius of" +
                    "\n\t30 feet. To you, solid objects within that radius appear transparent and don't prevent light" +
                    "\n\tfrom passing through them. The vision can penetrate 1 foot of stone, 1 inch of common metal," +
                    "\n\tor up to 3 feet of wood or dirt. Thicker substances block the vision, as does a thin" +
                    "\n\tsheet of lead." +
                    "\n\tWhenever you use the ring again before taking a long rest, you must succeed on a DC 15" +
                    "\n\tConstitution saving throw or gain one level of exhaustion."
        ),
        "robe of eyes" to MagicItem(
            name = "Robe of Eyes",
            description = "\n\tThis robe is adorned with eyelike patterns. While you wear the robe, you gain the" +
                    "\n\tfollowing benefits:" +
                    "\n\tThe robe lets you see in all directions, and you have advantage on Wisdom (Perception)" +
                    "\n\tchecks that rely on sight." +
                    "\n\tYou have darkvision out to a range of 120 feet." +
                    "\n\tYou can see invisible creatures and objects, as well as see into the Ethereal Plane, out" +
                    "\n\tto a range of 120 feet." +
                    "\n\tThe eyes on the robe can't be closed or averted. Although you can close or avert your own" +
                    "\n\teyes, you are never considered to be doing so while wearing this robe." +
                    "\n\tA light spell cast on the robe or a daylight spell cast within 5 feet of the robe causes you" +
                    "\n\tto be blinded for 1 minute. At the end of each of your turns, you can make a Constitution" +
                    "\n\tsaving throw (DC 11 for light or DC 15 for daylight), ending the blindness on a success."
        ),
        "rod of rulership" to MagicItem(
            name = "Rod of Rulership",
            description = "\n\tYou can use an action to present the rod and command obedience from each creature of" +
                    "\n\tyour choice that you can see within 120 feet of you. Each target must succeed on a DC 15" +
                    "\n\tWisdom saving throw or be charmed by you for 8 hours. While charmed in this way, the" +
                    "\n\tcreature regards you as its trusted leader. If harmed by you or your companions, or" +
                    "\n\tcommanded to do something contrary to its nature, a target ceases to be charmed in this way." +
                    "\n\tThe rod can't be used again until the next dawn."
        ),
        "+2 rod of the pact keeper" to MagicItem(
            name = "+2 Rod of the Pact Keeper",
            description = "\n\tWhile holding this rod, you gain a +2 bonus to spell attack rolls and to the saving " +
                    "\n\tthrow DCs of your warlock spells." +
                    "\n\tIn addition, you can regain 1 warlock spell slot as an action while holding the rod. You " +
                    "\n\tcan’t use this property again until you finish a long rest.",
        ),
        "rope of entanglement" to MagicItem(
            name = "Rope of Entanglement",
            description = "\n\tThis rope is 30 feet long and weighs 3 pounds. If you hold one end of the rope and" +
                    "\n\tuse an action to speak its command word, the other end darts forward to entangle a creature" +
                    "\n\tyou can see within 20 feet of you. The target must succeed on a DC 15 Dexterity saving" +
                    "\n\tthrow or become restrained." +
                    "\n\tYou can release the creature by using a bonus action to speak a second command word. A target" +
                    "\n\trestrained by the rope can use an action to make a DC 15 Strength or Dexterity check" +
                    "\n\t(target’s choice). On a success, the creature is no longer restrained by the rope." +
                    "\n\tThe rope has AC 20 and 20 hit points. It regains 1 hit point every 5 minutes as long as it" +
                    "\n\thas at least 1 hit point. If the rope drops to 0 hit points, it is destroyed."
        ),
        "+1 scale mail" to MagicItem(
            name = "+1 Scale Mail",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tThis armor consists of a coat and leggings (and perhaps a separate skirt) of leather" +
                    "\n\tcovered with overlapping pieces of metal, much like the scales of a fish. The suit" +
                    "\n\tincludes gauntlets."
        ),
        "scale mail of resistance" to MagicItem(
            name = "Scale Mail of Resistance",
            description = "\n\tYou have resistance to one damage type while wearing this ring. The gem in the ring" +
                    "\n\tindicates the type, which the DM chooses or determines randomly." +
                    "\n\td10\tDamage Type\tGem" +
                    "\n\t1\tAcid\tPearl" +
                    "\n\t2\tCold\tTourmaline" +
                    "\n\t3\tFire\tGarnet" +
                    "\n\t4\tForce\tSapphire" +
                    "\n\t5\tLightning\tCitrine" +
                    "\n\t6\tNecrotic\tJet" +
                    "\n\t7\tPoison\tAmethyst" +
                    "\n\t8\tPsychic\tJade" +
                    "\n\t9\tRadiant\tTopaz" +
                    "\n\t10\tThunder\tSpinel"
        ),
        "+2 shield" to MagicItem(
            name = "+2 Shield",
            description = "\n\tWhile holding this shield, you have a +2 bonus to AC. This bonus is in addition to" +
                    "\n\tthe shield's normal bonus to AC." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "shield of missile attraction" to MagicItem(
            name = "Shield of Missile Attraction",
            description = "\n\tWhile holding this shield, you have resistance to damage from ranged weapon attacks." +
                    "\n\tCurse. This shield is cursed. Attuning to it curses you until you are targeted by the" +
                    "\n\tremove curse spell or similar magic. Removing the shield fails to end the curse on you." +
                    "\n\tWhenever a ranged weapon attack is made against a target within 10 feet of you, the curse" +
                    "\n\tcauses you to become the target instead." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "staff of charming" to MagicItem(
            name = "Staff of Charming",
            description = "\n\tWhile holding this staff, you can use an action to expend 1 of its 10 charges to cast" +
                    "\n\tcharm person, command, or comprehend languages from it using your spell save DC. The staff" +
                    "\n\tcan also be used as a magic quarterstaff." +
                    "\n\tIf you are holding the staff and fail a saving throw against an enchantment spell that" +
                    "\n\ttargets only you, you can turn your failed save into a successful one. You can't use this" +
                    "\n\tproperty of the staff again until the next dawn. If you succeed on a save against an" +
                    "\n\tenchantment spell that targets only you, with or without the staff's intervention, you can" +
                    "\n\tuse your reaction to expend 1 charge from the staff and turn the spell back on its caster as" +
                    "\n\tif you had cast the spell." +
                    "\n\tThe staff regains 1d8 + 2 expended charges daily at dawn. If you expend the last charge," +
                    "\n\troll a d20. On a 1, the staff becomes a nonmagical quarterstaff."
        ),
        "staff of healing" to MagicItem(
            name = "Staff of Healing",
            description = "\n\tThis staff has 10 charges. While holding it, you can use an action to expend 1 or" +
                    "\n\tmore of its charges to cast one of the following spells from it, using your spell save DC" +
                    "\n\tand spellcasting ability modifier: cure wounds (1 charge per spell level, up to 4th)," +
                    "\n\tlesser restoration (2 charges), or mass cure wounds (5 charges)." +
                    "\n\tThe staff regains 1d6 + 4 expended charges daily at dawn. If you expend the last charge," +
                    "\n\troll a d20. On a 1, the staff vanishes in a flash of light, lost forever."
        ),
        "staff of swarming insects" to MagicItem(
            name = "Staff of Swarming Insects",
            description = "\n\tThis staff has 10 charges and regains 1d6 + 4 expended charges daily at dawn. If you" +
                    "\n\texpend the last charge, roll a d20. On a 1, a swarm of insects consumes and destroys the" +
                    "\n\tstaff, then disperses." +
                    "\n\tSpells. While holding the staff, you can use an action to expend some of its charges to cast" +
                    "\n\tone of the following spells from it, using your spell save DC: giant insect (4 charges) or" +
                    "\n\tinsect plague (5 charges)." +
                    "\n\tInsect Cloud. While holding the staff, you can use an action and expend 1 charge to cause a" +
                    "\n\tswarm of harmless flying insects to spread out in a 30-foot radius from you. The insects" +
                    "\n\tremain for 10 minutes, making the area heavily obscured for creatures other than you. The" +
                    "\n\tswarm moves with you, remaining centered on you. A wind of at least 10 miles per hour" +
                    "\n\tdisperses the swarm and ends the effect."
        ),
        "staff of the woodlands" to MagicItem(
            name = "Staff of the Woodlands",
            description = "\n\tThis staff can be wielded as a magic quarterstaff that grants a +2 bonus to attack" +
                    "\n\tand damage rolls made with it. While holding it, you have a +2 bonus to spell attack rolls." +
                    "\n\tThe staff has 10 charges for the following properties. It regains 1d6 + 4 expended charges" +
                    "\n\tdaily at dawn. If you expend the last charge, roll a d20. On a 1, the staff loses its" +
                    "\n\tproperties and becomes a nonmagical quarterstaff." +
                    "\n\tSpells" +
                    "\n\tYou can use an action to expend 1 or more of the staff's charges to cast one of the" +
                    "\n\tfollowing spells from it, using your spell save DC:" +
                    "\n\tanimal friendship (1 charge)" +
                    "\n\tawaken (5 charges)" +
                    "\n\tbarkskin (2 charges)" +
                    "\n\tlocate animals or plants (2 charges)" +
                    "\n\tspeak with animals (1 charge)" +
                    "\n\tspeak with plants (3 charges)" +
                    "\n\twall of thorns (6 charges)." +
                    "\n\tYou can also use an action to cast the pass without trace spell from the staff without" +
                    "\n\tusing any charges." +
                    "\n\tTree Form. You can use an action to plant one end of the staff in fertile earth and expend" +
                    "\n\t1 charge to transform the staff into a healthy tree. The tree is 60 feet tall and has a" +
                    "\n\t5-foot-diameter trunk, and its branches at the top spread out in a 20-foot radius. The tree" +
                    "\n\tappears ordinary but radiates a faint aura of transmutation magic if targeted by detect" +
                    "\n\tmagic. While touching the tree and using another action to speak its command word, you" +
                    "\n\treturn the staff to its normal form. Any creature in the tree falls when it reverts to a staff."
        ),
        "staff of withering" to MagicItem(
            name = "Staff of Withering",
            description = "\n\tThis staff has 3 charges and regains 1d3 expended charges daily at dawn." +
                    "\n\tThe staff can be wielded as a magic quarterstaff. On a hit, it deals damage as a normal" +
                    "\n\tquarterstaff, and you can expend 1 charge to deal an extra 2d10 necrotic damage to the" +
                    "\n\ttarget. In addition, the target must succeed on a DC 15 Constitution saving throw or have" +
                    "\n\tdisadvantage for 1 hour on any ability check or saving throw that uses Strength or Constitution."
        ),
        "stone of controlling earth elementals" to MagicItem(
            name = "Stone of Controlling Earth Elementals",
            description = "\n\tIf the stone is touching the ground, you can use an action to speak its command word" +
                    "\n\tand summon an earth elemental, as if you had cast the conjure elemental spell. The stone" +
                    "\n\tcan't be used this way again until the next dawn. The stone weighs 5 pounds."
        ),
        "sun blade" to MagicItem(
            name = "Sun Blade",
            description = "\n\tThis item appears to be a longsword hilt. While grasping the hilt, you can use a bonus" +
                    "\n\taction to cause a blade of pure radiance to spring into existence, or make the blade" +
                    "\n\tdisappear. While the blade exists, this magic longsword has the finesse property. If you" +
                    "\n\tare proficient with shortswords or longswords, you are proficient with the sun blade." +
                    "\n\tYou gain a +2 bonus to attack and damage rolls made with this weapon, which deals radiant" +
                    "\n\tdamage instead of slashing damage. When you hit an undead with it, that target takes an" +
                    "\n\textra 1d8 radiant damage." +
                    "\n\tThe sword's luminous blade emits bright light in a 15-foot radius and dim light for an" +
                    "\n\tadditional 15 feet. The light is sunlight. While the blade persists, you can use an action" +
                    "\n\tto expand or reduce its radius of bright and dim light by 5 feet each, to a maximum of 30" +
                    "\n\tfeet each or a minimum of 10 feet each." +
                    "\n\tProficiency with a longsword allows you to add your proficiency bonus to the attack roll" +
                    "\n\tfor any attack you make with it."
        ),
        "sword of life stealing" to MagicItem(
            name = "Sword of Life Stealing",
            description = "\n\tWhen you attack a creature with this magic weapon and roll a 20 on the attack roll," +
                    "\n\tthat target takes an extra 10 necrotic damage if it isn't a construct or an undead. You" +
                    "\n\talso gain 10 temporary hit points."
        ),
        "sword of wounding" to MagicItem(
            name = "Sword of Wounding",
            description = "\n\tHit points lost to this weapon's damage can be regained only through a short or long" +
                    "\n\trest, rather than by regeneration, magic, or any other means." +
                    "\n\tOnce per turn, when you hit a creature with an attack using this magic weapon, you can" +
                    "\n\twound the target. At the start of each of the wounded creature's turns, it takes 1d4" +
                    "\n\tnecrotic damage for each time you've wounded it, and it can then make a DC 15 Constitution" +
                    "\n\tsaving throw, ending the effect of all such wounds on itself on a success. Alternatively," +
                    "\n\tthe wounded creature, or a creature within 5 feet of it, can use an action to make a DC 15" +
                    "\n\tWisdom (Medicine) check, ending the effect of such wounds on it on a success."
        ),
        "tentacle rod" to MagicItem(
            name = "Tentacle Rod",
            description = "\n\tMade by the drow, this rod is a magic weapon that ends in three rubbery tentacles." +
                    "\n\tWhile holding the rod, you can use an action to direct each tentacle to attack a creature" +
                    "\n\tyou can see within 15 feet of you. Each tentacle makes a melee attack roll with a +9 bonus." +
                    "\n\tOn a hit, the tentacle deals 1d6 bludgeoning damage. If you hit a target with all three" +
                    "\n\ttentacles, it must make a DC 15 Constitution saving throw. On a failure, the creature's" +
                    "\n\tspeed is halved, it has disadvantage on Dexterity saving throws, and it can't use reactions" +
                    "\n\tfor 1 minute. Moreover, on each of its turns, it can take either an action or a bonus" +
                    "\n\taction, but not both. At the end of each of its turns, it can repeat the saving throw," +
                    "\n\tending the effect on itself on a success."
        ),
        "vicious weapon" to MagicItem(
            name = "Vicious Weapon",
            description = "\n\tWhen you roll a 20 on your attack roll with this magic weapon, the target takes an" +
                    "\n\textra 7 damage of the weapon’s type."
        ),
        "wand of binding" to MagicItem(
            name = "Wand of Binding",
            description = "\n\tThis wand has 7 charges for the following properties. It regains 1d6 + 1 expended" +
                    "\n\tcharges daily at dawn. If you expend the wand's last charge, roll a d20. On a 1, the wand" +
                    "\n\tcrumbles into ashes and is destroyed." +
                    "\n\tSpells. While holding the wand, you can use an action to expend some of its charges to cast" +
                    "\n\tone of the following spells (save DC 17): hold monster (5 charges) or hold person (2 charges)." +
                    "\n\tAssisted Escape. While holding the wand, you can use your reaction to expend 1 charge and" +
                    "\n\tgain advantage on a saving throw you make to avoid being paralyzed or restrained, or you" +
                    "\n\tcan expend 1 charge and gain advantage on any check you make to escape a grapple."
        ),
        "wand of enemy detection" to MagicItem(
            name = "Wand of Enemy Detection",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action and expend 1 charge" +
                    "\n\tto speak its command word. For the next minute, you know the direction of the nearest" +
                    "\n\tcreature hostile to you within 60 feet, but not its distance from you. The wand can sense" +
                    "\n\tthe presence of hostile creatures that are ethereal, invisible, disguised, or hidden, as" +
                    "\n\twell as those in plain sight. The effect ends if you stop holding the wand." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into ashes and is destroyed."
        ),
        "wand of fear" to MagicItem(
            name = "Wand of Fear",
            description = "\n\tThis wand has 7 charges for the following properties. It regains 1d6 + 1 expended" +
                    "\n\tcharges daily at dawn. If you expend the wand's last charge, roll a d20. On a 1, the wand" +
                    "\n\tcrumbles into ashes and is destroyed." +
                    "\n\tCommand. While holding the wand, you can use an action to expend 1 charge and command" +
                    "\n\tanother creature to flee or grovel, as with the command spell (save DC 15)." +
                    "\n\tCone of Fear. While holding the wand, you can use an action to expend 2 charges, causing" +
                    "\n\tthe wand's tip to emit a 60-foot cone of amber light. Each creature in the cone must" +
                    "\n\tsucceed on a DC 15 Wisdom saving throw or become frightened of you for 1 minute. While it" +
                    "\n\tis frightened in this way, a creature must spend its turns trying to move as far away from" +
                    "\n\tyou as it can, and it can't willingly move to a space within 30 feet of you. It also can't" +
                    "\n\ttake reactions. For its action, it can use only the Dash action or try to escape from an" +
                    "\n\teffect that prevents it from moving. If it has nowhere it can move, the creature can use" +
                    "\n\tthe Dodge action. At the end of each of its turns, a creature can repeat the saving throw," +
                    "\n\tending the effect on itself on a success."
        ),
        "wand of fireballs" to MagicItem(
            name = "Wand of Fireballs",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action to expend 1 or" +
                    "\n\tmore of its charges to cast the fireball spell (save DC 15) from it. For 1 charge, you" +
                    "\n\tcast the 3rd-level version of the spell. You can increase the spell slot level by one for" +
                    "\n\teach additional charge you expend." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into ashes and is destroyed."
        ),
        "wand of lightning bolts" to MagicItem(
            name = "Wand of Lightning Bolts",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action to expend 1 or more" +
                    "\n\tof its charges to cast the lightning bolt spell (save DC 15) from it. For 1 charge, you" +
                    "\n\tcast the 3rd-level version of the spell. You can increase the spell slot level by one for" +
                    "\n\teach additional charge you expend." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into ashes and is destroyed."
        ),
        "wand of paralysis" to MagicItem(
            name = "Wand of Paralysis",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action to expend 1 of" +
                    "\n\tits charges to cause a thin blue ray to streak from the tip toward a creature you can see" +
                    "\n\twithin 60 feet of you. The target must succeed on a DC 15 Constitution saving throw or be" +
                    "\n\tparalyzed for 1 minute. At the end of each of the target's turns, it can repeat the saving" +
                    "\n\tthrow, ending the effect on itself on a success." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into ashes and is destroyed."
        ),
        "+2 wand of the war mage" to MagicItem(
            name = "+2 Wand of the War Mage",
            description = "\n\tWhile holding this wand, you gain a +2 bonus to spell attack rolls. In addition," +
                    "\n\tyou ignore half cover when making a spell attack."
        ),
        "wand of wonder" to MagicItem(
            name = "Wand of Wonder",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action to expend 1 of its" +
                    "\n\tcharges and choose a target within 120 feet of you. The target can be a creature, an object," +
                    "\n\tor a point in space. Roll d100 and consult the following table to discover what happens." +
                    "\n\tIf the effect causes you to cast a spell from the wand, the spell's save DC is 15. If the" +
                    "\n\tspell normally has a range expressed in feet, its range becomes 120 feet if it isn't" +
                    "\n\talready. If an effect covers an area, you must center the spell on and include the target." +
                    "\n\tIf an effect has multiple possible subjects, the GM randomly determines which ones" +
                    "\n\tare affected." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into dust and is destroyed." +
                    "\n\td100\tEffect" +
                    "\n\t01-05\tYou cast slow." +
                    "\n\t06-10\tYou cast faerie fire." +
                    "\n\t11-15\tYou are stunned until the start of your next turn, believing something awesome" +
                    "\n\tjust happened." +
                    "\n\t16-20\tYou cast gust of wind." +
                    "\n\t21-25\tYou cast detect thoughts on the target you chose. If you didn't target a creature," +
                    "\n\tyou instead take 1d6 psychic damage." +
                    "\n\t26-30\tYou cast stinking cloud." +
                    "\n\t31-33\tHeavy rain falls in a 60-foot radius centered on the target. The area becomes" +
                    "\n\tlightly obscured. The rain falls until the start of your next turn." +
                    "\n\t34-36\tAn animal appears in the unoccupied space nearest the target. The animal isn't" +
                    "\n\tunder your control and acts as it normally would. Roll a d100 to determine which animal" +
                    "\n\tappears. On a 01–25, a rhinoceros appears; on a 26–50, an elephant appears; and on a" +
                    "\n\t51–100, a rat appears." +
                    "\n\t37-46\tYou cast lightning bolt." +
                    "\n\t47-49\tA cloud of 600 oversized butterflies fills a 30‐foot radius centered on the" +
                    "\n\ttarget. The area becomes heavily obscured. The butterflies remain for 10 minutes." +
                    "\n\t50-53\tYou enlarge the target as if you had cast enlarge/reduce. If the target can't be" +
                    "\n\taffected by that spell, or if you didn't target a creature, you become the target." +
                    "\n\t54-58\tYou cast darkness." +
                    "\n\t59-62\tGrass grows on the ground in a 60‐foot radius centered on the target. If grass is" +
                    "\n\talready there, it grows to ten times its normal size and remains overgrown for 1 minute." +
                    "\n\t63-65\tAn object of the GM's choice disappears into the Ethereal Plane. The object must be" +
                    "\n\tneither worn nor carried, within 120 feet of the target, and no larger than 10 feet in" +
                    "\n\tany dimension." +
                    "\n\t66-69\tYou shrink yourself as if you had cast enlarge/reduce on yourself." +
                    "\n\t70-79\tYou cast fireball." +
                    "\n\t80-84\tYou cast invisibility on yourself." +
                    "\n\t85-87\tLeaves grow from the target. If you chose a point in space as the target, leaves" +
                    "\n\tsprout from the creature nearest to that point. Unless they are picked off, the leaves" +
                    "\n\tturn brown and fall off after 24 hours." +
                    "\n\t88-90\tA stream of 1d4 × 10 gems, each worth 1 gp, shoots from the wand's tip in a line" +
                    "\n\t30 feet long and 5 feet wide. Each gem deals 1 bludgeoning damage, and the total damage of" +
                    "\n\tthe gems is divided equally among all creatures in the line." +
                    "\n\t91-95\tA burst of colorful shimmering light extends from you in a 30‐foot radius. You and" +
                    "\n\teach creature in the area that can see must succeed on a DC 15 Constitution saving throw or" +
                    "\n\tbecome blinded for 1 minute. A creature can repeat the saving throw at the end of each of" +
                    "\n\tits turns, ending the effect on itself on a success." +
                    "\n\t96-97\tThe target's skin turns bright blue for 1d10 days. If you chose a point in space, the" +
                    "\n\tcreature nearest to that point is affected." +
                    "\n\t98-00\tIf you targeted a creature, it must make a DC 15 Constitution saving throw. If you" +
                    "\n\tdidn't target a creature, you become the target and must make the saving throw. If the" +
                    "\n\tsaving throw fails by 5 or more, the target is instantly petrified. On any other failed" +
                    "\n\tsave, the target is restrained and begins to turn to stone. While restrained in this way," +
                    "\n\tthe target must repeat the saving throw at the end of its next turn, becoming petrified on" +
                    "\n\ta failure or ending the effect on a success. The petrification lasts until the target is" +
                    "\n\tfreed by the greater restoration spell or similar magic."
        ),
        "wings of flying" to MagicItem(
            name = "Wings of Flying",
            description = "\n\tWhile wearing this cloak, you can use an action to speak its command word. This turns" +
                    "\n\tthe cloak into a pair of bat wings or bird wings on your back for 1 hour or until you" +
                    "\n\trepeat the command word as an action. The wings give you a flying speed of 60 feet. When" +
                    "\n\tthey disappear, you can't use them again for 1d12 hours."
        )
    )
}