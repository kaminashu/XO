package www.uzmd.xo

class GameWinX(var list: ArrayList<Int>) {
    var one_element = list.get(0)
    var two_element = list.get(1)
    var three_element = list.get(2)


    fun xWin(): Boolean {
        when (one_element) {
            1 -> {
                if (two_element == 2 && three_element == 3) {
                    return true
                }
                if (two_element == 3 && three_element == 2) {
                    return true
                }

                if (two_element == 4 && three_element == 7) {
                    return true
                }
                if (two_element == 7 && three_element == 4) {
                    return true
                }

                if (two_element == 5 && three_element == 9) {
                    return true
                }
                if (two_element == 9 && three_element == 5) {
                    return true
                }
            }

            2 -> {
                if (two_element == 5 && three_element == 8) {
                    return true
                }
                if (two_element == 8 && three_element == 5) {
                    return true
                }

                if (two_element == 1 && three_element == 3) {
                    return true
                }
                if (two_element == 3 && three_element == 1) {
                    return true
                }

            }

            3 -> {
                //fors elemwnt three
                if (two_element == 2 && three_element == 1) {
                    return true

                }
                if (two_element == 1 && three_element == 2) {
                    return true
                }

                if (two_element == 6 && three_element == 9) {
                    return true
                }
                if (two_element == 9 && three_element == 6) {
                    return true
                }

                if (two_element == 5 && three_element == 7) {
                    return true
                }
                if (two_element == 7 && three_element == 5) {
                    return true
                }
            }

            4 -> {
                if (two_element == 5 && three_element == 6) {
                    return true
                }
                if (two_element == 6 && three_element == 5) {
                    return true
                }

                if (two_element == 1 && three_element == 7) {
                    return true
                }
                if (two_element == 7 && three_element == 1) {
                    return true
                }

            }

            5 -> {
                if (two_element == 4 && three_element == 6) {
                    return true
                }
                if (two_element == 6 && three_element == 4) {
                    return true
                }

                if (two_element == 2 && three_element == 8) {
                    return true
                }
                if (two_element == 8 && three_element == 2) {
                    return true
                }
            }

            6 -> {
                if (two_element == 5 && three_element == 4) {
                    return true
                }
                if (two_element == 4 && three_element == 5) {
                    return true
                }

                if (two_element == 3 && three_element == 9) {
                    return true
                }
                if (two_element == 9 && three_element == 3) {
                    return true
                }
            }

            7 -> {
                if (two_element == 5 && three_element == 3) {
                    return true
                }
                if (two_element == 3 && three_element == 5) {
                    return true
                }

                if (two_element == 4 && three_element == 1) {
                    return true
                }
                if (two_element == 1 && three_element == 4) {
                    return true
                }

                if (two_element == 8 && three_element == 9) {
                    return true
                }
                if (two_element == 9 && three_element == 8) {
                    return true
                }
            }

            8 -> {
                if (two_element == 5 && three_element == 2) {
                    return true
                }
                if (two_element == 2 && three_element == 5) {
                    return true
                }

                if (two_element == 7 && three_element == 9) {
                    return true
                }
                if (two_element == 9 && three_element == 7) {
                    return true
                }
            }

            9 -> {
                if (two_element == 8 && three_element == 7) {
                    return true
                }
                if (two_element == 7 && three_element == 8) {
                    return true
                }
                if (two_element == 6 && three_element == 3) {
                    return true
                }
                if (two_element == 3 && three_element == 6) {
                    return true
                }
                if (two_element == 5 && three_element == 1) {
                    return true
                }
                if (two_element == 1 && three_element == 5) {
                    return true
                }
            }

            else -> {}


        }
        return false
    }
}