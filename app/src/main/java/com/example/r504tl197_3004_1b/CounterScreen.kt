package com.example.r504tl197_3004_1b

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


// constCounter on vakio arvo, joten sen arvoa ei voi muuttaa


// tätä sen sijaan voi, koska se on var


@Composable
fun CounterRoot(modifier: Modifier = Modifier) {
    val count = remember {

        mutableStateOf(0)
    }

    Counter(count = count.value, onClick = {
        count.value++
    })
}


// muutetaan niin, että counter on nyt mutableStateOf, joka saa arvokseen 0
// voi halutessasi käyttää mutableIntStateOf:ia myös tässä. Compose ymmärtää, että count on integer arvo
// mutableStateOfista on olemassa integereille oma overload (mutableIntStateOf())
@Composable
fun Counter(modifier: Modifier = Modifier, count: Int, onClick : () -> Unit) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center


    ) {
        Button(onClick = {
            // kun muuttujan arvo laitetaan mutableStateOfiin, sitä ei voi suoraan enää kasvattaa
            // vaan kasvatetaan sen valueta
            onClick()

        }) {
            Text("count: $count")
        }
    }
}

