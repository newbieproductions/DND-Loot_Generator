package com.example.lootgenerator.data

import com.example.lootgenerator.model.MagicItem

fun rollListFName(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsF.magicItems["+1 weapon"]?.name.toString()
        in 16..18 -> MagicItemsF.magicItems["+1 shield"]?.name.toString()
        in 19..21 -> MagicItemsF.magicItems["sentinel shield"]?.name.toString()
        in 22..23 -> MagicItemsF.magicItems["amulet of proof against detection and location"]?.name.toString()
        in 24..25 -> MagicItemsF.magicItems["boots of elvenkind"]?.name.toString()
        in 26..27 -> MagicItemsF.magicItems["boots of striding and springing"]?.name.toString()
        in 28..29 -> MagicItemsF.magicItems["bracers of archery"]?.name.toString()
        in 30..31 -> MagicItemsF.magicItems["brooch of shielding"]?.name.toString()
        in 32..33 -> MagicItemsF.magicItems["broom of flying"]?.name.toString()
        in 34..35 -> MagicItemsF.magicItems["cloak of elvenkind"]?.name.toString()
        in 36..37 -> MagicItemsF.magicItems["cloak of protection"]?.name.toString()
        in 38..39 -> MagicItemsF.magicItems["gauntlets of ogre power"]?.name.toString()
        in 40..41 -> MagicItemsF.magicItems["hat of disguise"]?.name.toString()
        in 42..43 -> MagicItemsF.magicItems["javelin of lightning"]?.name.toString()
        in 44..45 -> MagicItemsF.magicItems["pearl of power"]?.name.toString()
        in 46..47 -> MagicItemsF.magicItems["+1 rod of the pact keeper"]?.name.toString()
        in 48..49 -> MagicItemsF.magicItems["slippers of spider climbing"]?.name.toString()
        in 50..51 -> MagicItemsF.magicItems["staff of the adder"]?.name.toString()
        in 52..53 -> MagicItemsF.magicItems["staff of the python"]?.name.toString()
        in 54..55 -> MagicItemsF.magicItems["sword of vengeance"]?.name.toString()
        in 56..57 -> MagicItemsF.magicItems["trident of fish command"]?.name.toString()
        in 58..59 -> MagicItemsF.magicItems["wand of magic missiles"]?.name.toString()
        in 60..61 -> MagicItemsF.magicItems["+1 wand of the war mage"]?.name.toString()
        in 62..63 -> MagicItemsF.magicItems["wand of web"]?.name.toString()
        in 64..65 -> MagicItemsF.magicItems["weapon of warning"]?.name.toString()
        66 -> MagicItemsF.magicItems["adamantine chain mail"]?.name.toString()
        67 -> MagicItemsF.magicItems["adamantine chain shirt"]?.name.toString()
        68 -> MagicItemsF.magicItems["adamantine scale mail"]?.name.toString()
        69 -> MagicItemsF.magicItems["gray bag of tricks"]?.name.toString()
        70 -> MagicItemsF.magicItems["rust bag of tricks"]?.name.toString()
        71 -> MagicItemsF.magicItems["tan bag of tricks"]?.name.toString()
        72 -> MagicItemsF.magicItems["boots of the winterlands"]?.name.toString()
        73 -> MagicItemsF.magicItems["circlet of blasting"]?.name.toString()
        74 -> MagicItemsF.magicItems["deck of illusions"]?.name.toString()
        75 -> MagicItemsF.magicItems["eversmoking bottle"]?.name.toString()
        76 -> MagicItemsF.magicItems["eyes of charming"]?.name.toString()
        77 -> MagicItemsF.magicItems["eyes of the eagle"]?.name.toString()
        78 -> MagicItemsF.magicItems["figurine of wondrous power (silver raven)"]?.name.toString()
        79 -> MagicItemsF.magicItems["gem of brightness"]?.name.toString()
        80 -> MagicItemsF.magicItems["gloves of missile snaring"]?.name.toString()
        81 -> MagicItemsF.magicItems["gloves of swimming and climbing"]?.name.toString()
        82 -> MagicItemsF.magicItems["gloves of thievery"]?.name.toString()
        83 -> MagicItemsF.magicItems["headband of intellect"]?.name.toString()
        84 -> MagicItemsF.magicItems["helm of telepathy"]?.name.toString()
        85 -> MagicItemsF.magicItems["doss lute"]?.name.toString()
        86 -> MagicItemsF.magicItems["fochlucan bandore"]?.name.toString()
        87 -> MagicItemsF.magicItems["mac-fuirmidh cittern"]?.name.toString()
        88 -> MagicItemsF.magicItems["medallion of thoughts"]?.name.toString()
        89 -> MagicItemsF.magicItems["necklace of adaptation"]?.name.toString()
        90 -> MagicItemsF.magicItems["periapt of wound closure"]?.name.toString()
        91 -> MagicItemsF.magicItems["pipes of haunting"]?.name.toString()
        92 -> MagicItemsF.magicItems["pipes of the sewers"]?.name.toString()
        93 -> MagicItemsF.magicItems["ring of jumping"]?.name.toString()
        94 -> MagicItemsF.magicItems["ring of mind shielding"]?.name.toString()
        95 -> MagicItemsF.magicItems["ring of warmth"]?.name.toString()
        96 -> MagicItemsF.magicItems["ring of water walking"]?.name.toString()
        97 -> MagicItemsF.magicItems["quiver of ehlonna"]?.name.toString()
        98 -> MagicItemsF.magicItems["stone of good luck (luckstone)"]?.name.toString()
        99 -> MagicItemsF.magicItems["wind fan"]?.name.toString()
        else -> MagicItemsF.magicItems["winged boots"]?.name.toString()
    }

    return result
}

fun rollListFDescription(magicRoll: Int): String {
    var result = when (magicRoll) {
        in 1..15 -> MagicItemsF.magicItems["+1 weapon"]?.description.toString()
        in 16..18 -> MagicItemsF.magicItems["+1 shield"]?.description.toString()
        in 19..21 -> MagicItemsF.magicItems["sentinel shield"]?.description.toString()
        in 22..23 -> MagicItemsF.magicItems["amulet of proof against detection and location"]?.description.toString()
        in 24..25 -> MagicItemsF.magicItems["boots of elvenkind"]?.description.toString()
        in 26..27 -> MagicItemsF.magicItems["boots of striding and springing"]?.description.toString()
        in 28..29 -> MagicItemsF.magicItems["bracers of archery"]?.description.toString()
        in 30..31 -> MagicItemsF.magicItems["brooch of shielding"]?.description.toString()
        in 32..33 -> MagicItemsF.magicItems["broom of flying"]?.description.toString()
        in 34..35 -> MagicItemsF.magicItems["cloak of elvenkind"]?.description.toString()
        in 36..37 -> MagicItemsF.magicItems["cloak of protection"]?.description.toString()
        in 38..39 -> MagicItemsF.magicItems["gauntlets of ogre power"]?.description.toString()
        in 40..41 -> MagicItemsF.magicItems["hat of disguise"]?.description.toString()
        in 42..43 -> MagicItemsF.magicItems["javelin of lightning"]?.description.toString()
        in 44..45 -> MagicItemsF.magicItems["pearl of power"]?.description.toString()
        in 46..47 -> MagicItemsF.magicItems["+1 rod of the pact keeper"]?.description.toString()
        in 48..49 -> MagicItemsF.magicItems["slippers of spider climbing"]?.description.toString()
        in 50..51 -> MagicItemsF.magicItems["staff of the adder"]?.description.toString()
        in 52..53 -> MagicItemsF.magicItems["staff of the python"]?.description.toString()
        in 54..55 -> MagicItemsF.magicItems["sword of vengeance"]?.description.toString()
        in 56..57 -> MagicItemsF.magicItems["trident of fish command"]?.description.toString()
        in 58..59 -> MagicItemsF.magicItems["wand of magic missiles"]?.description.toString()
        in 60..61 -> MagicItemsF.magicItems["+1 wand of the war mage"]?.description.toString()
        in 62..63 -> MagicItemsF.magicItems["wand of web"]?.description.toString()
        in 64..65 -> MagicItemsF.magicItems["weapon of warning"]?.description.toString()
        66 -> MagicItemsF.magicItems["adamantine chain mail"]?.description.toString()
        67 -> MagicItemsF.magicItems["adamantine chain shirt"]?.description.toString()
        68 -> MagicItemsF.magicItems["adamantine scale mail"]?.description.toString()
        69 -> MagicItemsF.magicItems["gray bag of tricks"]?.description.toString()
        70 -> MagicItemsF.magicItems["rust bag of tricks"]?.description.toString()
        71 -> MagicItemsF.magicItems["tan bag of tricks"]?.description.toString()
        72 -> MagicItemsF.magicItems["boots of the winterlands"]?.description.toString()
        73 -> MagicItemsF.magicItems["circlet of blasting"]?.description.toString()
        74 -> MagicItemsF.magicItems["deck of illusions"]?.description.toString()
        75 -> MagicItemsF.magicItems["eversmoking bottle"]?.description.toString()
        76 -> MagicItemsF.magicItems["eyes of charming"]?.description.toString()
        77 -> MagicItemsF.magicItems["eyes of the eagle"]?.description.toString()
        78 -> MagicItemsF.magicItems["figurine of wondrous power (silver raven)"]?.description.toString()
        79 -> MagicItemsF.magicItems["gem of brightness"]?.description.toString()
        80 -> MagicItemsF.magicItems["gloves of missile snaring"]?.description.toString()
        81 -> MagicItemsF.magicItems["gloves of swimming and climbing"]?.description.toString()
        82 -> MagicItemsF.magicItems["gloves of thievery"]?.description.toString()
        83 -> MagicItemsF.magicItems["headband of intellect"]?.description.toString()
        84 -> MagicItemsF.magicItems["helm of telepathy"]?.description.toString()
        85 -> MagicItemsF.magicItems["doss lute"]?.description.toString()
        86 -> MagicItemsF.magicItems["fochlucan bandore"]?.description.toString()
        87 -> MagicItemsF.magicItems["mac-fuirmidh cittern"]?.description.toString()
        88 -> MagicItemsF.magicItems["medallion of thoughts"]?.description.toString()
        89 -> MagicItemsF.magicItems["necklace of adaptation"]?.description.toString()
        90 -> MagicItemsF.magicItems["periapt of wound closure"]?.description.toString()
        91 -> MagicItemsF.magicItems["pipes of haunting"]?.description.toString()
        92 -> MagicItemsF.magicItems["pipes of the sewers"]?.description.toString()
        93 -> MagicItemsF.magicItems["ring of jumping"]?.description.toString()
        94 -> MagicItemsF.magicItems["ring of mind shielding"]?.description.toString()
        95 -> MagicItemsF.magicItems["ring of warmth"]?.description.toString()
        96 -> MagicItemsF.magicItems["ring of water walking"]?.description.toString()
        97 -> MagicItemsF.magicItems["quiver of ehlonna"]?.description.toString()
        98 -> MagicItemsF.magicItems["stone of good luck (luckstone)"]?.description.toString()
        99 -> MagicItemsF.magicItems["wind fan"]?.description.toString()
        else -> MagicItemsF.magicItems["winged boots"]?.description.toString()
    }

    return result
}

object MagicItemsF {
    val magicItems = mapOf<String, MagicItem>(
        "+1 weapon" to MagicItem(
            name = "+1 Weapon",
            description = "\n\tYou have a +1 bonus to attack and damage rolls made with this " +
                    "magic weapon."
        ),
        "+1 shield" to MagicItem(
            name = "+1 Shield",
            description = "\n\tWhile holding this shield, you have a +1 bonus to AC. This bonus " +
                    "is in addition to the shield's normal bonus to AC." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding " +
                    "a shield increases your Armor Class by 2. You can benefit from only one " +
                    "shield at a time."
        ),
        "sentinel shield" to MagicItem(
            name = "Sentinel Shield",
            description = "\n\tWhile holding this shield, you have advantage on initiative " +
                    "rolls and Wisdom (Perception) checks. The shield is emblazoned with a " +
                    "symbol of an eye." +
                    "\n\tA shield is made from wood or metal and is carried in one hand. Wielding " +
                    "a shield increases your Armor Class by 2. You can benefit from only one " +
                    "shield at a time."
        ),
        "amulet of proof against detection and location" to MagicItem(
            name = "Amulet of Proof against Detection and Location",
            description = "\n\tWhile wearing this amulet, you are hidden from divination " +
                    "magic. You can't be targeted by such magic or perceived through magical " +
                    "scrying sensors."
        ),
        "boots of elvenkind" to MagicItem(
            name = "Boots of Elvenkind",
            description = "\n\tWhile you wear these boots, your steps make no sound, regardless " +
                    "of the surface you are moving across. You also have advantage on Dexterity " +
                    "(Stealth) checks that rely on moving silently."
        ),
        "boots of striding and springing" to MagicItem(
            name = "Boots of Striding and Springing",
            description = "\n\tWhile you wear these boots, your walking speed becomes 30 feet, " +
                    "unless your walking speed is higher, and your speed isn't reduced if you " +
                    "are encumbered or wearing heavy armor. In addition, you can jump three " +
                    "times the normal distance, though you can't jump farther than your " +
                    "remaining movement would allow."
        ),
        "bracers of archery" to MagicItem(
            name = "Bracers of Archery",
            description = "\n\tWhile wearing these bracers, you have proficiency with the " +
                    "longbow and shortbow, and you gain a +2 bonus to damage rolls on ranged " +
                    "attacks made with such weapons."
        ),
        "brooch of shielding" to MagicItem(
            name = "Brooch of Shielding",
            description = "\n\tWhile wearing this brooch, you have resistance to force damage, " +
                    "and you have immunity to damage from the magic missile spell."
        ),
        "broom of flying" to MagicItem(
            name = "Broom of Flying",
            description = "\n\tThis wooden broom, which weighs 3 pounds, functions like a " +
                    "mundane broom until you stand astride it and speak its command word. It " +
                    "then hovers beneath you and can be ridden in the air. It has a flying " +
                    "speed of 50 feet. It can carry up to 400 pounds, but its flying speed " +
                    "becomes 30 feet while carrying over 200 pounds. The broom stops hovering " +
                    "when you land." +
                    "\n\tYou can send the broom to travel alone to a destination within 1 mile " +
                    "of you if you speak the command word, name the location, and are familiar " +
                    "with that place. The broom comes back to you when you speak another command " +
                    "word, provided that the broom is still within 1 mile of you."
        ),
        "cloak of elvenkind" to MagicItem(
            name = "Cloak of Elvenkind",
            description = "\n\tWhile you wear this cloak with its hood up, Wisdom (Perception) " +
                    "checks made to see you have disadvantage, and you have advantage on " +
                    "Dexterity (Stealth) checks made to hide, as the cloak's color shifts to " +
                    "camouflage you. Pulling the hood up or down requires an action."
        ),
        "cloak of protection" to MagicItem(
            name = "Cloak of Protection",
            description = "\n\tYou gain a +1 bonus to AC and saving throws while you wear this cloak."
        ),
        "gauntlets of ogre power" to MagicItem(
            name = "Gauntlets of Ogre Power",
            description = "\n\tYour Strength score is 19 while you wear these gauntlets. They " +
                    "have no effect on you if your Strength is 19 or higher without them."
        ),
        "hat of disguise" to MagicItem(
            name = "Hat of Disguise",
            description = "\n\tWhile wearing this hat, you can use an action to cast the " +
                    "disguise self spell from it at will. The spell ends if the hat is removed."
        ),
        /**
         * target for auto rolls
         */
        "javelin of lightning" to MagicItem(
            name = "Javelin of Lightning",
            description = "\n\tThis javelin is a magic weapon. When you hurl it and speak its " +
                    "command word, it transforms into a bolt of lightning, forming a line 5 " +
                    "feet wide that extends out from you to a target within 120 feet. Each " +
                    "creature in the line excluding you and the target must make a DC 13 " +
                    "Dexterity saving throw, taking 4d6 lightning damage on a failed save, and " +
                    "half as much damage on a successful one. The lightning bolt turns back into " +
                    "a javelin when it reaches the target. Make a ranged weapon attack against " +
                    "the target. On a hit, the target takes damage from the javelin plus 4d6 " +
                    "lightning damage." +
                    "\n\tThe javelin's property can't be used again until the next dawn. In the " +
                    "meantime, the javelin can still be used as a magic weapon." +
                    "\n\tProficiency with a javelin allows you to add your proficiency bonus " +
                    "to the attack roll for any attack you make with it."
        ),
        "pearl of power" to MagicItem(
            name = "Pearl of Power",
            description = "\n\tWhile this pearl is on your person, you can use an action " +
                    "to speak its command word and regain one expended spell slot. If the " +
                    "expended slot was of 4th level or higher, the new slot is 3rd level. Once " +
                    "you use the pearl, it can't be used again until the next dawn."
        ),
        "+1 rod of the pact keeper" to MagicItem(
            name = "+1 Rod of the Pact Keeper",
            description = "\n\tWhile holding this rod, you gain a +1 bonus to spell attack rolls " +
                    "and to the saving throw DCs of your warlock spells." +
                    "\n\tIn addition, you can regain 1 warlock spell slot as an action while " +
                    "holding the rod. You can’t use this property again until you finish " +
                    "a long rest."
        ),
        "slippers of spider climbing" to MagicItem(
            name = "Slippers of Spider Climbing",
            description = "\n\tWhile you wear these light shoes, you can move up, down, and " +
                    "across vertical surfaces and upside down along ceilings, while leaving your " +
                    "hands free. You have a climbing speed equal to your walking speed. " +
                    "However, the slippers don't allow you to move this way on a slippery " +
                    "surface, such as one covered by ice or oil."
        ),
        /**
         * target for auto rolls
         */
        "staff of the adder" to MagicItem(
            name = "Staff of the Adder",
            description = "\n\tYou can use a bonus action to speak the staff's command word and " +
                    "make the head of the staff become that of an animate poisonous snake for " +
                    "1 minute. By using another bonus action to speak the command word again, " +
                    "you return the staff to its normal inanimate form." +
                    "\n\tYou can make a melee attack using the snake head, which has a reach of " +
                    "5 feet. Your proficiency bonus applies to the attack roll. On a hit, the " +
                    "target takes 1d6 piercing damage and must succeed on a DC 15 Constitution " +
                    "saving throw or take 3d6 poison damage." +
                    "\n\tThe snake head can be attacked while it is animate. It has an Armor " +
                    "Class of 15 and 20 hit points. If the head drops to 0 hit points, the " +
                    "staff is destroyed. As long as it's not destroyed, the staff regains all " +
                    "lost hit points when it reverts to its animate form."
        ),
        "staff of the python" to MagicItem(
            name = "Staff of the Python",
            description = "\n\tYou can use an action to speak this staff's command word and " +
                    "throw the staff on the ground within 10 feet of you. The staff becomes a " +
                    "giant constrictor snake under your control and acts on its own initiative " +
                    "count. By using a bonus action to speak the command word again, you return " +
                    "the staff to its normal form in a space formerly occupied by the snake." +
                    "\n\tOn your turn, you can mentally command the snake if it is within 60 " +
                    "feet of you and you aren't incapacitated. You decide what action the snake " +
                    "takes and where it moves during its next turn, or you can issue it a " +
                    "general command, such as to attack your enemies or guard a location." +
                    "\n\tIf the snake is reduced to 0 hit points, it dies and reverts to its " +
                    "staff form. The staff then shatters and is destroyed. If the snake reverts " +
                    "to staff form before losing all its hit points, it regains all of them."
        ),
        "sword of vengeance" to MagicItem(
            name = "Sword of Vengeance",
            description = "\n\tYou gain a +1 bonus to attack and damage rolls made with this " +
                    "magic weapon." +
                    "\n\tCurse. This sword is cursed and possessed by a vengeful spirit. " +
                    "Becoming attuned to it extends the curse to you. As long as you remain " +
                    "cursed, you are unwilling to part with the sword, keeping it on your " +
                    "person at all times. While attuned to this weapon, you have disadvantage " +
                    "on attack rolls made with weapons other than this one." +
                    "\n\tIn addition, while the sword is on your person, you must succeed on a " +
                    "DC 15 Wisdom saving throw whenever you take damage in combat. On a failed " +
                    "save, you must attack the creature that damaged you until you drop to 0 " +
                    "hit points or it does, or until you can’t reach the creature to make a " +
                    "melee attack against it." +
                    "\n\tYou can break the curse in the usual ways. Alternatively, casting " +
                    "banishment on the sword forces the vengeful spirit to leave it. The sword " +
                    "then becomes a +1 weapon with no other properties." +
                    "\n\tApplicable Weapons: Greatsword, Longsword, Rapier, Scimitar, Shortsword"
        ),
        /**
         * target for auto rolls
         */
        "trident of fish command" to MagicItem(
            name = "Trident of Fish Command",
            description = "\n\tThis trident is a magic weapon. It has 3 charges. While you carry " +
                    "it, you can use an action and expend 1 charge to cast dominate beast (save " +
                    "DC 15) from it on a beast that has an innate swimming speed. The trident " +
                    "regains 1d3 expended charges daily at dawn." +
                    "\n\tProficiency with a trident allows you to add your proficiency bonus to " +
                    "the attack roll for any attack you make with it."
        ),
        /**
         * target for auto rolls
         */
        "wand of magic missiles" to MagicItem(
            name = "Wand of Magic Missiles",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an action " +
                    "to expend 1 or more of its charges to cast the magic missile spell from it. " +
                    "For 1 charge, you cast the 1st-level version of the spell. You can increase " +
                    "the spell slot level by one for each additional charge you expend." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend " +
                    "the wand's last charge, roll a d20. On a 1, the wand crumbles into ashes " +
                    "and is destroyed."
        ),
        "+1 wand of the war mage" to MagicItem(
            name = "+1 Wand of the War Mage",
            description = "\n\tWhile holding this wand, you gain a +1 bonus to spell attack rolls. " +
                    "In addition, you ignore half cover when making a spell attack."
        ),
        /**
         * target for auto rolls
         */
        "wand of web" to MagicItem(
            name = "Wand of Web",
            description = "\n\tThis wand has 7 charges. While holding it, you can use an " +
                    "action to expend 1 of its charges to cast the web spell (save DC 15) from it." +
                    "\n\tThe wand regains 1d6 + 1 expended charges daily at dawn. If you expend " +
                    "the wand's last charge, roll a d20. On a 1, the wand crumbles into ashes " +
                    "and is destroyed."
        ),
        "weapon of warning" to MagicItem(
            name = "Weapon of Warning",
            description = "\n\tThis magic weapon warns you of danger. While the weapon is on " +
                    "your person, you have advantage on initiative rolls. In addition, you and " +
                    "any of your companions within 30 feet of you can’t be surprised, except " +
                    "when incapacitated by something other than nonmagical sleep. The weapon " +
                    "magically awakens you and your companions within range if any of you are " +
                    "sleeping naturally when combat begins."
        ),
        "adamantine chain mail" to MagicItem(
            name = "Adamantine Chain Mail",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the " +
                    "hardest substances in existence. While you're wearing it, any critical " +
                    "hit against you becomes a normal hit." +
                    "\n\tMade of interlocking metal rings, chain mail includes a layer of " +
                    "quilted fabric worn underneath the mail to prevent chafing and to cushion " +
                    "the impact of blows. The suit includes gauntlets."
        ),
        "adamantine chain shirt" to MagicItem(
            name = "Adamantine Chain Shirt",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the " +
                    "hardest substances in existence. While you're wearing it, any critical " +
                    "hit against you becomes a normal hit." +
                    "\n\tMade of interlocking metal rings, a chain shirt is worn between layers " +
                    "of clothing or leather. This armor offers modest protection to the wearer's " +
                    "upper body and allows the sound of the rings rubbing against one another " +
                    "to be muffled by outer layers."
        ),
        "adamantine scale mail" to MagicItem(
            name = "Adamantine Scale Mail",
            description = "\n\tThis suit of armor is reinforced with adamantine, one of the " +
                    "hardest substances in existence. While you're wearing it, any critical " +
                    "hit against you becomes a normal hit." +
                    "\n\tThis armor consists of a coat and leggings (and perhaps a separate " +
                    "skirt) of leather covered with overlapping pieces of metal, much like the " +
                    "scales of a fish. The suit includes gauntlets."
        ),
        /**
         * target for table and auto roll
         */
        "gray bag of tricks" to MagicItem(
            name = "Gray Bag of Tricks",
            description = "\n\tThis ordinary bag, made from gray cloth, appears empty. Reaching " +
                    "inside the bag, however, reveals the presence of a small, fuzzy object. " +
                    "The bag weighs 1/2 pound." +
                    "\n\tYou can use an action to pull the fuzzy object from the bag and throw " +
                    "it up to 20 feet. When the object lands, it transforms into a creature " +
                    "you determine by rolling a d8 and consulting the table that corresponds " +
                    "to the bag's color. See the Monsters Listing for the creature's statistics. " +
                    "The creature vanishes at the next dawn or when it is reduced to 0 hit points." +
                    "\n\tThe creature is friendly to you and your companions, and it acts on " +
                    "your turn. You can use a bonus action to command how the creature moves " +
                    "and what action it takes on its next turn, or to give it general orders, " +
                    "such as to attack your enemies. In the absence of such orders, the creature " +
                    "acts in a fashion appropriate to its nature." +
                    "\n\tOnce three fuzzy objects have been pulled from the bag, the bag " +
                    "can't be used again until the next dawn." +
                    "\n\tGray Bag of Tricks" +
                    "\n\td8\tCreature" +
                    "\n\t1\tWeasel" +
                    "\n\t2\tGiant rat" +
                    "\n\t3\tBadger" +
                    "\n\t4\tBoar" +
                    "\n\t5\tPanther" +
                    "\n\t6\tGiant badger" +
                    "\n\t7\tDire wolf" +
                    "\n\t8\tGiant elk"
        ),
        /**
         * target for table and auto roll
         */
        "rust bag of tricks" to MagicItem(
            name = "Rust Bag of Tricks",
            description = "\n\tThis ordinary bag, made from rust cloth, appears empty. " +
                    "Reaching inside the bag, however, reveals the presence of a small, fuzzy " +
                    "object. The bag weighs 1/2 pound." +
                    "\n\tYou can use an action to pull the fuzzy object from the bag and throw " +
                    "it up to 20 feet. When the object lands, it transforms into a creature " +
                    "you determine by rolling a d8 and consulting the table that corresponds " +
                    "to the bag's color. See the Monsters Listing for the creature's statistics. " +
                    "The creature vanishes at the next dawn or when it is reduced to 0 hit points." +
                    "\n\tThe creature is friendly to you and your companions, and it acts on " +
                    "your turn. You can use a bonus action to command how the creature moves " +
                    "and what action it takes on its next turn, or to give it general orders, " +
                    "such as to attack your enemies. In the absence of such orders, the creature " +
                    "acts in a fashion appropriate to its nature." +
                    "\n\tOnce three fuzzy objects have been pulled from the bag, the bag " +
                    "can't be used again until the next dawn." +
                    "\n\tRust Bag of Tricks" +
                    "\n\td8\tCreature" +
                    "\n\t1\tRat" +
                    "\n\t2\tOwl" +
                    "\n\t3\tMastiff" +
                    "\n\t4\tGoat" +
                    "\n\t5\tGiant goat" +
                    "\n\t6\tGiant boar" +
                    "\n\t7\tLion" +
                    "\n\t8\tBrown bear"
        ),
        /**
         * target for table and auto roll
         */
        "tan bag of tricks" to MagicItem(
            name = "Tan Bag of Tricks",
            description = "\n\tThis ordinary bag, made from tan cloth, appears empty. Reaching " +
                    "inside the bag, however, reveals the presence of a small, fuzzy object. The " +
                    "bag weighs 1/2 pound." +
                    "\n\tYou can use an action to pull the fuzzy object from the bag and throw it " +
                    "up to 20 feet. When the object lands, it transforms into a creature you " +
                    "determine by rolling a d8 and consulting the table that corresponds to the " +
                    "bag's color. See the Monsters Listing for the creature's statistics. The " +
                    "creature vanishes at the next dawn or when it is reduced to 0 hit points." +
                    "\n\tThe creature is friendly to you and your companions, and it acts on your " +
                    "turn. You can use a bonus action to command how the creature moves and what " +
                    "action it takes on its next turn, or to give it general orders, such as to " +
                    "attack your enemies. In the absence of such orders, the creature acts in a " +
                    "fashion appropriate to its nature." +
                    "\n\tOnce three fuzzy objects have been pulled from the bag, the bag can't " +
                    "be used again until the next dawn." +
                    "\n\tTan Bag of Tricks" +
                    "\n\td8\tCreature" +
                    "\n\t1\tJackal" +
                    "\n\t2\tApe" +
                    "\n\t3\tBaboon" +
                    "\n\t4\tAxe beak" +
                    "\n\t5\tBlack bear" +
                    "\n\t6\tGiant weasel" +
                    "\n\t7\tGiant hyena" +
                    "\n\t8\tTiger"
        ),
        "boots of the winterlands" to MagicItem(
            name = "Boots of the Winterlands",
            description = "\n\tThese furred boots are snug and feel quite warm. While you wear " +
                    "them, you gain the following benefits:" +
                    "\n\tYou have resistance to cold damage." +
                    "\n\tYou ignore difficult terrain created by ice or snow. You can tolerate " +
                    "temperatures as low as −50 degrees Fahrenheit without any additional " +
                    "protection. If you wear heavy clothes, you can tolerate temperatures as " +
                    "low as −100 degrees Fahrenheit."
        ),
        "circlet of blasting" to MagicItem(
            name = "Circlet of Blasting",
            description = "\n\tWhile wearing this circlet, you can use an action to cast the " +
                    "scorching ray spell with it. When you make the spell's attacks, you do so " +
                    "with an attack bonus of +5. The circlet can't be used this way again " +
                    "until the next dawn."
        ),
        /**
         * target for table and auto rolls
         */
        "deck of illusions" to MagicItem(
            name = "Deck of Illusions",
            description = "\n\tThis box contains a set of parchment cards. A full deck has 34 cards. A deck found as treasure is usually missing 1d20 − 1 cards." +
                    "\n\tThe magic of the deck functions only if cards are drawn at random (you can use an altered deck of playing cards to simulate the deck). You can use an action to draw a card at random from the deck and throw it to the ground at a point within 30 feet of you." +
                    "\n\tAn illusion of one or more creatures forms over the thrown card and remains until dispelled. An illusory creature appears real, of the appropriate size, and behaves as if it were a real creature except that it can do no harm. While you are within 120 feet of the illusory creature and can see it, you can use an action to move it magically anywhere within 30 feet of its card. Any physical interaction with the illusory creature reveals it to be an illusion, because objects pass through it. Someone who uses an action to visually inspect the creature identifies it as illusory with a successful DC 15 Intelligence (Investigation) check. The creature then appears translucent." +
                    "\n\tThe illusion lasts until its card is moved or the illusion is dispelled. When the illusion ends, the image on its card disappears, and that card can't be used again." +
                    "\n\tPlaying Card\tIllusion" +
                    "\n\tAce of hearts\tRed dragon" +
                    "\n\tKing of hearts\tKnight and four guards" +
                    "\n\tQueen of hearts\tSuccubus or incubus" +
                    "\n\tJack of hearts\tDruid" +
                    "\n\tTen of hearts\tCloud giant" +
                    "\n\tNine of hearts\tEttin" +
                    "\n\tEight of hearts\tBugbear" +
                    "\n\tTwo of hearts\tGoblin" +
                    "\n\tAce of diamonds\tBeholder" +
                    "\n\tKing of diamonds\tArchmage and mage apprentice" +
                    "\n\tQueen of diamonds\tNight hag" +
                    "\n\tJack of diamonds\tAssassin" +
                    "\n\tTen of diamonds\tFire giant" +
                    "\n\tNine of diamonds\tOgre mage" +
                    "\n\tEight of diamonds\tGnoll" +
                    "\n\tTwo of diamonds\tKobold" +
                    "\n\tAce of spades\tLich" +
                    "\n\tKing of spades\tPriest and two acolytes" +
                    "\n\tQueen of spades\tMedusa" +
                    "\n\tJack of spades\tVeteran" +
                    "\n\tTen of spades\tFrost giant" +
                    "\n\tNine of spades\tTroll" +
                    "\n\tEight of spades\tHobgoblin" +
                    "\n\tTwo of spades\tGoblin" +
                    "\n\tAce of clubs\tIron golem" +
                    "\n\tKing of clubs\tBandit captain and three bandits" +
                    "\n\tQueen of clubs\tErinyes" +
                    "\n\tJack of clubs\tBerserker" +
                    "\n\tTen of clubs\tHill giant" +
                    "\n\tNine of clubs\tOgre" +
                    "\n\tEight of clubs\tOrc" +
                    "\n\tTwo of clubs\tKobold" +
                    "\n\tJokers (2)\tYou (the deck's owner)"
        ),
        "eversmoking bottle" to MagicItem(
            name = "Eversmoking Bottle",
            description = "\n\tSmoke leaks from the lead-stoppered mouth of this brass bottle, " +
                    "which weighs 1 pound. When you use an action to remove the stopper, a cloud " +
                    "of thick smoke pours out in a 60-foot radius from the bottle. The cloud's " +
                    "area is heavily obscured. Each minute the bottle remains open and within the " +
                    "cloud, the radius increases by 10 feet until it reaches its maximum " +
                    "radius of 120 feet." +
                    "\n\tThe cloud persists as long as the bottle is open. Closing the bottle " +
                    "requires you to speak its command word as an action. Once the bottle is " +
                    "closed, the cloud disperses after 10 minutes. A moderate wind (11 to 20 " +
                    "miles per hour) can also disperse the smoke after 1 minute, and a strong " +
                    "wind (21 or more miles per hour) can do so after 1 round."
        ),
        "eyes of charming" to MagicItem(
            name = "Eyes of Charming",
            description = "\n\tThese crystal lenses fit over the eyes. They have 3 charges. " +
                    "While wearing them, you can expend 1 charge as an action to cast the " +
                    "charm person spell (save DC 13) on a humanoid within 30 feet of you, " +
                    "provided that you and the target can see each other. The lenses regain " +
                    "all expended charges daily at dawn."
        ),
        "eyes of the eagle" to MagicItem(
            name = "Eyes of the Eagle",
            description = "\n\tThese crystal lenses fit over the eyes. While wearing them, you " +
                    "have advantage on Wisdom (Perception) checks that rely on sight. In " +
                    "conditions of clear visibility, you can make out details of even extremely " +
                    "distant creatures and objects as small as 2 feet across."
        ),
        "figurine of wondrous power (silver raven)" to MagicItem(
            name = "Figurine of Wondrous Power (Silver Raven)",
            description = "\n\tA figurine of wondrous power is a statuette of a beast small " +
                    "enough to fit in a pocket. If you use an action to speak the command word " +
                    "and throw the figurine to a point on the ground within 60 feet of you, the " +
                    "figurine becomes a living creature. If the space where the creature would " +
                    "appear is occupied by other creatures or objects, or if there isn't enough " +
                    "space for the creature, the figurine doesn't become a creature." +
                    "\n\tThe creature is friendly to you and your companions. It understands your " +
                    "languages and obeys your spoken commands. If you issue no commands, the " +
                    "creature defends itself but takes no other actions." +
                    "\n\tThe creature exists for a duration specific to each figurine. At the end " +
                    "of the duration, the creature reverts to its figurine form. It reverts to a " +
                    "figurine early if it drops to 0 hit points or if you use an action to speak " +
                    "the command word again while touching it. When the creature becomes a " +
                    "figurine again, its property can't be used again until a certain amount of " +
                    "time has passed, as specified in the figurine's description." +
                    "\n\tSilver Raven. This silver statuette of a raven can become a raven for " +
                    "up to 12 hours. Once it has been used, it can't be used again until 2 days " +
                    "have passed. While in raven form, the figurine allows you to cast the " +
                    "animal messenger spell on it at will."
        ),
        "gem of brightness" to MagicItem(
            name = "Gem of Brightness",
            description = "\n\tThis prism has 50 charges. While you are holding it, you can " +
                    "use an action to speak one of three command words to cause one of the " +
                    "following effects:" +
                    "\n\tThe first command word causes the gem to shed bright light in a 30-foot " +
                    "radius and dim light for an additional 30 feet. This effect doesn't expend " +
                    "a charge. It lasts until you use a bonus action to repeat the command word " +
                    "or until you use another function of the gem." +
                    "\n\tThe second command word expends 1 charge and causes the gem to fire a " +
                    "brilliant beam of light at one creature you can see within 60 feet of you. " +
                    "The creature must succeed on a DC 15 Constitution saving throw or become " +
                    "blinded for 1 minute. The creature can repeat the saving throw at the end " +
                    "of each of its turns, ending the effect on itself on a success." +
                    "\n\tThe third command word expends 5 charges and causes the gem to flare " +
                    "with blinding light in a 30- foot cone originating from it. Each creature " +
                    "in the cone must make a saving throw as if struck by the beam created " +
                    "with the second command word." +
                    "\n\tWhen all of the gem's charges are expended, the gem becomes a " +
                    "nonmagical jewel worth 50 gp."
        ),
        /**
         * target for auto roll
         */
        "gloves of missile snaring" to MagicItem(
            name = "Gloves of Missile Snaring",
            description = "\n\tThese gloves seem to almost meld into your hands when you don " +
                    "them. When a ranged weapon attack hits you while you're wearing them, you " +
                    "can use your reaction to reduce the damage by 1d10 + your Dexterity " +
                    "modifier, provided that you have a free hand. If you reduce the damage to " +
                    "0, you can catch the missile if it is small enough for you to hold in that hand."
        ),
        "gloves of swimming and climbing" to MagicItem(
            name = "Gloves of Swimming and Climbing",
            description = "\n\tWhile wearing these gloves, climbing and swimming don't cost " +
                    "you extra movement, and you gain a +5 bonus to Strength (Athletics) " +
                    "checks made to climb or swim."
        ),
        "gloves of thievery" to MagicItem(
            name = "Gloves of Thievery",
            description = "\n\tThese gloves are invisible while worn. While wearing them, you " +
                    "gain a +5 bonus to Dexterity (Sleight of Hand) checks and Dexterity checks " +
                    "made to pick locks."
        ),
        "headband of intellect" to MagicItem(
            name = "Headband of Intellect",
            description = "\n\tYour Intelligence score is 19 while you wear this headband. It " +
                    "has no effect on you if your Intelligence is 19 or higher without it."
        ),
        "helm of telepathy" to MagicItem(
            name = "Helm of Telepathy",
            description = "\n\tWhile wearing this helm, you can use an action to cast the " +
                    "detect thoughts spell (save DC 13) from it. As long as you maintain " +
                    "concentration on the spell, you can use a bonus action to send a telepathic " +
                    "message to a creature you are focused on. It can reply--using a bonus " +
                    "action to do so--while your focus on it continues." +
                    "\n\tWhile focusing on a creature with detect thoughts, you can use an " +
                    "action to cast the suggestion spell (save DC 13) from the helm on that " +
                    "creature. Once used, the suggestion property can't be used again until " +
                    "the next dawn."
        ),
        /**
         * target for auto rolls
         */
        "doss lute" to MagicItem(
            name = "Doss Lute",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, " +
                    "superior to an ordinary instrument in every way. Seven types of these " +
                    "instruments exist, each named after a legendary bard college. A creature " +
                    "that attempts to play the instrument without being attuned to it must " +
                    "succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its " +
                    "spells: Fly, Invisibility, Levitate, Protection from Evil and Good, " +
                    "Animal Friendship, Protection from Energy (fire only), Protection from " +
                    "Poison. Once the instrument has been used to cast a spell, it can’t be " +
                    "used to cast that spell again until the next dawn. The spells use your " +
                    "spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of " +
                    "its targets to be charmed on a failed saving throw, thereby imposing " +
                    "disadvantage on the save. This effect applies only if the spell has a " +
                    "somatic or a material component."
        ),
        /**
         * target for auto rolls
         */
        "fochlucan bandore" to MagicItem(
            name = "Fochlucan Bandore",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, " +
                    "superior to an ordinary instrument in every way. Seven types of these " +
                    "instruments exist, each named after a legendary bard college. A creature " +
                    "that attempts to play the instrument without being attuned to it must " +
                    "succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its " +
                    "spells: Fly, Invisibility, Levitate, Protection from Evil and Good, " +
                    "Entangle, Faerie Fire, Shillelagh, Speak with Animals. Once the instrument " +
                    "has been used to cast a spell, it can’t be used to cast that spell again " +
                    "until the next dawn. The spells use your spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any of " +
                    "its targets to be charmed on a failed saving throw, thereby imposing " +
                    "disadvantage on the save. This effect applies only if the spell has a " +
                    "somatic or a material component."
        ),
        /**
         * target for auto rolls
         */
        "mac-fuirmidh cittern" to MagicItem(
            name = "Mac-Fuirmidh Cittern",
            description = "\n\tAn instrument of the bards is an exquisite example of its kind, " +
                    "superior to an ordinary instrument in every way. Seven types of these " +
                    "instruments exist, each named after a legendary bard college. A creature " +
                    "that attempts to play the instrument without being attuned to it must " +
                    "succeed on a DC 15 Wisdom saving throw or take 2d4 psychic damage." +
                    "\n\tYou can use an action to play the instrument and cast one of its " +
                    "spells: Fly, Invisibility, Levitate, Protection from Evil and Good, " +
                    "Barkskin, Cure Wounds, Fog Cloud. Once the instrument has been used to " +
                    "cast a spell, it can’t be used to cast that spell again until the next " +
                    "dawn. The spells use your spellcasting ability and spell save DC." +
                    "\n\tYou can play the instrument while casting a spell that causes any " +
                    "of its targets to be charmed on a failed saving throw, thereby imposing " +
                    "disadvantage on the save. This effect applies only if the spell has a " +
                    "somatic or a material component."
        ),
        /**
         * target for auto rolls
         */
        "medallion of thoughts" to MagicItem(
            name = "Medallion of Thoughts",
            description = "\n\tThe medallion has 3 charges. While wearing it, you can use an " +
                    "action and expend 1 charge to cast the detect thoughts spell (save DC 13) " +
                    "from it. The medallion regains 1d3 expended charges daily at dawn."
        ),
        "necklace of adaptation" to MagicItem(
            name = "Necklace of Adaptation",
            description = "\n\tWhile wearing this necklace, you can breathe normally in any " +
                    "environment, and you have advantage on saving throws made against harmful " +
                    "gases and vapors (such as cloudkill and stinking cloud effects, inhaled " +
                    "poisons, and the breath weapons of some dragons)."
        ),
        "periapt of wound closure" to MagicItem(
            name = "Periapt of Wound Closure",
            description = "\n\tWhile you wear this pendant, you stabilize whenever you are " +
                    "dying at the start of your turn. In addition, whenever you roll a Hit Die " +
                    "to regain hit points, double the number of hit points it restores."
        ),
        /**
         * target for auto rolls
         */
        "pipes of haunting" to MagicItem(
            name = "Pipes of Haunting",
            description = "\n\tYou must be proficient with wind instruments to use these pipes. " +
                    "They have 3 charges. You can use an action to play them and expend 1 charge " +
                    "to create an eerie, spellbinding tune. Each creature within 30 feet of you " +
                    "that hears you play must succeed on a DC 15 Wisdom saving throw or become " +
                    "frightened of you for 1 minute. If you wish, all creatures in the area " +
                    "that aren't hostile toward you automatically succeed on the saving throw. " +
                    "A creature that fails the saving throw can repeat it at the end of each of " +
                    "its turns, ending the effect on itself on a success. A creature that " +
                    "succeeds on its saving throw is immune to the effect of these pipes for 24 " +
                    "hours. The pipes regain 1d3 expended charges daily at dawn."
        ),
        /**
         * target for auto rolls
         */
        "pipes of the sewers" to MagicItem(
            name = "Pipes of the Sewers",
            description = "\n\tYou must be proficient with wind instruments to use these pipes. " +
                    "While you are attuned to the pipes, ordinary rats and giant rats are " +
                    "indifferent toward you and will not attack you unless you threaten or " +
                    "harm them." +
                    "\n\tThe pipes have 3 charges. If you play the pipes as an action, you can " +
                    "use a bonus action to expend 1 to 3 charges, calling forth one swarm of " +
                    "rats with each expended charge, provided that enough rats are within half " +
                    "a mile of you to be called in this fashion (as determined by the GM). If " +
                    "there aren't enough rats to form a swarm, the charge is wasted. Called " +
                    "swarms move toward the music by the shortest available route but aren't " +
                    "under your control otherwise. The pipes regain 1d3 expended charges daily " +
                    "at dawn." +
                    "\n\tWhenever a swarm of rats that isn't under another creature's control " +
                    "comes within 30 feet of you while you are playing the pipes, you can make " +
                    "a Charisma check contested by the swarm's Wisdom check. If you lose the " +
                    "contest, the swarm behaves as it normally would and can't be swayed by " +
                    "the pipes' music for the next 24 hours. If you win the contest, the swarm " +
                    "is swayed by the pipes' music and becomes friendly to you and your " +
                    "companions for as long as you continue to play the pipes each round as " +
                    "an action. A friendly swarm obeys your commands. If you issue no commands " +
                    "to a friendly swarm, it defends itself but otherwise takes no actions. If " +
                    "a friendly swarm starts its turn and can't hear the pipes' music, your " +
                    "control over that swarm ends, and the swarm behaves as it normally would " +
                    "and can't be swayed by the pipes' music for the next 24 hours."
        ),
        "ring of jumping" to MagicItem(
            name = "Ring of Jumping",
            description = "\n\tWhile wearing this ring, you can cast the jump spell from it as a " +
                    "bonus action at will, but can target only yourself when you do so."
        ),
        "ring of mind shielding" to MagicItem(
            name = "Ring of Mind Shielding",
            description = "\n\tWhile wearing this ring, you are immune to magic that allows " +
                    "other creatures to read your thoughts, determine whether you are lying, " +
                    "know your alignment, or know your creature type. Creatures can " +
                    "telepathically communicate with you only if you allow it." +
                    "\n\tYou can use an action to cause the ring to become invisible until you " +
                    "use another action to make it visible, until you remove the ring, or " +
                    "until you die." +
                    "\n\tIf you die while wearing the ring, your soul enters it, unless it " +
                    "already houses a soul. You can remain in the ring or depart for the " +
                    "afterlife. As long as your soul is in the ring, you can telepathically " +
                    "communicate with any creature wearing it. A wearer can't prevent this " +
                    "telepathic communication."
        ),
        "ring of warmth" to MagicItem(
            name = "Ring of Warmth",
            description = "\n\tWhile wearing this ring, you have resistance to cold damage. " +
                    "In addition, you and everything you wear and carry are unharmed by " +
                    "temperatures as low as −50 degrees Fahrenheit."
        ),
        "ring of water walking" to MagicItem(
            name = "Ring of Water Walking",
            description = "\n\tWhile wearing this ring, you can stand on and move across " +
                    "any liquid surface as if it were solid ground."
        ),
        "quiver of ehlonna" to MagicItem(
            name = "Quiver of Ehlonna",
            description = "\n\tEach of the quiver's three compartments connects to an " +
                    "extradimensional space that allows the quiver to hold numerous items " +
                    "while never weighing more than 2 pounds. The shortest compartment can " +
                    "hold up to sixty arrows, bolts, or similar objects. The midsize " +
                    "compartment holds up to eighteen javelins or similar objects. The longest " +
                    "compartment holds up to six long objects, such as bows, quarterstaffs, " +
                    "or spears." +
                    "\n\tYou can draw any item the quiver contains as if doing so from a " +
                    "regular quiver or scabbard."
        ),
        "stone of good luck (luckstone)" to MagicItem(
            name = "Stone of Good Luck (Luckstone)",
            description = "\n\tWhile this polished agate is on your person, you gain a +1 bonus " +
                    "to ability checks and saving throws."
        ),
        /**
         * target for auto roll
         */
        "wind fan" to MagicItem(
            name = "Wind Fan",
            description = "\n\tWhile holding this fan, you can use an action to cast the gust " +
                    "of wind spell (save DC 13) from it. Once used, the fan shouldn't be used " +
                    "again until the next dawn. Each time it is used again before then, it has " +
                    "a cumulative 20 percent chance of not working and tearing into useless, " +
                    "nonmagical tatters."
        ),
        "winged boots" to MagicItem(
            name = "Winged Boots",
            description = "\n\tWhile you wear these boots, you have a flying speed equal to " +
                    "your walking speed. You can use the boots to fly for up to 4 hours, all " +
                    "at once or in several shorter flights, each one using a minimum of 1 minute " +
                    "from the duration. If you are flying when the duration expires, you descend " +
                    "at a rate of 30 feet per round until you land." +
                    "\n\tThe boots regain 2 hours of flying capability for every 12 hours " +
                    "they aren't in use."
        )
    )
}