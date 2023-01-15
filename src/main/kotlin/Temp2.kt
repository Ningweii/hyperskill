
fun main() {

    println("Pawns-Only Chess\nFirst player's name:")
    val firstPlayer = readln()
    println("Second player's name:")
    val secondPlayer = readln()

    val board: MutableList<MutableList<Char>> = MutableList(8) { MutableList(8) { ' ' } }
    for (i in board.indices) { board[1][i] = 'B' }
    for (i in board.indices) { board[6][i] = 'W' }

    board.print()

    var player = firstPlayer
    var color = "white"

    while(true) {
        println("$player's turn:")
        val input = readln()
        if (input == "exit") break

        if (!input.isValidInput()) println("Invalid input") else {
            val x1 = input[0].code - 97
            val y1 = 8 - input[1].digitToInt()
            val x2 = input[2].code - 97
            val y2 = 8 - input[3].digitToInt()
            if (board[y1][x1] != color[0].uppercaseChar()) println("No $color pawn at ${input.substring(0, 2)}") else {
                if(board.isValidMove(x1, y1, x2, y2, color)) {
                    board[y1][x1] = ' '
                    board[y2][x2] = color[0].uppercaseChar()
                    board.print()
                    player = if (player == firstPlayer) secondPlayer else firstPlayer
                    color = if (color == "white") "black" else "white"
                } else println("Invalid input")
            }
        }
    }
    println("Bye!")
}

fun MutableList<MutableList<Char>>.isValidMove(x1: Int, y1: Int, x2: Int, y2: Int, color: String): Boolean {
    val oppositeColor = if (color == "white") 'B' else 'W'
    if (x1 != x2 || this[y2][x2] == oppositeColor) return false

    val firstMove = (color == "white" && y1 == 6) || (color == "black" && y1 == 1)
    return if (color == "white") {
        y1 - y2 == 1 || firstMove && y1 - y2 == 2
    } else {
        y2 - y1 == 1 || firstMove && y2 - y1 == 2
    }
}

fun String.isValidInput() = Regex("[a-h][1-8][a-h][1-8]").matches(this)

fun MutableList<MutableList<Char>>.print() {
    println("  +---+---+---+---+---+---+---+---+")
    this.forEachIndexed { index, list ->
        print("${8 - index} ")
        list.forEach {
            print("| $it ")
        }
        println("|\n  +---+---+---+---+---+---+---+---+")
    }
    println("    a   b   c   d   e   f   g   h")
}




