package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListIName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..5 -> MagicItemsI.magicItems["defender"]?.name.toString()
        in 6..10 -> MagicItemsI.magicItems["hammer of thunderbolts"]?.name.toString()
        in 11..15 -> MagicItemsI.magicItems["luck blade"]?.name.toString()
        in 16..20 -> MagicItemsI.magicItems["sword of answering"]?.name.toString()
        in 21..23 -> MagicItemsI.magicItems["holy avenger"]?.name.toString()
        in 24..26 -> MagicItemsI.magicItems["ring of djinni summoning"]?.name.toString()
        in 27..29 -> MagicItemsI.magicItems["ring of invisibility"]?.name.toString()
        in 30..32 -> MagicItemsI.magicItems["ring of spell turning"]?.name.toString()
        in 33..35 -> MagicItemsI.magicItems["rod of lordly might"]?.name.toString()
        in 36..38 -> MagicItemsI.magicItems["staff of the magi"]?.name.toString()
        in 39..41 -> MagicItemsI.magicItems["vorpal sword"]?.name.toString()
        in 42..43 -> MagicItemsI.magicItems["belt of cloud giant strength"]?.name.toString()
        in 44..45 -> MagicItemsI.magicItems["+2 breastplate"]?.name.toString()
        in 46..47 -> MagicItemsI.magicItems["+3 chain mail"]?.name.toString()
        in 48..49 -> MagicItemsI.magicItems["+3 chain shirt"]?.name.toString()
        in 50..51 -> MagicItemsI.magicItems["cloak of invisibility"]?.name.toString()
        in 52..53 -> MagicItemsI.magicItems["crystal ball"]?.name.toString()
        in 54..55 -> MagicItemsI.magicItems["+1 half plate"]?.name.toString()
        in 56..57 -> MagicItemsI.magicItems["iron flask"]?.name.toString()
        in 58..59 -> MagicItemsI.magicItems["+3 leather armor"]?.name.toString()
        in 60..61 -> MagicItemsI.magicItems["+1 plate"]?.name.toString()
        in 62..63 -> MagicItemsI.magicItems["robe of the archmagi"]?.name.toString()
        in 64..65 -> MagicItemsI.magicItems["rod of resurrection"]?.name.toString()
        in 66..67 -> MagicItemsI.magicItems["+1 scale mail"]?.name.toString()
        in 68..69 -> MagicItemsI.magicItems["scarab of protection"]?.name.toString()
        in 70..71 -> MagicItemsI.magicItems["+2 splint"]?.name.toString()
        in 72..73 -> MagicItemsI.magicItems["+2 studded leather"]?.name.toString()
        in 74..75 -> MagicItemsI.magicItems["well of many worlds"]?.name.toString()
        76 -> MagicItemsI.magicItems["magic armor"]?.name.toString()
        77 -> MagicItemsI.magicItems["apparatus of kwalish"]?.name.toString()
        78 -> MagicItemsI.magicItems["armor of invulnerability"]?.name.toString()
        79 -> MagicItemsI.magicItems["belt of storm giant strength"]?.name.toString()
        80 -> MagicItemsI.magicItems["cubic gate"]?.name.toString()
        81 -> MagicItemsI.magicItems["deck of many things"]?.name.toString()
        82 -> MagicItemsI.magicItems["efreeti chain"]?.name.toString()
        83 -> MagicItemsI.magicItems["half plate armor of resistance"]?.name.toString()
        84 -> MagicItemsI.magicItems["iron horn of valhalla"]?.name.toString()
        85 -> MagicItemsI.magicItems["ollamh harp"]?.name.toString()
        86 -> MagicItemsI.magicItems["ioun stone of greater absorption"]?.name.toString()
        87 -> MagicItemsI.magicItems["ioun stone of mastery"]?.name.toString()
        88 -> MagicItemsI.magicItems["ioun stone of regeneration"]?.name.toString()
        89 -> MagicItemsI.magicItems["plate armor of etherealness"]?.name.toString()
        90 -> MagicItemsI.magicItems["plate armor of resistance"]?.name.toString()
        91 -> MagicItemsI.magicItems["ring of air elemental command"]?.name.toString()
        92 -> MagicItemsI.magicItems["ring of earth elemental command"]?.name.toString()
        93 -> MagicItemsI.magicItems["ring of fire elemental command"]?.name.toString()
        94 -> MagicItemsI.magicItems["ring of three wishes"]?.name.toString()
        95 -> MagicItemsI.magicItems["ring of water elemental command"]?.name.toString()
        96 -> MagicItemsI.magicItems["sphere of annihilation"]?.name.toString()
        97 -> MagicItemsI.magicItems["talisman of pure good"]?.name.toString()
        98 -> MagicItemsI.magicItems["talisman of the sphere"]?.name.toString()
        99 -> MagicItemsI.magicItems["talisman of ultimate evil"]?.name.toString()
        else -> MagicItemsI.magicItems["tome of the stilled tongue"]?.name.toString()
    }

    return result
}

fun rollListIDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..5 -> MagicItemsI.magicItems["defender"]?.description.toString()
        in 6..10 -> MagicItemsI.magicItems["hammer of thunderbolts"]?.description.toString()
        in 11..15 -> MagicItemsI.magicItems["luck blade"]?.description.toString()
        in 16..20 -> MagicItemsI.magicItems["sword of answering"]?.description.toString()
        in 21..23 -> MagicItemsI.magicItems["holy avenger"]?.description.toString()
        in 24..26 -> MagicItemsI.magicItems["ring of djinni summoning"]?.description.toString()
        in 27..29 -> MagicItemsI.magicItems["ring of invisibility"]?.description.toString()
        in 30..32 -> MagicItemsI.magicItems["ring of spell turning"]?.description.toString()
        in 33..35 -> MagicItemsI.magicItems["rod of lordly might"]?.description.toString()
        in 36..38 -> MagicItemsI.magicItems["staff of the magi"]?.description.toString()
        in 39..41 -> MagicItemsI.magicItems["vorpal sword"]?.description.toString()
        in 42..43 -> MagicItemsI.magicItems["belt of cloud giant strength"]?.description.toString()
        in 44..45 -> MagicItemsI.magicItems["+2 breastplate"]?.description.toString()
        in 46..47 -> MagicItemsI.magicItems["+3 chain mail"]?.description.toString()
        in 48..49 -> MagicItemsI.magicItems["+3 chain shirt"]?.description.toString()
        in 50..51 -> MagicItemsI.magicItems["cloak of invisibility"]?.description.toString()
        in 52..53 -> MagicItemsI.magicItems["crystal ball"]?.name.toString()
        in 54..55 -> MagicItemsI.magicItems["+1 half plate"]?.name.toString()
        in 56..57 -> MagicItemsI.magicItems["iron flask"]?.name.toString()
        in 58..59 -> MagicItemsI.magicItems["+3 leather armor"]?.description.toString()
        in 60..61 -> MagicItemsI.magicItems["+1 plate"]?.description.toString()
        in 62..63 -> MagicItemsI.magicItems["robe of the archmagi"]?.description.toString()
        in 64..65 -> MagicItemsI.magicItems["rod of resurrection"]?.description.toString()
        in 66..67 -> MagicItemsI.magicItems["+1 scale mail"]?.description.toString()
        in 68..69 -> MagicItemsI.magicItems["scarab of protection"]?.description.toString()
        in 70..71 -> MagicItemsI.magicItems["+2 splint"]?.description.toString()
        in 72..73 -> MagicItemsI.magicItems["+2 studded leather"]?.description.toString()
        in 74..75 -> MagicItemsI.magicItems["well of many worlds"]?.description.toString()
        76 -> MagicItemsI.magicItems["magic armor"]?.description.toString()
        77 -> MagicItemsI.magicItems["apparatus of kwalish"]?.description.toString()
        78 -> MagicItemsI.magicItems["armor of invulnerability"]?.description.toString()
        79 -> MagicItemsI.magicItems["belt of storm giant strength"]?.description.toString()
        80 -> MagicItemsI.magicItems["cubic gate"]?.description.toString()
        81 -> MagicItemsI.magicItems["deck of many things"]?.description.toString()
        82 -> MagicItemsI.magicItems["efreeti chain"]?.description.toString()
        83 -> MagicItemsI.magicItems["half plate armor of resistance"]?.description.toString()
        84 -> MagicItemsI.magicItems["iron horn of valhalla"]?.description.toString()
        85 -> MagicItemsI.magicItems["ollamh harp"]?.description.toString()
        86 -> MagicItemsI.magicItems["ioun stone of greater absorption"]?.description.toString()
        87 -> MagicItemsI.magicItems["ioun stone of mastery"]?.description.toString()
        88 -> MagicItemsI.magicItems["ioun stone of regeneration"]?.description.toString()
        89 -> MagicItemsI.magicItems["plate armor of etherealness"]?.description.toString()
        90 -> MagicItemsI.magicItems["plate armor of resistance"]?.description.toString()
        91 -> MagicItemsI.magicItems["ring of air elemental command"]?.description.toString()
        92 -> MagicItemsI.magicItems["ring of earth elemental command"]?.description.toString()
        93 -> MagicItemsI.magicItems["ring of fire elemental command"]?.description.toString()
        94 -> MagicItemsI.magicItems["ring of three wishes"]?.description.toString()
        95 -> MagicItemsI.magicItems["ring of water elemental command"]?.description.toString()
        96 -> MagicItemsI.magicItems["sphere of annihilation"]?.description.toString()
        97 -> MagicItemsI.magicItems["talisman of pure good"]?.description.toString()
        98 -> MagicItemsI.magicItems["talisman of the sphere"]?.description.toString()
        99 -> MagicItemsI.magicItems["talisman of ultimate evil"]?.description.toString()
        else -> MagicItemsI.magicItems["tome of the stilled tongue"]?.description.toString()
    }

    return result
}

object MagicItemsI {
    val magicItems = mapOf<String, MagicItem>(
        "defender" to MagicItem(
            name = "Defender",
            description = "\n\tYou gain a +3 bonus to attack and damage rolls made with this magic weapon." +
                    "\n\tThe first time you attack with the sword on each of your turns, you can transfer some or" +
                    "\n\tall of the sword’s bonus to your Armor Class, instead of using the bonus on any attacks that" +
                    "\n\tturn. For example, you could reduce the bonus to your attack and damage rolls to +1 and gain" +
                    "\n\ta +2 bonus to AC. The adjusted bonuses remain in effect until the start of your next turn," +
                    "\n\talthough you must hold the sword to gain a bonus to AC from it."
        ),
        "hammer of thunderbolts" to MagicItem(
            name = "Hammer of Thunderbolts",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon.\n" +
                    "\n\tGiant's Bane (Requires Attunement). You must be wearing a belt of giant strength (any variety) and gauntlets of ogre power to attune to this weapon. The attunement ends if you take off either of those items. While you are attuned to this weapon and holding it, your Strength score increases by 4 and can exceed 20, but not 30. When you roll a 20 on an attack roll made with this weapon against a giant, the giant must succeed on a DC 17 Constitution saving throw or die.\n" +
                    "\n\tThe hammer also has 5 charges. While attuned to it, you can expend 1 charge and make a ranged weapon attack with the hammer, hurling it as if it had the thrown property with a normal range of 20 feet and a long range of 60 feet. If the attack hits, the hammer unleashes a thunderclap audible out to 300 feet. The target and every creature within 30 feet of it must succeed on a DC 17 Constitution saving throw or be stunned until the end of your next turn. The hammer regains 1d4 + 1 expended charges daily at dawn.\n" +
                    "\n\tProficiency with a maul allows you to add your proficiency bonus to the attack roll for any attack you make with it."
        ),
        "luck blade" to MagicItem(
            name = "Luck Blade",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this magic weapon. While the" +
                    "\n\tsword is on your person, you also gain a +1 bonus to saving throws." +
                    "\n\tLuck. If the sword is on your person, you can call on its luck (no action required) to reroll" +
                    "\n\tone attack roll, ability check, or saving throw you dislike. You must use the second roll." +
                    "\n\tThis property can't be used again until the next dawn." +
                    "\n\tWish. The sword has 1d4–1 charges. While holding it, you can use an action to expend 1 charge" +
                    "\n\tand cast the wish spell from it. This property can't be used again until the next dawn. The" +
                    "\n\tsword loses this property if it has no charges."
        ),
        "sword of answering" to MagicItem(
            name = "Sword of Answering",
            description = "\n\tIn the world of Greyhawk, only nine of these blades are known to exist. Each is" +
                    "\n\tpatterned after the legendary sword Fragarach, which is variously translated as “Final Word.”" +
                    "\n\tEach of the nine swords has its own name and alignment, and each bears a different gem in" +
                    "\n\tits pommel." +
                    "\n\tName\tAlignment\tGem" +
                    "\n\tAnswerer\tChaotic good\tEmerald" +
                    "\n\tBack Talker\tChaotic evil\tJet" +
                    "\n\tConcluder\tLawful neutral\tAmethyst" +
                    "\n\tLast Quip\tChaotic neutral\tTourmaline" +
                    "\n\tRebutter\tNeutral good\tTopaz" +
                    "\n\tReplier\tNeutral\tPeridot" +
                    "\n\tRetorter\tLawful good\tAquamarine" +
                    "\n\tScather\tLawful evil\tGarnet" +
                    "\n\tSquelcher\tNeutral evil\tSpinel" +
                    "\n\tYou gain a +3 bonus to attack and damage rolls made with this sword. In addition, while you" +
                    "\n\thold the sword, you can use your reaction to make one melee attack with it against any" +
                    "\n\tcreature in your reach that deals damage to you. You have advantage on the attack roll, and" +
                    "\n\tany damage dealt with this special attack ignores any damage immunity or resistance the" +
                    "\n\ttarget has." +
                    "\n\tProficiency with a longsword allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "holy avenger" to MagicItem(
            name = "Holy Avenger",
            description = "\n\tYou gain a +3 bonus to attack and damage rolls made with this magic weapon. When you" +
                    "\n\thit a fiend or an undead with it, that creature takes an extra 2d10 radiant damage." +
                    "\n\tWhile you hold the drawn sword, it creates an aura in a 10-foot radius around you. You and" +
                    "\n\tall creatures friendly to you in the aura have advantage on saving throws against spells and" +
                    "\n\tother magical effects. If you have 17 or more levels in the paladin class, the radius of the" +
                    "\n\taura increases to 30 feet."
        ),
        "ring of djinni summoning" to MagicItem(
            name = "Ring of Djinni Summoning",
            description = "\n\tWhile wearing this ring, you can speak its command word as an action to summon a" +
                    "\n\tparticular djinni from the Elemental Plane of Air. The djinni appears in an unoccupied space" +
                    "\n\tyou choose within 120 feet of you. It remains as long as you concentrate (as if concentrating" +
                    "\n\ton a spell), to a maximum of 1 hour, or until it drops to 0 hit points. It then returns to its" +
                    "\n\thome plane." +
                    "\n\tWhile summoned, the djinni is friendly to you and your companions. It obeys any commands you" +
                    "\n\tgive it, no matter what language you use. If you fail to command it, the djinni defends" +
                    "\n\titself against attackers but takes no other actions." +
                    "\n\tAfter the djinni departs, it can't be summoned again for 24 hours, and the ring becomes" +
                    "\n\tnonmagical if the djinni dies."
        ),
        "ring of invisibility" to MagicItem(
            name = "Ring of Invisibility",
            description = "\n\tWhile wearing this ring, you can turn invisible as an action. Anything you are wearing" +
                    "\n\tor carrying is invisible with you. You remain invisible until the ring is removed, until you" +
                    "\n\tattack or cast a spell, or until you use a bonus action to become visible again."
        ),
        "ring of spell turning" to MagicItem(
            name = "Ring of Spell Turning",
            description = "\n\tWhile wearing this ring, you have advantage on saving throws against any spell that" +
                    "\n\ttargets only you (not in an area of effect). In addition, if you roll a 20 for the save and" +
                    "\n\tthe spell is 7th level or lower, the spell has no effect on you and instead targets the" +
                    "\n\tcaster, using the slot level, spell save DC, attack bonus, and spellcasting ability of" +
                    "\n\tthe caster."
        ),
        "rod of lordly might" to MagicItem(
            name = "Rod of Lordly Might",
            description = "\n\tThis rod has a flanged head, and it functions as a magic mace that grants a +3 bonus to" +
                    "\n\tattack and damage rolls made with it. The rod has properties associated with six different" +
                    "\n\tbuttons that are set in a row along the haft. It has three other properties as well," +
                    "\n\tdetailed below." +
                    "\n\tSix Buttons. You can press one of the rod's six buttons as a bonus action. A button's effect" +
                    "\n\tlasts until you push a different button or until you push the same button again, which causes" +
                    "\n\tthe rod to revert to its normal form." +
                    "\n\tIf you press button 1, the rod becomes a flame tongue, as a fiery blade sprouts from the end" +
                    "\n\topposite the rod's flanged head (you choose the type of sword)." +
                    "\n\tIf you press button 2, the rod's flanged head folds down and two crescent-shaped blades" +
                    "\n\tspring out, transforming the rod into a magic battleaxe that grants a +3 bonus to attack and" +
                    "\n\tdamage rolls made with it." +
                    "\n\tIf you press button 3, the rod's flanged head folds down, a spear point springs from the rod's" +
                    "\n\ttip, and the rod's handle lengthens into a 6-foot haft, transforming the rod into a magic spear" +
                    "\n\tthat grants a +3 bonus to attack and damage rolls made with it." +
                    "\n\tIf you press button 4, the rod transforms into a climbing pole up to 50 feet long, as you" +
                    "\n\tspecify. In surfaces as hard as granite, a spike at the bottom and three hooks at the top" +
                    "\n\tanchor the pole. Horizontal bars 3 inches long fold out from the sides, 1 foot apart, forming" +
                    "\n\ta ladder. The pole can bear up to 4,000 pounds. More weight or lack of solid anchoring causes" +
                    "\n\tthe rod to revert to its normal form." +
                    "\n\tIf you press button 5, the rod transforms into a handheld battering ram and grants its user a" +
                    "\n\t+10 bonus to Strength checks made to break through doors, barricades, and other barriers." +
                    "\n\tIf you press button 6, the rod assumes or remains in its normal form and indicates magnetic" +
                    "\n\tnorth. (Nothing happens if this function of the rod is used in a location that has no magnetic" +
                    "\n\tnorth.) The rod also gives you knowledge of your approximate depth beneath the ground or your" +
                    "\n\theight above it." +
                    "\n\tDrain Life. When you hit a creature with a melee attack using the rod, you can force the" +
                    "\n\ttarget to make a DC 17 Constitution saving throw. On a failure, the target takes an extra 4d6" +
                    "\n\tnecrotic damage, and you regain a number of hit points equal to half that necrotic damage." +
                    "\n\tThis property can't be used again until the next dawn." +
                    "\n\tParalyze. When you hit a creature with a melee attack using the rod, you can force the target" +
                    "\n\tto make a DC 17 Strength saving throw. On a failure, the target is paralyzed for 1 minute." +
                    "\n\tThe target can repeat the saving throw at the end of each of its turns, ending the effect on" +
                    "\n\ta success. This property can't be used again until the next dawn." +
                    "\n\tTerrify. While holding the rod, you can use an action to force each creature you can see" +
                    "\n\twithin 30 feet of you to make a DC 17 Wisdom saving throw. On a failure, a target is" +
                    "\n\tfrightened of you for 1 minute. A frightened target can repeat the saving throw at the end of" +
                    "\n\teach of its turns, ending the effect on itself on a success. This property can't be used" +
                    "\n\tagain until the next dawn."
        ),
        "staff of the magi" to MagicItem(
            name = "Staff of the Magi",
            description = "\n\tThis staff can be wielded as a magic quarterstaff that grants a +2 bonus to attack and" +
                    "\n\tdamage rolls made with it. While you hold it, you gain a +2 bonus to spell attack rolls." +
                    "\n\tThe staff has 50 charges for the following properties. It regains 4d6 + 2 expended charges" +
                    "\n\tdaily at dawn. If you expend the last charge, roll a d20. On a 20, the staff regains 1d12 +" +
                    "\n\t1 charges." +
                    "\n\tSpell Absorption. While holding the staff, you have advantage on saving throws against spells." +
                    "\n\tIn addition, you can use your reaction when another creature casts a spell that targets only" +
                    "\n\tyou. If you do, the staff absorbs the magic of the spell, canceling its effect and gaining a" +
                    "\n\tnumber of charges equal to the absorbed spell's level. However, if doing so brings the staff's" +
                    "\n\ttotal number of charges above 50, the staff explodes as if you activated its retributive" +
                    "\n\tstrike (see below)." +
                    "\n\tSpells. While holding the staff, you can use an action to expend some of its charges to cast" +
                    "\n\tone of the following spells from it, using your spell save DC and spellcasting ability:" +
                    "\n\tconjure elemental (7 charges), dispel magic (3 charges), fireball (7th-level version, 7" +
                    "\n\tcharges), flaming sphere (2 charges), ice storm (4 charges), invisibility (2 charges), knock" +
                    "\n\t(2 charges), lightning bolt (7th-level version, 7 charges), passwall (5 charges), plane shift" +
                    "\n\t(7 charges), telekinesis (5 charges), wall of fire (4 charges), or web (2 charges)." +
                    "\n\tYou can also use an action to cast one of the following spells from the staff without using" +
                    "\n\tany charges: arcane lock, detect magic, enlarge/reduce, light, mage hand, or protection from" +
                    "\n\tevil and good." +
                    "\n\tRetributive Strike. You can use an action to break the staff over your knee or against a" +
                    "\n\tsolid surface, performing a retributive strike. The staff is destroyed and releases its" +
                    "\n\tremaining magic in an explosion that expands to fill a 30-foot-radius sphere centered on it." +
                    "\n\tYou have a 50 percent chance to instantly travel to a random plane of existence, avoiding the" +
                    "\n\texplosion. If you fail to avoid the effect, you take force damage equal to 16 × the number of" +
                    "\n\tcharges in the staff. Every other creature in the area must make a DC 17 Dexterity saving" +
                    "\n\tthrow. On a failed save, a creature takes an amount of damage based on how far away it is" +
                    "\n\tfrom the point of origin, as shown in the following table. On a successful save, a creature" +
                    "\n\ttakes half as much damage." +
                    "\n\tDistance from Origin\tDamage" +
                    "\n\t10 ft. away or closer\t8 x the number of charges in the staff" +
                    "\n\t11 to 20 ft. away\t6 x the number of charges in the staff" +
                    "\n\t21 to 30 ft. away\t4 x the number of charges in the staff"
        ),
        "vorpal sword" to MagicItem(
            name = "Vorpal Sword",
            description = "\n\tYou gain a +3 bonus to attack and damage rolls made with this magic weapon. In addition," +
                    "\n\tthe weapon ignores resistance to slashing damage." +
                    "\n\tWhen you attack a creature that has at least one head with this weapon and roll a 20 on the" +
                    "\n\tattack roll, you cut off one of the creature's heads. The creature dies if it can't survive" +
                    "\n\twithout the lost head. A creature is immune to this effect if it is immune to slashing damage," +
                    "\n\tdoesn't have or need a head, has legendary actions, or the GM decides that the creature is too" +
                    "\n\tbig for its head to be cut off with this weapon. Such a creature instead takes an extra 6d8" +
                    "\n\tslashing damage from the hit."
        ),
        "belt of cloud giant strength" to MagicItem(
            name = "Belt of Cloud Giant Strength",
            description = "\n\tWhile wearing this belt, your Strength score changes to 27. The item has no effect on" +
                    "\n\tyou if your Strength without the belt is equal to or greater than 27."
        ),
        "+2 breastplate" to MagicItem(
            name = "+2 Breastplate",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tThis armor consists of a fitted metal chest piece worn with supple leather. Although it leaves the legs and arms relatively unprotected, this armor provides good protection for the wearer's vital organs while leaving the wearer relatively unencumbered."
        ),
        "+3 chain mail" to MagicItem(
            name = "+3 Chain Mail",
            description = "\n\tYou have a +3 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, chain mail includes a layer of quilted fabric worn" +
                    "\n\tunderneath the mail to prevent chafing and to cushion the impact of blows. The suit" +
                    "\n\tincludes gauntlets."
        ),
        "+3 chain shirt" to MagicItem(
            name = "+3 Chain Shirt",
            description = "\n\tYou have a +3 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, a chain shirt is worn between layers of clothing or leather." +
                    "\n\tThis armor offers modest protection to the wearer's upper body and allows the sound of the" +
                    "\n\trings rubbing against one another to be muffled by outer layers."
        ),
        "cloak of invisibility" to MagicItem(
            name = "Cloak of Invisibility",
            description = "\n\tWhile wearing this cloak, you can pull its hood over your head to cause yourself to" +
                    "\n\tbecome invisible. While you are invisible, anything you are carrying or wearing is invisible" +
                    "\n\twith you. You become visible when you cease wearing the hood. Pulling the hood up or down" +
                    "\n\trequires an action." +
                    "\n\tDeduct the time you are invisible, in increments of 1 minute, from the cloak's maximum" +
                    "\n\tduration of 2 hours. After 2 hours of use, the cloak ceases to function. For every" +
                    "\n\tuninterrupted period of 12 hours the cloak goes unused, it regains 1 hour of duration. "
        ),
        "+1 half plate" to MagicItem(
            name = "+1 Half Plate",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tHalf plate consists of shaped metal plates that cover most of the wearer's body. It does not" +
                    "\n\tinclude leg protection beyond simple greaves that are attached with leather straps."
        ),
        "iron flask" to MagicItem(
            name = "Iron Flask",
            description = "\n\tThis iron bottle has a brass stopper. You can use an action to speak the flask's command" +
                    "\n\tword, targeting a creature that you can see within 60 feet of you. If the target is native to" +
                    "\n\ta plane of existence other than the one you're on, the target must succeed on a DC 17 Wisdom" +
                    "\n\tsaving throw or be trapped in the flask. If the target has been trapped by the flask before," +
                    "\n\tit has advantage on the saving throw. Once trapped, a creature remains in the flask until" +
                    "\n\treleased. The flask can hold only one creature at a time. A creature trapped in the flask" +
                    "\n\tdoesn't need to breathe, eat, or drink and doesn't age." +
                    "\n\tYou can use an action to remove the flask's stopper and release the creature the flask" +
                    "\n\tcontains. The creature is friendly to you and your companions for 1 hour and obeys your" +
                    "\n\tcommands for that duration. If you give no commands or give it a command that is likely to" +
                    "\n\tresult in its death, it defends itself but otherwise takes no actions. At the end of the" +
                    "\n\tduration, the creature acts in accordance with its normal disposition and alignment." +
                    "\n\tAn identify spell reveals that a creature is inside the flask, but the only way to determine" +
                    "\n\tthe type of creature is to open the flask. A newly discovered bottle might already contain a" +
                    "\n\tcreature chosen by the GM or determined randomly." +
                    "\n\td100 \tContents       \td100 \tContents" +
                    "\n\t1-50 \tEmpty          \t77-78\tElemental (any)" +
                    "\n\t51   \tArcanaloth     \t79   \tGithyanki knight" +
                    "\n\t52   \tCambion        \t80   \tGithzerai zerth" +
                    "\n\t53-54\tDao            \t81-82\tInvisible Stalker" +
                    "\n\t55-57\tDemon (type 1) \t83-84\tMarid" +
                    "\n\t58-60\tDemon (type 2) \t85-86\tMezzoloth" +
                    "\n\t61-62\tDemon (type 3) \t87-88\tNight hag" +
                    "\n\t63-64\tDemon (type 4) \t89-90\tNycaloth" +
                    "\n\t65   \tDemon (type 5) \t91   \tPlanetar" +
                    "\n\t66   \tDemon (type 6) \t92-93\tSalamander" +
                    "\n\t67   \tDeva           \t94-95\tSlaad (any)" +
                    "\n\t68-69\tDevil (greater)\t96   \tSolar" +
                    "\n\t70-72\tDevil (lesser) \t97-98\tSuccubus/incubus" +
                    "\n\t73-74\tDjinni         \t99   \tUltroloth" +
                    "\n\t75-76\tEfreeti        \t00   \tXorn"
        ),
        "crystal ball" to MagicItem(
            name = "Crystal Ball",
            description = "\n\tThe typical crystal ball, a very rare item, is about 6 inches in diameter. While" +
                    "\n\ttouching it, you can cast the scrying spell (save DC 17) with it." +
                    "\n\tThe following crystal ball variants are legendary items and have additional properties." +
                    "\n\tCrystal Ball of Mind Reading. You can use an action to cast the detect thoughts spell (save" +
                    "\n\tDC 17) while you are scrying with the crystal ball, targeting creatures you can see within 30" +
                    "\n\tfeet of the spell’s sensor. You don’t need to concentrate on this detect thoughts to maintain" +
                    "\n\tit during its duration, but it ends if scrying ends." +
                    "\n\tCrystal Ball of Telepathy. While scrying with the crystal ball, you can communicate" +
                    "\n\ttelepathically with creatures you can see within 30 feet of the spell’s sensor. You can also" +
                    "\n\tuse an action to cast the suggestion spell (save DC 17) through the sensor on one of those" +
                    "\n\tcreatures. You don’t need to concentrate on this Suggestion to maintain it during its" +
                    "\n\tduration, but it ends if scrying ends. Once used, the suggestion power of the crystal ball" +
                    "\n\tcan’t be used again until the next dawn." +
                    "\n\tCrystal Ball of True Seeing. While scrying with the crystal ball, you have truesight with a" +
                    "\n\tradius of 120 feet centered on the spell’s sensor."
        ),
        "+3 leather armor" to MagicItem(
            name = "+3 Leather Armor",
            description = "\n\tYou have a +3 bonus to AC while wearing this armor." +
                    "\n\tThe breastplate and shoulder protectors of this armor are made of leather that has been" +
                    "\n\tstiffened by being boiled in oil. The rest of the armor is made of softer and more" +
                    "\n\tflexible materials."
        ),
        "+1 plate" to MagicItem(
            name = "+1 Plate",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of plate" +
                    "\n\tincludes gauntlets, heavy leather boots, a visored helmet, and thick layers of padding" +
                    "\n\tunderneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "robe of the archmagi" to MagicItem(
            name = "Robe of the Archmagi",
            description = "\n\tThis elegant garment is made from exquisite cloth of white, gray, or black and adorned" +
                    "\n\twith silvery runes. The robe's color corresponds to the alignment for which the item was" +
                    "\n\tcreated. A white robe was made for good, gray for neutral, and black for evil. You can't" +
                    "\n\tattune to a robe of the archmagi that doesn't correspond to your alignment. You gain these" +
                    "\n\tbenefits while wearing the robe:" +
                    "\n\tIf you aren't wearing armor, your base Armor Class is 15 + your Dexterity modifier." +
                    "\n\tYou have advantage on saving throws against spells and other magical effects." +
                    "\n\tYour spell save DC and spell attack bonus each increase by 2."
        ),
        "rod of resurrection" to MagicItem(
            name = "Rod of Resurrection",
            description = "\n\tThe rod has 5 charges. While you hold it, you can use an action to cast one of the" +
                    "\n\tfollowing spells from it: heal (expends 1 charge) or resurrection (expends 5 charges)." +
                    "\n\tThe rod regains 1 expended charge daily at dawn. If the rod is reduced to 0 charges, roll a" +
                    "\n\td20. On a 1, the rod disapears in a burst of radiance. "
        ),
        "+1 scale mail" to MagicItem(
            name = "+1 Scale Mail",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tThis armor consists of a coat and leggings (and perhaps a separate skirt) of leather covered" +
                    "\n\twith overlapping pieces of metal, much like the scales of a fish. The suit includes gauntlets."
        ),
        "scarab of protection" to MagicItem(
            name = "Scarab of Protection",
            description = "\n\tIf you hold this beetle-shaped medallion in your hand for 1 round, an inscription" +
                    "\n\tappears on its surface revealing its magical nature. It provides two benefits while it is" +
                    "\n\ton your person:" +
                    "\n\tYou have advantage on saving throws against spells." +
                    "\n\tThe scarab has 12 charges. If you fail a saving throw against a necromancy spell or a harmful" +
                    "\n\teffect originating from an undead creature, you can use your reaction to expend 1 charge and" +
                    "\n\tturn the failed save into a successful one. The scarab crumbles into powder and is destroyed" +
                    "\n\twhen its last charge is expended."
        ),
        "+2 splint" to MagicItem(
            name = "+2 Splint",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tThis armor is made of narrow vertical strips of metal riveted to a backing of leather that is" +
                    "\n\tworn over cloth padding. Flexible chain mail protects the joints."
        ),
        "+2 studded leather" to MagicItem(
            name = "+2 Studded Leather",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tMade from tough but flexible leather, studded leather is reinforced with close-set rivets" +
                    "\n\tor spikes."
        ),
        "well of many worlds" to MagicItem(
            name = "Well of Many Worlds",
            description = "\n\tThis fine black cloth, soft as silk, is folded up to the dimensions of a handkerchief." +
                    "\n\tIt unfolds into a circular sheet 6 feet in diameter." +
                    "\n\tYou can use an action to unfold and place the well of many worlds on a solid surface," +
                    "\n\twhereupon it creates a two-way portal to another world or plane of existence. Each time the" +
                    "\n\titem opens a portal, the DM decides where it leads. You can use an action to close an open" +
                    "\n\tportal by taking hold of the edges of the cloth and folding it up. Once well of many worlds" +
                    "\n\thas opened a portal, it can’t do so again for 1d8 hours."
        ),
        "magic armor" to MagicItem(
            name = "Magic Armor",
            description = "\n\t1–2\tArmor\t+2 half plate" +
                    "\n\t3–4\tArmor\t+2 plate" +
                    "\n\t5–6\tArmor\t+3 studded leather" +
                    "\n\t7–8\tArmor\t+3 breastplate" +
                    "\n\t9–10\tArmor\t+3 splint" +
                    "\n\t11\tArmor\t+3 half plate" +
                    "\n\t12\tArmor\t+3 plate"
        ),
        "apparatus of kwalish" to MagicItem(
            name = "Apparatus of Kwalish",
            description = "\n\tThis item first appears to be a Large sealed iron barrel weighing 500 pounds. The barrel" +
                    "\n\thas a hidden catch, which can be found with a successful DC 20 Intelligence (Investigation)" +
                    "\n\tcheck. Releasing the catch unlocks a hatch at one end of the barrel, allowing two Medium or" +
                    "\n\tsmaller creatures to crawl inside. Ten levers are set in a row at the far end, each in a" +
                    "\n\tneutral position, able to move either up or down. When certain levers are used, the apparatus" +
                    "\n\ttransforms to resemble a giant lobster. The apparatus of Kwalish is a Large object with the" +
                    "\n\tfollowing statistics:" +
                    "\n\tArmor Class: 20" +
                    "\n\tHit Points: 200" +
                    "\n\tSpeed: 30 ft., swim 30 ft. (or 0 ft. for both if the legs and tail aren't extended)" +
                    "\n\tDamage Immunities: poison, psychic" +
                    "\n\to be used as a vehicle, the apparatus requires one pilot. While the apparatus's hatch is" +
                    "\n\tclosed, the compartment is airtight and watertight. The compartment holds enough air for 10" +
                    "\n\thours of breathing, divided by the number of breathing creatures inside." +
                    "\n\tThe apparatus floats on water. It can also go underwater to a depth of 900 feet. Below that," +
                    "\n\tthe vehicle takes 2d6 bludgeoning damage per minute from pressure." +
                    "\n\tA creature in the compartment can use an action to move as many as two of the apparatus's" +
                    "\n\tlevers up or down. After each use, a lever goes back to its neutral position. Each lever, from" +
                    "\n\tleft to right, functions as shown in the Apparatus of Kwalish Levers table." +
                    "\n\tApparatus of Kwalish Levers" +
                    "\n\tLever\tUp\tDown" +
                    "\n\t1\tLegs and tail extend, allowing the apparatus to walk and swim.\tLegs and tail retract," +
                    "\n\treducing the apparatus's speed to 0 and making it unable to benefit from bonuses to speed." +
                    "\n\t2\tForward window shutter opens.\tForward window shutter closes." +
                    "\n\t3\tSide window shutters open (two per side).\tSide window shutters close (two per side)." +
                    "\n\t4\tTwo claws extend from the front sides of the apparatus.\tThe claws retract." +
                    "\n\t5\tEach extended claw makes the following melee weapon attack: +8 to hit, reach 5 ft., one" +
                    "\n\ttarget. Hit: 7 (2d6) bludgeoning damage.\tEach extended claw makes the following melee weapon" +
                    "\n\tattack: +8 to hit, reach 5 ft., one target. Hit: The target is grappled (escape DC 15)." +
                    "\n\t6\tThe apparatus walks or swims forward.\tThe apparatus walks or swims backward." +
                    "\n\t7\tThe apparatus turns 90 degrees left.\tThe apparatus turns 90 degrees right." +
                    "\n\t8\tEyelike fixtures emit bright light in a 30-foot radius and dim light for an additional 30" +
                    "\n\tfeet.\tThe light turns off." +
                    "\n\t9\tThe apparatus sinks as much as 20 feet in liquid.\tThe apparatus rises up to 20 feet in" +
                    "\n\tliquid." +
                    "\n\t10\tThe rear hatch unseals and opens.\tThe rear hatch closes and seals."
        ),
        "armor of invulnerability" to MagicItem(
            name = "Armor of Invulnerability",
            description = "\n\tYou have resistance to nonmagical damage while you wear this armor. Additionally, you" +
                    "\n\tcan use an action to make yourself immune to nonmagical damage for 10 minutes or until you are" +
                    "\n\tno longer wearing the armor. Once this special action is used, it can't be used again until" +
                    "\n\tthe next dawn." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of plate" +
                    "\n\tincludes gauntlets, heavy leather boots, a visored helmet, and thick layers of padding" +
                    "\n\tunderneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "belt of storm giant strength" to MagicItem(
            name = "Belt of Storm Giant Strength",
            description = "\n\tWhile wearing this belt, your Strength score changes to 29. The item has no effect on" +
                    "\n\tyou if your Strength without the belt is equal to or greater than 29."
        ),
        "cubic gate" to MagicItem(
            name = "Cubic Gate",
            description = "\n\tThis cube is 3 inches across and radiates palpable magical energy. The six sides of the" +
                    "\n\tcube are each keyed to a different plane of existence, one of which is the Material Plane." +
                    "\n\tThe other sides are linked to planes determined by the GM." +
                    "\n\tYou can use an action to press one side of the cube to cast the gate spell with it, opening a" +
                    "\n\tportal to the plane keyed to that side. Alternatively, if you use an action to press one side" +
                    "\n\ttwice, you can cast the plane shift spell (save DC 17) with the cube and transport the targets" +
                    "\n\tto the plane keyed to that side." +
                    "\n\tThe cube has 3 charges. Each use of the cube expends 1 charge. The cube regains 1d3 expended" +
                    "\n\tcharges daily at dawn."
        ),
        "deck of many things" to MagicItem(
            name = "Deck of Many Things",
            description = "\n\tUsually found in a box or pouch, this deck contains a number of cards made of ivory or" +
                    "\n\tvellum. Most (75 percent) of these decks have only thirteen cards, but the rest have twenty-two." +
                    "\n\tBefore you draw a card, you must declare how many cards you intend to draw and then draw them" +
                    "\n\trandomly (you can use an altered deck of playing cards to simulate the deck). Any cards drawn" +
                    "\n\tin excess of this number have no effect. Otherwise, as soon as you draw a card from the deck," +
                    "\n\tits magic takes effect. You must draw each card no more than 1 hour after the previous draw." +
                    "\n\tIf you fail to draw the chosen number, the remaining number of cards fly from the deck on" +
                    "\n\ttheir own and take effect all at once." +
                    "\n\tOnce a card is drawn, it fades from existence. Unless the card is the Fool or the Jester, the" +
                    "\n\tcard reappears in the deck, making it possible to draw the same card twice." +
                    "\n\tPlaying Card\tCard" +
                    "\n\tAce of diamonds\tVizier*" +
                    "\n\tKing of diamonds\tSun" +
                    "\n\tQueen of diamonds\tMoon" +
                    "\n\tJack of diamonds\tStar" +
                    "\n\tTwo of diamonds\tComet*" +
                    "\n\tAce of hearts\tThe Fates*" +
                    "\n\tKing of hearts\tThrone" +
                    "\n\tQueen of hearts\tKey" +
                    "\n\tJack of hearts\tKnight" +
                    "\n\tTwo of hearts\tGem*" +
                    "\n\tAce of clubs\tTalons*" +
                    "\n\tKing of clubs\tThe Void" +
                    "\n\tQueen of clubs\tFlames" +
                    "\n\tJack of clubs\tSkull" +
                    "\n\tTwo of clubs\tIdiot*" +
                    "\n\tAce of spades\tDonjon*" +
                    "\n\tKing of spades\tRuin" +
                    "\n\tQueen of spades\tEuryale" +
                    "\n\tJack of spades\tRogue" +
                    "\n\tTwo of spades\tBalance*" +
                    "\n\tJoker (with TM)\tFool*" +
                    "\n\tJoker (without TM)\tJester" +
                    "\n\t* Found only in a deck with twenty-two cards" +
                    "\n\tBalance. Your mind suffers a wrenching alteration, causing your alignment to change. Lawful" +
                    "\n\tbecomes chaotic, good becomes evil, and vice versa. If you are true neutral or unaligned," +
                    "\n\tthis card has no effect on you." +
                    "\n\tComet. If you single-handedly defeat the next hostile monster or group of monsters you" +
                    "\n\tencounter, you gain experience points enough to gain one level. Otherwise, this card has" +
                    "\n\tno effect." +
                    "\n\tDonjon. You disappear and become entombed in a state of suspended animation in an" +
                    "\n\textradimensional sphere. Everything you were wearing and carrying stays behind in the space" +
                    "\n\tyou occupied when you disappeared. You remain imprisoned until you are found and removed from" +
                    "\n\tthe sphere. You can't be located by any divination magic, but a wish spell can reveal the" +
                    "\n\tlocation of your prison. You draw no more cards." +
                    "\n\tEuryale. The card's medusa-like visage curses you. You take a −2 penalty on saving throws" +
                    "\n\twhile cursed in this way. Only a god or the magic of The Fates card can end this curse." +
                    "\n\tThe Fates. Reality's fabric unravels and spins anew, allowing you to avoid or erase one event" +
                    "\n\tas if it never happened. You can use the card's magic as soon as you draw the card or at any" +
                    "\n\tother time before you die." +
                    "\n\tFlames. A powerful devil becomes your enemy. The devil seeks your ruin and plagues your life," +
                    "\n\tsavoring your suffering before attempting to slay you. This enmity lasts until either you or" +
                    "\n\tthe devil dies." +
                    "\n\tFool. You lose 10,000 XP, discard this card, and draw from the deck again, counting both" +
                    "\n\tdraws as one of your declared draws. If losing that much XP would cause you to lose a level," +
                    "\n\tyou instead lose an amount that leaves you with just enough XP to keep your level." +
                    "\n\tGem. Twenty-five pieces of jewelry worth 2,000 gp each or fifty gems worth 1,000 gp each" +
                    "\n\tappear at your feet." +
                    "\n\tIdiot. Permanently reduce your Intelligence by 1d4 + 1 (to a minimum score of 1). You can" +
                    "\n\tdraw one additional card beyond your declared draws." +
                    "\n\tJester. You gain 10,000 XP, or you can draw two additional cards beyond your declared draws." +
                    "\n\tKey. A rare or rarer magic weapon with which you are proficient appears in your hands. The" +
                    "\n\tGM chooses the weapon." +
                    "\n\tKnight. You gain the service of a 4th-level fighter who appears in a space you choose within" +
                    "\n\t30 feet of you. The fighter is of the same race as you and serves you loyally until death," +
                    "\n\tbelieving the fates have drawn him or her to you. You control this character." +
                    "\n\tMoon. You are granted the ability to cast the wish spell 1d3 times." +
                    "\n\tRogue. A nonplayer character of the GM's choice becomes hostile toward you. The identity of" +
                    "\n\tyour new enemy isn't known until the NPC or someone else reveals it. Nothing less than a wish" +
                    "\n\tspell or divine intervention can end the NPC's hostility toward you." +
                    "\n\tRuin. All forms of wealth that you carry or own, other than magic items, are lost to you." +
                    "\n\tPortable property vanishes. Businesses, buildings, and land you own are lost in a way that" +
                    "\n\talters reality the least. Any documentation that proves you should own something lost to this" +
                    "\n\tcard also disappears." +
                    "\n\tSkull. You summon an avatar of death--a ghostly humanoid skeleton clad in a tattered black" +
                    "\n\trobe and carrying a spectral scythe. It appears in a space of the GM's choice within 10 feet" +
                    "\n\tof you and attacks you, warning all others that you must win the battle alone. The avatar" +
                    "\n\tfights until you die or it drops to 0 hit points, whereupon it disappears. If anyone tries to" +
                    "\n\thelp you, the helper summons its own avatar of death. A creature slain by an avatar of death" +
                    "\n\tcan't be restored to life." +
                    "\n\tAvatar of Death" +
                    "\n\tMedium undead, neutral evil" +
                    "\n\tArmor Class 20" +
                    "\n\tHit Points half the hit point maximum of its summoner" +
                    "\n\tSpeed 60 ft., fly 60 ft. (hover)" +
                    "\n\tSTR\tDEX\tCON\tINT\tWIS\tCHA" +
                    "\n\t16 (+3)\t16 (+3)\t16 (+3)\t16 (+3)\t16 (+3)\t16 (+3)" +
                    "\n\tDamage Immunities necrotic, poison" +
                    "\n\tCondition Immunities charmed, frightened, paralyzed, petrified, poisoned, unconscious" +
                    "\n\tSenses darkvision 60 ft., truesight 60 ft., passive Perception 13" +
                    "\n\tLanguages all languages known to its summoner" +
                    "\n\tChallenge -- (0 XP)" +
                    "\n\tIncorporeal Movement. The avatar can move through other creatures and objects as if they were" +
                    "\n\tdifficult terrain. It takes 5 (1d10) force damage if it ends its turn inside an object." +
                    "\n\tTurning Immunity. The avatar is immune to features that turn undead." +
                    "\n\tActions" +
                    "\n\tReaping Scythe. The avatar sweeps its spectral scythe through a creature within 5 feet of it," +
                    "\n\tdealing 7 (1d8 + 3) slashing damage plus 4 (1d8) necrotic damage." +
                    "\n\tStar. Increase one of your ability scores by 2. The score can exceed 20 but can't exceed 24." +
                    "\n\tSun. You gain 50,000 XP, and a wondrous item (which the GM determines randomly) appears in" +
                    "\n\tyour hands." +
                    "\n\tTalons. Every magic item you wear or carry disintegrates. Artifacts in your possession aren't" +
                    "\n\tdestroyed but do vanish." +
                    "\n\tThrone. You gain proficiency in the Persuasion skill, and you double your proficiency bonus on" +
                    "\n\tchecks made with that skill. In addition, you gain rightful ownership of a small keep" +
                    "\n\tsomewhere in the world. However, the keep is currently in the hands of monsters, which you" +
                    "\n\tmust clear out before you can claim the keep as yours." +
                    "\n\tVizier. At any time you choose within one year of drawing this card, you can ask a question in" +
                    "\n\tmeditation and mentally receive a truthful answer to that question. Besides information, the" +
                    "\n\tanswer helps you solve a puzzling problem or other dilemma. In other words, the knowledge comes" +
                    "\n\twith wisdom on how to apply it." +
                    "\n\tThe Void. This black card spells disaster. Your soul is drawn from your body and contained in" +
                    "\n\tan object in a place of the GM's choice. One or more powerful beings guard the place. While" +
                    "\n\tyour soul is trapped in this way, your body is incapacitated. A wish spell can't restore your" +
                    "\n\tsoul, but the spell reveals the location of the object that holds it. You draw no more cards."
        ),
        "efreeti chain" to MagicItem(
            name = "Efreeti Chain",
            description = "\n\tWhile wearing this armor, you gain a +3 bonus to AC, you are immune to fire damage, and" +
                    "\n\tyou can understand and speak Primordial. In addition, you can stand on and walk across molten" +
                    "\n\trock as if it were solid ground." +
                    "\n\tMade of interlocking metal rings, chain mail includes a layer of quilted fabric worn" +
                    "\n\tunderneath the mail to prevent chafing and to cushion the impact of blows. The suit includes" +
                    "\n\tgauntlets."
        ),
        "half plate armor of resistance" to MagicItem(
            name = "Half Plate Armor of Resistance",
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
        "iron horn of valhalla" to MagicItem(
            name = "Iron Horn of Valhalla",
            description = "\n\tYou can use an action to blow this horn. In response, 5d4+5 warrior spirits from the" +
                    "\n\tValhalla appear within 60 feet of you. They use the statistics of a berserker. They return to" +
                    "\n\tValhalla after 1 hour or when they drop to 0 hit points. Once you use the horn, it can't be" +
                    "\n\tused again until 7 days have passed." +
                    "\n\tIf you blow the horn without having proficiency with all martial weapons, the summoned" +
                    "\n\tberserkers attack you. If you meet the requirement, they are friendly to you and your" +
                    "\n\tcompanions and follow your commands."
        ),
        "ollamh harp" to MagicItem(
            name = "Ollamh Harp",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, superior to an ordinary" +
                    "\n\tinstrument in every way. Seven types of these instruments exist, each named after a legendary" +
                    "\n\tbard college. A creature that attempts to play the instrument without being attuned to it" +
                    "\n\tmust succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its spells: Fly, Invisibility," +
                    "\n\tLevitate, Protection from Evil and Good, Confusion, Control Weather, Fire Storm. Once the" +
                    "\n\tinstrument has been used to cast a spell, it can’t be used to cast that spell again until the" +
                    "\n\tnext dawn. The spells use your spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of its targets to be charmed" +
                    "\n\ton a failed saving throw, thereby imposing disadvantage on the save. This effect applies only" +
                    "\n\tif the spell has a somatic or a material component."
        ),
        "ioun stone of greater absorption" to MagicItem(
            name = "Ioun Stone of Greater Absorption",
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
                    "\n\tGreater Absorption. While this marbled lavender and green ellipsoid orbits your head, you can" +
                    "\n\tuse your reaction to cancel a spell of 8th level or lower cast by a creature you can see and" +
                    "\n\ttargeting only you." +
                    "\n\tOnce the stone has canceled 50 levels of spells, it burns out and turns dull gray, losing its" +
                    "\n\tmagic. If you are targeted by a spell whose level is higher than the number of spell levels" +
                    "\n\tthe stone has left, the stone can't cancel it."
        ),
        "ioun stone of mastery" to MagicItem(
            name = "Ioun Stone of Mastery",
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
                    "\n\tMastery. Your proficiency bonus increases by 1 while this pale green prism orbits your head."
        ),
        "ioun stone of regeneration" to MagicItem(
            name = "Ioun Stone of Regeneration",
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
                    "\n\tRegeneration. You regain 15 hit points at the end of each hour this pearly white spindle" +
                    "\n\torbits your head, provided that you have at least 1 hit point."
        ),
        "plate armor of etherealness" to MagicItem(
            name = "Plate Armor of Etherealness",
            description = "\n\tWhile you're wearing this armor, you can speak its command word as an action to gain" +
                    "\n\tthe effect of the etherealness spell, which last for 10 minutes or until you remove the armor" +
                    "\n\tor use an action to speak the command word again. This property of the armor can't be used" +
                    "\n\tagain until the next dawn." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of plate" +
                    "\n\tincludes gauntlets, heavy leather boots, a visored helmet, and thick layers of padding" +
                    "\n\tunderneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "plate armor of resistance" to MagicItem(
            name = "Plate armor of Resistance",
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
        "ring of air elemental command" to MagicItem(
            name = "Ring of Air Elemental Command",
            description = "\n\tThis ring is linked to the Elemental Plane of Air." +
                    "\n\tWhile wearing this ring, you have advantage on attack rolls against air elementals, and they" +
                    "\n\thave disadvantage on attack rolls against you. In addition, you have access to properties" +
                    "\n\tbased on the Elemental Plane of Air." +
                    "\n\tThe ring has 5 charges. It regains 1d4 + 1 expended charges daily at dawn. Spells cast from" +
                    "\n\tthe ring have a save DC of 17." +
                    "\n\tYou can expend 2 of the ring's charges to cast dominate monster on an air elemental. In" +
                    "\n\taddition, when you fall, you descend 60 feet per round and take no damage from falling." +
                    "\n\tYou can also speak and understand Auran." +
                    "\n\tIf you help slay an air elemental while attuned to the ring, you gain access to the following" +
                    "\n\tadditional properties:" +
                    "\n\tYou have resistance to lightning damage." +
                    "\n\tYou have a flying speed equal to your walking speed and can hover." +
                    "\n\tYou can cast the following spells from the ring, expending the necessary number of charges:" +
                    "\n\tchain lightning (3 charges), gust of wind (2 charges), or wind wall (1 charge)."
        ),
        "ring of earth elemental command" to MagicItem(
            name = "Ring of Earth Elemental Command",
            description = "\n\tThis ring is linked to the Elemental Plane of Earth." +
                    "\n\tWhile wearing this ring, you have advantage on attack rolls against earth elementals, and they" +
                    "\n\thave disadvantage on attack rolls against you. In addition, you have access to properties" +
                    "\n\tbased on the Elemental Plane of Earth." +
                    "\n\tThe ring has 5 charges. It regains 1d4 + 1 expended charges daily at dawn. Spells cast from" +
                    "\n\tthe ring have a save DC of 17." +
                    "\n\tYou can expend 2 of the ring's charges to cast dominate monster on an earth elemental. In" +
                    "\n\taddition, you can move in difficult terrain that is composed of rubble, rocks, or dirt as if" +
                    "\n\tit were normal terrain. You can also speak and understand Terran." +
                    "\n\tIf you help slay an earth elemental while attuned to the ring, you gain access to the" +
                    "\n\tfollowing additional properties:" +
                    "\n\tYou have resistance to acid damage." +
                    "\n\tYou can move through solid earth or rock as if those areas were difficult terrain. If you end" +
                    "\n\tyour turn there, you are shunted out to the nearest unoccupied space you last occupied." +
                    "\n\tYou can cast the following spells from the ring, expending the necessary number of charges:" +
                    "\n\tstone shape (2 charges), stoneskin (3 charges), or wall of stone (3 charges)."
        ),
        "ring of fire elemental command" to MagicItem(
            name = "Ring of Fire Elemental Command",
            description = "\n\tThis ring is linked to the Elemental Plane of Fire." +
                    "\n\tWhile wearing this ring, you have advantage on attack rolls against fire elementals, and they" +
                    "\n\thave disadvantage on attack rolls against you. In addition, you have access to properties" +
                    "\n\tbased on the Elemental Plane of Fire." +
                    "\n\tThe ring has 5 charges. It regains 1d4 + 1 expended charges daily at dawn. Spells cast from" +
                    "\n\tthe ring have a save DC of 17." +
                    "\n\tYou can expend 2 of the ring's charges to cast dominate monster on a fire elemental. In" +
                    "\n\taddition, you have resistance to fire damage. You can also speak and understand Ignan." +
                    "\n\tIf you help slay a fire elemental while attuned to the ring, you gain access to the following" +
                    "\n\tadditional properties:" +
                    "\n\tYou are immune to fire damage." +
                    "\n\tYou can cast the following spells from the ring, expending the necessary number of charges:" +
                    "\n\tburning hands (1 charge), fireball (2 charges), and wall of fire (3 charges)."
        ),
        "ring of three wishes" to MagicItem(
            name = "Ring of Three Wishes",
            description = "\n\tWhile wearing this ring, you can use an action to expend 1 of its 3 charges to cast" +
                    "\n\tthe wish spell from it. The ring becomes nonmagical when you use the last charge."
        ),
        "ring of water elemental command" to MagicItem(
            name = "Ring of Water Elemental Command",
            description = "\n\tThis ring is linked to the Elemental Plane of Water." +
                    "\n\tWhile wearing this ring, you have advantage on attack rolls against water elementals, and" +
                    "\n\tthey have disadvantage on attack rolls against you. In addition, you have access to properties" +
                    "\n\tbased on the Elemental Plane of Water." +
                    "\n\tThe ring has 5 charges. It regains 1d4 + 1 expended charges daily at dawn. Spells cast from" +
                    "\n\tthe ring have a save DC of 17." +
                    "\n\tYou can expend 2 of the ring's charges to cast dominate monster on a water elemental. In" +
                    "\n\taddition, you can stand on and walk across liquid surfaces as if they were solid ground. You" +
                    "\n\tcan also speak and understand Aquan." +
                    "\n\tIf you help slay a water elemental while attuned to the ring, you gain access to the" +
                    "\n\tfollowing additional properties:" +
                    "\n\tYou can breathe underwater and have a swimming speed equal to your walking speed." +
                    "\n\tYou can cast the following spells from the ring, expending the necessary number of charges:" +
                    "\n\tcreate or destroy water (1 charge), control water (3 charges), ice storm (2 charges), or" +
                    "\n\twall of ice (3 charges)."
        ),
        "sphere of annihilation" to MagicItem(
            name = "Sphere of Annihilation",
            description = "\n\tThis 2-foot-diameter black sphere is a hole in the multiverse, hovering in space and" +
                    "\n\tstabilized by a magical field surrounding it." +
                    "\n\tThe sphere obliterates all matter it passes through and all matter that passes through it." +
                    "\n\tArtifacts are the exception. Unless an artifact is susceptible to damage from a sphere of" +
                    "\n\tannihilation, it passes through the sphere unscathed. Anything else that touches the sphere" +
                    "\n\tbut isn't wholly engulfed and obliterated by it takes 4d10 force damage." +
                    "\n\tThe sphere is stationary until someone controls it. If you are within 60 feet of an" +
                    "\n\tuncontrolled sphere, you can use an action to make a DC 25 Intelligence (Arcana) check. On a" +
                    "\n\tsuccess, the sphere levitates in one direction of your choice, up to a number of feet equal" +
                    "\n\tto 5 × your Intelligence modifier (minimum 5 feet). On a failure, the sphere moves 10 feet" +
                    "\n\ttoward you. A creature whose space the sphere enters must succeed on a DC 13 Dexterity saving" +
                    "\n\tthrow or be touched by it, taking 4d10 force damage." +
                    "\n\tIf you attempt to control a sphere that is under another creature's control, you make an" +
                    "\n\tIntelligence (Arcana) check contested by the other creature's Intelligence (Arcana) check." +
                    "\n\tThe winner of the contest gains control of the sphere and can levitate it as normal." +
                    "\n\tIf the sphere comes into contact with a planar portal, such as that created by the gate spell," +
                    "\n\tor an extradimensional space, such as that within a portable hole, the GM determines randomly" +
                    "\n\twhat happens, using the following table." +
                    "\n\td100\tResult" +
                    "\n\t01-50\tThe sphere is destroyed." +
                    "\n\t51-85\tThe sphere moves through the portal or into the extradimensional space." +
                    "\n\t86-00\tA spatial rift sends each creature and object within 180 feet of the sphere, including" +
                    "\n\tthe sphere, to a random plane of existence."
        ),
        "talisman of pure good" to MagicItem(
            name = "Talisman of Pure Good",
            description = "\n\tThis talisman is a mighty symbol of goodness. A creature that is neither good nor evil" +
                    "\n\tin alignment takes 6d6 radiant damage upon touching the talisman. An evil creature takes 8d6" +
                    "\n\tradiant damage upon touching the talisman. Either sort of creature takes the damage again each" +
                    "\n\ttime it ends its turn holding or carrying the talisman." +
                    "\n\tIf you are a good cleric or paladin, you can use the talisman as a holy symbol, and you gain a" +
                    "\n\t+2 bonus to spell attack rolls while you wear or hold it." +
                    "\n\tThe talisman has 7 charges. If you are wearing or holding it, you can use an action to expend" +
                    "\n\t1 charge from it and choose one creature you can see on the ground within 120 feet of you. If" +
                    "\n\tthe target is of evil alignment, a flaming fissure opens under it. The target must succeed on" +
                    "\n\ta DC 20 Dexterity saving throw or fall into the fissure and be destroyed, leaving no remains." +
                    "\n\tThe fissure then closes, leaving no trace of its existence. When you expend the last charge," +
                    "\n\tthe talisman disperses into motes of golden light and is destroyed."
        ),
        "talisman of the sphere" to MagicItem(
            name = "talisman of the Sphere",
            description = "\n\tWhen you make an Intelligence (Arcana) check to control a sphere of annihilation while" +
                    "\n\tyou are holding this talisman, you double your proficiency bonus on the check. In addition," +
                    "\n\twhen you start your turn with control over a sphere of annihilation, you can use an action to" +
                    "\n\tlevitate it 10 feet plus a number of additional feet equal to 10 × your Intelligence modifier."
        ),
        "talisman of ultimate evil" to MagicItem(
            name = "Talisman of Ultimate Evil",
            description = "\n\tThis item symbolizes unrepentant evil. A creature that is neither good nor evil in" +
                    "\n\talignment takes 6d6 necrotic damage upon touching the talisman. A good creature takes 8d6" +
                    "\n\tnecrotic damage upon touching the talisman. Either sort of creature takes the damage again" +
                    "\n\teach time it ends its turn holding or carrying the talisman." +
                    "\n\tIf you are an evil cleric or paladin, you can use the talisman as a holy symbol, and you" +
                    "\n\tgain a +2 bonus to spell attack rolls while you wear or hold it." +
                    "\n\tThe talisman has 6 charges. If you are wearing or holding it, you can use an action to expend" +
                    "\n\t1 charge from the talisman and choose one creature you can see on the ground within 120 feet" +
                    "\n\tof you. If the target is of good alignment, a flaming fissure opens under it. The target must" +
                    "\n\tsucceed on a DC 20 Dexterity saving throw or fall into the fissure and be destroyed, leaving" +
                    "\n\tno remains. The fissure then closes, leaving no trace of its existence. When you expend the" +
                    "\n\tlast charge, the talisman dissolves into foul-smelling slime and is destroyed."
        ),
        "tome of the stilled tongue" to MagicItem(
            name = "Tome of the Stilled Tongue",
            description = "\n\tThis thick leather-bound volume has a desiccated tongue pinned to the front cover. Five" +
                    "\n\tof these tomes exist, and it's unknown which one is the original. The grisly cover decoration" +
                    "\n\ton the first tome of the stilled tongue once belonged to a treacherous former servant of the" +
                    "\n\tlich-god Vecna, keeper of secrets. The tongues pinned to the covers of the four copies came" +
                    "\n\tfrom other spellcasters who crossed Vecna. The first few pages of each tome are filled with" +
                    "\n\tindecipherable scrawls. The remaining pages are blank and pristine." +
                    "\n\tIf you can attune to this item, you can use it as a spellbook and an arcane focus. In" +
                    "\n\taddition, while holding the tome, you can use a bonus action to cast a spell you have" +
                    "\n\twritten in this tome, without expending a spell slot or using any verbal or somatic" +
                    "\n\tcomponents. Once used, this property of the tome can't be used again until the next dawn." +
                    "\n\tWhile attuned to the book, you can remove the tongue from the book's cover. If you do so," +
                    "\n\tall spells written in the book are permanently erased." +
                    "\n\tVecna watches anyone using this tome. He can also write cryptic messages in the book. These" +
                    "\n\tmessages appear at midnight and fade away after they are read."
        )
    )
}