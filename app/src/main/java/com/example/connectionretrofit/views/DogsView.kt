package com.example.connectionretrofit.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.connectionretrofit.viewmodels.DogViewModel

@Preview(showBackground = true)
@Composable
fun DogsView(dogViewModel: DogViewModel = DogViewModel()){
    var image = dogViewModel.urlImage

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = "${image}",
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

        
        Button(modifier = Modifier.fillMaxWidth(), onClick = {
        dogViewModel.fetchData() }) {
            Text(text = "Cambiar imagen")
        }
    }
}