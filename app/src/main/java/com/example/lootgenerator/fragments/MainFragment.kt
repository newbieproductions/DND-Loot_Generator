package com.example.lootgenerator.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.dndlootgenerator.tables.hoardTable
import com.example.dndlootgenerator.tables.individualTable
import com.example.dndlootgenerator.tables.magicDescription
import com.example.dndlootgenerator.tables.magicName
import com.example.lootgenerator.data.*

@Preview
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
    val chalRatings = listOf<String>("CR 0-4", "CR 5-10", "CR 11-16", "CR 17+")
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
                    .onGloballyPositioned { coordinates -> textFieldSize = coordinates.size.toSize() },
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

        Row {

            OutlinedTextField(
                value = numOfMonsters,
                onValueChange = {numOfMonsters = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .onGloballyPositioned { coordinates -> textFieldSize = coordinates.size.toSize() }
                    .padding(top = 10.dp),
                label = { Text("# of Monsters") }
            )
        }

        /**
         * Loot Buttons
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
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
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
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text(text = "Hoard Loot", color = Color.White)
            }
        }

        /**
         * Currency, Gems, & Art Cards
         */
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            /**
             * Currency
             */
            Box(
                modifier = Modifier.weight(1f)
                    .padding(all = 10.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.LightGray)
                    .height(height = 156.dp)
            ) {
                Column(verticalArrangement = Arrangement.SpaceEvenly) {
                    /**
                     * Currency Header
                     */
                    Text(
                        text = "Currency:", color = Color.White,
                        modifier = Modifier.background(Color.Black)
                            .fillMaxWidth()
                            .padding(start = 10.dp)
                            .padding(top = 5.dp)
                            .padding(bottom = 5.dp)
                            .weight(1f)
                    )
                    /**
                     * Currency Content
                     */
                    Text(
                        text = "CP: $copperResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "SP: $silverResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "EP: $electrumResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "GP: $goldResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "PP: $platinumResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 5.dp).weight(1f)
                    )
                }
            }

            /**
             * Gems
             */
            Box(
                modifier = Modifier.weight(1f)
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.LightGray)
            ) {
                Column {
                    /**
                     * Gems Header
                     */
                    Text(
                        text = "Gems:", color = Color.White,
                        modifier = Modifier.background(Color.Black)
                            .fillMaxWidth()
                            .padding(start = 10.dp)
                            .padding(top = 5.dp)
                            .padding(bottom = 5.dp)
                    )
                    /**
                     * Gems Content
                     */
                    Text(
                        text = "10 GP: $tenGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp)
                    )
                    Text(
                        text = "50 GP: $fiftyGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp)
                    )
                    Text(
                        text = "100 GP: $oneHundredGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp)
                    )
                    Text(
                        text = "500 GP: $fiveHundredGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp)
                    )
                    Text(
                        text = "1000 GP: $thousandGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp)
                    )
                    Text(
                        text = "5000 GP: $fiveThousandGemsResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 5.dp)
                    )
                }
            }
            /**
             * Art
             */
            Box(
                modifier = Modifier.weight(1f)
                    .padding(all = 10.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.LightGray)
                    .height(height = 156.dp)
            ) {
                Column(verticalArrangement = Arrangement.SpaceEvenly) {
                    /**
                     * Art Header
                     */
                    Text(
                        text = "Art:", color = Color.White,
                        modifier = Modifier.background(Color.Black)
                            .fillMaxWidth()
                            .padding(start = 10.dp)
                            .padding(top = 5.dp)
                            .padding(bottom = 5.dp)
                            .weight(1f)
                    )
                    /**
                     * Art Content
                     * */
                    Text(
                        text = "25 GP: $twentyFiveArtResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "250 GP: $twoFiftyArtResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "750 GP: $sevenFiftyArtResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "2500 GP: $twentyFiveHundredArtResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 2.dp).weight(1f)
                    )
                    Text(
                        text = "7500 GP: $seventyFiveHundredArtResult", modifier = Modifier.padding(start = 10.dp)
                            .padding(top = 2.dp).padding(bottom = 5.dp).weight(1f)
                    )
                }
            }
        }

        /**
         * Magical Items
         */
        Box(
            modifier = Modifier.padding(all = 10.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.LightGray)
        ) {

            Column {
                Text(
                    text = "Magic Items:",
                    color = Color.White,
                    modifier = Modifier.background(Color.Black)
                        .fillMaxWidth()
                        .padding(start = 10.dp)
                        .padding(top = 5.dp)
                        .padding(bottom = 5.dp)
                )

                if (nameList.isEmpty()) {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "No magic items!",
                        modifier = Modifier.padding(10.dp).fillMaxWidth(),
                        fontWeight = FontWeight.Bold
                    )
                } else {
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