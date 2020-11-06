package org.fhossyl.common

import androidx.compose.foundation.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*

@Composable
fun App() {
  var text by remember { mutableStateOf("Hello, World!") }

  MaterialTheme {
    Button(onClick = {
      text = "Hello, ${getPlatformName()}"
    }) {
      Text(text)
    }
  }
}
