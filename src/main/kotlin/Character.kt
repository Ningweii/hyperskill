

fun hexadecimal() {
//    A character can also be represented by its hexadecimal code in the Unicode table.
//    The code starts with \u
    val ch = '\u0040' // it represents '@'
    println(ch) // @
}

fun numbersToCharsViseVersa() {
//    You can also convert numbers to characters and vice versa. Let's take a look at how it works
    val ch = 'a'
    println(ch.code)   // 97
    val num = 97
    println(num.toChar()) // a
}

fun readingCharacters() {
//    Kotlin does not provide a convenient function to read a Char.
//    However, you can do it another way: if you need to read one Char
//    in a whole line, use this construction:
    val ch: Char = readln().first()
//    You just read a String and get its first element, which will be a Char.
//    Strings are composed of characters

}

fun retrievingSubsequentCharacters() {
//    There are two operators for adding (+) and subtracting (-) integer numbers in order
//    to get the next and previous characters according to the Unicode order:
    val ch1 = 'b'
    val ch2 = ch1 + 1 // 'c'
    val ch3 = ch2 - 2 // 'a'

//    Remember that you cannot add a symbol to a number as it will cause an error.
//    val ch = 'a'
//    val ch1 = 1 + ch // Error

//    You also cannot sum up two characters:
//    val charsSum = 'a' + 'b' // Error

//    It is possible to use the increment (++) and decrement (--) operators in their
//    prefix and postfix forms. The assignment operator combined with + or - also
//    works for characters, as well as += and -=.
    var ch = 'A'
    ch += 10
    println(ch)   // 'K'
    println(++ch) // 'L'
    println(++ch) // 'M'
    println(--ch) // 'L'
}

fun escapeSequences() {
//    '\n' is the newline character;
//    '\t' is the tab character;
//    '\r' is the carriage return character;
//    '\\' is the backslash character itself;
//    '\'' is the single quote mark;
//    '\"' is the double quote mark.
    print('\t') // makes a tab
    print('a')  // prints 'a'
    print('\n') // goes to a new line
    print('c')  // prints 'c'

//    Note: there is also a character to represent a single space ' '.
//    It is just a regular character, not an escape sequence.
}

fun relationalOperations() {
//    You can compare characters using relational operations (==, <, >, <=, >=, and !=)
//    according to their position in the Unicode table.

    println('a' < 'c')  // true
    println('x' >= 'z') // false

    println('D' == 'D') // true
    println('Q' != 'q') // true because capital and small letters are not the same

    println('A' < 'a')  // true because capital Latin letters are placed before small ones

//    Using relational operations and codes, we can check whether a Char is a digit:
//    all ten digits have codes from '\u0030' to '\u0039'.
//    Here is a program that does it:
        val ch = readln().first()
        val isDigit = ch >= '\u0030' && ch <= '\u0039'
        println(isDigit)
//    If the input is a digit '0', '1', '2', ..., '9' (without quotes), the program prints true.
//    Otherwise, it prints false.
}

fun processingCharacters(){
//    There's a variety of useful functions to work with characters.
//    You can use these functions instead of dealing with character codes.

//    isDigit() returns true if the given character represents a digit ('1', '2', etc); otherwise, false;
//
//    isLetter() returns true if the given character represents a letter ('a', 'B', 'm', etc); otherwise, false;
//
//    isLetterOrDigit() returns true if the given character represents a letter or a digit; otherwise, false;
//
//    isWhitespace() returns true if the given character represents a whitespace (' ', or '\t', or '\n'); otherwise, false;
//
//    isUpperCase() returns true if the given character is an uppercase character; otherwise, false;
//
//    isLowerCase() returns true if the given character is a lowercase character; otherwise, false;
//
//    toUpperCase() returns the uppercase form of the given character (before Kotlin 1.5; you shouldn't use it nowadays);
//
//    uppercaseChar() returns the uppercase form of the given character (since Kotlin 1.5);
//
//    uppercase() returns a String with the uppercase form of the given character (since Kotlin 1.5);
//
//    toLowerCase() returns the lowercase form of the given character (before Kotlin 1.5; you shouldn't use it nowadays);
//
//    lowercaseChar() returns the lowercase form of the given character (since Kotlin 1.5);
//
//    lowercase() returns a String with the lowercase form of the given character (since Kotlin 1.5).


//    Let's take a look at some examples of the functions listed above:

    val one = '1'

    val isDigit = one.isDigit()   // true
    val isLetter = one.isLetter() // false

    val capital = 'A'
    val small = 'e'

    val isLetterOrDigit = capital.isLetterOrDigit() // true

    val isUpperCase = capital.isUpperCase() // true
    val isLowerCase = capital.isLowerCase() // false

    val capitalEString = small.uppercase() // "E"
    val capitalE = small.uppercaseChar()   // 'E'
}


fun capitalLetterOrDigit() {
//    Write a program that reads a character and checks if it is a
//    capital letter or a digit from 1 to 9.
//    The program must print either true or false.
//    My solution:

    val c = readln().first()
    println(c.isUpperCase() || c.isDigit() && c.digitToInt() in 1..9)
}


fun compareLatinLetters() {
//    Write a program that reads two Latin letters as characters and
//    compares them ignoring cases. If these characters represent the
//    same letter print true , otherwise false.
    val firstLetter = "abundance".first() // only takes first char
    val secondLetter = "Astartes".first() // only takes first char
    print(firstLetter.equals(secondLetter, true))
}


fun comparingNumbersAndCharacters() {
//    Write a program that reads one number and one character on separate
//    lines and checks if the number matches the character's decimal
//    representation correctly.
//    If the input character is represented by the input number, print true;
//    otherwise, print false.

    val num = 64
    val char = 'a'
    println(char.code == 95) // false
    println(char.code == 97) // true
}


fun main() {

    //-------------------------- Characters -------------------------------------

    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'

//    hexadecimal()
//    numbersToCharsViseVersa()
//    readingCharacters()
//    retrievingSubsequentCharacters()
//    escapeSequences()
//    relationalOperations()
//    processingCharacters()

    // Problems
//    capitalLetterOrDigit()
//    compareLatinLetters()
    comparingNumbersAndCharacters()


}