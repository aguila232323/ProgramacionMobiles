package dam.moviles.deberes3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import dam.moviles.deberes3.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var mochila: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        incializarMochila()
        inicializarViewModel()
        Color()
    }
    private fun inicializarViewModel(){
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

    }

    private fun incializarMochila() {
        mochila = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mochila.root)
    }
    private fun Color(){
        val nombresColores = arrayOf(
            "rojo",
            "verde",
            "azul",
            "amarillo",
            "naranja"
        )
        val coloresArray = arrayOf(
            ContextCompat.getColor(this, R.color.rojo),
            ContextCompat.getColor(this, R.color.verde),
            ContextCompat.getColor(this, R.color.azul),
            ContextCompat.getColor(this, R.color.amarillo),
            ContextCompat.getColor(this, R.color.naranja)
        )


        mochila.Fondo.setBackgroundColor(coloresArray.get(viewModel.numeroAleatorio))
        mochila.Texto.setText(nombresColores.get(viewModel.numeroAleatorio))

    }


}



