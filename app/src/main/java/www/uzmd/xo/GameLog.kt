package www.uzmd.xo

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import www.uzmd.xo.databinding.ActivityMainBinding
import www.uzmd.xo.databinding.DrawDialogBinding
import www.uzmd.xo.databinding.WinDialogBinding

class GameLog(val context: Context) : Game {

    var bt1 = false
    var bt2 = false
    var bt3 = false
    var bt4 = false
    var bt5 = false
    var bt6 = false
    var bt7 = false
    var bt8 = false
    var bt9 = false
    override fun win_x(list: ArrayList<Int>): Boolean {
        if (list.size >= 3) {
            val game = GameWin(list).xWin()
            if (game) {
                val winDialogBinding =
                    WinDialogBinding.inflate(LayoutInflater.from(context), null, false)
                val dialog = AlertDialog.Builder(context).create()
                dialog.setView(winDialogBinding.root)
                winDialogBinding.textWinner.setText("Player X")
                dialog.show()
                winDialogBinding.restart.setOnClickListener {
                    dialog.dismiss()

                }
                return true
            }
            return false
        }
        return false
    }

    override fun win_o(list: ArrayList<Int>): Boolean {
        if (list.size >= 3) {
            val game = GameWin(list).xWin()
            if (game) {
                val winDialogBinding =
                    WinDialogBinding.inflate(LayoutInflater.from(context), null, false)
                val dialog = AlertDialog.Builder(context).create()
                dialog.setView(winDialogBinding.root)
                winDialogBinding.textWinner.setText("Player O")
                dialog.show()
                winDialogBinding.restart.setOnClickListener {
                    dialog.dismiss()
                }
                return true
            }
            return false
        }
        return false
    }

    override fun draw(list1: ArrayList<Int>, list2: ArrayList<Int>): Boolean {
        if ((list1.size + list2.size) == 9) {
            val drawDialogBinding =
                DrawDialogBinding.inflate(LayoutInflater.from(context), null, false)
            val dialog = AlertDialog.Builder(context).create()
            dialog.setView(drawDialogBinding.root)
            drawDialogBinding.textWinner.setText("Player O")
            dialog.show()
            drawDialogBinding.restart.setOnClickListener {
                dialog.dismiss()
            }
            return true
        }
        return false
    }

    override fun restart(list1: ArrayList<Int>, list2: ArrayList<Int>) {
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(context), null, false)

        list1.clear()
        list2.clear()
        bt1 = false
        bt2 = false
        bt3 = false
        bt4 = false
        bt5 = false
        bt6 = false
        bt7 = false
        bt8 = false
        bt9 = false
    }
}