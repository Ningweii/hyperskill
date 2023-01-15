
//In Kotlin, a lambda is a function that is not declared, but is passed directly in the form
//of an expression. It is often used as a concise way to represent a function when it is
//passed as an argument to another function.

//To create a lambda expression in Kotlin, you can use the -> symbol to define
//a function that can be passed around as a value. Here is the general syntax
//for defining a lambda expression in Kotlin:

//val lambdaName: (parameterType1, parameterType2, ...) -> returnType = { parameter1, parameter2, ... -> functionBody }

//If you only have one parameter, you can use the it keyword to represent the
// parameter, like this:
//val double: (Int) -> Int = { it * 2 }


fun sortedorNot() {
    // Sorted or not
    val list = MutableList(readln().toInt()) { readln().toInt() }
    println(if ((1 until list.size).all { list[it] >= list[it - 1] }) "Sorted!" else "NOT sorted!")

}

fun lambdaAsFun() {
    val add: (Int, Int) -> Int = { x, y -> x + y }
    println(add(3, 4))
    val rex = listOf(1, 2, 3, 4, 5).map { add(it, it) }
    println(rex)
}

fun reduce() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, x -> acc + x }  // sum is 15
}

fun concatenateListOfStrings(){
    val words = listOf("a", "b", "c", "d", "e")
//    val sentence = words.reduce { acc, x -> "$acc $x" }  // sentence is "a b c d e".
}

fun ifInsideLambda() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val count = numbers.reduce { acc, number -> if (number % 2 == 0) acc + 1 else acc }
    println(count)  // prints 3
}


fun main() {
    sortedorNot()
    lambdaAsFun()
    reduce()
    concatenateListOfStrings()
    ifInsideLambda()
    squareNumsLambda()
    mapOf()
    forEachIndexed()



// Filter
    findEvens()
    evenIndexedNums()

}

fun findEvens(){
    val nums = listOf(2, 5, 3, 6, 4)
    val evens = nums.filter { it % 2 == 0 }

    println(evens)
}

fun evenIndexedNums() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 8)
    val evenIndexNumbers = numbers.filterIndexed { index, _ -> index % 2 == 0 }
    println(evenIndexNumbers)
}

fun startsWith() {
    val words = listOf("apple", "banana", "cherry", "date", "elderberry", "fig")
    val wordsStartingWithC = words.filter { it.startsWith("c") }
}

fun squareNumsLambda() {
    val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val square: (Int) -> Int = { x -> x * x }
    val squareNums = myList.map(square)
    println(squareNums)
}

fun squareNumsFunction() {
    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5)

        // This is a function that takes an Int parameter and returns the square of that number
        fun square(x: Int): Int = x * x

        // This is how you reference the square function using the :: operator and pass it as an argument to the map function
        val squares = numbers.map(::square)

        println(squares)  // Output: [1, 4, 9, 16, 25]
    }
}


fun mapOf() {
    val scores = mapOf("Alice" to 90, "Bob" to 95, "Charlie" to 85)
    val message = "The scores are: ${scores.map { (name, score) -> "$name: $score" }.joinToString()}"
    println(message)


    val clients = mapOf("Nikolaus" to 25, "Giorgio" to 23, "Davido" to 45, "Tikano" to 43)
    val clientsOver30 = clients.filter { (key, value) -> value > 30 }
    val message2 = "Clients over thirty are: ${clientsOver30.map { (key, value) -> "$key: $value" }.joinToString() }"
    println(message2)
}


fun forEachIndexed() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    numbers.forEachIndexed { index, element -> numbers[index] = element + 2 }
    println(numbers)


    var sum = 0
    numbers.forEachIndexed { index, _ -> sum += numbers[index] }
    println(sum)



    val ls: MutableList<Int> = mutableListOf(1, 88, 2, 3, 4, 5, 6, 7, 8, 9)
    var firstEven: Int? = null
    ls.forEachIndexed { index, element ->
        if (element % 2 == 0 && firstEven == null) {
            firstEven = ls[index]
        }
    }
    println(firstEven)

}

