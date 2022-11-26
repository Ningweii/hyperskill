package projects
fun printBoard() {
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
}

fun main() {
    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstPlayer = readln()
    println("Second Player's name:")
    val secondPlayer = readln()

    printBoard()

    val whitesStartPosition = Regex("[a-h]2")
    val blacksStartPosition = Regex("[a-h]7")
    var player = ""
    player = firstPlayer
    while (true) {
        println("$player's turn:")
        val playerTurn = readln()
        if (playerTurn == "exit") break
        if (whitesStartPosition.matches(playerTurn)) {
            player = if (player == firstPlayer) secondPlayer else firstPlayer
        } else println("Invalid Input")
    }
    println("bye!")
}

