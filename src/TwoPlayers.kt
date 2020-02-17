class TwoPlayers : GameEngineOne {
    override fun gameTwoPlayers() {
        val options = arrayOf("GUNTING", "BATU", "KERTAS")
        val playerOneChoice = getPlayerOneChoice(options)
        val playerTwoChoice = getPlayerTwoChoice(options)
        printResult(playerOneChoice, playerTwoChoice)
    }

    override fun getPlayerOneChoice(optionsParam: Array<String>): String {
        var isValidChoice = false
        var playerOneChoice = ""
        while (!isValidChoice) {
            print("Player 1 please enter your choice ->")
            for (item in optionsParam) print(" $item")
            println(":")
            val userInput = readLine()!!.toUpperCase()
            if (userInput in optionsParam) {
                isValidChoice = true
                playerOneChoice = userInput
            }
            if (!isValidChoice) println("Whoops! You must enter a valid choice.")
        }
        return playerOneChoice
    }

    override fun getPlayerTwoChoice(optionsParam: Array<String>): String {
        var isValidChoice = false
        var playerTwoChoice = ""
        while (!isValidChoice) {
            print("Player 2 please enter your choice ->")
            for (item in optionsParam) print(" $item")
            println(":")
            val userInput = readLine()!!.toUpperCase()
            if (userInput in optionsParam) {
                isValidChoice = true
                playerTwoChoice = userInput
            }
            if (!isValidChoice) println("Whoops! You must enter a valid choice.")
        }
        return playerTwoChoice
    }

    override fun printResult(playerOneChoice: String, playerTwoChoice: String) {
        val result: String = if (
            (playerOneChoice == "BATU" && playerTwoChoice == "GUNTING") ||
            (playerOneChoice == "KERTAS" && playerTwoChoice == "BATU") ||
            (playerOneChoice == "GUNTING" && playerTwoChoice == "KERTAS")
        ) {
            "Player 1 WIN!"
        } else if (
            (playerOneChoice == "GUNTING" && playerTwoChoice == "BATU") ||
            (playerOneChoice == "BATU" && playerTwoChoice == "KERTAS") ||
            (playerOneChoice == "KERTAS" && playerTwoChoice == "GUNTING")
        ) {
            "Player 2 WIN!"
        } else {
            "DRAW!"
        }
        println("Player 1 choose $playerOneChoice. Player 2 choose $playerTwoChoice. $result")
    }
}
