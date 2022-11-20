
fun turnValidation(playerName: String, playerTurnParam: String, regex: Regex): String {
    var playerTurn = playerTurnParam
    while (!regex.matches(playerTurn) || playerTurn == "exit") {
        if (playerTurn == "exit") {
            return playerTurn
        }
        println("Invalid Input")
        println("$playerName's turn:")
        playerTurn = readln()
    }
    return ""
}

fun playerWantsToExit(playerTurn: String): Boolean = playerTurn == "exit"

fun endGame() = println("Bye!")


fun main() {
    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstPlayerName = readln()
    println("Second Player's name:")
    val secondPlayerName = readln()

    println("""
        +---+---+---+---+---+---+---+---+
      8 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
      7 | B | B | B | B | B | B | B | B |
        +---+---+---+---+---+---+---+---+
      6 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
      5 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
      4 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
      3 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
      2 | W | W | W | W | W | W | W | W |
        +---+---+---+---+---+---+---+---+
      1 |   |   |   |   |   |   |   |   |
        +---+---+---+---+---+---+---+---+
          a   b   c   d   e   f   g   h
    """.trimIndent())

    val validTurnCombination = Regex("[a-h][1-8][a-h][1-8]")

    while (true) {
        println("$firstPlayerName's turn:")
        val firstPlayerTurn = readln()
        var heDoes = turnValidation(firstPlayerName, firstPlayerTurn, validTurnCombination)
        if (playerWantsToExit(heDoes)) break

        println("$secondPlayerName's turn:")
        val secondPlayerTurn = readln()
        heDoes = turnValidation(secondPlayerName, secondPlayerTurn, validTurnCombination)
        if (playerWantsToExit(heDoes)) break
    }
    endGame()
}



// Interesting Solution
/*
package chess

fun main() {
    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstPlayer = readln()
    println("Second Player's name:")
    val secondPlayer = readln()
    displayChessboard()
    val moveRegex = Regex("[a-h][1-8][a-h][1-8]")

    var player = firstPlayer

    while (true) {
        println("$player's turn:")
        val input = readln()
        if (input == "exit") break
        if (moveRegex.matches(input)) {
            player = if (player == firstPlayer) secondPlayer else firstPlayer
        } else {
            println("Invalid Input")
        }
    }

    println("Bye!")
}

fun displayChessboard() {
    val ranks = MutableList(8) { "+---" }
    val files = MutableList(8) { "|   " }
    val blackStart = MutableList(8) { "| B " }
    val whiteStart = MutableList(8) { "| W " }
    for (i in 8 downTo 1) {
        println("  ${ranks.joinToString("")}+")
        when (i) {
            7 -> println("$i ${blackStart.joinToString("")}|")
            2 -> println("$i ${whiteStart.joinToString("")}|")
            else -> println("$i ${files.joinToString("")}|")
        }
    }
    println("  ${ranks.joinToString("")}+")
    print("  ")
    for (ch in 'a'..'h') {
        print("  $ch ")
    }
    println()
}
 */




