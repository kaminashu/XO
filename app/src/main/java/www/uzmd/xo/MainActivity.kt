package www.uzmd.xo

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import www.uzmd.xo.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i: Boolean = true
        var bt1: Boolean = false
        var bt2: Boolean = false
        var bt3: Boolean = false
        var bt4: Boolean = false
        var bt5: Boolean = false
        var bt6: Boolean = false
        var bt7: Boolean = false
        var bt8: Boolean = false
        var bt9: Boolean = false
        var camO = ArrayList<Int>()
        var camX = ArrayList<Int>()
        binding.apply {
            imgBtn1.setOnClickListener {
                if (bt1) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    if (i) {
                        camX.add(1)
                        winX(camX)
                        imgBtn1.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(1)
                        winO(camO)
                        imgBtn1.setImageResource(R.drawable.o)

                        i = true
                    }
                    bt1 = true
                }
            }
            imgBtn2.setOnClickListener {
                if (bt2) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    if (i) {
                        camX.add(2)
                        winX(camX)
                        imgBtn2.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(2)
                        winO(camO)
                        imgBtn2.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt2 = true
                }

            }
            imgBtn3.setOnClickListener {
                if (bt3) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(3)
                        winX(camX)
                        imgBtn3.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(3)
                        winO(camO)
                        imgBtn3.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt3 = true
                }
            }
            imgBtn4.setOnClickListener {
                if (bt4) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(4)
                        winX(camX)
                        imgBtn4.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(4)
                        winO(camO)
                        imgBtn4.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt4 = true
                }
            }
            imgBtn5.setOnClickListener {
                if (bt5) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(5)
                        winX(camX)
                        imgBtn5.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(5)
                        winO(camO)
                        imgBtn5.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt5 = true
                }
            }

            imgBtn6.setOnClickListener {
                if (bt6) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(6)
                        winX(camX)
                        imgBtn6.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(6)
                        winO(camO)
                        imgBtn6.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt6 = true
                }
            }


            imgBtn7.setOnClickListener {
                if (bt7) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(7)
                        winX(camX)
                        imgBtn7.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(7)
                        winO(camO)
                        imgBtn7.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt7 = true
                }
            }

            imgBtn8.setOnClickListener {
                if (bt8) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(8)
                        winX(camX)
                        winO(camO)
                        imgBtn8.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(8)

                        imgBtn8.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt8 = true
                }
            }


            imgBtn9.setOnClickListener {
                if (bt9) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        camX.add(9)
                        winX(camX)
                        imgBtn9.setImageResource(R.drawable.x)
                        i = false
                    } else {
                        camO.add(9)
                        winO(camO)
                        imgBtn9.setImageResource(R.drawable.o)
                        i = true
                    }
                    bt9 = true
                }
            }


        }

    }
fun winX(list:ArrayList<Int>){
    Log.e(TAG, "winX: "+ list.size)
 //   Toast.makeText(this, "X golip", Toast.LENGTH_SHORT).show()
    if(list.size>2) {

        val gameWinX = GameWinX(list)
        if (gameWinX.xWin()) {
            Toast.makeText(this@MainActivity, "X golib", Toast.LENGTH_SHORT).show()
        }
    }
}
    fun winO(list:ArrayList<Int>){
        Log.e(TAG, "winX: "+ list.size)
        //   Toast.makeText(this, "X golip", Toast.LENGTH_SHORT).show()
        if(list.size>2) {

            val gameWinX = GameWinX(list)
            if (gameWinX.xWin()) {
                Toast.makeText(this@MainActivity, "O golib", Toast.LENGTH_SHORT).show()
            }
        }
    }
}