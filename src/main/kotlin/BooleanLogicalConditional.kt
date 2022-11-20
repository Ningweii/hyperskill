
//----------------- Boolean and logical operators -------------------
fun readingBooleanValues() {
//    val b: Boolean = readln().toBoolean()
//    println(b)

    // strict boolean is case sensitive
    val strictBoolean = readln().toBooleanStrict()
    println(strictBoolean)

    println("true".toBooleanStrict())     // true
// println("True".toBooleanStrict())  // program crashes
    println("false".toBooleanStrict())    // false
// println("faLse".toBooleanStrict()) // program crashes

    println("true".toBooleanStrictOrNull())  // true
    println("false".toBooleanStrictOrNull()) // false
    println("faLse".toBooleanStrictOrNull()) // null

//    println(readln().toBoolean())
}

fun oneLinerBoolean() = (readLine()!!.toBoolean() && readLine()!!.toBoolean()).let(::println)

fun rangeCheck () {
    val x = readln().toInt()
    println(x in 1..10)

    val y = 5 in 1..10


//    If you need to exclude the right border, you may subtract 1 from it:
//    val withinExclRight = c in a..b - 1 // a <= c && c < b

//    If you need to check that a value is not within a range, just add ! (not) before in.
//    val notWithin = 100 !in 10..99 // tru

//    You may combine ranges using standard logical operators.
//    The code below checks if c is within one of three ranges.
//    val within = c in 5..10 || c in 20..30 || c in 40..50 // true if c is within at least one range

//    You can assign a range to a variable and use it later.
    val range = 100..200
    println(300 in range) // false

//    In addition to integer ranges, you can also use ranges of characters
//    and even strings (according to dictionary order).
    println('b' in 'a'..'c') // true
    println('k' in 'a'..'e') // false

    println("hello" in "he".."hi") // true
    println("abc" in "aab".."aac") // false
}


//-------------------- Conditional expression ---------------------

fun singleIfCase() {
//    The conditional expression (if expression for short) is a construction that allows a
//    program to perform different computations depending on the value of a boolean expression.
//    If it is true, the program performs one action. If it is false , the program performs
//    another action. Here you can see some examples of boolean expressions: a > b, i - j == 1 and so on.

//    val age = ... // an integer value
//    if (age > 100) {
//        println("Very experienced person")
//    }
//    In this example, if the age is greater than 100 the code prints "Very experienced person",
//    otherwise, it does nothing. After this, other lines of code are executed.
//    If a condition is false, actions in the body will not be executed:
}

fun downTo() {
    println('n' in 'a'.downTo('Z'))
    println('f' in 'z'.downTo('c'))
}

fun conditionIsAnExpression() {
//    Unlike other languages (such as Java, Python, C#), in Kotlin if is an expression,
//    not a statement. As a regular expression, it can return a value (result) of computations.
//    The result must be the last expression in a body.

//    This code finds the max of two integer numbers a and b.
//    It prints the choice and stores the result to the max variable.
    val a = 5
    val b = 4
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

//    If you are going to use the if as an expression, it must have an else branch.
//    In an expression-style if, it's better to produce results of the same type
//    in all the branches because in this case, the type of the variable will be strict.
//    However, in general, it's not required. Later, you will learn how to work
//    with variables of an unknown type.


//    If all the bodies contain only a single statement, you can skip braces:
    val max2 = if (a > b) a else b


//    Sometimes we even do NOT need to declare a new variable for storing a result.
//    In this example, we compare two numbers and print the text information
//    passing it to a function.

    val c = readln().toInt()
    val d = readln().toInt()

    println(
        if (a == b) {
            "a equal b"
        } else if (a > b) {
            "a is greater than b"
        } else {
            "a is less than b"
        }
    )
}

fun idiom() {
//    It's time for the next idiom! Now we draw your attention to the expression-style if.
//    You should prefer to use this form when you need to get some results.
//    Of course, you may work with if as a statement, but using if as an expression
//    is a better way. For example:

    val a = 5
    val b = 8

    val max = if (a > b) a else b // one line

    //.............

    var max2 = a // try to avoid var if possible
    if (b > a) max2 = b

//    The second snippet may cause some trouble, for example, you may accidentally alter
//    the value of the max variable or forget to change it. So we suggest you use
//    expression-style if in those cases.
}


fun main() {
//    readingBooleanValues()
//    oneLinerBoolean()
//    rangeCheck()
//    downTo()

//    Conditional Expressions
    singleIfCase()
    downTo()
//    conditionIsAnExpression()
//    idiom()
}

