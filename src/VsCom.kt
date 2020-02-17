import java.lang.Math;

class VsCom : GameEngineTwo {
    override fun gameVsCom() {
        val options = arrayOf("GUNTING", "BATU", "KERTAS")
        val playerOneChoice = getPlayerOneChoice(options)
        val playerComChoice = getPlayerComChoice(options)
        printResult(playerOneChoice, playerComChoice)
    }

    override fun getPlayerOneChoice(optionsParam: Array<String>): String {
        var isValidChoice = false
        var playerOneChoice = ""
        print("Enter your name: ")
        val welcomemsg = Welcome(readLine()!!)
        while (!isValidChoice) {
            welcomemsg.printWelcome()
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

    override fun getPlayerComChoice(optionsParam: Array<String>): String =
        optionsParam[(Math.random() * optionsParam.size).toInt()]

    override fun printResult(playerOneChoice: String, playerComChoice: String) {
        val result: String = if (
            (playerOneChoice == "BATU" && playerComChoice == "GUNTING") ||
            (playerOneChoice == "KERTAS" && playerComChoice == "BATU") ||
            (playerOneChoice == "GUNTING" && playerComChoice == "KERTAS")
        ) {
            "You WIN!"
        } else if (
            (playerOneChoice == "GUNTING" && playerComChoice == "BATU") ||
            (playerOneChoice == "BATU" && playerComChoice == "KERTAS") ||
            (playerOneChoice == "KERTAS" && playerComChoice == "GUNTING")
        ) {
            "Computer WIN!"
        } else {
            "DRAW!"
        }
        println("You choose $playerOneChoice. Computer choose $playerComChoice. $result")
    }
}