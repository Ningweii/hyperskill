fun pawnOnly() {
    val graphicBoard = mutableListOf(
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
    val boardMatrice = mutableListOf(
        mutableListOf("a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"),
        mutableListOf("a7b", "b7b", "c7b", "d7b", "e7b", "f7b", "g7b", "h7b"),
        mutableListOf("a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"),
        mutableListOf("a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"),
        mutableListOf("a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"),
        mutableListOf("a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"),
        mutableListOf("a2w", "b2w", "c2w", "d2w", "e2w", "f2w", "g2w", "h2w"),
        mutableListOf("a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1")
    )

    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstPlayer = readln()
    println("Second Player's name:")
    val secondPlayer = readln()

    // Prints graphic board
    for (array in graphicBoard) println(array.joinToString(""))

    var currentPosition = ""
    var player = ""
    var isWhite = false

    player = firstPlayer
    while (true) {
        println("$player's turn:")

        val playerTurn = readln()
        if (playerTurn == "exit") break
        if (!playerTurn.matches("[a-z][\\d][a-z][\\d]".toRegex())) {
            println("Incorrect format!")
            continue
        }

        var firstHalf = playerTurn.substring(0, 2)
        var secondHalf = playerTurn.substring(2)
        var firstHalfDigit = firstHalf.substring(1).toInt()
        var secondHalfDigit = secondHalf.substring(1).toInt()
        var firstHalfChar = firstHalf.substring(0, 1)
        var secondHalfChar = secondHalf.substring(0, 1)



        var teamChar = '0'
        val generalRegex = Regex("[a-h][1-8][a-h][1-8]")
        val initialPosition = if (player == firstPlayer) "[a-h]2".toRegex() else "[a-h]7".toRegex()
        teamChar = if (player == firstPlayer) 'w' else 'b'
        isWhite = player == firstPlayer
        var thereIsNoPawn = false

        // Below code checks if input is invalid
        if (!generalRegex.matches(playerTurn) ||
            firstHalfChar != secondHalfChar ||
            firstHalfDigit == secondHalfDigit ||
            (teamChar == 'w' && firstHalfDigit == 1) ||
            (teamChar == 'b' && firstHalfDigit == 8) ||
            (initialPosition.matches(firstHalf) && teamChar == 'w' && secondHalfDigit - firstHalfDigit !in 1..2) ||
            (initialPosition.matches(firstHalf) && teamChar == 'b' && firstHalfDigit - secondHalfDigit !in 1..2) ||
            (initialPosition.matches(firstHalf) && teamChar == 'w' && secondHalfDigit !in 3..4) ||
            (initialPosition.matches(firstHalf) && teamChar == 'b' && secondHalfDigit !in 5..6) ||
            (!initialPosition.matches(firstHalf) && teamChar == 'w' && secondHalfDigit - firstHalfDigit != 1) ||
            (!initialPosition.matches(firstHalf) && teamChar == 'b' && firstHalfDigit - secondHalfDigit != 1) ) {
            println("Invalid input")
            continue
        }

            //Below code checks if there ar no white or black pawns at current position
        for (i in 0 until boardMatrice.size) {
            for (j in 0 until boardMatrice[i].size) {
                if (!initialPosition.matches(firstHalf) && firstHalf == boardMatrice[i][j]) {
                    thereIsNoPawn = true
                    currentPosition = boardMatrice[i][j]
                    break
                }
            }
            if (thereIsNoPawn) break
        }
        if (thereIsNoPawn && teamChar == 'w') {
            println("There are no white pawns at $currentPosition")
            continue
        } else if (thereIsNoPawn && teamChar == 'b') {
            println("There are no black pawns at $currentPosition")
            continue
        }
                // rows
                // 0 1 2 3 4 5  6   7
                // 1 3 5 7 9 11 13  15

                // cols
                // 0 1  2  3  4  5  6   7
                // 4 8 12  16 20 24 28  32


        // Below code checks if input is initial and propels pawn by 1 or 2 rows in the same column
        for (i in 0 until boardMatrice.size) {
            for (j in 0 until boardMatrice[i].size) {
                if (boardMatrice[i][j].toRegex().matches(firstHalf + teamChar) &&
                    initialPosition.matches(firstHalf)) {
                    var currentGraphicElement = ""
                    println("it's a match!")
                    boardMatrice[i][j] = boardMatrice[i][j].substring(0, 2)
                    graphicBoard[i * 2 + 1][j * 4 + 4] = graphicBoard[i * 2 + 1][j * 4 + 4].replace(Regex("[W?B?]"), " ")
                    println("graphic board element is ${graphicBoard[i * 2 + 1][j * 4 + 4]}")
                    println("i is $i   j is $j")
                    var temp = 0
                    if (isWhite && (secondHalfDigit == 3 || secondHalfDigit == 4)) {
                        boardMatrice[i - (secondHalfDigit - 2)][j] += teamChar.toString()
                        graphicBoard[i * 2 + 1 - if (secondHalfDigit == 3) 2 else 4][j * 4 + 4] = graphicBoard[i * 2 + 1 - if (secondHalfDigit == 3) 2 else 4][j * 4 + 4].replace(" ", teamChar.uppercase())
                    } else if (!isWhite && (secondHalfDigit == 6 || secondHalfDigit == 5)) {
                        boardMatrice[i + (secondHalfDigit % 2 + 1)][j] += teamChar.toString()
                    }
                    //Below code checks if input is not initial and moves pawn by one row
                } else if (boardMatrice[i][j].toRegex().matches(firstHalf + teamChar) &&
                    !initialPosition.matches(firstHalf)) {
                    if (isWhite) {
                        boardMatrice[i][j] = boardMatrice[i][j].substring(0, 2)
                        boardMatrice[i - 1][j] += teamChar.toString()
                    } else {
                        boardMatrice[i][j] = boardMatrice[i][j].substring(0, 2)
                        boardMatrice[i + 1][j] += teamChar.toString()
                    }
                }
            }
        }




        for (arr in graphicBoard) { println(arr.joinToString("")) }
//        for (arr in boardMatrice) { println(arr) }

        player = if (player == firstPlayer) secondPlayer else firstPlayer
    }

    println("bye!")

}



fun main() {

    pawnOnly()

//    val graphicBoard = mutableListOf(
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("8", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("7", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|", " ", "B", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("6", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("5", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("4", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("3", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("2", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|", " ", "W", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf("1", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " ", "|"),
//        mutableListOf("  +---+---+---+---+---+---+---+---+"),
//        mutableListOf(" ", " ", " ", " ", "a", " ", " ", " ", "b", " ", " ", " ", "c", " ", " ", " ", "d", " ", " ", " ", "e", " ", " ", " ", "f", " ", " ", " ", "g", " ", " ", " ", "h")
//    )
//
//    println(graphicBoard[3].joinToString(""))

}