package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListHName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..10 -> MagicItemsH.magicItems["+3 weapon"]?.name.toString()
        in 11..12 -> MagicItemsH.magicItems["amulet of the planes"]?.name.toString()
        in 13..14 -> MagicItemsH.magicItems["carpet of flying"]?.name.toString()
        in 15..16 -> MagicItemsH.magicItems["crystal ball"]?.name.toString()
        in 17..18 -> MagicItemsH.magicItems["ring of regeneration"]?.name.toString()
        in 19..20 -> MagicItemsH.magicItems["ring of shooting stars"]?.name.toString()
        in 21..22 -> MagicItemsH.magicItems["ring of telekinesis"]?.name.toString()
        in 23..24 -> MagicItemsH.magicItems["robe of scintillating colors"]?.name.toString()
        in 25..26 -> MagicItemsH.magicItems["robe of stars"]?.name.toString()
        in 27..28 -> MagicItemsH.magicItems["rod of absorption"]?.name.toString()
        in 29..30 -> MagicItemsH.magicItems["rod of alertness"]?.name.toString()
        in 31..32 -> MagicItemsH.magicItems["rod of security"]?.name.toString()
        in 33..34 -> MagicItemsH.magicItems["+3 rod of the pact keeper"]?.name.toString()
        in 35..36 -> MagicItemsH.magicItems["scimitar of speed"]?.name.toString()
        in 37..38 -> MagicItemsH.magicItems["+3 shield"]?.name.toString()
        in 39..40 -> MagicItemsH.magicItems["staff of fire"]?.name.toString()
        in 41..42 -> MagicItemsH.magicItems["staff of frost"]?.name.toString()
        in 43..44 -> MagicItemsH.magicItems["staff of power"]?.name.toString()
        in 45..46 -> MagicItemsH.magicItems["staff of striking"]?.name.toString()
        in 47..48 -> MagicItemsH.magicItems["staff of thunder and lightning"]?.name.toString()
        in 49..50 -> MagicItemsH.magicItems["sword of sharpness"]?.name.toString()
        in 51..52 -> MagicItemsH.magicItems["wand of polymorph"]?.name.toString()
        in 53..54 -> MagicItemsH.magicItems["+3 wand of the war mage"]?.name.toString()
        55 -> MagicItemsH.magicItems["adamantine half plate"]?.name.toString()
        56 -> MagicItemsH.magicItems["adamantine plate"]?.name.toString()
        57 -> MagicItemsH.magicItems["animated shield"]?.name.toString()
        58 -> MagicItemsH.magicItems["belt of fire giant strength"]?.name.toString()
        59 -> MagicItemsH.magicItems["belt of frost giant strength"]?.name.toString()
        60 -> MagicItemsH.magicItems["+1 breastplate"]?.name.toString()
        61 -> MagicItemsH.magicItems["breastplate of resistance"]?.name.toString()
        62 -> MagicItemsH.magicItems["candle of invocation"]?.name.toString()
        63 -> MagicItemsH.magicItems["+2 chain mail"]?.name.toString()
        64 -> MagicItemsH.magicItems["+2 chain shirt"]?.name.toString()
        65 -> MagicItemsH.magicItems["cloak of arachnida"]?.name.toString()
        66 -> MagicItemsH.magicItems["dancing sword"]?.name.toString()
        67 -> MagicItemsH.magicItems["demon armor"]?.name.toString()
        68 -> MagicItemsH.magicItems["dragon scale mail"]?.name.toString()
        69 -> MagicItemsH.magicItems["dwarven plate"]?.name.toString()
        70 -> MagicItemsH.magicItems["dwarven thrower"]?.name.toString()
        71 -> MagicItemsH.magicItems["efreeti bottle"]?.name.toString()
        72 -> MagicItemsH.magicItems["figurine of wondrous power (obsidian steed)"]?.name.toString()
        73 -> MagicItemsH.magicItems["frost brand"]?.name.toString()
        74 -> MagicItemsH.magicItems["helm of brilliance"]?.name.toString()
        75 -> MagicItemsH.magicItems["bronze horn of valhalla"]?.name.toString()
        76 -> MagicItemsH.magicItems["anstruth harp"]?.name.toString()
        77 -> MagicItemsH.magicItems["ioun stone of absorption"]?.name.toString()
        78 -> MagicItemsH.magicItems["ioun stone of agility"]?.name.toString()
        79 -> MagicItemsH.magicItems["ioun stone of fortitude"]?.name.toString()
        80 -> MagicItemsH.magicItems["ioun stone of insight"]?.name.toString()
        81 -> MagicItemsH.magicItems["ioun stone of intellect"]?.name.toString()
        82 -> MagicItemsH.magicItems["ioun stone of leadership"]?.name.toString()
        83 -> MagicItemsH.magicItems["ioun stone of strength"]?.name.toString()
        84 -> MagicItemsH.magicItems["+2 leather armor"]?.name.toString()
        85 -> MagicItemsH.magicItems["manual of bodily health"]?.name.toString()
        86 -> MagicItemsH.magicItems["manual of gainful exercise"]?.name.toString()
        87 -> MagicItemsH.magicItems["manual of golems"]?.name.toString()
        88 -> MagicItemsH.magicItems["manual of quickness of action"]?.name.toString()
        89 -> MagicItemsH.magicItems["mirror of life trapping"]?.name.toString()
        90 -> MagicItemsH.magicItems["nine lives stealer"]?.name.toString()
        91 -> MagicItemsH.magicItems["oathbow"]?.name.toString()
        92 -> MagicItemsH.magicItems["+2 scale mail"]?.name.toString()
        93 -> MagicItemsH.magicItems["spellguard shield"]?.name.toString()
        94 -> MagicItemsH.magicItems["+1 splint"]?.name.toString()
        95 -> MagicItemsH.magicItems["splint armor of resistance"]?.name.toString()
        96 -> MagicItemsH.magicItems["+1 studded leather"]?.name.toString()
        97 -> MagicItemsH.magicItems["studded leather of resistance"]?.name.toString()
        98 -> MagicItemsH.magicItems["tome of clear thought"]?.name.toString()
        99 -> MagicItemsH.magicItems["tome of leadership and influence"]?.name.toString()
        else -> MagicItemsH.magicItems["tome of understanding"]?.name.toString()
    }

    return result
}

fun rollListHDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..10 -> MagicItemsH.magicItems["+3 weapon"]?.description.toString()
        in 11..12 -> MagicItemsH.magicItems["amulet of the planes"]?.description.toString()
        in 13..14 -> MagicItemsH.magicItems["carpet of flying"]?.description.toString()
        in 15..16 -> MagicItemsH.magicItems["crystal ball"]?.description.toString()
        in 17..18 -> MagicItemsH.magicItems["ring of regeneration"]?.description.toString()
        in 19..20 -> MagicItemsH.magicItems["ring of shooting stars"]?.description.toString()
        in 21..22 -> MagicItemsH.magicItems["ring of telekinesis"]?.description.toString()
        in 23..24 -> MagicItemsH.magicItems["robe of scintillating colors"]?.description.toString()
        in 25..26 -> MagicItemsH.magicItems["robe of stars"]?.description.toString()
        in 27..28 -> MagicItemsH.magicItems["rod of absorption"]?.description.toString()
        in 29..30 -> MagicItemsH.magicItems["rod of alertness"]?.description.toString()
        in 31..32 -> MagicItemsH.magicItems["rod of security"]?.description.toString()
        in 33..34 -> MagicItemsH.magicItems["+3 rod of the pact keeper"]?.description.toString()
        in 35..36 -> MagicItemsH.magicItems["scimitar of speed"]?.description.toString()
        in 37..38 -> MagicItemsH.magicItems["+3 shield"]?.description.toString()
        in 39..40 -> MagicItemsH.magicItems["staff of fire"]?.description.toString()
        in 41..42 -> MagicItemsH.magicItems["staff of frost"]?.description.toString()
        in 43..44 -> MagicItemsH.magicItems["staff of power"]?.description.toString()
        in 45..46 -> MagicItemsH.magicItems["staff of striking"]?.description.toString()
        in 47..48 -> MagicItemsH.magicItems["staff of thunder and lightning"]?.description.toString()
        in 49..50 -> MagicItemsH.magicItems["sword of sharpness"]?.description.toString()
        in 51..52 -> MagicItemsH.magicItems["wand of polymorph"]?.description.toString()
        in 53..54 -> MagicItemsH.magicItems["+3 wand of the war mage"]?.description.toString()
        55 -> MagicItemsH.magicItems["adamantine half plate"]?.description.toString()
        56 -> MagicItemsH.magicItems["adamantine plate"]?.description.toString()
        57 -> MagicItemsH.magicItems["animated shield"]?.description.toString()
        58 -> MagicItemsH.magicItems["belt of fire giant strength"]?.description.toString()
        59 -> MagicItemsH.magicItems["belt of frost giant strength"]?.description.toString()
        60 -> MagicItemsH.magicItems["+1 breastplate"]?.description.toString()
        61 -> MagicItemsH.magicItems["breastplate of resistance"]?.description.toString()
        62 -> MagicItemsH.magicItems["candle of invocation"]?.description.toString()
        63 -> MagicItemsH.magicItems["+2 chain mail"]?.description.toString()
        64 -> MagicItemsH.magicItems["+2 chain shirt"]?.description.toString()
        65 -> MagicItemsH.magicItems["cloak of arachnida"]?.description.toString()
        66 -> MagicItemsH.magicItems["dancing sword"]?.description.toString()
        67 -> MagicItemsH.magicItems["demon armor"]?.description.toString()
        68 -> MagicItemsH.magicItems["dragon scale mail"]?.description.toString()
        69 -> MagicItemsH.magicItems["dwarven plate"]?.description.toString()
        70 -> MagicItemsH.magicItems["dwarven thrower"]?.description.toString()
        71 -> MagicItemsH.magicItems["efreeti bottle"]?.description.toString()
        72 -> MagicItemsH.magicItems["figurine of wondrous power (obsidian steed)"]?.description.toString()
        73 -> MagicItemsH.magicItems["frost brand"]?.description.toString()
        74 -> MagicItemsH.magicItems["helm of brilliance"]?.description.toString()
        75 -> MagicItemsH.magicItems["bronze horn of valhalla"]?.description.toString()
        76 -> MagicItemsH.magicItems["anstruth harp"]?.description.toString()
        77 -> MagicItemsH.magicItems["ioun stone of absorption"]?.description.toString()
        78 -> MagicItemsH.magicItems["ioun stone of agility"]?.description.toString()
        79 -> MagicItemsH.magicItems["ioun stone of fortitude"]?.description.toString()
        80 -> MagicItemsH.magicItems["ioun stone of insight"]?.description.toString()
        81 -> MagicItemsH.magicItems["ioun stone of intellect"]?.description.toString()
        82 -> MagicItemsH.magicItems["ioun stone of leadership"]?.description.toString()
        83 -> MagicItemsH.magicItems["ioun stone of strength"]?.description.toString()
        84 -> MagicItemsH.magicItems["+2 leather armor"]?.description.toString()
        85 -> MagicItemsH.magicItems["manual of bodily health"]?.description.toString()
        86 -> MagicItemsH.magicItems["manual of gainful exercise"]?.description.toString()
        87 -> MagicItemsH.magicItems["manual of golems"]?.description.toString()
        88 -> MagicItemsH.magicItems["manual of quickness of action"]?.description.toString()
        89 -> MagicItemsH.magicItems["mirror of life trapping"]?.description.toString()
        90 -> MagicItemsH.magicItems["nine lives stealer"]?.description.toString()
        91 -> MagicItemsH.magicItems["oathbow"]?.description.toString()
        92 -> MagicItemsH.magicItems["+2 scale mail"]?.description.toString()
        93 -> MagicItemsH.magicItems["spellguard shield"]?.description.toString()
        94 -> MagicItemsH.magicItems["+1 splint"]?.description.toString()
        95 -> MagicItemsH.magicItems["splint armor of resistance"]?.description.toString()
        96 -> MagicItemsH.magicItems["+1 studded leather"]?.description.toString()
        97 -> MagicItemsH.magicItems["studded leather of resistance"]?.description.toString()
        98 -> MagicItemsH.magicItems["tome of clear thought"]?.description.toString()
        99 -> MagicItemsH.magicItems["tome of leadership and influence"]?.description.toString()
        else -> MagicItemsH.magicItems["tome of understanding"]?.description.toString()
    }

    return result
}

object MagicItemsH {
    val magicItems = mapOf<String, MagicItem>(
        "+3 weapon" to MagicItem(
            name = "+3 Weapon",
            description = "\n\tYou have a +3 bonus to attack and damage rolls made with this magic weapon."
        ),
        "amulet of the planes" to MagicItem(
            name = "Amulet of the Planes",
            description = "\n\tWhile wearing this amulet, you can use an action to name a location that you are" +
                    "\n\tfamiliar with on another plane of existence. Then make a DC 15 Intelligence check. On a" +
                    "\n\tsuccessful check, you cast the plane shift spell. On a failure, you and each creature and" +
                    "\n\tobject within 15 feet of you travel to a random destination. Roll a d100. On a 1–60, you" +
                    "\n\ttravel to a random location on the plane you named. On a 61–100, you travel to a randomly" +
                    "\n\tdetermined plane of existence."
        ),
        "carpet of flying" to MagicItem(
            name = "Carpet of Flying",
            description = "\n\tYou can speak the carpet's command word as an action to make the carpet hover and fly." +
                    "\n\tIt moves according to your spoken directions, provided that you are within 30 feet of it." +
                    "\n\tFour sizes of carpet of flying exist. The DM chooses the size of a given carpet or" +
                    "\n\tdetermines it randomly." +
                    "\n\tSize\tCapacity\tFlying Speed" +
                    "\n\t3 ft. x 5 ft.\t200 lb.\t80 feet" +
                    "\n\t4 ft. x 6 ft.\t400 lb.\t60 feet" +
                    "\n\t5 ft. x 7 ft.\t600 lb.\t40 feet" +
                    "\n\t6 ft. x 9 ft.\t800 lb.\t30 feet" +
                    "\n\tA carpet can carry up to twice the weight shown on the table, but it flies at half speed if" +
                    "\n\tit carries more than its normal capacity."
        ),
        "crystal ball" to MagicItem(
            name = "Crystal Ball",
            description = "\n\tThe typical crystal ball, a very rare item, is about 6 inches in diameter. While" +
                    "\n\ttouching it, you can cast the scrying spell (save DC 17) with it." +
                    "\n\tThe following crystal ball variants are legendary items and have additional properties." +
                    "\n\tCrystal Ball of Mind Reading. You can use an action to cast the detect thoughts spell (save" +
                    "\n\tDC 17) while you are scrying with the crystal ball, targeting creatures you can see within" +
                    "\n\t30 feet of the spell’s sensor. You don’t need to concentrate on this detect thoughts to" +
                    "\n\tmaintain it during its duration, but it ends if scrying ends." +
                    "\n\tCrystal Ball of Telepathy. While scrying with the crystal ball, you can communicate" +
                    "\n\ttelepathically with creatures you can see within 30 feet of the spell’s sensor. You can also" +
                    "\n\tuse an action to cast the suggestion spell (save DC 17) through the sensor on one of those" +
                    "\n\tcreatures. You don’t need to concentrate on this Suggestion to maintain it during its" +
                    "\n\tduration, but it ends if scrying ends. Once used, the suggestion power of the crystal ball" +
                    "\n\tcan’t be used again until the next dawn." +
                    "\n\tCrystal Ball of True Seeing. While scrying with the crystal ball, you have truesight with a" +
                    "\n\tradius of 120 feet centered on the spell’s sensor."
        ),
        "ring of regeneration" to MagicItem(
            name = "Ring of Regeneration",
            description = "\n\tWhile wearing this ring, you regain 1d6 hit points every 10 minutes, provided that you" +
                    "\n\thave at least 1 hit point. If you lose a body part, the ring causes the missing part to regrow" +
                    "\n\tand return to full functionality after 1d6 + 1 days if you have at least 1 hit point" +
                    "\n\tthe whole time."
        ),
        "ring of shooting stars" to MagicItem(
            name = "Ring of Shooting Stars",
            description = "\n\tWhile wearing this ring in dim light or darkness, you can cast dancing lights and" +
                    "\n\tlight from the ring at will. Casting either spell from the ring requires an action." +
                    "\n\tThe ring has 6 charges for the following other properties. The ring regains 1d6 expended" +
                    "\n\tcharges daily at dawn." +
                    "\n\tFaerie Fire. You can expend 1 charge as an action to cast faerie fire from the ring." +
                    "\n\tBall Lightning. You can expend 2 charges as an action to create one to four 3-foot-diameter" +
                    "\n\tspheres of lightning. The more spheres you create, the less powerful each sphere is" +
                    "\n\tindividually." +
                    "\n\tEach sphere appears in an unoccupied space you can see within 120 feet of you. The spheres" +
                    "\n\tlast as long as you concentrate (as if concentrating on a spell), up to 1 minute. Each sphere" +
                    "\n\tsheds dim light in a 30-foot radius." +
                    "\n\tAs a bonus action, you can move each sphere up to 30 feet, but no farther than 120 feet away" +
                    "\n\tfrom you. When a creature other than you comes within 5 feet of a sphere, the sphere" +
                    "\n\tdischarges lightning at that creature and disappears. That creature must make a DC 15" +
                    "\n\tDexterity saving throw. On a failed save, the creature takes lightning damage based on the" +
                    "\n\tnumber of spheres you created." +
                    "\n\tSpheres\tLightning Damage" +
                    "\n\t4\t2d4" +
                    "\n\t3\t2d6" +
                    "\n\t2\t5d4" +
                    "\n\t1\t4d12" +
                    "\n\tShooting Stars. You can expend 1 to 3 charges as an action. For every charge you expend, you" +
                    "\n\tlaunch a glowing mote of light from the ring at a point you can see within 60 feet of you." +
                    "\n\tEach creature within a 15-foot cube originating from that point is showered in sparks and" +
                    "\n\tmust make a DC 15 Dexterity saving throw, taking 5d4 fire damage on a failed save, or half" +
                    "\n\tas much damage on a successful one."
        ),
        "ring of telekinesis" to MagicItem(
            name = "Ring of Telekinesis",
            description = "\n\tWhile wearing this ring, you can cast the telekinesis spell at will, but you can target" +
                    "\n\tonly objects that aren't being worn or carried."
        ),
        "robe of scintillating colors" to MagicItem(
            name = "Robe of Scintillating Colors",
            description = "\n\tThis robe has 3 charges, and it regains 1d3 expended charges daily at dawn. While you" +
                    "\n\twear it, you can use an action and expend 1 charge to cause the garment to display a" +
                    "\n\tshifting pattern of dazzling hues until the end of your next turn. During this time, the" +
                    "\n\trobe sheds bright light in a 30-foot radius and dim light for an additional 30 feet. Creatures" +
                    "\n\tthat can see you have disadvantage on attack rolls against you. In addition, any creature in" +
                    "\n\tthe bright light that can see you when the robe's power is activated must succeed on a DC 15" +
                    "\n\tWisdom saving throw or become stunned until the effect ends."
        ),
        "robe of stars" to MagicItem(
            name = "Robe of Stars",
            description = "\n\tThis black or dark blue robe is embroidered with small white or silver stars. You gain" +
                    "\n\ta +1 bonus to saving throws while you wear it." +
                    "\n\tSix stars, located on the robe's upper front portion, are particularly large. While wearing" +
                    "\n\tthis robe, you can use an action to pull off one of the stars and use it to cast magic" +
                    "\n\tmissile as a 5th-level spell. Daily at dusk, 1d6 removed stars reappear on the robe." +
                    "\n\tWhile you wear the robe, you can use an action to enter the Astral Plane along with" +
                    "\n\teverything you are wearing and carrying. You remain there until you use an action to return" +
                    "\n\tto the plane you were on. You reappear in the last space you occupied, or if that space is" +
                    "\n\toccupied, the nearest unoccupied space."
        ),
        "rod of absorption" to MagicItem(
            name = "Rod of Absorption",
            description = "\n\tWhile holding this rod, you can use your reaction to absorb a spell that is targeting" +
                    "\n\tonly you and not with an area of effect. The absorbed spell's effect is canceled, and the" +
                    "\n\tspell's energy -- not the spell itself -- is stored in the rod. The energy has the same level" +
                    "\n\tas the spell when it was cast. The rod can absorb and store up to 50 levels of energy over the" +
                    "\n\tcourse of its existence. Once the rod absorbs 50 levels of energy, it can't absorb more. If" +
                    "\n\tyou are targeted by a spell that the rod can't store, the rod has no effect on that spell." +
                    "\n\tWhen you become attuned to the rod, you know how many levels of energy the rod has absorbed" +
                    "\n\tover the course of its existence, and how many levels of spell energy it currently has stored." +
                    "\n\tIf you are a spellcaster holding the rod, you can convert energy stored in it into spell slots" +
                    "\n\tto cast spells you have prepared or know. You can create spell slots only of a level equal to" +
                    "\n\tor lower than your own spell slots, up to a maximum of 5th level. You use the stored levels in" +
                    "\n\tplace of your slots, but otherwise cast the spell as normal. For example, you can use 3" +
                    "\n\tlevels stored in the rod as a 3rd-level spell slot." +
                    "\n\tA newly found rod has 1d10 levels of spell energy stored in it already. A rod that can no" +
                    "\n\tlonger absorb spell energy and has no energy remaining becomes nonmagical."
        ),
        "rod of alertness" to MagicItem(
            name = "Rod of Alertness",
            description = "\n\tThis rod has a flanged head and the following properties." +
                    "\n\tAlertness. While holding the rod, you have advantage on Wisdom (Perception) checks and on" +
                    "\n\trolls for initiative." +
                    "\n\tSpells. While holding the rod, you can use an action to cast one of the following spells" +
                    "\n\tfrom it: detect evil and good, detect magic, detect poison and disease, or see invisibility." +
                    "\n\tProtective Aura. As an action, you can plant the haft end of the rod in the ground," +
                    "\n\twhereupon the rod's head sheds bright light in a 60-foot radius and dim light for an" +
                    "\n\tadditional 60 feet. While in that bright light, you and any creature that is friendly to" +
                    "\n\tyou gain a +1 bonus to AC and saving throws and can sense the location of any invisible" +
                    "\n\thostile creature that is also in the bright light." +
                    "\n\tThe rod's head stops glowing and the effect ends after 10 minutes, or when a creature uses" +
                    "\n\tan action to pull the rod from the ground. This property can't be used again until the" +
                    "\n\tnext dawn."
        ),
        "rod of security" to MagicItem(
            name = "Rod of Security",
            description = "\n\tWhile holding this rod, you can use an action to activate it. The rod then instantly" +
                    "\n\ttransports you and up to 199 other willing creatures you can see to a paradise that exists" +
                    "\n\tin an extraplanar space. You choose the form that the paradise takes. It could be a tranquil" +
                    "\n\tgarden, lovely glade, cheery tavern, immense palace, tropical island, fantastic carnival, or" +
                    "\n\twhatever else you can imagine. Regardless of its nature, the paradise contains enough water" +
                    "\n\tand food to sustain its visitors. Everything else that can be interacted with inside the" +
                    "\n\textraplanar space can exist only there. For example, a flower picked from a garden in the" +
                    "\n\tparadise disappears if it is taken outside the extraplanar space." +
                    "\n\tFor each hour spent in the paradise, a visitor regains hit points as if it had spent 1 Hit" +
                    "\n\tDie. Also, creatures don't age while in the paradise, although time passes normally. Visitors" +
                    "\n\tcan remain in the paradise for up to 200 days divided by the number of creatures present" +
                    "\n\t(round down)." +
                    "\n\tWhen the time runs out or you use an action to end it, all visitors reappear in the location" +
                    "\n\tthey occupied when you activated the rod, or an unoccupied space nearest that location. The" +
                    "\n\trod can't be used again until ten days have passed."
        ),
        "+3 rod of the pact keeper" to MagicItem(
            name = "+3 Rod of the Pact Keeper",
            description = "\n\tWhile holding this rod, you gain a +3 bonus to spell attack rolls and to the saving " +
                    "\n\tthrow DCs of your warlock spells." +
                    "\n\tIn addition, you can regain 1 warlock spell slot as an action while holding the rod. You " +
                    "\n\tcan’t use this property again until you finish a long rest.",
        ),
        "scimitar of speed" to MagicItem(
            name = "Scimitar of Speed",
            description = "\n\tYou gain a +2 bonus to attack and damage rolls made with this magic weapon. In" +
                    "\n\taddition, you can make one attack with it as a bonus action on each of your turns." +
                    "\n\tProficiency with a scimitar allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "+3 shield" to MagicItem(
            name = "+3 Shield",
            description = "\n\tWhile holding this shield, you have a +3 bonus to AC. This bonus is in addition to the" +
                    "\n\tshield's normal bonus to AC." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "staff of fire" to MagicItem(
            name = "Staff of Fire",
            description = "\n\tYou have resistance to fire damage while you hold this staff." +
                    "\n\tThe staff has 10 charges. While holding it, you can use an action to expend 1 or more of its" +
                    "\n\tcharges to cast one of the following spells from it, using your spell save DC: burning hands" +
                    "\n\t(1 charge), fireball (3 charges), or wall of fire (4 charges)." +
                    "\n\tThe staff regains 1d6 + 4 expended charges daily at dawn. If you expend the last charge, roll" +
                    "\n\ta d20. On a 1, the staff blackens, crumbles into cinders, and is destroyed."
        ),
        "staff of frost" to MagicItem(
            name = "Staff of Frost",
            description = "\n\tYou have resistance to cold damage while you hold this staff." +
                    "\n\tThe staff has 10 charges. While holding it, you can use an action to expend 1 or more of its" +
                    "\n\tcharges to cast one of the following spells from it, using your spell save DC: cone of cold" +
                    "\n\t(5 charges), fog cloud (1 charge), ice storm (4 charges), or wall of ice (4 charges)." +
                    "\n\tThe staff regains 1d6 + 4 expended charges daily at dawn. If you expend the last charge, roll" +
                    "\n\ta d20. On a 1, the staff turns to water and is destroyed."
        ),
        "staff of power" to MagicItem(
            name = "Staff of Power",
            description = "\n\tThis staff can be wielded as a magic quarterstaff that grants a +2 bonus to attack and" +
                    "\n\tdamage rolls made with it. While holding it, you gain a +2 bonus to Armor Class, saving" +
                    "\n\tthrows, and spell attack rolls." +
                    "\n\tThe staff has 20 charges for the following properties. The staff regains 2d8 + 4 expended" +
                    "\n\tcharges daily at dawn. If you expend the last charge, roll a d20. On a 1, the staff retains" +
                    "\n\tits +2 bonus to attack and damage rolls but loses all other properties. On a 20, the staff" +
                    "\n\tregains 1d8 + 2 charges." +
                    "\n\tPower Strike. When you hit with a melee attack using the staff, you can expend 1 charge to" +
                    "\n\tdeal an extra 1d6 force damage to the target." +
                    "\n\tSpells. While holding this staff, you can use an action to expend 1 or more of its charges to" +
                    "\n\tcast one of the following spells from it, using your spell save DC and spell attack bonus:" +
                    "\n\tcone of cold (5 charges), fireball (5th-level version, 5 charges), globe of invulnerability" +
                    "\n\t(6 charges), hold monster (5 charges), levitate (2 charges), lightning bolt (5th-level" +
                    "\n\tversion, 5 charges), magic missile (1 charge), ray of enfeeblement (1 charge), or wall of" +
                    "\n\tforce (5 charges)." +
                    "\n\tRetributive Strike. You can use an action to break the staff over your knee or against a" +
                    "\n\tsolid surface, performing a retributive strike. The staff is destroyed and releases its" +
                    "\n\tremaining magic in an explosion that expands to fill a 30-foot-radius sphere centered on it." +
                    "\n\tYou have a 50 percent chance to instantly travel to a random plane of existence, avoiding" +
                    "\n\tthe explosion. If you fail to avoid the effect, you take force damage equal to 16 × the" +
                    "\n\tnumber of charges in the staff. Every other creature in the area must make a DC 17 Dexterity" +
                    "\n\tsaving throw. On a failed save, a creature takes an amount of damage based on how far away" +
                    "\n\tit is from the point of origin, as shown in the following table. On a successful save, a" +
                    "\n\tcreature takes half as much damage." +
                    "\n\tDistance from Origin\tDamage" +
                    "\n\t10 ft. away or closer\t8 x the number of charges in the staff" +
                    "\n\t11 to 20 ft. away\t6 x the number of charges in the staff" +
                    "\n\t21 to 30 ft. away\t4 x the number of charges in the staff"
        ),
        "staff of striking" to MagicItem(
            name = "Staff of Striking",
            description = "\n\tThis staff can be wielded as a magic quarterstaff that grants a +3 bonus to attack and" +
                    "\n\tdamage rolls made with it." +
                    "\n\tThe staff has 10 charges. When you hit with a melee attack using it, you can expend up to 3" +
                    "\n\tof its charges. For each charge you expend, the target takes an extra 1d6 force damage. The" +
                    "\n\tstaff regains 1d6 + 4 expended charges daily at dawn. If you expend the last charge, roll a" +
                    "\n\td20. On a 1, the staff becomes a nonmagical quarterstaff."
        ),
        "staff of thunder and lightning" to MagicItem(
            name = "Staff of Thunder and Lightning",
            description = "\n\tThis staff can be wielded as a magic quarterstaff that grants a +2 bonus to attack and" +
                    "\n\tdamage rolls made with it. It also has the following additional properties. When one of these" +
                    "\n\tproperties is used, it can't be used again until the next dawn." +
                    "\n\tLightning. When you hit with a melee attack using the staff, you can cause the target to take" +
                    "\n\tan extra 2d6 lightning damage." +
                    "\n\tThunder. When you hit with a melee attack using the staff, you can cause the staff to emit a" +
                    "\n\tcrack of thunder, audible out to 300 feet. The target you hit must succeed on a DC 17" +
                    "\n\tConstitution saving throw or become stunned until the end of your next turn." +
                    "\n\tLightning Strike. You can use an action to cause a bolt of lightning to leap from the" +
                    "\n\tstaff's tip in a line that is 5 feet wide and 120 feet long. Each creature in that line" +
                    "\n\tmust make a DC 17 Dexterity saving throw, taking 9d6 lightning damage on a failed save, or" +
                    "\n\thalf as much damage on a successful one." +
                    "\n\tThunderclap. You can use an action to cause the staff to issue a deafening thunderclap," +
                    "\n\taudible out to 600 feet. Each creature within 60 feet of you (not including you) must make a" +
                    "\n\tDC 17 Constitution saving throw. On a failed save, a creature takes 2d6 thunder damage and" +
                    "\n\tbecomes deafened for 1 minute. On a successful save, a creature takes half damage and" +
                    "\n\tisn't deafened." +
                    "\n\tThunder and Lightning. You can use an action to use the Lightning Strike and Thunderclap" +
                    "\n\tproperties at the same time. Doing so doesn't expend the daily use of those properties," +
                    "\n\tonly the use of this one."
        ),
        "sword of sharpness" to MagicItem(
            name = "Sword of Sharpness",
            description = "\n\tWhen you attack an object with this magic sword and hit, maximize your weapon damage" +
                    "\n\tdice against the target." +
                    "\n\tWhen you attack a creature with this weapon and roll a 20 on the attack roll, that target" +
                    "\n\ttakes an extra 14 slashing damage. Then roll another d20. If you roll a 20, you lop off one" +
                    "\n\tof the target's limbs, with the effect of such loss determined by the GM. If the creature" +
                    "\n\thas no limb to sever, you lop off a portion of its body instead." +
                    "\n\tIn addition, you can speak the sword's command word to cause the blade to shed bright light" +
                    "\n\tin a 10-foot radius and dim light for an additional 10 feet. Speaking the command word" +
                    "\n\tagain or sheathing the sword puts out the light."
        ),
        "wand of polymorph" to MagicItem(
            name = "Wand of Polymorph",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action to expend 1 of its" +
                    "\n\tcharges to cast the polymorph spell (save DC 15) from it." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend the wand's last" +
                    "\n\tcharge, roll a d20. On a 1, the wand crumbles into ashes and is destroyed."
        ),
        "+3 wand of the war mage" to MagicItem(
            name = "+3 Wand of the War Mage",
            description = "\n\tWhile holding this wand, you gain a +3 bonus to spell attack rolls. In addition," +
                    "\n\tyou ignore half cover when making a spell attack."
        ),
        "adamantine half plate" to MagicItem(
            name = "Adamantine Half Plate",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the hardest substances in" +
                    "\n\texistence. While you're wearing it, any critical hit against you becomes a normal hit." +
                    "\n\tHalf plate consists of shaped metal plates that cover most of the wearer's body. It does not" +
                    "\n\tinclude leg protection beyond simple greaves that are attached with leather straps."
        ),
        "adamantine plate" to MagicItem(
            name = "Adamantine Plate",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the hardest substances in" +
                    "\n\texistence. While you're wearing it, any critical hit against you becomes a normal hit." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of" +
                    "\n\tplate includes gauntlets, heavy leather boots, a visored helmet, and thick layers of" +
                    "\n\tpadding underneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "animated shield" to MagicItem(
            name = "animated Shield",
            description = "\n\tWhile holding this shield, you can speak its command word as a bonus action to cause it" +
                    "\n\tto animate. The shield leaps into the air and hovers in your space to protect you as if you" +
                    "\n\twere wielding it, leaving your hands free. The shield remains animated for 1 minute, until" +
                    "\n\tyou use a bonus action to end this effect, or until you are incapacitated or die, at which" +
                    "\n\tpoint the shield falls to the ground or into your hand if you have one free." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "belt of fire giant strength" to MagicItem(
            name = "Belt of Fire Giant Strength",
            description = "\n\tWhile wearing this belt, your Strength score changes to 25.  The item has no effect on" +
                    "\n\tyou if your Strength without the belt is equal to or greater than 25."
        ),
        "belt of frost giant strength" to MagicItem(
            name = "Belt of Frost Giant Strength",
            description = "\n\tWhile wearing this belt, your Strength score changes to 23. The item has no effect on" +
                    "\n\tyou if your Strength without the belt is equal to or greater than 23."
        ),
        "+1 breastplate" to MagicItem(
            name = "+1 Breastplate",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tThis armor consists of a fitted metal chest piece worn with supple leather. Although it" +
                    "\n\tleaves the legs and arms relatively unprotected, this armor provides good protection for" +
                    "\n\tthe wearer's vital organs while leaving the wearer relatively unencumbered."
        ),
        "breastplate of resistance" to MagicItem(
            name = "Breastplate of Resistance",
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
        "candle of invocation" to MagicItem(
            name = "Candle of Invocation",
            description = "\n\tThis slender taper is dedicated to a deity and shares that deity's alignment. The" +
                    "\n\tcandle's alignment can be detected with the detect evil and good spell. The GM chooses the" +
                    "\n\tgod and associated alignment or determines the alignment randomly." +
                    "\n\td20\tAlignment" +
                    "\n\t1-2\tChaotic evil" +
                    "\n\t3-4\tChaotic neutral" +
                    "\n\t5-7\tChaotic good" +
                    "\n\t8-9\tNeutral evil" +
                    "\n\t10-11\tNeutral" +
                    "\n\t12-13\tNeutral good" +
                    "\n\t14-15\tLawful evil" +
                    "\n\t16-17\tLawful neutral" +
                    "\n\t18-20\tLawful good" +
                    "\n\tThe candle's magic is activated when the candle is lit, which requires an action. After" +
                    "\n\tburning for 4 hours, the candle is destroyed. You can snuff it out early for use at a later" +
                    "\n\ttime. Deduct the time it burned in increments of 1 minute from the candle's total burn time." +
                    "\n\tWhile lit, the candle sheds dim light in a 30-foot radius. Any creature within that light" +
                    "\n\twhose alignment matches that of the candle makes attack rolls, saving throws, and ability" +
                    "\n\tchecks with advantage. In addition, a cleric or druid in the light whose alignment matches" +
                    "\n\tthe candle's can cast 1st- level spells he or she has prepared without expending spell slots," +
                    "\n\tthough the spell's effect is as if cast with a 1st-level slot." +
                    "\n\tAlternatively, when you light the candle for the first time, you can cast the gate spell" +
                    "\n\twith it. Doing so destroys the candle."
        ),
        "+2 chain mail" to MagicItem(
            name = "+2 Chain Mail",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, chain mail includes a layer of quilted fabric worn" +
                    "\n\tunderneath the mail to prevent chafing and to cushion the impact of blows. The suit" +
                    "\n\tincludes gauntlets."
        ),
        "+2 chain shirt" to MagicItem(
            name = "+2 Chain Shirt",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tMade of interlocking metal rings, a chain shirt is worn between layers of clothing or" +
                    "\n\tleather. This armor offers modest protection to the wearer's upper body and allows the sound" +
                    "\n\tof the rings rubbing against one another to be muffled by outer layers."
        ),
        "cloak of arachnida" to MagicItem(
            name = "Cloak of Arachnida",
            description = "\n\tThis fine garment is made of black silk interwoven with faint silvery threads. While" +
                    "\n\twearing it, you gain the following benefits:" +
                    "\n\tYou have resistance to poison damage." +
                    "\n\tYou have a climbing speed equal to your walking speed." +
                    "\n\tYou can move up, down, and across vertical surfaces and upside down along ceilings, while" +
                    "\n\tleaving your hands free." +
                    "\n\tYou can't be caught in webs of any sort and can move through webs as if they were difficult" +
                    "\n\tterrain." +
                    "\n\tYou can use an action to cast the web spell (save DC 13). The web created by the spell fills" +
                    "\n\ttwice its normal area. Once used, this property of the cloak can't be used again until the" +
                    "\n\tnext dawn."
        ),
        "dancing sword" to MagicItem(
            name = "Dancing Sword",
            description = "\n\tYou can use a bonus action to toss this magic sword into the air and speak the command" +
                    "\n\tword. When you do so, the sword begins to hover, flies up to 30 feet, and attacks one" +
                    "\n\tcreature of your choice within 5 feet of it. The sword uses your attack roll and ability" +
                    "\n\tscore modifier to damage rolls." +
                    "\n\tWhile the sword hovers, you can use a bonus action to cause it to fly up to 30 feet to" +
                    "\n\tanother spot within 30 feet of you. As part of the same bonus action, you can cause the" +
                    "\n\tsword to attack one creature within 5 feet of it." +
                    "\n\tAfter the hovering sword attacks for the fourth time, it flies up to 30 feet and tries to" +
                    "\n\treturn to your hand. If you have no hand free, it falls to the ground at your feet. If the" +
                    "\n\tsword has no unobstructed path to you, it moves as close to you as it can and then falls to" +
                    "\n\tthe ground. It also ceases to hover if you grasp it or move more than 30 feet away from it."
        ),
        "demon armor" to MagicItem(
            name = "Demon Armor",
            description = "\n\tWhile wearing this armor, you gain a +1 bonus to AC, and you can understand and speak" +
                    "\n\tAbyssal. In addition, the armor's clawed gauntlets turn unarmed strikes with your hands into" +
                    "\n\tmagic weapons that deal slashing damage, with a +1 bonus to attack rolls and damage rolls" +
                    "\n\tand a damage die of 1d8." +
                    "\n\tCurse. Once you don this cursed armor, you can't doff it unless you are targeted by the" +
                    "\n\tremove curse spell or similar magic. While wearing the armor, you have disadvantage on attack" +
                    "\n\trolls against demons and on saving throws against their spells and special abilities." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of plate" +
                    "\n\tincludes gauntlets, heavy leather boots, a visored helmet, and thick layers of padding" +
                    "\n\tunderneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "dragon scale mail" to MagicItem(
            name = "Dragon Scale Mail",
            description = "\n\tDragon scale mail is made of the scales of one kind of dragon. Sometimes dragons" +
                    "\n\tcollect their cast-off scales and gift them to humanoids. Other times, hunters carefully" +
                    "\n\tskin and preserve the hide of a dead dragon. In either case, dragon scale mail is" +
                    "\n\thighly valued." +
                    "\n\tWhile wearing this armor, you gain a +1 bonus to AC, you have advantage on saving throws" +
                    "\n\tagainst the Frightful Presence and breath weapons of dragons, and you have resistance to" +
                    "\n\tone damage type that is determined by the kind of a dragon that provided the scales (see" +
                    "\n\tthe table)." +
                    "\n\tAdditionally, you can focus your senses as an action to magically discern the distance" +
                    "\n\tand direction to the closest dragon of the type of armor within 30 miles of you. This" +
                    "\n\tspecial action can't be used again until the next dawn." +
                    "\n\tDragon\tResistance" +
                    "\n\tBlack\tAcid" +
                    "\n\tBlue\tLightning" +
                    "\n\tBrass\tFire" +
                    "\n\tBronze\tLightning" +
                    "\n\tCopper\tAcid" +
                    "\n\tGold\tFire" +
                    "\n\tGreen\tPoison" +
                    "\n\tRed\tFire" +
                    "\n\tSilver\tCold" +
                    "\n\tWhite\tCold"
        ),
        "dwarven plate" to MagicItem(
            name = "Dwarven Plate",
            description = "\n\tWhile wearing this armor, you gain a +2 bonus to AC. In addition, if an effect moves" +
                    "\n\tyou against your will along the ground, you can use your reaction to reduce the distance" +
                    "\n\tyou are moved by up to 10 feet." +
                    "\n\tPlate consists of shaped, interlocking metal plates to cover the entire body. A suit of" +
                    "\n\tplate includes gauntlets, heavy leather boots, a visored helmet, and thick layers of" +
                    "\n\tpadding underneath the armor. Buckles and straps distribute the weight over the body."
        ),
        "dwarven thrower" to MagicItem(
            name = "Dwarven Thrower",
            description = "\n\tYou gain a +3 bonus to attack and damage rolls made with this magic weapon. It has the" +
                    "\n\tthrown property with a normal range of 20 feet and a long range of 60 feet. When you hit with" +
                    "\n\ta ranged attack using this weapon, it deals an extra 1d8 damage or, if the target is a" +
                    "\n\tgiant, 2d8 damage. Immediately after the attack, the weapon flies back to your hand." +
                    "\n\tProficiency with a warhammer allows you to add your proficiency bonus to the attack roll" +
                    "\n\tfor any attack you make with it."
        ),
        "efreeti bottle" to MagicItem(
            name = "Efreeti Bottle",
            description = "\n\tThis painted brass bottle weighs 1 pound. When you use an action to remove the" +
                    "\n\tstopper, a cloud of thick smoke flows out of the bottle. At the end of your turn, the" +
                    "\n\tsmoke disappears with a flash of harmless fire, and an efreeti appears in an unoccupied" +
                    "\n\tspace within 30 feet of you." +
                    "\n\tThe first time the bottle is opened, the GM rolls to determine what happens." +
                    "\n\td100\tEffect" +
                    "\n\t01-10\tThe efreeti attacks you. After fighting for 5 rounds, the efreeti disappears, and" +
                    "\n\tthe bottle loses its magic." +
                    "\n\t11-90\tThe efreeti serves you for 1 hour, doing as you command. Then the efreeti returns to" +
                    "\n\tthe bottle, and a new stopper contains it. The stopper can't be removed for 24 hours. The" +
                    "\n\tnext two times the bottle is opened, the same effect occurs. If the bottle is opened a fourth" +
                    "\n\ttime, the efreeti escapes and disappears, and the bottle loses its magic." +
                    "\n\t91-00\tThe efreeti can cast the wish spell three times for you. It disappears when it grants" +
                    "\n\tthe final wish or after 1 hour, and the bottle loses its magic."
        ),
        "figurine of wondrous power (obsidian steed)" to MagicItem(
            name = "Figurine of Wondrous Power (Obsidian Steed)",
            description = "\n\tA figurine of wondrous power is a statuette of a beast small enough to fit in a pocket." +
                    "\n\tIf you use an action to speak the command word and throw the figurine to a point on the" +
                    "\n\tground within 60 feet of you, the figurine becomes a living creature. If the space where the" +
                    "\n\tcreature would appear is occupied by other creatures or objects, or if there isn't enough" +
                    "\n\tspace for the creature, the figurine doesn't become a creature." +
                    "\n\tThe creature is friendly to you and your companions. It understands your languages and obeys" +
                    "\n\tyour spoken commands. If you issue no commands, the creature defends itself but takes no" +
                    "\n\tother actions." +
                    "\n\tThe creature exists for a duration specific to each figurine. At the end of the duration, the" +
                    "\n\tcreature reverts to its figurine form. It reverts to a figurine early if it drops to 0 hit" +
                    "\n\tpoints or if you use an action to speak the command word again while touching it. When the" +
                    "\n\tcreature becomes a figurine again, its property can't be used again until a certain amount" +
                    "\n\tof time has passed, as specified in the figurine's description." +
                    "\n\tObsidian Steed. This polished obsidian horse can become a nightmare for up to 24 hours. The" +
                    "\n\tnightmare fights only to defend itself. Once it has been used, it can't be used again until" +
                    "\n\t5 days have passed." +
                    "\n\tIf you have a good alignment, the figurine has a 10 percent chance each time you use it to" +
                    "\n\tignore your orders, including a command to revert to figurine form. If you mount the" +
                    "\n\tnightmare while it is ignoring your orders, you and the nightmare are instantly transported" +
                    "\n\tto a random location on the plane of Hades, where the nightmare reverts to figurine form."
        ),
        "frost brand" to MagicItem(
            name = "Frost Brand",
            description = "\n\tWhen you hit with an attack using this magic sword, the target takes an extra 1d6 cold" +
                    "\n\tdamage. In addition, while you hold the sword, you have resistance to fire damage." +
                    "\n\tIn freezing temperatures, the blade sheds bright light in a 10-foot radius and dim light for" +
                    "\n\tan additional 10 feet." +
                    "\n\tWhen you draw this weapon, you can extinguish all non-magical flames within 30 feet of you." +
                    "\n\tThis property can be used no more than once per hour."
        ),
        "helm of brilliance" to MagicItem(
            name = "Helm of Brilliance",
            description = "\n\tThis dazzling helm is set with 1d10 diamonds, 2d10 rubies, 3d10 fire opals, and" +
                    "\n\t4d10 opals. Any gem pried from the helm crumbles to dust. When all the gems are removed or" +
                    "\n\tdestroyed, the helm loses its magic." +
                    "\n\tYou gain the following benefits while wearing it:" +
                    "\n\tYou can use an action to cast one of the following spells (save DC 18), using one of the" +
                    "\n\thelm's gems of the specified type as a component: daylight (opal), fireball (fire opal)," +
                    "\n\tprismatic spray (diamond), or wall of fire (ruby). The gem is destroyed when the spell is" +
                    "\n\tcast and disappears from the helm." +
                    "\n\tAs long as it has at least one diamond, the helm emits dim light in a 30-foot radius when" +
                    "\n\tat least one undead is within that area. Any undead that starts its turn in that area takes" +
                    "\n\t1d6 radiant damage." +
                    "\n\tAs long as the helm has at least one ruby, you have resistance to fire damage." +
                    "\n\tAs long as the helm has at least one fire opal, you can use an action and speak a command" +
                    "\n\tword to cause one weapon you are holding to burst into flames. The flames emit bright light" +
                    "\n\tin a 10-foot radius and dim light for an additional 10 feet. The flames are harmless to you" +
                    "\n\tand the weapon. When you hit with an attack using the blazing weapon, the target takes an" +
                    "\n\textra 1d6 fire damage. The flames last until you use a bonus action to speak the command" +
                    "\n\tword again or until you drop or stow the weapon." +
                    "\n\tRoll a d20 if you are wearing the helm and take fire damage as a result of failing a saving" +
                    "\n\tthrow against a spell. On a roll of 1, the helm emits beams of light from its remaining" +
                    "\n\tgems. Each creature within 60 feet of the helm other than you must succeed on a DC 17" +
                    "\n\tDexterity saving throw or be struck by a beam, taking radiant damage equal to the number of" +
                    "\n\tgems in the helm. The helm and its gems are then destroyed."
        ),
        "bronze horn of valhalla" to MagicItem(
            name = "Bronze Horn of Valhalla",
            description = "\n\tYou can use an action to blow this horn. In response, 4d4+4 warrior spirits from the" +
                    "\n\tValhalla appear within 60 feet of you. They use the statistics of a berserker. They return" +
                    "\n\tto Valhalla after 1 hour or when they drop to 0 hit points. Once you use the horn, it can't" +
                    "\n\tbe used again until 7 days have passed." +
                    "\n\tIf you blow the horn without having proficiency with all medium armor, the summoned" +
                    "\n\tberserkers attack you. If you meet the requirement, they are friendly to you and your" +
                    "\n\tcompanions and follow your commands."
        ),
        "anstruth harp" to MagicItem(
            name = "Anstruth Harp",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, superior to an ordinary" +
                    "\n\tinstrument in every way. Seven types of these instruments exist, each named after a" +
                    "\n\tlegendary bard college. A creature that attempts to play the instrument without being attuned" +
                    "\n\tto it must succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its spells: Fly, Invisibility," +
                    "\n\tLevitate, Protection from Evil and Good, Control Weather, Cure Wounds (5th level), Wall of" +
                    "\n\tThorns. Once the instrument has been used to cast a spell, it can’t be used to cast that spell" +
                    "\n\tagain until the next dawn. The spells use your spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of its targets to be charmed" +
                    "\n\ton a failed saving throw, thereby imposing disadvantage on the save. This effect applies only" +
                    "\n\tif the spell has a somatic or a material component."
        ),
        "ioun stone of absorption" to MagicItem(
            name = "Ioun Stone of Absorption",
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
                    "\n\tAbsorption. While this pale lavender ellipsoid orbits your head, you can use your reaction to" +
                    "\n\tcancel a spell of 4th level or lower cast by a creature you can see and targeting only you." +
                    "\n\tOnce the stone has canceled 20 levels of spells, it burns out and turns dull gray, losing its" +
                    "\n\tmagic. If you are targeted by a spell whose level is higher than the number of spell levels" +
                    "\n\tthe stone has left, the stone can't cancel it."
        ),
        "ioun stone of agility" to MagicItem(
            name = "Ioun Stone of Agility",
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
                    "\n\tAgility. Your Dexterity score increases by 2, to a maximum of 20, while this deep red sphere" +
                    "\n\torbits your head."
        ),
        "ioun stone of fortitude" to MagicItem(
            name = "Ioun Stone of Fortitude",
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
                    "\n\tFortitude. Your Constitution score increases by 2, to a maximum of 20, while this pink" +
                    "\n\trhomboid orbits your head."
        ),
        "ioun stone of insight" to MagicItem(
            name = "Ioun Stone of Insight",
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
                    "\n\tInsight. Your Wisdom score increases by 2, to a maximum of 20, while this incandescent blue" +
                    "\n\tsphere orbits your head."
        ),
        "ioun stone of intellect" to MagicItem(
            name = "Ioun Stone of Intellect",
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
                    "\n\tIntellect. Your Intelligence score increases by 2, to a maximum of 20, while this marbled" +
                    "\n\tscarlet and blue sphere orbits your head."
        ),
        "ioun stone of leadership" to MagicItem(
            name = "Ioun Stone of Leadership",
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
                    "\n\tLeadership. Your Charisma score increases by 2, to a maximum of 20, while this marbled pink" +
                    "\n\tand green sphere orbits your head."
        ),
        "ioun stone of strength" to MagicItem(
            name = "Ioun Stone of Strength",
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
                    "\n\tStrength. Your Strength score increases by 2, to a maximum of 20, while this pale blue" +
                    "\n\trhomboid orbits your head."
        ),
        "+2 leather armor" to MagicItem(
            name = "+2 Leather Armor",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tThe breastplate and shoulder protectors of this armor are made of leather that has been" +
                    "\n\tstiffened by being boiled in oil. The rest of the armor is made of softer and more flexible" +
                    "\n\tmaterials."
        ),
        "manual of bodily health" to MagicItem(
            name = "Manual of Bodily Health",
            description = "\n\tThis book contains health and diet tips, and its words are charged with magic. If you" +
                    "\n\tspend 48 hours over a period of 6 days or fewer studying the book's contents and practicing" +
                    "\n\tits guidelines, your Constitution score increases by 2, as does your maximum for that score." +
                    "\n\tThe manual then loses its magic, but regains it in a century."
        ),
        "manual of gainful exercise" to MagicItem(
            name = "Manual of Gainful Exercise",
            description = "\n\tThis book describes fitness exercises, and its words are charged with magic. If you" +
                    "\n\tspend 48 hours over a period of 6 days or fewer studying the book's contents and practicing" +
                    "\n\tits guidelines, your Strength score increases by 2, as does your maximum for that score." +
                    "\n\tThe manual then loses its magic, but regains it in a century."
        ),
        "manual of golems" to MagicItem(
            name = "Manual of Golems",
            description = "\n\tThis tome contains information and incantations necessary to make a particular type of" +
                    "\n\tgolem. To decipher and use the manual, you must be a spellcaster with at least two 5th-level" +
                    "\n\tspell slots. A creature that can't use a manual of golems and attempts to read it takes 6d6" +
                    "\n\tpsychic damage." +
                    "\n\td20\tGolem\tTime\tCost" +
                    "\n\t1-5\tManual of Clay Golems\t30 days\t65,000 GP" +
                    "\n\t6-17\tManual of Flesh Golems\t60 days\t50,000 GP" +
                    "\n\t18\tManual of Iron Golems\t120 days\t100,000 GP" +
                    "\n\t19-20\tManual of Stone Golems\t90 days\t80,000 GP" +
                    "\n\tTo create a golem, you must spend the time shown on the table, working without interruption" +
                    "\n\twith the manual at hand and resting no more than 8 hours per day. You must also pay the" +
                    "\n\tspecified cost to purchase supplies." +
                    "\n\tOnce you finish creating the golem, the book is consumed in eldritch flames. The golem" +
                    "\n\tbecomes animate when the ashes of the manual are sprinkled on it. It is under your control," +
                    "\n\tand it understands and obeys your spoken commands."
        ),
        "manual of quickness of action" to MagicItem(
            name = "Manual of Quickness of Action",
            description = "\n\tThis book contains coordination and balance exercises, and its words are charged with" +
                    "\n\tmagic. If you spend 48 hours over a period of 6 days or fewer studying the book's contents" +
                    "\n\tand practicing its guidelines, your Dexterity score increases by 2, as does your maximum for" +
                    "\n\tthat score. The manual then loses its magic, but regains it in a century."
        ),
        "mirror of life trapping" to MagicItem(
            name = "Mirror of Life Trapping",
            description = "\n\tWhen this 4-foot-tall mirror is viewed indirectly, its surface shows faint images of" +
                    "\n\tcreatures. The mirror weighs 50 pounds, and it has AC 11, 10 hit points, and vulnerability to" +
                    "\n\tbludgeoning damage. It shatters and is destroyed when reduced to 0 hit points." +
                    "\n\tIf the mirror is hanging on a vertical surface and you are within 5 feet of it, you can use" +
                    "\n\tan action to speak its command word and activate it. It remains activated until you use an" +
                    "\n\taction to speak the command word again." +
                    "\n\tAny creature other than you that sees its reflection in the activated mirror while within" +
                    "\n\t30 feet of it must succeed on a DC 15 Charisma saving throw or be trapped, along with" +
                    "\n\tanything it is wearing or carrying, in one of the mirror's twelve extradimensional cells." +
                    "\n\tThis saving throw is made with advantage if the creature knows the mirror's nature, and" +
                    "\n\tconstructs succeed on the saving throw automatically." +
                    "\n\tAn extradimensional cell is an infinite expanse filled with thick fog that reduces" +
                    "\n\tvisibility to 10 feet. Creatures trapped in the mirror's cells don't age, and they don't" +
                    "\n\tneed to eat, drink, or sleep. A creature trapped within a cell can escape using magic that" +
                    "\n\tpermits planar travel. Otherwise, the creature is confined to the cell until freed." +
                    "\n\tIf the mirror traps a creature but its twelve extradimensional cells are already occupied," +
                    "\n\tthe mirror frees one trapped creature at random to accommodate the new prisoner. A freed" +
                    "\n\tcreature appears in an unoccupied space within sight of the mirror but facing away from it." +
                    "\n\tIf the mirror is shattered, all creatures it contains are freed and appear in unoccupied" +
                    "\n\tspaces near it." +
                    "\n\tWhile within 5 feet of the mirror, you can use an action to speak the name of one creature" +
                    "\n\ttrapped in it or call out a particular cell by number. The creature named or contained in the" +
                    "\n\tnamed cell appears as an image on the mirror's surface. You and the creature can then" +
                    "\n\tcommunicate normally." +
                    "\n\tIn a similar way, you can use an action to speak a second command word and free one creature" +
                    "\n\ttrapped in the mirror. The freed creature appears, along with its possessions, in the" +
                    "\n\tunoccupied space nearest to the mirror and facing away from it."
        ),
        "nine lives stealer" to MagicItem(
            name = "Nine Lives Stealer",
            description = "\n\tYou gain a +2 bonus to attack and damage rolls made with this magic weapon." +
                    "\n\tThe sword has 1d8 + 1 charges. If you score a critical hit against a creature that has fewer" +
                    "\n\tthan 100 hit points, it must succeed on a DC 15 Constitution saving throw or be slain" +
                    "\n\tinstantly as the sword tears its life force from its body (a construct or an undead is" +
                    "\n\timmune). The sword loses 1 charge if the creature is slain. When the sword has no charges" +
                    "\n\tremaining, it loses this property."
        ),
        "oathbow" to MagicItem(
            name = "Oathbow",
            description = "\n\tWhen you nock an arrow on this bow, it whispers in Elvish, \"Swift defeat to my" +
                    "\n\tenemies.\" When you use this weapon to make a ranged attack, you can, as a command phrase," +
                    "\n\tsay, \"Swift death to you who have wronged me.\" The target of your attack becomes your sworn" +
                    "\n\tenemy until it dies or until dawn seven days later. You can have only one such sworn enemy at" +
                    "\n\ta time. When your sworn enemy dies, you can choose a new one after the next dawn." +
                    "\n\tWhen you make a ranged attack roll with this weapon against your sworn enemy, you have" +
                    "\n\tadvantage on the roll. In addition, your target gains no benefit from cover, other than total" +
                    "\n\tcover, and you suffer no disadvantage due to long range. If the attack hits, your sworn enemy" +
                    "\n\ttakes an extra 3d6 piercing damage." +
                    "\n\tWhile your sworn enemy lives, you have disadvantage on attack rolls with all other weapons." +
                    "\n\tProficiency with a longbow allows you to add your proficiency bonus to the attack roll for" +
                    "\n\tany attack you make with it."
        ),
        "+2 scale mail" to MagicItem(
            name = "+2 Scale Mail",
            description = "\n\tYou have a +2 bonus to AC while wearing this armor." +
                    "\n\tThis armor consists of a coat and leggings (and perhaps a separate skirt) of leather covered" +
                    "\n\twith overlapping pieces of metal, much like the scales of a fish. The suit includes gauntlets."
        ),
        "spellguard shield" to MagicItem(
            name = "Spellguard Shield",
            description = "\n\tWhile holding this shield, you have advantage on saving throws against spells and other" +
                    "\n\tmagical effects, and spell attacks have disadvantage against you." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding a shield increases" +
                    "\n\tyour Armor Class by 2. You can benefit from only one shield at a time."
        ),
        "+1 splint" to MagicItem(
            name = "+1 Splint",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tThis armor is made of narrow vertical strips of metal riveted to a backing of leather that" +
                    "\n\tis worn over cloth padding. Flexible chain mail protects the joints."
        ),
        "splint armor of resistance" to MagicItem(
            name = "Splint Armor of Resistance",
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
        "+1 studded leather" to MagicItem(
            name = "+1 Studded Leather",
            description = "\n\tYou have a +1 bonus to AC while wearing this armor." +
                    "\n\tMade from tough but flexible leather, studded leather is reinforced with close-set" +
                    "\n\trivets or spikes."
        ),
        "studded leather of resistance" to MagicItem(
            name = "Studded Leather of Resistance",
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
        "tome of clear thought" to MagicItem(
            name = "Tome of Clear Thought",
            description = "\n\tThis book contains memory and logic exercises, and its words are charged with magic." +
                    "\n\tIf you spend 48 hours over a period of 6 days or fewer studying the book's contents and" +
                    "\n\tpracticing its guidelines, your Intelligence score increases by 2, as does your maximum for" +
                    "\n\tthat score. The manual then loses its magic, but regains it in a century."
        ),
        "tome of leadership and influence" to MagicItem(
            name = "Tome of Leadership and Influence",
            description = "\n\tThis book contains guidelines for influencing and charming others, and its words are" +
                    "\n\tcharged with magic. If you spend 48 hours over a period of 6 days or fewer studying the" +
                    "\n\tbook's contents and practicing its guidelines, your Charisma score increases by 2, as does" +
                    "\n\tyour maximum for that score. The manual then loses its magic, but regains it in a century."
        ),
        "tome of understanding" to MagicItem(
            name = "Tome of Understanding",
            description = "\n\tThis book contains intuition and insight exercises, and its words are charged with" +
                    "\n\tmagic. If you spend 48 hours over a period of 6 days or fewer studying the book's contents" +
                    "\n\tand practicing its guidelines, your Wisdom score increases by 2, as does your maximum for" +
                    "\n\tthat score. The manual then loses its magic, but regains it in a century."
        )
    )
}