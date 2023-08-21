package www.uzmd.xo

interface Game {
fun win_x(list:ArrayList<Int>):Boolean
fun win_o(list:ArrayList<Int>):Boolean
fun draw(list1:ArrayList<Int>,list2:ArrayList<Int>):Boolean
fun restart(list1:ArrayList<Int>,list2:ArrayList<Int>)

}