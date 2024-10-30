package dam.moviles.deberes3

import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel: ViewModel() {

    var numeroAleatorio = Random.nextInt(0,5)
}