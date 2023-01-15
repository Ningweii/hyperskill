
fun example1() {

    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}

fun example2() {
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()
    when (op) {
        "+", "plus" -> {
            val sum = a + b
            println(sum)
        }
        "-", "minus" -> {
            val diff = a - b
            println(diff)
        }
        "*", "times" -> {
            val product = a * b
            println(product)
        }
        else -> println("Unknown operator")
    }
}

fun whenAsExpression() {
    val result = when (4) {
        1 -> "result is equal to one"
        2, 3 -> "result is equal to two and three"
        in 4..100 -> "result is in range from four to ten (inclusive)"
        else -> "result is unknown"
    }
    println(result)
}


fun whenInsidePrintln() {
    println(when("george"){
        "george" -> "your name is george"
        "nika" -> "your name is nika"
        else -> "I don't know your name"
    })

    println(when("*"){
        "+" -> 4 + 5
        "-" -> 4 - 5
        "*" -> 4 * 5
        else -> "unknown operator"
    })
}

fun lastLine() {
/*
If a branch contains a block with multiple statements enclosed in {...}, the last line
must be a single value or a complex expression that will be performed and returned as
the result of the when expression
*/
    val a = 4;
    val b = 5
    val result = when ("+") {
        "+" -> {
            val sum = a + b
            sum // last line
        }
        else -> "unknown"
    }
    println(result)
}

fun calculationChecking() {
    /*
    The program below reads three integer numbers a, b, and c, and then tries to
    determine how to calculate c using a and b. If there are many ways to calculate c,
    it will print only the first one:
    */
    val (var1, var2, var3) = readln().split(" ")
    val a = var1.toInt()
    val b = var2.toInt()
    val c = var3.toInt()

    println(when (c) {
        a + b -> "$c equals $a plus $b"
        a - b -> "$c equals $a minus $b"
        a * b -> "$c equals $a times $b"
        else -> "We do not know how to calculate $c"
    })
}

fun rangeChecking() {
    when (18) {
        0 -> println("n is zero")
        in 1..10 -> println("number is between 1 and 10 (inclusive)")
        in 25..30 -> println("number is between 25 and 30 (inclusive)")
        else -> println("number is outside a range")
    }
}

fun multipleRangeChecking() {
//    val letter = 'j'
//    when (letter) {
//        in 'a'..'d', in 'l'..'q' -> println("$letter is in range from a to d or l to q")
//        else -> println("$letter is not in range")
//    }

//    ------------------------------

    val n = readln().toInt()
    println(when (n) {
        in 2..5, in 10..15, in 21..30 -> "$n is in range from 2-5 or 10-15 or 21-30"
        in 40..50, in 65..90 -> "$n is in range from 40-50 or 65-90"
        else -> "$n is not in any range"
    })
}

fun whenWithoutArguments() {
    val n = readln().toInt()

    when {
        n == 0 -> println("n is zero")
        n in 100..200 -> println("n is between 100 and 200")
        n > 300 -> println("n is greater than 300")
        n < 0 -> println("n is negative")
        // else-branch is optional here
    }

}




fun main() {

//    example1()
//    example2()
//    whenAsExpression()
//    whenInsidePrintln()
//    calculationChecking()
//    rangeChecking()
    multipleRangeChecking()
//    whenWithoutArguments()

}
