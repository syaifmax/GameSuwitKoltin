class PilihGameMode {
    fun cekPilihan(pilih: Int) {
        when (pilih) {
            1 -> {
                val programsatu = TwoPlayers()
                programsatu.gameTwoPlayers()
            }
            2 -> {
                val programdua = VsCom()
                programdua.gameVsCom()
            }
            3 -> {
                val programtiga = GoodBye()
                programtiga.cetakGoodBye()
                System.exit(0)
            }
            else -> {
                println("Whoops! Looks like you choose wrong mode. Please try again...")
            }
        }
    }
}