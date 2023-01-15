import java.util.*

class Problems {
}


fun uniqueCharacters() {
//    Write a program that reads a word and prints the number of characters that
//    appear in it only once.
    /*
    * sample input: "abracadabra"
    * sample output: 2
    * */

    // My solution
    val str = "abracadabra"
    var count = 0

    for (i in str.indices) {
        if (str[i] !in str.substring(0, i) && str[i] !in str.substring(i + 1)) {
            count++
        }
    }
    print(count)

    //-----------------------------------------

    // another solution, not mine but very cool
    println(str.toList().groupBy { it }.filterValues { it.size == 1 }.size)

    //--------------------------------

    // Another cool solution :D
    val x = readLine()!!
    var s = 0
    x.forEach { char ->
        if (x.indexOf(char) == x.lastIndexOf(char)) s++
    }
    print(s)
}


fun placementOfShips() {

    /*
    There is a game in which players need to deploy ships on the battlefield.
    Let's build a program to figure out where ships can be placed.

    We have a field with 5 rows (X) and 5 columns (Y), 25 cells in total.
    Write a program that reads the coordinates (X, Y) of three one-cell-sized
    ships and prints all the available rows (X) and columns (Y) for new ships.
    New ships can be placed only in the rows and columns which are vacant,
    so you need to print out the indices of rows and columns with no ships in them.

    Print the rows (X) and columns (Y) on two different lines (the list of empty rows
            on the first line and the list of empty columns on the next line).
    All the output coordinates should be separated with a space. Do not add extra
    spaces at the end of the output lines.
    */

    /*
    Sample input:
    1 2
    2 3
    4 1
    Sample output:
    3 5
    4 5

    Sample input:
    1 3
    1 4
    1 2
    Sample output:
    2 3 4 5
    1 5
    */

//    My solution
    val rows = mutableListOf(1, 2, 3, 4, 5)
    val cols = mutableListOf(1, 2, 3, 4, 5)

    for (i in 0..2) {
//        val input = readln()
//        val x = input[0].digitToInt()
//        val y = input[2].digitToInt()
        val (x, y) = readln().split(" ").map { it.toInt() }
        if (x in rows) rows.remove(x)
        if (y in cols) cols.remove(y)
    }

    println(rows.joinToString(" "))
    println(cols.joinToString(" "))


// Another solution
    val scanner = Scanner(System.`in`)
    val rowss = (1..5).toMutableList()
    val colss = (1..5).toMutableList()
    repeat(3) {
        rowss.remove(scanner.nextInt())
        colss.remove(scanner.nextInt())
    }
    println(rowss.joinToString(" "))
    println(colss.joinToString(" "))


//    Yet another solution
    List(3) { readLine()!!.split(' ').map(String::toInt) }.run {
        val xyFree = mutableListOf((1..5).toMutableList(), (1..5).toMutableList())
        map { xyFree[0] -= it[0]; xyFree[1] -= it[1] }
        xyFree.map { println(it.joinToString(" ")) }
    }
}

fun maximumElementDivisibleBy4() {
    /*
    You have a sequence of natural numbers that do not exceed 30000. Find the maximum
    element in the sequence divisible by 4. As input, the program first gets the
    number of elements in the sequence, and then the elements themselves. A sequence
    always has an element divisible by 4. The number of elements does not exceed 1000.
    The program should print a single number — the maximum sequence element (number)
    divisible by 4.

    Sample input:
    6
    24
    12
    47
    36
    16
    46

    Sample output:
    36
    */

//    My solution
    val list = MutableList(readln().toInt()) { readln().toInt() }
    var max = 0
    for (i in list.indices) {
        if (list[i] % 4 == 0 && max < list[i]) max = list[i]
    }
    println(max)


//    Another solution
println(List(readln().toInt()) { readln().toInt() }.filter { it % 4 == 0 }.maxByOrNull { it })


}

fun main() {
    maximumElementDivisibleBy4()
}