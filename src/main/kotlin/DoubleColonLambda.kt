fun main() {


    fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2 until n) {
            if (n % i == 0) return false
        }
        return true
    }

    fun containsNumbers(str: String): Boolean {
        if (str.contains("[0-9]".toRegex())) {
            return true
        }
        return false
    }

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val primeNumbers = numbers.filter(::isPrime)

    println("Original list $numbers")
    println("Prime numbers from list $primeNumbers")

    val strs = listOf("cat", "d0ggie", "muzzle")
    val stringsWithNumbers = strs.filter(::containsNumbers)
    println("original array")
    println("strings that contain numbers: $stringsWithNumbers")


}

