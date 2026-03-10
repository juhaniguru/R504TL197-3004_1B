package com.example.r504tl197_3004_1b

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


// constCounter on vakio arvo, joten sen arvoa ei voi muuttaa
const val constCounter = 0

// tätä sen sijaan voi, koska se on var
private var count = 0


@Composable
fun Counter(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center


    ) {
        // tämä onClick-funktio kasvattaa napin klikillä
        // integerin arvoa ja logittaa konsoliin uuden arvon
        // tagilla juhanicounter
        Button(onClick = {
            count++
            Log.d("juhanicounter", "$count")
        }) {
            Text("count: $count")
        }
    }
}

