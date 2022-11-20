import java.lang.IllegalArgumentException

fun main() {

//----------------------------- Functions ----------------------------------------

//    Program decomposition

//    Functions can divide a program into small reusable pieces.
//    It is called decomposition. You can call these pieces as many times as you need,
//    instead of repeating them. A decomposed program has a modular structure;
//    it is easier to modify and maintain than a program with one main function
//    that contains a thousand lines. This idea comes from procedural programming.

//    Basic syntax
//      To declare a new function, you need to indicate the fun keyword and a function name,
//      a list of parameters in parentheses, and the type of the result value.
//      So, it looks like this:
//    fun functionName(p1: Type1, p2: Type2, ...): ReturnType {
//        // body
//        return result
//    }

//    A function has the following components:
//    a name that follows the same rules and recommendations as a variable name;
//    a list of parameters in parentheses. Each parameter has a name and a type
//    separated by a colon :. All the parameters are separated by commas ,;
//    the type of the return value (optional);
//    a body that contains statements and expressions;
//    the keyword return followed by the result (also optional).
//    The types of parameters and the result can be of any type
//    including Int, Double, Boolean, String, and so on.


//    Single-expression functions
//    If a function returns a single expression, you can write it without curly braces:
    fun sum(a: Int, b: Int): Int = a + b
    fun sayHello(): Unit = println("Hello")
    fun isPositive(number: Int): Boolean = number > 0
//    Specifying the return type is optional, as it can be inferred automatically:


    val num = transform("blu")
    println(num)
    println(num::class)
}


//fun firstFun(a: Int, b: Int): Int {
//    return a + b
//}
//fun firstFun(a: Int, b: Int) = a + b


fun transform(color: String) = when (color) {
    "red" -> 0
    "green" -> 1
    "blue" -> 2
//    else -> throw IllegalArgumentException("Invalid color param value")
    else -> "whaat??"
}


