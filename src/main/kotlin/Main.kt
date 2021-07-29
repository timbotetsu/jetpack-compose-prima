import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication


@OptIn(ExperimentalComposeUiApi::class)
fun main() = singleWindowApplication(
    title = "Compose Desktop App",
    state = WindowState(size = WindowSize(1024.dp, 768.dp))
) {

    val darkTheme by remember { mutableStateOf(false) }

    MaterialTheme(
        colors = if (darkTheme) darkColors() else lightColors(),
        typography = typography
    ) {
        PrimaApp()
    }

}

@Composable
private fun PrimaApp() {
    Row(modifier = Modifier
        .background(color = MaterialTheme.colors.surface)
        .fillMaxSize()
    ) {
        // TODO:
    }
}