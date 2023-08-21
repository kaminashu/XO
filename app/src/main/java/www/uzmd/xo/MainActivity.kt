package www.uzmd.xo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import www.uzmd.xo.databinding.ActivityMainBinding
import www.uzmd.xo.databinding.DrawDialogBinding
import www.uzmd.xo.databinding.WinDialogBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val gameLog = GameLog(this)
    val camO = ArrayList<Int>()
    val camX = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i = true



        binding.apply {
            res()
            imgBtn1.setOnClickListener {
                if (gameLog.bt1) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    if (i) {
                        imgBtn1.setImageResource(R.drawable.x)
                        i = false
                        camX.add(1)
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn1.setImageResource(R.drawable.o)
                        i = false
                        camO.add(1)
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt1 = true
                }
            }
            imgBtn2.setOnClickListener {
                if (gameLog.bt2) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    if (i) {
                        imgBtn2.setImageResource(R.drawable.x)
                        i = false
                        camX.add(2)
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn2.setImageResource(R.drawable.o)
                        i = true
                        camO.add(2)
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()

                    }
                    gameLog.bt2 = true
                }

            }
            imgBtn3.setOnClickListener {
                if (gameLog.bt3) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn3.setImageResource(R.drawable.x)
                        camX.add(3)
                        i = false
                        if (gameLog.win_x(camX)) res()  else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn3.setImageResource(R.drawable.o)
                        camO.add(3)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt3 = true
                }
            }
            imgBtn4.setOnClickListener {
                if (gameLog.bt4) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn4.setImageResource(R.drawable.x)
                        camX.add(4)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn4.setImageResource(R.drawable.o)
                        camO.add(4)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt4 = true
                }
            }
            imgBtn5.setOnClickListener {
                if (gameLog.bt5) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn5.setImageResource(R.drawable.x)
                        camX.add(5)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn5.setImageResource(R.drawable.o)
                        camO.add(5)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt5 = true
                }
            }

            imgBtn6.setOnClickListener {
                if (gameLog.bt6) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn6.setImageResource(R.drawable.x)
                        camX.add(6)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn6.setImageResource(R.drawable.o)
                        camO.add(6)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt6 = true
                }
            }


            imgBtn7.setOnClickListener {
                if (gameLog.bt7) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn7.setImageResource(R.drawable.x)
                        camX.add(7)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn7.setImageResource(R.drawable.o)
                        camO.add(7)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt7 = true
                }
            }

            imgBtn8.setOnClickListener {
                if (gameLog.bt8) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn8.setImageResource(R.drawable.x)
                        camX.add(8)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn8.setImageResource(R.drawable.o)
                        camO.add(8)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt8 = true
                }
            }


            imgBtn9.setOnClickListener {
                if (gameLog.bt9) {
                    Toast.makeText(
                        this@MainActivity,
                        "Boshqa katakcha tanlang !",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (i) {
                        imgBtn9.setImageResource(R.drawable.x)
                        camX.add(9)
                        i = false
                        if (gameLog.win_x(camX)) res() else if (gameLog.draw(camX,camO)) res()
                    } else {
                        imgBtn9.setImageResource(R.drawable.o)
                        camO.add(9)
                        i = true
                        if (gameLog.win_o(camO)) res() else if (gameLog.draw(camX,camO)) res()
                    }
                    gameLog.bt9 = true
                }
            }


        }

    }

    fun res() {
        gameLog.restart(camX, camO)
        //   Thread.sleep(1_000)
        binding.apply {
            imgBtn1.setImageResource(R.drawable.res)
            imgBtn2.setImageResource(R.drawable.res)
            imgBtn3.setImageResource(R.drawable.res)
            imgBtn4.setImageResource(R.drawable.res)
            imgBtn5.setImageResource(R.drawable.res)
            imgBtn6.setImageResource(R.drawable.res)
            imgBtn7.setImageResource(R.drawable.res)
            imgBtn8.setImageResource(R.drawable.res)
            imgBtn9.setImageResource(R.drawable.res)
        }
    }
}