# 5E-loot-table-generator

Things used within the program:

- if statements
- when conditions
- ranges for when conditions using "in .. "
- while conditions
- importing random() library for dice rolls.
- map of
- objects
- data class
- .size on the name and description mutable lists in hoard table.
- using Scanner to get user input
- mutable lists to store magic items and their descriptions
- compose for desktop
- boxs, columns, and rows for designing ui elements (in compose)
- modifying ui elements, colors, shapes, padding, weights, etc....
- taking a mutable list of strings and making it usable within a composable. 
- taking user input in the form of keyboard input and through a dropdown menu. 

Resources used:

- https://kotlinlang.org/docs/control-flow.html#when-expression
- https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/
- https://developer.android.com/codelabs/basic-android-kotlin-training-project-lunch-tray?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-project-lunch-tray#4 (used to referance the model for magic items)
- https://kotlinlang.org/docs/collections-overview.html#collection-types
- https://www.dndbeyond.com/sources/dmg/treasure#RandomTreasure
- https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/
- https://www.programiz.com/kotlin-programming/input-output
-   https://www.tutorialkart.com/android-jetpack-compose/row-horizontal-arrangement-center/
-   https://developer.android.com/jetpack/compose/tutorial?authuser=1
-   https://developer.android.com/jetpack/compose/documentation?authuser=1
-   https://www.youtube.com/watch?v=qvDo0SKR8-k
-   https://www.geeksforgeeks.org/button-in-android-using-jetpack-compose/
-   https://www.geeksforgeeks.org/pass-an-on-click-event-to-a-function-in-android-jetpack-compose/
-   https://joebirch.co/android/exporing-jetpack-compose-padding-modifier/
-   https://stackoverflow.com/questions/68882402/how-to-change-text-value-when-a-button-is-clicked-in-jetpack-compose
-   https://developer.android.com/jetpack/compose/state?authuser=1#state-in-composables
-   https://www.android--code.com/2021/03/jetpack-compose-rounded-corner-shape.html
-   https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary?authuser=1#Box(androidx.compose.ui.Modifier,androidx.compose.ui.Alignment,kotlin.Boolean,kotlin.Function1)
-   https://joebirch.co/android/exploring-jetpack-compose-column/
-   https://www.jetpackcompose.net/jetpack-compose-modifiers
-   https://developer.android.com/jetpack/compose/text?authuser=1
-   https://developer.android.com/jetpack/compose/state
-   https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary?authuser=1#LazyColumn(androidx.compose.ui.Modifier,androidx.compose.foundation.lazy.LazyListState,androidx.compose.foundation.layout.PaddingValues,kotlin.Boolean,androidx.compose.foundation.layout.Arrangement.Vertical,androidx.compose.ui.Alignment.Horizontal,androidx.compose.foundation.gestures.FlingBehavior,kotlin.Boolean,kotlin.Function1)
-   https://developer.android.com/jetpack/compose/lists?authuser=1
-   https://mahendranv.github.io/posts/compose-dropdown/
-   https://www.geeksforgeeks.org/drop-down-menu-in-android-using-jetpack-compose/
-   https://www.youtube.com/watch?v=O_MmOP5fjUg

TO DO:

- Make a setting that will auto roll magic item rolls if the user wants -> items marked in program.  
- Adjust magic item formatting -> 
- make function to export results to google sheets & excel.
- take "hoard while loops" that add the magic item names and descriptions and make it a general function.
- make a cantrip - 9th level spell lists.
- Make a copy button
- Figure out the bug where selecting text to copy from multiple rows

Updates:
- 5/31/22 -> Cleaned up the code to match the magic item descriptions in magic item table A & B. 
- 5/30/22 -> Made the magic results selectable so that the user can copy and paste the results. Made composable functions to display the currency, art, and gems. Removed the row for the currency, art, gems. adjusted button sizes. Fixed package names and import names on multiple files.
- 5/29/22 -> Setup Github Repository and learned how to commit and push code from android studio. 
- 5/27/22 -> Added a challenge rating dropdown menu to select the CR, consolidated individual and hoard loot buttons (multiple buttons aren't needed since CR is not in the dropdown menu). Added a # of Monsters text field for user input. 
- 5/26/22 -> added art object and gems lists. deleted menues file (forgot to do this when i started using compose for the ui). Cleaned up magic item list A. 
- 5/24/22 -> Made local versions of the desktop app for windows and mac. Learned a bit about intelliJ compiling and differences in mac vs windows compiling.
- 5/23/22 -> Make the rest of the program a bit more pretty. Try to compile program to a windows and mac app.
- 5/22/22 -> Created a display area for the magic items and made the box somewhat pretty.
- 5/21/22 -> broke up the currency, art, and gems parts into their own boxes. Modified and adapted the boxes to look somewhat pretty.
- 5/20/22 -> added to the work-in-progress branch. Learned more about compose for desktop (links in the resources). Made the hoard and individual buttons. Corrected hoard function where the mutable variables didn't reset.
- 5/18/22 -> added the Work-In-Progress branch. began learning the basics of compose for desktop to add ui elements. the goal is to have a working desktop mac and windows app available with the current individual and hoard looting tables.
- 5/17/22 -> Made currency file and moved the currency variables to it (from hoard and individual tables). Reorganized some of the hoard loot table. Made a menu file and added some basic menu functions with user input.
- 5/14/22 -> Corrected error occurring with cr 11-16 rolls. Output now correctly displays the whole list of names and descriptions.
- 5/13/22 -> Finished making magic item tables + added the tables to the hoard loot table.
- 5/12/22 -> Added magic tables through table G.
