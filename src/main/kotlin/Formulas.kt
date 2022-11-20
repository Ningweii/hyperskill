import java.lang.Math.sqrt
import java.lang.Math.pow

fun main(){
 //--------------------------- Formulas ----------------------------------------

//    pythagoras()
//    factorial()
//    prime()
//    timesTable()
//    fibonacci()
//    extractLastDig(123)



}

//------------------- Hypotenuse (Pythagoras) --------------------------------
//Write a program to calculate hypotenuse of a triangle
fun pythagoras() {
    println("------------------------- Find Hypotenuse --------------------------")
    print("Submit first cath: " )
    val firstCath = readln().toDouble()
    print("Submit second cath: " )
    val secondCath = readln().toDouble()
    val hypotenuse = sqrt(pow(firstCath, 2.0) + pow(secondCath, 2.0))
    println("Hypotenuse is equal to $hypotenuse")

}

fun factorial() {
//    Find factorial of a number
    println("--------------------------- Find Factorial -------------------------------")
    print("Submit number: ")
    val targetNum = readln().toInt()
    var factorial = 1
    for (i in 1..targetNum) {
        factorial *= i
    }
    println("Factorial of $targetNum is $factorial")
}

fun prime(){
    println("----------------------- Check If Number Is Prime ------------------------")
    print("Submit number: ")
    val targetNum = readln().toInt()
    var isPrime = true
    for (i in 2 until targetNum) {
        if (targetNum % i == 0) {
            isPrime = false
        }
    }
    println(if (isPrime) "$targetNum is prime!" else "$targetNum is Not prime")
}

fun timesTable() {
    for (i in 1..9) {
        for (j in 1..9) {
            println("$i * $j = ${i * j}\t")
        }
        println()
    }
}

fun fibonacci() {
    val targetNumber = 4
    var firstNum = 0
    var secondNum = 1
    var fibonacciNumber = 0
    for (i in 0..targetNumber) {
        fibonacciNumber += (targetNumber - i) + (targetNumber - i - 1)

    }
    println(fibonacciNumber)
}

fun extractLastDig(number: Int): Int {
    return number % 10
}