fun main(args: Array<String>) {
    val pilihgamemode = PilihGameMode()
    do {
        println("===============================")
        println("   GAME SUIT TERMINAL VERSION  ")
        println("===============================")
        println("Choose Game Mode")
        println("1. 2 Players")
        println("2. Versus Computer")
        println("3. Exit Game")
        print("Select your mode: ")
        val selectmode = readLine()!!.toUpperCase()
        val mode: Int = try {
            selectmode.toInt()
        } catch (e: NumberFormatException) {
            0
        }
        pilihgamemode.cekPilihan(mode)
    } while (mode != 3)
}
