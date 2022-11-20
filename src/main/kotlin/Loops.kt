import java.util.*

fun forLoop() {
//    This is the syntax the for loop has:
//    for (element in source) {
        // body of loop
//    }

    for (i in 1..10) {
        println(i)
    }

    for (ch in 'a'..'d') {
        println(ch)
    }

//    Iterating through a String
    for (ch in "Hello") {
        println(ch)
    }

//    Iterating in the backward order
    for (i in 4 downTo 1) {
        println(i)
    }


//    Excluding the upper limit
//    If we need to exclude the upper limit from a range,
//    we can subtract one from it or write until instead of ..:

    for (i in 1 until 4) {
        println(i)
    }


//    Specifying a step
//    If we do not specify a step, it is assumed that the step is equal
//    to one (e.g. 1, 2, 3, ...). Although if we want to change the step,
//    we need to specify it explicitly.
//    In the example below, we print only odd numbers from the range 1..7.
    for (i in 1..7 step 2) {
        println(i)
    }
//    You can also use it for backward iteration
    for (i in 7 downTo 1 step 2) {
        println(i)
    }


//    An example: the factorial of a number
//    Let's write a program that calculates the factorial of a given integer number.
//    It's a classic. The factorial     of n is a product of integer numbers
//    from 1 to n inclusive. Assumed that factorial of 0 is 1.
//    The factorial of 1 is 1 as well.
    val n = readln().toInt()
    var result = 1 // starting value of the factorial
    for (i in 2..n) { // the product from 2 to n
        result *= i
    }
    println(result)


//    An example: the multiplication table of even numbers
//    You can nest one for loop in the body of another for loop because loops are
//    just regular statements. Programmers often use nested loops to process
//    multidimensional structures like tables (matrices), data cubes, and so on.
//    For example, the code below prints the multiplication table of even numbers from 2 to 10.

        for (i in 2..10 step 2) {
            for (j in 2..10 step 2) {
                print(i * j)
                print('\t')  // print the product of i and j followed by one tab
            }
            println()
        }

//    Idiom
//    Almost everything in this topic is an idiom! Different types of ranges may be
//    difficult to understand, but they offer a really convenient and easy-to-read
//    way to write code. Here we give you a quick reminder of the syntax for
//    iterating over basic ranges:

//    for (i in 1..6) { ... }        // closed range: 1, 2, 3, 4, 5, 6
//    for (i in 1 until 6) { ... }   // half-open range: 1, 2, 3, 4, 5
//    for (x in 1..6 step 2) { ... } // step 2: 1, 3, 5
//    for (x in 6 downTo 1) { ... }  // closed range, backward order: 6, 5, 4, 3, 2, 1

}


fun checkOrder() {
//    Write a program that checks if N numbers are sorted according to the ascending
//    order (from the smallest number to the largest one).
//    The first line contains the number N.
//    The other lines contain N numbers.
//    Output "YES" if N numbers are sorted in ascending order, otherwise, output "NO".

    val size = readln().toInt()
    val nums = MutableList(size) { readln().toInt() }
    print(if (nums == nums.sorted()) "YES" else "NO")
}


fun fizzBuzz() {
//    Fizz Buzz is a classic programming problem. Here is its slightly modified version.
//    Write a program that takes the input of two integers: the beginning and the end
//    of the interval (both numbers belong to the interval).
//    The program is to output the numbers from this interval, but if the number
//    is divisible by 3, you should output Fizz instead of it; if the number is
//    divisible by 5, output Buzz, and if it is divisible both by 3 and by 5,
//    output FizzBuzz.
//    Output each number or word on a separate line.

    val startInt = 8
    val endInt = 16

    for (i in startInt..endInt) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else println(i)
    }
}


fun productOfNumbersFromAtoB() {
//    Write a program that prints the product of all the integer numbers
//    from a to b (a < b).
//    Include a and exclude b from your calculation.
//    The result can be large, so you should use the Long type.
    val startIntInclusive = 100
    val endIntExclusive = 105
    var product: Long = 1
    for (i in startIntInclusive until endIntExclusive) {
        product *= i
    }
    print(product)
}


fun minimumValueOfNnumbers() {
//    Write a program that finds the minimum value of N numbers.
//    The first line contains the number N.
//    The other lines contain N numbers.
//    Output an integer number which is the minimum of N numbers.
    var minimum = Long.MAX_VALUE
    val sizeOfList = readln().toInt()
    val list = MutableList(sizeOfList) { readln().toLong() }
    for (i in 0 until list.size) {
        if (minimum > list[i]) {
            minimum = list[i]
        }
    }
    println(minimum)


//    Another solution
    val size = readln().toInt()
    val arr = MutableList(size) { readln().toInt() }
    println(arr.sorted().get(0))
}


fun longestSequence() {
//    Write a program that reads N numbers and outputs the length of the
//    longest sequence in non-descending order. By non-descending,
//    we mean that the next element is either equal or greater than the
//    previous one (A<=B). Elements of the sequence are to follow one another.
//    Input format
//    The first line contains the positive integer number N (N>0).
//    The other lines contain N numbers.
//    Example
//    The input array is 1 2 4 1 2 2 5 7 4 3. In this case, the length of
//    the longest sequence in non-descending order is 5. It includes
//    these elements: 1 2 2 5 7.
//    My solution :D
    val arr = mutableListOf(1, 2, 4, 1, 2, 2, 5, 7, 4, 3)
    val secondArr = mutableListOf<Int>()
    var longestSequence = 0
    var i = 0
    var x = 0
    while (i < arr.size) {
        secondArr.add(arr[i])
        if (secondArr.sorted() == arr.subList(0, i + 1) && secondArr.size > longestSequence) {
            longestSequence = secondArr.size
            i++
        } else {
            secondArr.clear()
            arr.subList(0, i).clear()
            i = 0
            if (x < longestSequence) {
                x = longestSequence
            }
            longestSequence = 0
        }
    }
    println(Math.max(x, longestSequence))



//    Another solution
    val input = List(readln().toInt()) { readln().toInt() }
    var current = 1
    var max = 1
    for (i in 0 until input.lastIndex) {
        if (input[i + 1] >= input[i]) current++ else current = 1
        if (max < current) max = current
    }
    println(max)
}



//------------------------- while loop ------------------------------


fun englishAlphabet() {
    var firstChar = 'A'
    while (firstChar <= 'Z') {
        print("$firstChar ")
        firstChar++
    }
}

fun hasNext() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        var a = scanner.next()
        println(a)
        println(a::class)

    }
}

fun doWhileLoop() {
    do {
        val num = readln().toInt()
        println(num)
    } while (num != 0)

}

fun collatzConjecture() {
//    You have a natural number n. Generate a sequence of integers,
//    described in the Collatz conjecture:
//    If n is an even number, divide it in half, if it is odd,
//    multiply it by 3 and add 1. Repeat this operation until you get 1 as a result.
//    For example, if n is 17, then the sequence would look like this:
//    17 52 26 13 40 20 10 5 16 8 4 2 1

    var n = readln().toInt()
    while (n != 1) {
        print("$n ")
        n = if (n % 2 == 0) n / 2 else n * 3 + 1
    }
    print("$n")
}

fun squaresOfNaturalNumbers() {
//    You have an integer number N. Print all squares of natural numbers
//    that do not exceed N in ascending order.

//    val n = readln().toInt()
//    var square = 0
//    for (i in 1..n) {
//        square = i * i
//        if (square <= n) print("$square ")
//    }

// another way of solving
//    val n = 30
//    var square = 0
//    var squareIndex = 1
//    var i = 1
//    while ((square + 1) < n - squareIndex < (square + squareIndex)) {
//        squareIndex += 2
//        square = i * i
//        if (square <= n) print("$square ")
//        i++
//    }

    // Yet another way of solving
//    val n = readln().toInt()
//    var i = 1
//    while (i * i <= n) {
//        println(i * i)
//        i++
//    }

    var max = 0
    do {
        val n = readln().toInt()
        if (n > max) max = n
    } while (n != 0)
    println(max)

}

fun sequence122333() {
    // The Sequence 1 2 2 3 3 3 4 4 4 4...
//    Write a program that prints a part of the following sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
//    (the number of repetitions is equal to the respective number).
//    Input is a positive integer n – the number of the elements of the
//    sequence that the program should print. Output the sequence of numbers,
//    written in a single line, separated by spaces.
//    For example, if n is 7, the program should output 1 2 2 3 3 3 4 (seven numbers).

    val n = readln().toInt()
    var i = 0
    var count = 0
    while (i < n) {
        i++
        var j = 0
        while (j < i && count < n ) {
            print("$i, ")
            j++
            count++
        }
    }
//  This was quite challenging problem for me to solve but I did it all by myself :D <3
}

fun theFirstPositionOfTheLargestElement() {
//    Write a program that reads a sequence of numbers of undefined size
//    and prints the largest number and the position of its first occurrence.
//    The position starts from 1. Note that numbers can be negative.

    val scanner = Scanner(System.`in`)
    var max = Integer.MIN_VALUE
    var indexOfMaxElement = 0
    var generalIndex = 0
    while (scanner.hasNextInt()) {
        val n = scanner.nextInt()
        if (n > max) {
            max = n
            generalIndex += 1
            indexOfMaxElement = generalIndex
        } else {
            generalIndex += 1
        }
    }

    println("max is $max and the index is $indexOfMaxElement")
    println("$max $indexOfMaxElement")
}

fun balanceChecker() {

//    Create an algorithm that prevents an e-wallet account from going
//    into negative balance. The account should be debited for each
//    purchase sequentially while the balance allows it.
//    The input should include:
//    On the first line, a single integer number representing the available balance.
//    On the second line, a sequence of integers representing purchase payments,
//    which should be processed one after another.

    // This is not my code but it's better solution than mine
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (balance - purchase < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            return
        } else {
            balance -= purchase
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}

// My solution
//val scanner = Scanner(System.`in`)
//var balance = scanner.nextInt()
//var balanceIsSufficient = true
//
//while (scanner.hasNextInt() && balance >= 0) {
//    val itemPrice = scanner.nextInt()
//    balance -= itemPrice
//    if (balance < 0) {
//        println("Error, insufficient funds for the purchase. Your balance is ${balance + itemPrice}, but you need $itemPrice.\n")
//        balanceIsSufficient = false
//    }
//}
//if(balanceIsSufficient) println("Thank you for choosing us to manage your account! Your balance is $balance.\n")




fun main() {

//    forLoop()
//    Problems
//    checkOrder()
//    fizzBuzz()
//    productOfNumbersFromAtoB()
//    minimumValueOfNnumbers()
//    longestSequence()


//    while loop
    englishAlphabet()
    hasNext()
    doWhileLoop()
//    problems
    collatzConjecture()
    squaresOfNaturalNumbers()
    sequence122333()
    theFirstPositionOfTheLargestElement()
    balanceChecker()

}