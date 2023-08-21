package www.uzmd.xo

data class GameWin(var list: ArrayList<Int>) {
    var one_element = list.get(0)
    var two_element = list.get(1)
    var three_element = list.get(2)
    var ms = arrayOf(one_element, two_element, three_element)
    var four_element: Int = if (list.size >= 4) {
        list.get(3)
    } else {
        0
    }
    var five_element: Int = if (list.size >= 5) {
        list.get(4)
    } else {
        0
    }



    fun xWin(): Boolean {
        if(four_element!=0){
            ms = arrayOf(one_element, two_element, three_element,four_element)
        }
        if(five_element!=0){
            ms = arrayOf(one_element, two_element, three_element,four_element,five_element)
        }

                if (1 in ms && 2 in ms && 3 in ms) {
                    return true
                }
                if (1 in ms && 4 in ms && 7 in ms) {
                    return true
                }
                if (1 in ms && 5 in ms && 9 in ms) {
                    return true
                }



                if (2 in ms && 5 in ms && 8 in ms) {
                    return true
                }


                //fors elemwnt three

                if (3 in ms && 6 in ms && 9 in ms) {
                    return true
                }
                if (3 in ms && 5 in ms && 7 in ms) {
                    return true
                }



                if (4 in ms && 6 in ms && 5 in ms) {
                    return true
                }


                if (7 in ms && 8 in ms && 9 in ms) {
                    return true
                }


        return false
    }

}