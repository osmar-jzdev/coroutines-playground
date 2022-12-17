package dgtic.unam.juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dgtic.unam.juego.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Practical exameple using corrutines of a simple app with a counter
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* //1st way
        CoroutineScope(Dispatchers.Default).launch {
            var counter = 0
            while(true){
                delay(1000)
                withContext(Dispatchers.Main){
                    binding.textMain.text =  counter.toString()
                    counter++
                }
            }
        }*/

        //2nd Way
        /*GlobalScope.launch {
            var counter = 0
            while(true){
                delay(1000)
                withContext(Dispatchers.Main) {
                    binding.textMain.text =  counter.toString()
                    counter++
                }
            }
        }*/

        //3rd way
        Executors.newSingleThreadExecutor().execute{
            CoroutineScope(Dispatchers.Main).launch {
                var counter = 0
                while(true){
                    delay(1000)
                    runOnUiThread {
                        binding.textMain.text =  counter.toString()
                        counter++
                    }
                }
            }
        }
    }
}