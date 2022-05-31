package com.example.lootgenerator.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.lootgenerator.data.*
import com.example.lootgenerator.tables.hoardTable
import com.example.lootgenerator.tables.individualTable
import com.example.lootgenerator.tables.magicDescription
import com.example.lootgenerator.tables.magicName

@Composable
fun LootResults() {

    var copperResult by remember { mutableStateOf(0) }
    var silverResult by remember { mutableStateOf(0) }
    var goldResult by remember { mutableStateOf(0) }
    var electrumResult by remember { mutableStateOf(0) }
    var platinumResult by remember { mutableStateOf(0) }
    var tenGemsResult by remember { mutableStateOf(0) }
    var fiftyGemsResult by remember { mutableStateOf(0) }
    var oneHundredGemsResult by remember { mutableStateOf(0) }
    var fiveHundredGemsResult by remember { mutableStateOf(0) }
    var thousandGemsResult by remember { mutableStateOf(0) }
    var fiveThousandGemsResult by remember { mutableStateOf(0) }
    var twentyFiveArtResult by remember { mutableStateOf(0) }
    var twoFiftyArtResult by remember { mutableStateOf(0) }
    var sevenFiftyArtResult by remember { mutableStateOf(0) }
    var twentyFiveHundredArtResult by remember { mutableStateOf(0) }
    var seventyFiveHundredArtResult by remember { mutableStateOf(0) }
    var nameList: List<String> = magicName
    var descriptionList: List<String> = magicDescription
    var challengeRating by remember { mutableStateOf(0) }
    var expanded by remember { mutableStateOf(false) }
    var textFieldSize by remember { mutableStateOf(Size.Zero)}
    val icon = if (expanded) {Icons.Filled.KeyboardArrowUp} else {Icons.Filled.KeyboardArrowDown}
    val chalRatings = listOf("CR 0-4", "CR 5-10", "CR 11-16", "CR 17+")
    var numOfMonsters by remember { mutableStateOf("1") }
    var selectedText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(all = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /**
         * Dropdown menu for CR.
         */
        Row {
            
            OutlinedTextField(
                value = selectedText, 
                onValueChange = {selectedText = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { coordinates ->
                        textFieldSize = coordinates.size.toSize()
                    },
                label = { Text("Challenge Rating") },
                trailingIcon = { Icon(icon, "Challenge Rating",
                modifier = Modifier.clickable { expanded = !expanded }) }
            )

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {expanded = false},
                modifier = Modifier.
                        width(with(LocalDensity.current){textFieldSize.width.toDp()})
            ) {
                chalRatings.forEach { label ->
                    DropdownMenuItem(onClick = {
                        selectedText = label
                        expanded = false
                        if (selectedText == chalRatings[0]) {challengeRating = 0}
                        if (selectedText == chalRatings[1]) {challengeRating = 5}
                        if (selectedText == chalRatings[2]) {challengeRating = 11}
                        if (selectedText == chalRatings[3]) {challengeRating = 17}
                    }) {
                        Text(text = label)
                    }
                }
            }
        }
        /**
         * Outlined texfield for # of monsters
         */
        Row {
            OutlinedTextField(
                value = numOfMonsters,
                onValueChange = {numOfMonsters = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { coordinates ->
                        textFieldSize = coordinates.size.toSize()
                    }
                    .padding(top = 10.dp),
                label = { Text("# of Monsters") }
            )
        }

        /**
         * Individual & Hoard Loot Buttons
         */
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            /**
             * Individual Loot Button
             */
            Button(
                onClick = {
                    magicName.clear()
                    magicDescription.clear()
                    individualTable(numOfMonsters.toInt(), challengeRating)
                    copperResult = copper
                    silverResult = silver
                    electrumResult = electrum
                    goldResult = gold
                    platinumResult = platinum
                    resetCurrency()
                },
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(text = "Individual Loot", color = Color.White)
            }

            /**
             * Hoard Loot Button
             */
            Button(
                onClick = {
                    magicName.clear()
                    magicDescription.clear()
                    hoardTable(challengeRating)
                    copperResult = copper
                    silverResult = silver
                    electrumResult = electrum
                    goldResult = gold
                    platinumResult = platinum
                    tenGemsResult = tenGems
                    fiftyGemsResult = fiftyGems
                    oneHundredGemsResult = oneHundredGems
                    fiveHundredGemsResult = fiveHundredGems
                    thousandGemsResult = thousandGems
                    fiveThousandGemsResult = fiveThousandGems
                    twentyFiveArtResult = twentyFiveArt
                    twoFiftyArtResult - twoFiftyArt
                    sevenFiftyArtResult = sevenFiftyArt
                    twentyFiveHundredArtResult = twentyFiveHundredArt
                    seventyFiveHundredArtResult = seventyFiveHundredArt
                    nameList = magicName
                    descriptionList = magicDescription
                    resetCurrency()
                },
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(text = "Hoard Loot", color = Color.White)
            }
        }

        /**
         * Magical Item Box
         */
        Box(
            modifier = Modifier
                .padding(all = 10.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.LightGray)
        ) {
            Column {
                Text(
                    text = "Total Loot:",
                    color = Color.White,
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 2.dp)
                        .padding(bottom = 2.dp)
                )

                DisplayCurrency(copperResult, silverResult, goldResult,
                    electrumResult, platinumResult)

                DisplayGems(tenGemsResult, fiftyGemsResult, oneHundredGemsResult,
                    fiveHundredGemsResult, thousandGemsResult, fiveThousandGemsResult)

                DisplayArt(twentyFiveArtResult, twoFiftyArtResult, sevenFiftyArtResult,
                    twentyFiveHundredArtResult, seventyFiveHundredArtResult)

                if (nameList.isEmpty()) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "No magic items!",
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        fontWeight = FontWeight.Bold
                    )
                } else {
                    SelectionContainer() {
                        LazyColumn(modifier = Modifier.weight(1f, fill = false)) {
                            items(nameList.size) {
                                Text(
                                    text = "${nameList[it]}",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 24.sp,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 10.dp)
                                )
                                Text(
                                    text = "${descriptionList[it]}",
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 10.dp)
                                        .weight(1f, fill = false)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DisplayCurrency (copper: Int,
                     silver:Int,
                     gold:Int,
                     electrum:Int,
                     platinum:Int) {

    var currencyResult = ""

    Column() {
        Row(modifier = Modifier.padding(bottom = 5.dp)) {
            Text(
                text = "Currency:",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
                    .padding(bottom = 2.dp)
                    .weight(1f)
            )

            if (copper != 0) {
                currencyResult += "$copper CP, "
            }

            if (silver != 0) {
                currencyResult += "$silver SP, "
            }

            if (electrum != 0) {
                currencyResult += "$electrum EP, "
            }

            if (gold != 0) {
                currencyResult += "$gold GP, "
            }

            if (platinum != 0) {
                currencyResult += "$platinum PP, "
            }

            Text(text = currencyResult.dropLast(2),
                modifier = Modifier.padding(end = 10.dp))
        }
    }
}

@Composable
fun DisplayGems (tenGems: Int,
                 fiftyGems: Int,
                 oneHundredGems:Int,
                 fiveHundredGems:Int,
                 thousandGems:Int,
                 fiveThousandGems:Int) {

    var gemsResult = ""

    Column() {
        Row(modifier = Modifier.padding(bottom = 5.dp)) {
            Text(
                text = "Gems:",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
                    .padding(bottom = 2.dp)
                    .weight(1f)
            )

            if (tenGems != 0) {
                gemsResult += "${tenGems}x 10 GP gems"
            }

            if (fiftyGems != 0) {
                gemsResult += "${fiftyGems}x 50 GP gems"
            }

            if (oneHundredGems != 0) {
                gemsResult += "${oneHundredGems}x 100 GP gems"
            }

            if (fiveHundredGems != 0) {
                gemsResult += "${fiveHundredGems}x 500 GP gems"
            }

            if (thousandGems != 0) {
                gemsResult += "${thousandGems}x 1000 GP gems"
            }

            if (fiveThousandGems != 0) {
                gemsResult += "${fiveThousandGems}x 5000 GP gems"
            }

            Text(text = gemsResult,
                modifier = Modifier.padding(end = 10.dp))
        }
    }
}

@Composable
fun DisplayArt (twentyFiveArt: Int,
                twoFiftyArt: Int,
                sevenFiftyArt: Int,
                twentyFiveHundredArt: Int,
                seventyFiveHundredArt: Int) {

    var artResult = ""

    Column() {
        Row(modifier = Modifier.padding(bottom = 5.dp)) {
            Text(
                text = "Art:",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
                    .padding(bottom = 2.dp)
                    .weight(1f)
            )

            if (twentyFiveArt != 0) {
                artResult += "${twentyFiveArt}x 25 GP art"
            }

            if (twoFiftyArt != 0) {
                artResult += "${twoFiftyArt}x 250 GP art"
            }

            if (sevenFiftyArt != 0) {
                artResult += "${sevenFiftyArt}x 750 GP art"
            }

            if (twentyFiveHundredArt != 0) {
                artResult += "${twentyFiveHundredArt}x 2500 GP art"
            }

            if (seventyFiveHundredArt != 0) {
                artResult += "${seventyFiveHundredArt}x 7500 GP art"
            }

            Text(text = artResult,
                modifier = Modifier.padding(end = 10.dp))
        }
    }
}