interface GameEngineOne {
    fun gameTwoPlayers()
    fun getPlayerOneChoice(optionsParam: Array<String>): String
    fun getPlayerTwoChoice(optionsParam: Array<String>): String
    fun printResult(playerOneChoice: String, playerTwoChoice: String)
}
interface GameEngineTwo {
    fun gameVsCom()
    fun getPlayerOneChoice(optionsParam: Array<String>): String
    fun getPlayerComChoice(optionsParam: Array<String>): String
    fun printResult(playerOneChoice: String, playerComChoice: String)
}