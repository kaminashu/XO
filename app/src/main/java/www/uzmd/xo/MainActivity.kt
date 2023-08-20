package www.uzmd.xo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.uzmd.xo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            imgBtn1.setOnClickListener {
                imgBtn1.setImageResource(R.drawable.x)
            }
        }
    }
}