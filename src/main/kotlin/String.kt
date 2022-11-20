fun concatenateCharWithString() {
    val str1 = 'a' + "bc"
    println(str1)
    val str2 = "de" + 'f'
}

fun stringMethods() {
    // Length of a String
    val str = "Hello"
    val lengthOfStr = str.length
    println(lengthOfStr)

}

fun charPlusStringPlusInt() {
    val strangeString = 'I' + "ntelliJ " + 2022
    println(strangeString)
}


fun stringRepeat() {
    println("I love khinkali".repeat(3))

    repeat(3){
        println("hello")
    }

    println("How to become a best programmer? hmm.. let me tell you a secret..")
    println("Eat. Sleep. Code. Repeat. \n".repeat(7))

    var count = 0
    repeat(3) {
        count++
        println(count)
    }

    val num = 5
    repeat(num) {
        println("wow")
    }
}

fun rawString() {
    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
    """.trimIndent()
    println(largeString)
}

fun abracadabra() {
    val spell = "abra"
    println((spell + "cad").repeat(spell.length) + spell)
}

fun stringTemplates() {
    val city = "Paris"
    val temp = "24"
    println("Now, the temperature in $city is $temp degrees Celsius.")
}

fun stringTemplatesForBuildingString() {
    val value = "55"
    val currency = "dollars"
    val price = "$value $currency" // "55 dollars"
    println(price)
}

fun templatesForExpressions() {
    val language = "Kotlin"
    println("$language has ${language.length} letters in the name")

    println("Enter number to be divided by 2")
    val num = readln().toInt()
    println("The obtained value is $num and its Int representation after division on 2 is ${num / 2}")

    val (a, b) = Array(2) { readLine()!!.toInt() }
    println("$a plus $b equals ${a + b}")
}

fun ignoreCase() {
    // this is how you ignore case with ignoreCase
    println("'a'.equals('a', false) is ${'a'.equals('a', false)}") // true
    println("'a'.equals('A', false) is ${'a'.equals('A', false)}") // false
    println("'a'.equals('A', true) is ${'a'.equals('A', true)}") // true

    // this is another way to ignore case
    println("A".uppercase() == "a".uppercase())
}

fun accessingCharacters() {
//    The elements of a string are individual characters that can be accessed by their index.
//    The first element of a string has an index of 0

    val greeting = "Hello"
    val first = greeting[0]  // 'H'
    val second = greeting[1] // 'e'
    val five = greeting[4]   // 'o'

    val last = greeting[greeting.length - 1] // 'o'
    val prelast = greeting[greeting.length - 2] // 'l'

//    Kotlin provides several convenient ways to access
//    the first and the last character of a string:
    println(greeting.first())   // 'H'
    println(greeting.last())    // 'o'
    println(greeting.lastIndex) // 4
}

fun emptyString() {
//    Sometimes you need a fast way to check if the String is empty.
//    For example, you need the first element of the string and want to check
//    for its existence. Of course, you can use the length and check if it's
//    greater than 0. But a much more elegant way is using the function isEmpty():
    val emptyString = ""
    println(emptyString.length == 0) //true
    println(emptyString.isEmpty()) //true
}

fun Immutability() {
//    Strings are immutable, meaning that once created, the string stays the same.
//    You cannot modify an element of a string. So, the example below would not work:

    val valString = "string"
//    valString[3] = 'o' // an error here!
//    var varString = "string"
//    varString[3] = 'o' // an error here too!

//    If you need to change the string, you can reassign it:
    var varString2 = "string"
    varString2 = "strong" // legal
    val valString2 = "string"
//    valString2 = "strong" // error, you cannot reassign val

//    Actually, we do not modify the stored value in the varString variable.
//    Instead, we assign a new value to it. So, it is absolutely legal.
//    This is one of the ways to work with strings. If you need to modify a string,
//    just create a new one.
}

fun comparingStrings() {
//    To compare two strings, use == (equals) and != (not equals) operators.
//    Both operators take two strings as their operands and return a
//    value of the Boolean type (true or false).
    val first = "first"
    val second = "second"
    var str = "first"

    println(first == str)    // true
    println(first == second) // false
    println(first != second) // true
}


fun split() {
    // Splitting The String
//    A string can be separated by delimiters to a list of strings.
//    To perform this, call the method split() , it divides a string
//    into substrings by a separator. In the previous example,
//    we used the " " delimiter, which splits a string into separate
//    words by spaces. Notably, the delimiter itself is not included
//    in any of the substrings.

//    The method returns a List of all the substrings. The List is similar
//    to MutableList, but you cannot reassign elements in the List and you
//    cannot resize the List. You can easily convert List to MutableList
//    and vice versa with toMutableList() and toList() functions.
    val sentence = "a long text"
    val wordsList: List<String> = sentence.split(" ") // ["a", "long", "text"]
    val mutableWordList = sentence.split(" ").toMutableList() // MutableList ["a", "long", "text"]


//    Let's try to split an American phone number into country code,
//    area code, central office code, and other remaining digits:
    val number = "+1-213-345-6789"
    val parts = number.split("-") // ["+1", "213", "345", "6789"]
//    Note that all the parts are still strings no matter how they look!



//    Choose your delimiter wisely, otherwise, you can receive some sentences that start with a space:
    val text = "That's one small step for a man, one giant leap for mankind."
    val partss = text.split(",") // ["That's one small step for a man", " one giant leap for mankind."]



//    You can choose any delimiter you prefer, even the combination of spaces and words:
    val textt = "I'm gonna be a programmer"
    val partsss = textt.split(" gonna be ") // ["I'm", "a programmer"]
//    As you can see, the split method is also a good tool to get rid of something you
//    don't need or don't want to use



    // Iterating Over a String
//    It's possible to iterate over characters of a string using a loop.
//    See the following example of iterating with range indices.
    val scientistName = "Isaac Newton"
    for (i in 0 until scientistName.length) {
        print("${scientistName[i]} ") // print the current character
    }
//    The code outputs: I s a a c   N e w t o n



//    Also, you can iterate through a string:
    val str = "strings are not primitive types!"
    var count = 0
    for (ch in str) {
        if (Character.isWhitespace(ch))
            count++
    }
    println(count) // 4
//    The code above counts and prints the number of spaces in str. The result is 4.



//    Example of iterating through an array by indices:
    val rainbow = "ROYGCBV"
    for (index in rainbow.indices){
        println("${index+1}: ${rainbow[index]}")
    }
//    The code above prints the colors of the rainbow with their numbers.
//    The output is:
//    1: R
//    2: O
//    3: Y
//    4: G
//    5: C
//    6: B
//    7: V

}

//--------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------


//------------------------------------ Problems ----------------------------------------


fun stringWithDoubleChars() {
//Write a program that reads a string and then output another string with doubled characters.
    val str = "hello"
    var strDouble = ""

    for (ch in str) {
        repeat(2) { strDouble += ch }
    }
    println(strDouble)
}


fun convertDate() {
//    Write a program that takes a date string formatted as YYYY-MM-DD as input,
//    then converts and outputs it as MM/DD/YYYY.
//    For instance, the input 2007-07-21 will result in the following output 07/21/2007.
    var date = "2000-08-16".split("-").toMutableList()
    println("${date[1]}-${date[2]}-${date[0]}")
}


fun palindrome() {
//    Write a program that reads a string and checks whether it is a palindrome,
//    i.e. it reads the same both left-to-right and right-to-left.
//    The program must output “yes” if the string is a palindrome and “no” otherwise.
//    My solution
    val str = "kayAk"
    var str2 = ""
    for (i in str.lastIndex downTo 0) {
        str2 += str[i]
    }
    if (str.equals(str2, true)) {
        print("yes")
    } else print("no")


    //another solution with reversed()
        val string = "kayak"
        if (string == string.reversed()) {
            print("yes")
        } else print("no")
}


fun longestWord() {

//    In the given string find the first longest word and output it.
//    Given a string in a single line. Words in the string are separated
//    by a single space.
//    Output the longest word. If there are several such words,
//    you should output the one that occurs first.

    // my solution
    val str = "one two three four five eight six".split(" ").toMutableList()
    var max = 0
    var maxStr = ""
    for (i in 0..str.size - 1) {
        if (max < str[i].length) {
            max = str[i].length
            maxStr = str[i]
        }
    }
    println(maxStr)


    //another solution
    print(readln().split(" ").maxByOrNull { it.length })

}


fun cutOutMiddleString() {
//    Write a program that reads a string, and then outputs the string without its
//    middle character when the length is odd, and without the middle 2 characters
//    when the length is even.
//    My solution
    val str = "george"
    if (str.length % 2 == 1) {
        println(str.substring(0, str.length / 2) + str.substring(str.length / 2 + 1))
    } else {
        println(str.substring(0, str.length / 2 - 1) + str.substring(str.length / 2 + 1))
    }
}


fun firstOccurrence() {
//    Write a program that takes a sentence as input and returns the index
//    of the first occurrence of the word "the", regardless of the
//    capitalization. If there is no occurrence of it must output -1.
//    For instance, if the sentence is “The apple is red.” the output
//    should be 0, if the sentence is “I ate the red apple.” the output
//    should be 6, and if the sentence is “I love apples.” the output
//    should be -1.
//    Note, the and The are equal.
//  My solution:
    val str = "I love apples"
    if (str.contains("the", true)) {
        println(str.indexOf("the", 0, true))
    } else print("-1")


    // Another solution
    val s = readln().lowercase()
    print(
        if ("the" in s) s.indexOf("the") else -1
    )


    // Another solution
    val text = readln()
    println(text.lowercase().indexOf("the"))


    // Another solution
    println(readln().indexOf("the", ignoreCase = true))

}

fun gc_Content(){
//    GC-content is an important feature of the genome sequences and is defined
//    as the percentage ratio of the sum of all guanines and cytosines to
//    the overall number of nucleic bases in the genome sequence.
//    Write a program, which calculates the percentage of G characters (guanine)
//    and C characters (cytosine) in the entered string. Your program should be
//    case independent.
//    For example, in the string "acggtgttat" the percentage of characters
//    G and C equals to 40.0. where 4 is the number of symbols G and C,
//    and 10 is the length of the string.
//    Note, answer should be double.

//    val i: Int = …
//    val j: Int = …
//    val result = i / j              // not correct, integer division
//    val result = i.toDouble() / j   // correct
//    Remember: characters are case-insensitive(g equals G and c equals C)
//    My solution:
    val nucleicBases = "acggtgttat".lowercase()
    var gcSum = 0.0
    for (char in nucleicBases) {
        if (char == 'g' || char == 'c') {
            gcSum++
        }
    }
    println(gcSum / nucleicBases.length * 100)
}


fun luckyTicket() {

//    Paul loves to ride public transport and after receiving the ticket,
//    he immediately checks whether he got the lucky one. A ticket is
//    considered a lucky one if the sum of the first three numbers in this
//    ticket matches the sum of the last three numbers in the same ticket.
//    However, Paul does not count well in his head. That is why he asks you
//    to write the program, which will check the equality of the sums and
//    display "Lucky" if the sums match, and "Regular" if the sums differ.
//    A string of six digits is provided as input to the program.
//    You need to print out only the word "Lucky" or "Regular" with a capital
//    letter (without quotes).
//    My solution:
    val numbersOnTicket = "092234"
    var sumOfFirstThree = 0
    var sumOfLastThree = 0
    for (i in 0..numbersOnTicket.lastIndex / 2) {
        sumOfFirstThree += numbersOnTicket[i].digitToInt()
    }
    for (i in 3..numbersOnTicket.lastIndex) {
        sumOfLastThree += numbersOnTicket[i].digitToInt()
    }
    println(if (sumOfFirstThree == sumOfLastThree) "Lucky" else "Regular")



    // Another solution modified by me
    val number = "090234".toCharArray().map { it.digitToInt() }
    val firstHalf = number[0] + number[1] + number[2]
    val secondHalf = number[3] + number[4] + number[5]
    print(if (firstHalf == secondHalf) "Lucky" else "Regular")



    //Another solution:
    val s = readln()
    val str = mutableListOf<Int>()
    for (i in s) str.add(i.digitToInt())
    print(
        if (str[0] + str[1] + str[2] == str[3] + str[4] + str[5]) "Lucky"
        else "Regular"
    )
}


fun luckyNumber() {
//    Given the number N with an even number of digits. If the sum of the
//    first half of the digits equals the sum of the second half of the digits,
//    then this number is considered lucky. For a given number, output "YES"
//    if this number is lucky, otherwise output "NO".
//    My solution:
    val N = "12344321"
    val firstHalf = N.substring(0, N.length / 2).toCharArray().map { it.digitToInt() }.sum()
    val secondHalf = N.substring(N.length / 2).toCharArray().map { it.digitToInt() }.sum()
    println(if (firstHalf == secondHalf) "YES" else "NO")
}


fun numberOfOccurrences() {
//    Write a program that finds the frequency of occurrences of substring in given string.
//    The first input line contains a string, the second one contains a substring.
//    My solution:
    val str = "hello yellow jello"
    val subStr = "ll"
    var count = 0
    for (i in 0..str.length - subStr.length) {
        if (str.substring(i, subStr.length + i).equals(subStr)) {
            count++
        }
    }
    println(count)

//    Another Solution
    val strr = readln().split(" ").toString()
    val subs = readln()
    val a = Regex(subs).findAll(strr).count()
    println(a)

// Another solution:
    var s = "hello there!"
    val subS = "the"
    var counter = 0
    while (s.contains(subS)) {
        s = s.replaceFirst(subS, "")
        counter++
    }
    print(counter++)


// Another solution:
    val st = readLine()!!
    val subSt = readLine()!!
    val result = st.split(subSt)
    println(result.lastIndex)


// Yet another solution
    println(readln().split(readln()).lastIndex)
}


fun euphoniousWord(){
//    All the letters of the English alphabet are divided into vowels and consonants.
//    The vowels are: a, e, i, o, u, y.
//    The remaining letters are consonants.
//    A word is considered euphonious if it doesn't have three or more vowels or
//    consonants in a row. Otherwise, it is considered discordant.
//    Your task is to create euphonious words from the discordant ones. You can
//    insert any letters inside the word. Output the minimum number of characters
//    needed to create a euphonious word from a given word.
//    For example, the word "schedule" is considered discordant because it
//    has three consonants in a row: "sch". To create a euphonious word
//    you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
    // My solution :D
    // I spent almost three days on this problem :D

    val str = "Schedule"
    val vowels = "aeiouy"
    var count = 0
    for (i in 1..str.lastIndex) {
        if (str[i] !in vowels && i % 2 == 0 && i > 1 && str[i - 1] !in vowels) {
            count++
        } else if (str[i] in vowels && i % 2 == 0 && i > 1 && str[i - 1] in vowels) {
            count++
        }
    }
    println(count)
}


fun pieceOfAlphabet() {
//    Write a program that reads a string and output true only when the letters
//    of this string form a substring of the ordered English alphabet,
//    for example, "abc", "xy", "pqrst".
//    Otherwise, it should print out false.
//    Note: string can consist of a single character. Assume an empty
//    string as an alphabet substring.

    val subStr = "abc"
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    println(subStr in alphabet)
}


fun parseUrl() {
//    You want to hack a website and get all available parameters.
//    Print them "key : value". If a parameter doesn't have value, print "not found".
//    If you find the password (parameter pass), you should print its value after
//    all parameters once again, but with a key password. If a URL does not contain
//    a parameter pass, do not print anything after parameters. But if
//    the pass parameter is present, its value cannot be empty
//    Note: the order of parameters should be like as in the URL.
//    Advice: learn the structure of URL.

//    https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
//    pass : 12345
//    port : 8080
//    cookie : not found
//    host : localhost
//    password : 12345

//   val url = "https://target.com/index.html?port=8080&cookie=&host=localhost"
//   val url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost"
    val url = "https://target.com/index.html?port=8080&name=Bob&cookie=&host=localhost"
    val pass = url.substringAfter("pass=").substringBefore("&")
    val port = url.substringAfter("port=").substringBefore("&")
    val name = url.substringAfter("name=").substringBefore("&")
    val cookie = url.substringAfter("cookie=").substringBefore("&")
    val host = url.substringAfter("host=")

    val urlComponents: MutableList<String> = mutableListOf<String>(pass, port, cookie, host)

    for (i in 0 until urlComponents.size) {
        if (urlComponents[i].isEmpty()) {
            urlComponents[i] = "not found"
        }
    }

    if ("pass=" in url) {
        print("""
             pass : ${urlComponents[0]}
             port : ${urlComponents[1]}
             cookie : ${urlComponents[2]}
             host : ${urlComponents[3]}
             password : $pass
         """.trimIndent())
    } else  {
        print("""
             port : ${urlComponents[1]}
             cookie : ${urlComponents[2]}
             host : ${urlComponents[3]}
         """.trimIndent())
    }
}


//------------------------ Substring -----------------------------


fun gettingPartOfString() {
//    Oftentimes, you need to get only a certain part of a string. Kotlin provides the
//    substring function for this.
//
//    The substring function accepts startIndex (inclusive) and lastIndex (exclusive)
//    as arguments and returns a string that starts at the startIndex and ends
//    right before the lastIndex.

    val greeting = "Hello"
    println(greeting.substring(0, 3)) // "Hel"
    println(greeting.substring(1, 3)) // "el"
    println(greeting.substring(2))    // "llo"
    println(greeting.substring(4, 5)) // "o"
//    The parameter lastIndex can be omitted; then you will get a substring from
//    the startIndex element to the end of the original string.

//    The expression greeting.substring(0, 3) returns "Hel" instead of "Hell" because
//    substring returns characters from the one at startIndex to the one right before lastIndex.


}


fun substringAfter() {
//    The substring method is not the only way to get part of a string.
//    You can also use the substringAfter and substringBefore functions:
    val greeting = "Hello"
    println(greeting.substringAfter('l'))  // "lo"
    println(greeting.substringBefore('o')) // "Hell"
    println(greeting.substringBefore('z')) // "Hello"
//    These functions accept delimiter as an argument and return a string before/after
//    the first occurrence of a specified delimiter. If the string does not contain any
//    occurrences of the delimiter argument, the function returns the whole string.

//    Just keep it in mind that as a second argument, you can specify the message to be
//    returned if the delimiter argument is not present in the string.
//    For example, .substringBefore('z', "can't find a character").

}


fun substringAfterLast() {
//    The functions substringBeforeLast and substringAfterLast have a logic similar
//    to substringBefore and substringAfter but return a string before or after the
//    last occurrence of the delimiter.
    val greeting = "Hello"
    println(greeting.substringAfterLast('l'))  // "o"
    println(greeting.substringBeforeLast('l')) // "Hel"
}


fun replacePartOfString() {
//    You've probably been in a situation when you need to replace just one word
//    in a string. The replace function replaces all occurrences of the
//    first argument in the string with the second argument.
    val example = "Good morning..."
    println(example.replace("morning", "bye")) // "Good bye..."
    println(example.replace('.', '!'))         // "Good morning!!!"


//    As you know, strings are immutable, so the replace function returns a new string without changing the original string. So, if you run this code:
//    val example = "Good morning"
//    example.replace("morning", "bye")
//    println(example)
//    It still prints Good morning.


//    If you need to replace only the first occurrence of an argument, use replaceFirst.
    val examplee = "one one two three"
    println(examplee.replaceFirst("one", "two")) // "two one two three"
}


fun changeCase() {
//    What if you need to replace all capital letters in a word with lowercase letters?
//    Try to imagine how you would do it with the replace function.
//    Now, that's too much code, right? Fortunately, in Kotlin you can use
//    the lowercase function:
    var example = "UPPERCASE String"
    println(example.lowercase()) // uppercase string
//    If you need to do the opposite, then use the uppercase function:

    example = "Lowercase String"
    println(example.uppercase()) // LOWERCASE STRING
//    If you work with the old version of the Kotin language (earlier than 1.5), you may use the functions toLowerCase() and toUpperCase(). However, since Kotlin 1.5, you should use the lowercase() and uppercase() functions.
}

fun swapFirstAndLastChars() {
    // Swipe first and last character of a string!
    // Code below is MY CODEEE!!! :DDDD
    val myString = "kowia"
    val firstChar = myString[0]
    val lastChar = myString[myString.length - 1]
    println("$lastChar" + "${myString.substring(1, myString.length - 1)}" + "$firstChar")
}


fun upperCaseAfterlastU() {
//    Write a program that capitalizes all letters after the last u symbol
//    in a word (all letters after last 'u' should be uppercase) and
//    prints the resulting string.
    // my solution
    val str = "analogueaxis"
    println(str.substringBeforeLast('u') + 'u' + str.substringAfterLast('u').uppercase())

// another solution
    val myText = "dominesquefam"
    println(myText.replaceAfterLast('u', myText.substringAfterLast('u').uppercase()))

}

fun main() {
//    String
//    stringMethods()
//    concatenateCharWithString()
//    charPlusStringPlusInt()
//    stringRepeat()
//    rawString()
//    abracadabra()
//    stringTemplates()
//    stringTemplatesForBuildingString()
//    templatesForExpressions()
//    ignoreCase()
//    accessingCharacters()
//    emptyString()
//    Immutability()
//    comparingStrings()
//    split()

    // Problems
//    stringWithDoubleChars()
//    convertDate()
//    palindrome()
//    longestWord()
//    cutOutMiddleString()
//    firstOccurrence()
//    gc_Content()
//    luckyTicket()
//    luckyNumber()
//    numberOfOccurrences()
//    euphoniousWord()
//    pieceOfAlphabet()
//    parseUrl()



//    substring
    gettingPartOfString()
    substringAfter()
    substringAfterLast()
    replacePartOfString()
    changeCase()

//    problems
    swapFirstAndLastChars()
    upperCaseAfterlastU()
}
