
fun main() {
    compressionAlgorithm()

}

fun compressionAlgorithm() {

//    Processing Strings
//    Compression algorithm
//    The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the
//    groups of the same characters of the input string are replaced by
//    the symbol and the number of its repetitions in this string.

    val str = "aaaabbcaa"
    var convertedStr = ""
    var currentLetter = str[0]
    var number = 0
    // aaaabbcaa
    for (i in 0 until str.length - 1) {
        if (currentLetter == str[i]) {
            currentLetter = str[i]
            number++
            if (currentLetter != str[i + 1]) {
                convertedStr += "$currentLetter${number}"
            }


        } else {
            currentLetter = str[i]
            number = 1
            if (currentLetter != str[i + 1]) {
                convertedStr += "$currentLetter${number}"
            }

        }
    }
    println(convertedStr)
}







