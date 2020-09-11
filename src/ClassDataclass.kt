class Players1 {
    data class PlayersData(val playerName: String, val TeamName: String, val playerNum: Int)

    fun task(): List<PlayersData> {
        return listOf(PlayersData("Hassan", "Barcelona", 9),
                      PlayersData("Mohammed", "Real Madrid", 7))
    }
}
    ////////////////////////////////////////////////////////////////////////
class Players2(val playerName: String, val TeamName: String, val playerNum: Int){

        fun task(): List<Players2> {
            return listOf(Players2("Hassan", "Barcelona", 9),
                          Players2("Mohammed", "Real Madrid", 7))
        }
    }

/*
* data class for data and setter and getter just not fun
* normal class for data and fun
*
* data class can not be defult constructor
* normal class can be defult constructor
*
*/