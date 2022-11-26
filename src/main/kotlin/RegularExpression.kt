
fun creatingRegularExpression() {
//    Creating a regular expression
//    Let's look at two possible ways to make a regex instance in Kotlin.
//    The first way is creating a String instance and then calling the
//    method toRegex(), which will make a regex out of that string:

    val string = "cat" // creating the "cat" string
    val regex = string.toRegex() // creating the "cat" regex


//    Another way is calling the Regex constructor:
    val regexx = Regex("cat") // creating a "cat" regex
//    The result will be the same: we’ll get the required regular expression.
//    For now, we can assume that these options are equally good, and
//    choosing one over the other is a matter of personal preference.
}


fun simpleMatching() {
//    Now let’s see how we can actually use regexes. The first method we will
//    consider is matches(). It is used for finding a full match, that is,
//    the whole string has to match the pattern.
//    Take a look at the signature: fun Regex.matches(string: CharSequence):
//    Boolean. As you see, it takes a regex, calls the string that will be
//    matched against the regular expression, and returns the boolean result.
//    If you want more example, check out the following code snippet:

    val regex = Regex("cat") // creating the "cat" regex

    val stringCat = "cat"
    val stringDog = "dog"
    val stringCats = "cats"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringDog))   // false
    println(regex.matches(stringCats))  // false
//    As you can see in the example above, when our regex is just a sequence
//    of simple characters, the result will be true only when the string
//    matches the regex perfectly.
//    This might seem a little excessive: after all, we could simply
//    compare two strings, which would be faster and easier.
//    This is true, but remember that the true power of regular expressions
//    is the option to use special characters that can define a certain
//    pattern. This pattern can be matched against multiple strings at once.
//    Let's now move on to some more interesting cases.
}


fun dotCharacter(){
//    The dot character
//    This special character is already familiar to you: the dot . matches
//    any single character including letters, digits, spaces, and so on.
//    The only character it cannot match is the newline character \n.
//    Other control characters such as \b and \t will still match.
//    Consider the following examples of using the dot:

    val regex = Regex("cat.") // creating the "cat." regex

    val stringCat = "cat."
    val stringEmotionalCat = "cat!"
    val stringCatWithSpace = "cat "
    val stringCatN = "cat\n"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringEmotionalCat))   // true
    println(regex.matches(stringCatWithSpace))  // true
    println(regex.matches(stringCatN))  //false
//    It's not complicated but certainly useful. For example, it can come
//    in handy when you need to find the same word that appears in the text
//    in different forms.
}


fun questionMark() {
//    The question mark
//    The question mark ? is a special character that denotes optionality.
//    It means “the preceding character or nothing”.
//    The following example illustrates how it works:

    val regex = Regex("cats?") // creating the "cats?" regex
    val stringCat = "cat"
    val stringManyCats = "cats"
    println(regex.matches(stringCat))   // true
    println(regex.matches(stringManyCats))   // true

//    You can also combine the dot character . and the question mark ? in one
//    regex pattern. This combination basically means that there can be any
//    single character or no character at all:

    val regexx = Regex("cat.?") // creating the "cat.?" regex
    val stringCatt = "cat"
    val stringManyCatss = "cats"
    val stringEmotionalCat = "cat!"
    val stringCot = "cot"
    println(regexx.matches(stringCatt))   // true
    println(regexx.matches(stringManyCatss))   // true
    println(regexx.matches(stringEmotionalCat))  // true
    println(regexx.matches(stringCot))   // false
//    This can make your work much easier, but wait a second: what if you need
//    to find the actual dot or the question mark?
}


fun escapeCharacter() {
//    If part of the actual regex happens to be a special character, this can
//    be managed with the escape character. When you create strings with special
//    characters, you can escape them using a double backslash \\:
    val regex = Regex("cats\\?")

    val stringCat = "cat"
    val stringManyCats = "cats"
    val stringEmotionalCats = "cats?"

    println(regex.matches(stringCat))   // false
    println(regex.matches(stringManyCats))   // false
    println(regex.matches(stringEmotionalCats))  // true
//    In the example above, the question mark was interpreted as a question
//    mark and nothing more.
//    So, if you need to find a special character such as a dot or a
//    question mark, you can escape it with \\. The characters on which
//    you used the escape symbol \\ will not be interpreted as special.
}


fun sets() {
//    Sets of characters
//    Each set consists of multiple characters but corresponds to a single character
//    in the string. Sets are enclosed in square brackets []. For example,
//    the set "[abc]" means that a single character "a", "b", or "c" can match it.
//    Take a look at the example below:
    val regex = Regex("[bcr]at") // it matches strings "bat", "cat", "rat", but not "fat"

    regex.matches("rat") // true
    regex.matches("fat") // false
//    You can use as many sets as you want and combine them with regular characters.
//    There are two sets in the following example:

    val pattern = "[ab]x[12]" // can match a or b followed by x followed by either 1 or 2
//    This pattern can be successfully matched by the following strings:
//    "ax1", "ax2", "bx1", "bx2"

//    Meanwhile, the following strings do not match the pattern:
//    "xa1", "aax1", "bx"
//    As you can see, the order of sets in regular expressions is important. On the
//    other hand, the order of characters within the set does not matter.
}


fun rangesOfCharacters() {
//    RAnges of characters
//    Sometimes we want to make our character sets quite large. In this case,
//    we don't have to write them all down: we can specify a range designated
//    by the hyphen symbol - instead. The character that precedes the hyphen
//    denotes the starting point of the range; the character after the hyphen is the
//    last character that falls into the range. We can put characters into a set
//    as a range if they immediately follow each other in the ASCII/Unicode encoding table.
//    This includes both alphabetically ordered letters and numeric values.
//    For example, we can write a set that matches every digit:
    val anyDigitPattern1 = "[0-9]" // matches any digit from 0 to 9

//    The same works for letter ranges, such as "[a-z]" or "[A-Z]". These ranges match
//    all Latin lowercase and uppercase letters respectively. These patterns are
//    case-sensitive; for a case-insensitive match, we can write the following regex:
    val anyLetterPattern2 = "[a-zA-Z]" // matches any letter "a", "b", ..., "A", "B", ...

//    Note that although the range [A-z] is technically valid, it includes additional
//    symbols that are placed between uppercase and lowercase letters in the ASCII table.
//    As you can see, you can easily put several ranges in one set and mix them with
//    separate characters in any order:
    val anyLetterPattern3 = "[a-z!?.A-Z]" // matches any letter as well as "!", "?", and "."
}


fun excludingCharacters() {
//    In some cases, it is easy to define which characters are not wanted. Then, we can
//    write a set that will match everything except the characters mentioned in it.
//    To do that, we write the hat character ^ as the first one in the set.
    val regex = "[^abc]".toRegex() // matches everything except "a", "b", and "c"
    regex.matches("a") // false
    regex.matches("b") // false
    regex.matches("c") // false
    regex.matches("d") // true

//    The same works for ranges:
    val regex2 = "[^1-6]".toRegex()
    regex2.matches("1") // false
    regex2.matches("2") // false
    regex2.matches("0") // true
    regex2.matches("9") // true
}


fun avoidingCharactersInSets() {
//    Avoiding characters in sets
//    The general rule is that you do not need to avoid special characters within sets
//    if they are used in their literal meaning. For example, the set [.?!] will match
//    a single period, a question mark, an exclamation mark, and nothing else. However,
//    the characters used to define a set or a range should be avoided or put in a neutral
//    position – in case we look for their literal symbols:
//    to match the hyphen character, we should put it in the first or in the last position
//    in the set: "[-a-z]" matches lowercase letters and the hyphen, and "[A-Z-]" matches
//    uppercase letters and the hyphen;
//    hat ^ does not need to be avoided if placed anywhere but the beginning. This way,
//    the set "[^a-z^]" matches everything except for lowercase letters
//    and the hat character;
//    square brackets should always be escaped:
    val regex = Regex("[\\[\\]]") // matches "[" and "]"
}


fun alternations() {
//    So far, we've been talking about single characters. However, there's also a way
//    to match longer sequences. The vertical bar | is used to match character sequences
//    either before or after the symbol:
    val regex = "yes|no|maybe".toRegex() // matches "yes", "no", or "maybe",
    // but not "y" or "e"
    regex.matches("no") // true
//    This is useful in situations when we want to look for one of several particular words,
//    for example, "bear", "bat", or "bird" to complete the sentence
//    The giant ___ scared me and when it's easier to indicate whole words.
//    The vertical bar can be used together with parentheses, which designate
//    the boundaries of alternating substrings: everything within the parentheses
//    is an optional substring that can match the alternation block:

    val scaryAnimal = "(b|r|go)at".toRegex()  // matches "bat", "rat", or "goat"
    val answer = "The answer is definitely (yes|no|maybe)".toRegex()
//    In general, alternations are quite similar to sets: they describe multiple alternatives
//    that a particular part of the pattern can match. However, while sets can match
//    only a single character in the string, alternations are used to define
//    multi-character alternatives.
}


fun shortHands() {
//    There are several pre-defined shorthands for the commonly used character sets:
//    \d is any digit, short for [0-9];
//    \s is a whitespace character (including tab and newline), short for [ \t\n\x0B\f\r];
//    \w is an alphanumeric character (letter or numeral), short for [a-zA-Z_0-9];
//    \b is a word boundary. This one is a bit trickier: it doesn't match any
//    specific character but rather matches the boundary between an alphanumeric
//    character and a non-alphanumeric character (for example, a whitespace character)
//    or a boundary of a string (its end or start). This way, "\ba" matches all words
//    (sequences of alphanumeric characters) starting with "a", "a\b" matches all
//    words ending with "a", and "\ba\b" matches all separate "a" characters
//    preceded and followed by non-alphanumeric characters.

//    There are also negative counterparts of these shorthands that are equivalent
//    to the restrictive sets and match everything except for the characters
//    mentioned above:
//    \D is a non-digit, short for [^0-9];
//    \S is a non-whitespace character, short for [^ \t\n\x0B\f\r];
//    \W is a non-alphanumeric character, short for [^a-zA-Z_0-9].
//    \B is a non-word boundary. It matches the case opposite to that of the
//    \b shorthand: it finds its match every time whenever there is no "gap"
//    between alphanumeric characters. For example, "a\B" matches all words
//    that start with "a".
//    These shorthands make writing common patterns much easier.
//    Each shorthand has the same first letter as its representation
//    (digit, space, word, boundary). The uppercase characters are used to
//    designate the shorthands for negative character classes.

//    Example
//    Let's consider an example with the listed shorthands. Remember that
//    in Kotlin we use an additional backslash \ character for escaping.

    val regex = "\\s\\w\\d\\s".toRegex()
    regex.matches(" A5 ")   // true
    regex.matches(" 33 ")   // true
    regex.matches("\tA4\t") // true because tabs are whitespace as well
    regex.matches("q18q") // false, 'q' is not a space
    regex.matches(" AB ") // false, 'B' is not a digit
    regex.matches(" -1 ") // false, '-' is not an alphanumeric character, but '1' is OK.

//    Another way to write shorthand is to use raw strings.
//    You don't need to escape \ in this case:
    val regexx = """\W\S\D\S\W""".toRegex()
    regexx.matches(" 9o9 ")  // true
    regexx.matches("\nA 1 ")   // true
    regexx.matches("\tAl4\t") // true
    regexx.matches(" \taa ") // false, '\t' is a space
    regexx.matches("_BBB ") // false, '_' is an alphanumeric character

//    Here's how boundary shorthands will work in Kotlin code:
    val startRegex = "\\bcat".toRegex() // matches the part of the word that starts with "cat"
    val endRegex = "cat\\b".toRegex() // matches the part of the word that ends with "cat"
    val wholeRegex = "\\bcat\\b".toRegex() // matches the whole word "cat"
//    For now, we are not applying them in practice because we only deal
//    with the matches method, which requires a full string to match the regexp.

//    If you do not want to use shorthands, you can write the same
//    regex as below:
    val regexxx = "[ \\t\\n\\x0B\\f\\r][a-zA-Z_0-9][0-9][ \\t\\n\\x0B\\f\\r]".toRegex()
//    This regex, however, is long and not nearly as readable as the
//    previous ones. It also has a lot of character repetitions.
//    You can use the predefined shorthands instead of commonly used
//    sets and ranges to simplify your regexes and make them more readable.
}




//--------------------------------- Problems ------------------------------------

fun makeMatchesUppercase() {
    // Find regex pattern matches in a text and print them in upper case inside that text

    val txt = """
        Leave spaces and lines between projects.main ideas so you can revisit them later and add information. 
        Gender a consistent system of abbreviations and symbols to save time. 
        Write in phrases, not complete sentences. 
        Learn to pull out important information and ignore trivial information. 
    """.trimIndent().split(" ").toMutableList()

    println("ORIGINAL ARRAY OF STRINGS:\n $txt")

    var matchCounter = 0
    var matchIndex: MutableList<Int> = mutableListOf<Int>()
    var matchedWords: MutableList<String> = mutableListOf<String>()
    val rgxPattern = Regex("in")
    for (i in 0..txt.lastIndex) {
        if (txt[i].contains(rgxPattern)) {
            matchedWords.add(txt[i])
            matchCounter++
            matchIndex.add(i)
            for (j in 0..matchedWords.lastIndex) {
                txt[i] = matchedWords[j].uppercase()
            }
        }
    }

    println("SEARCH PATTERN:\n$rgxPattern")
    println("TOTAL MATCHES FOUND:\n$matchCounter")
    println("INDICES OF MATCHED WORDS:\n$matchIndex")
    println("MATCHED WORDS:\n$matchedWords")
    println("UPDATED ARRAY OF STRINGS:\n${txt.joinToString().replace(",", "")}")
}


fun iCanDoHomeworkOnTime() {
//    Imagine that you're a tutor. You need to write a program that
//    parses your students' answers and prints true if the answer is
//    I can do my homework on time! or I can't do my homework on time!
//    and false in all other cases.
//    To complete this task, use the function matches().
//    My solution:
    val str = "I can do my homework on time!".toRegex()
    val s = "I can't do my homework on time!"
    println(s.replace("'", ""))


//    Another solution
    val answer = "I can't do my homework on time!"
    println(Regex("I can('t)? do my homework on time!").matches(answer))
}


fun color() {
    val color = "colou?rs?".toRegex()
    val colors = mutableListOf<String>("color", "colour", "colors", "colours", )
    for (col in colors) {
        println(if (col.matches(color)) col else "")
    }

}


fun helpTeacher() {
//    Annie is a teacher. She has a special program that counts her students'
//    wrong answers. You decided to help her and write the part of the
//    program that will give a result based on the number of wrong answers.
//    You already have the report string which contains the number of
//    incorrect answers:
//    "10 wrong answers", "1 wrong answer", "3 wrong answers", and so on.
//    The test is considered passed if the student gave 9 or fewer wrong answers.
//    Your program must print "true" if the student has passed the test,
//    and "false" if the student has failed.
//    To complete this task, use the function matches().
//    Create a regex that fits the reports when a student has passed the exam,
//    compare the report with it, and print the result.

//    Sample Input 1:
//    20 wrong answers
//    Sample Output 1:
//    false
//    My solution
    val report = "10 wrong answers"
    val rgx = Regex("..? wrong answers?")
    val score = report.substringBefore(" ").toInt()
    print(if (report.matches(rgx) && score <= 9) "true" else "false")


//    also my solution (I improved other student's code)
    val reportt = "10 wrong answers".substringBefore(" ").toInt() <= 9
    println(reportt)
}


fun main() {
//    creatingRegularExpression()
//    simpleMatching()
//    dotCharacter()
//    questionMark()
//    escapeCharacter()
    sets()


    // Problems
//    makeMatchesUppercase()
//    iCanDoHomeworkOnTime()
//    color()
//    helpTeacher()
//    rangesOfCharacters()
//    excludingCharacters()
//    avoidingCharactersInSets()
//    alternations()
    shortHands()


}