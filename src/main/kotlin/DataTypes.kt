
fun MIN_MAX_VALUE() {
    val minByte = Byte.MIN_VALUE
    val maxByte = Byte.MAX_VALUE
    val minShort = Short.MIN_VALUE
    val maxShort = Short.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val maxInt = Int.MAX_VALUE
    val minLong = Long.MIN_VALUE
    val maxLong = Long.MAX_VALUE
    val minFloat = Float.MIN_VALUE
    val maxFloat = Float.MAX_VALUE
    val minDouble = Double.MIN_VALUE
    val maxDouble = Double.MAX_VALUE

    println("Minimum value of Byte is $minByte \nMaximum value of Byte is $maxByte")
    println("Minimum value of Short is $minShort \nMaximum value of Short is $maxShort")
    println("Minimum value of Int is $minInt (-2_147_483_648)\nMaximum value of Int is $maxInt (2_147_483_647)")
    println("Minimum value of Long is $minLong (-9_223_372_036_854_775_808)\nMaximum value of Long is $maxLong (9_223_372_036_854_775_807)")

    println("Minimum value of Float is $minFloat\nMaximum value of Float is $maxFloat")
    println("Minimum value of Double is $minDouble\nMaximum value of Double is $maxDouble")

    // Size of data types below!

}

fun SIZE_OF_DATA_TYPES() {

    // Size of data types below!

    val oneByte = Byte.SIZE_BITS
    val oneShort = Short.SIZE_BITS
    val oneInt = Int.SIZE_BITS
    val oneLong = Long.SIZE_BITS

    val oneFloat = Float.SIZE_BITS
    val oneDouble = Double.SIZE_BITS

    val oneChar = Char.SIZE_BITS

    val oneBoolean = 16

    println("The size of 1 Byte is $oneByte bits")
    println("The size of 1 Short is $oneShort bits")
    println("The size of 1 Int is $oneInt bits")
    println("The size of 1 Long is $oneLong bits")

    println("The size of 1 Float is $oneFloat bits")
    println("The size of 1 Double is $oneDouble bits")

    println("The size of 1 Char is $oneChar bits")

    println("The size of 1 Boolean is $oneBoolean bits")
}

// ------------------------ Type Conversion --------------------------



fun convertNumbers() {
    val myInt = 10
    val myDouble = myInt.toDouble()
    val myLong = myInt.toLong()
    val myString = myInt.toString()
    println(myString::class)
    println(myInt.toDouble().toLong().toShort()::class)
}

fun charToNumberAndViseVersa() {
    val num1 = 125
    val ch = num1.toChar()
    val num2 = ch.code
    println("Original number: $num1")
    println("Converted number is following character: $ch")
    println("Converted character is following number: $num2")
}

fun floatingToNonFloating() {
    val myDouble = 12.5
    val myLong = myDouble.toLong()
    println(myLong)
}

fun typeOverFlow() {
    val bigNum: Long = 100_000_000_000_000

    // number gets truncated :)
    val num: Int = bigNum.toInt() // 276447232; oops
    println(num)
}

fun conversionToShortAndByteTypes() {
    val floatNumber = 10f
    val doubleNumber = 1.0

//    val shortNumber1 = floatNumber.toShort() // avoid this
//    val byteNumber1 = doubleNumber.toByte()  // avoid this

    val shortNumber2 = floatNumber.toInt().toShort() // correct way
    val byteNumber2 = doubleNumber.toInt().toByte()  // correct way
}

fun oneLiner() =  println(readLine()!!.toDouble().toLong())

fun inputWithConversion() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val res = num1 + num2
    println("The result of $num1 + $num2 = $res")
}

fun typeCoercion() {
    val num: Int = 100
    val longNum: Long = 1000
    val result = num + longNum // 1100, Long

    val bigNum: Long = 100000
    val doubleNum: Double = 0.0
    val bigFraction = bigNum - doubleNum // 100000.0, Double
}

fun main() {
//    Data types
//    MIN_MAX_VALUE()
//    SIZE_OF_DATA_TYPES()


//    Type conversion
    convertNumbers()
    charToNumberAndViseVersa()
    floatingToNonFloating()
    typeOverFlow()
    conversionToShortAndByteTypes()
    oneLiner()
    inputWithConversion()
    typeCoercion()
}
