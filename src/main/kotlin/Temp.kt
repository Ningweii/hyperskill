fun boardMatrice(): MutableList<MutableList<String>> {
    return mutableListOf(
        mutableListOf("a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"),
        mutableListOf("a7b", "b7b", "c7b", "d7b", "e7b", "f7b", "g7b", "h7b"),
        mutableListOf("a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"),
        mutableListOf("a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"),
        mutableListOf("a4", "b4", "c4", "d3", "e4", "f4", "g4", "h4"),
        mutableListOf("a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"),
        mutableListOf("a2w", "b2w", "c2w", "d2w", "e2w", "f2w", "g2w", "h2w"),
        mutableListOf("a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1")
    )
}

fun board(): MutableList<MutableList<String>> {
    val board = mutableListOf(
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("8", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("7", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("6", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("5", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("4", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("3", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("2", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf("1", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
        mutableListOf("  +---+---+---+---+---+---+---+---+"),
        mutableListOf(" ", " ", " ", " ", "a", " ", " ", " ", "b", " ", " ", " ", "c", " ", " ", " ", "d", " ", " ", " ", "e", " ", " ", " ", "f", " ", " ", " ", "g", " ", " ", " ", "h")
    )
    return board
}

fun pawnOnly() {

    val boardMatrice = mutableListOf(
        mutableListOf("a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"),
        mutableListOf("a7b", "b7b", "c7b", "d7b", "e7b", "f7b", "g7b", "h7b"),
        mutableListOf("a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"),
        mutableListOf("a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"),
        mutableListOf("a4", "b4", "c4", "d3", "e4", "f4", "g4", "h4"),
        mutableListOf("a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"),
        mutableListOf("a2w", "b2w", "c2w", "d2w", "e2w", "f2w", "g2w", "h2w"),
        mutableListOf("a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1")
    )


    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstPlayer = readln()
    println("Second Player's name:")
    val secondPlayer = readln()

    for (array in board()) println(array.joinToString(""))

    var initialPosition = ""
    var nextPosition = ""
    var currentPosition = ""
    var player = ""
    var isWhite = false

    player = firstPlayer
    while (true) {
        println("$player's turn:")
        val playerTurn = readln()
        var firstHalf = playerTurn.substring(0, 2)
        var secondHalf = playerTurn.substring(2)
        var secondHalfDigit = secondHalf.substring(1).toInt()
        var firstHalfChar = firstHalf.substring(0, 1)
        var secondHalfChar = secondHalf.substring(0, 1)
        println(firstHalfChar)
        println(secondHalfChar)


        if (playerTurn == "exit") break


        var teamChar = '0'
        initialPosition = if (player == firstPlayer) "[a-h]2" else "[a-h]7"
        nextPosition = if (player == firstPlayer) "[a-h][3?4?]" else "[a-h][6?5?]"
        teamChar = if (player == firstPlayer) 'w' else 'b'
        isWhite = player == firstPlayer


        var count = 0
        for (i in 0 until boardMatrice.size) {
            for (j in 0 until boardMatrice[i].size) {
                if (boardMatrice[i][j].toRegex().matches(firstHalf + teamChar) &&
                    Regex(initialPosition).matches(firstHalf)) {
                    println("it's a match!")
                    println(i)
                    boardMatrice[i][j] = boardMatrice[i][j].substring(0, 2)
                    if (isWhite && secondHalfDigit == 3 || secondHalfDigit == 4) {
                        boardMatrice[i - (secondHalfDigit - 2)][j] += teamChar.toString()
                    }

                }
            }
        }
        for (arr in boardMatrice) { println(arr) }
        player = if (player == firstPlayer) secondPlayer else firstPlayer
    }

    println("bye!")

}



fun main() {

    pawnOnly()

//    val str = "h2j7"
//    val subStr = str.substring(2, 3)
//    println(subStr)



//    val boardMatrice = mutableListOf(
//        mutableListOf("a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"),
//        mutableListOf("a7b", "b7b", "c7b", "d7b", "e7b", "f7b", "g7b", "h7b"),
//        mutableListOf("a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"),
//        mutableListOf("a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"),
//        mutableListOf("a4", "b4", "c4", "d3", "e4", "f4", "g4", "h4"),
//        mutableListOf("a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"),
//        mutableListOf("a2w", "b2w", "c2w", "d2w", "e2w", "f2w", "g2w", "h2w"),
//        mutableListOf("a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1")
//    )
////    println(boardMatrice[6][0])
////    boardMatrice[6].set(0, boardMatrice[6][0].substring(0, 2))
//    boardMatrice[6][0] = boardMatrice[6][0].substring(0, 2)
//    println(boardMatrice[6][0])



}