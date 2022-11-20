import java.util.Scanner

fun main(args: Array<String>) {


//------------------------------- Input -----------------------

    readLineExample() // One way
    readlnExample() // Second way
    scannerExample() // Third way
    multipleInputs() // Multiple Inputs
    multipleInputsWithRepeat() // Repeat
    multipleInputsWithTypeConversion()
    repeatingBlocks()






}

fun readLineExample() {
    print("What is your name? ")
    val name = readLine()!!
    print("What is your age? ")
    val age = readLine()!!.toInt() // readLine is String by default. so I converted number from string to int.
    println("You name is $name and you are $age years old")
}

fun readlnExample() {
    println("What is your hobbie? ")
    val hobbie = readln()
    println("Your hobbie is $hobbie")
}

fun scannerExample() {
    val scanner = Scanner(System.`in`)
    println("What is your hobbie? ")
    val hobbie = scanner.next()
    println("Your hobbie is $hobbie")

}

fun multipleInputs() {
    println("write down your nationality, city and phone number")

    // With readln
    val (nationality, city, phoneNumber) = readln().split(" ")
    println(nationality)
    println(city)
    println(phoneNumber)

    // With readLine
//    val (nationality, city, phoneNumber) = readLine()!!.split(' ') // <--- this produces same result

    // With Scanner
//    val scanner = Scanner(System.`in`)
//    val (nationality, city, phoneNumber) = scanner.nextLine().split(' ')

//    println("You are $nationality. You live in $city. Your phone number is $phoneNumber")
}

fun multipleInputsWithRepeat() {
    val scanner = Scanner(System.`in`)
    repeat(4) {
        println(scanner.next())
    }
}

fun multipleInputsWithTypeConversion() {
    val (a, b) = Array(2) { readln().toInt() }
    println("$a plus $b equals ${a + b}")

//    val (a, b) = List(2) { readln().toInt() }
//    println("$a plus $b equals ${a + b}")
}

fun repeatingBlocks() {
    println("enter how many numbers you want to add: ")
    val numOfInputs = readln().toInt()
    var sumOfInputs = 0
    var indexOfNum = 0

    repeat(numOfInputs) {
        println("Enter number ${++indexOfNum}: ")
        sumOfInputs += readln().toInt()
    }
    println("the sum of nums is $sumOfInputs")
}