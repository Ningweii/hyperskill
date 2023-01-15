
//--------------------------------- Mutable List ---------------------------------


fun mutableList() {
//    MutableList is an ordered list of variables of the same type.
//    You can access the list items by their indexes.
//    val numbers = mutableListOf(10.8, 14.3, 13.5, 12.1, 9.7)
//    println(numbers) // [10.8, 14.3, 13.5, 12.1, 9.7]


//    Here is an example of creating a mutable list in cases when we know the content type.
//    In angle brackets <>, you may specify the type of data that will be stored in the list.

//declaring a mutable list of integers
    val mutableListA = mutableListOf<Int>(1, 2, 3, 4, 3)
    println(mutableListA)

//declaring a mutable list of strings
    val mutableListB = mutableListOf<String>("Kotlin", "JetBrains")
    println(mutableListB)

//declaring an empty mutable list of booleans
    val mutableListC = mutableListOf<Boolean>()
    println("Empty list $mutableListC")


//    Also, Kotlin allows you to not explicitly specify what type of data the list stores:
//declaring a mutable list of integers
    val mutableListD = mutableListOf(1, 2, 3, 4, 5)
    println(mutableListA) // [1, 2, 3, 4, 5]


    // Mutable list size
//    To create a mutable list of a specified size n, we use the MutableList(n) function:
//    val list = MutableList(5) { 0 }
//    println(list) // [0, 0, 0, 0, 0]


//    Reading list from input
//    To read a list of a certain size from the console, we first need to create a MutableList
//    of some type with a known size. Inside the parentheses, we should place readln(),
//    with the help of which we can read input from the console. The readln() function returns
//    a string, so don’t forget to convert the input string into the type of the created list.
    val numbersE = MutableList(5) { readln().toInt() } // on each line single numbers from 1 to 5
    println(numbersE) // [1, 2, 3, 4, 5]



    // Reading List In a Single Line
//    If you want to read a list in a single line, use the following approach. You can read
//    the list with the readln() function. You’ll get a string, which you should split.
// here we have an input string "1 2 3 4 5"
    val numbersF = readln().split(" ").map { it.toInt() }.toMutableList()
    println(numbersF) // [1, 2, 3, 4, 5]
//    Let’s have a look at this code snippet. We read a string from input and then
//    use split(). We divide our string into smaller ones by space, then we use the map
//    function to convert every element to Int, and then we convert the
//    result to MutableList. Here you can read more about mapping transformation.



    // Ignoring Extra Spaces In Input
//    There is also a way that allows you to ignore line breaks and extra spaces in the
//    input string. You can do this with the help of regular expressions, which are
//    often used in text searching and editing.
    val regex = "\\s+".toRegex()  // 1 or more whitespace character (space, tabs etc.)
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toMutableList()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6




    // Interesting MutableList Code With Index ->
    val numbers = MutableList(100) { index ->
        if (index == 0 || index == 9 || index == 99) index + 1 else 0
    }
    println(numbers)




    // joinToString()
    val myList = mutableListOf("Peter", "Pavel", "Ivan")
    println(myList)
    println(myList.joinToString())
    println(myList.joinToString(" -> "))




    // Joining Mutable Lists
    val northCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val blueStars = mutableListOf("Ginan", "Mu Crucis")

    val newList = northCross + blueStars
    println(newList.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis




    // Comparing Mutable Lists
    val firstList = mutableListOf("result", "is", "true")
    val secondList = mutableListOf("result", "is", "true")
    val thirdList = mutableListOf("result")

    println(firstList == secondList)  //  true
    println(firstList == thirdList)   //  false
    println(secondList != thirdList)  //  true




    // Changing Mutable List Content
//    No matter which keyword you're using, val or var, you can still edit the values
//    of the existing elements through their index. This is possible because when we change
//    the contents of a list, we do not create a new list (the link to the list is not changed):
    val westernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    var brightStars = mutableListOf("Ginan", "Mu Crucis")
    westernCross[1] = "star"
    brightStars[1] = "star"

    println(westernCross[1]) // star
    println(brightStars[1]) // star


    // Removing and Adding elements
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = mutableListOf("Ginan", "Mu Crucis")
    val names = mutableListOf("Jack", "John", "Katie")
    val food = mutableListOf("Bread", "Cheese", "Meat")
    val fruits = mutableListOf("Apple", "Banana", "Grape", "Mango")

    southernCross.removeAt(0)
    southernCross.remove("Mimosa")

    stars.add("New star")
    stars.add(0, "First star")

    names.clear()

    food.addAll(fruits)

    println(names) // []
    println(southernCross.joinToString()) // Gacrux, Imai
    println(stars.joinToString()) // First star, Ginan, Mu Crucis, New star
    println(food.joinToString()) // Bread, Cheese, Meat, Apple, Banana, Grape, Mango

//    add(element) and add(index, element) insert new items at any position in the list.
//    If you don't specify the index, the item will be added to the end of the list.
//    list1.addAll(list2) adds all elements from list2 to the end of the list1.
//    remove(element) and removeAt(index) delete an item from the list. The former
//    function deletes a single instance of the specified element from the list
//    (it returns true if the item was successfully removed, otherwise it returns false).
//    The latter function deletes the element at the specified position and returns
//    the element that has been removed.
//    clear() deletes all elements from the list.


//    Also, you can use += to add new elements to the list:
    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
    val intList1 = mutableListOf(1, 2, 3, 4, 5)
    val intList2 = mutableListOf(5, 4, 3, 2, 1)

    vowels += 'y'
    intList1 += intList2

    println(vowels)   // [a, o, i, e, u, y]
    println(intList1) // [1, 2, 3, 4, 5, 5, 4, 3, 2, 1]


    // Copying List
//    Kotlin doesn't have any functions to copy existing lists. However, you can do
//    it using the toMutableList() function:

    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toMutableList()
    print(copyList) // [1, 2, 3, 4, 5]

//    This function creates a new MutableList and adds the contents of list to the new list.
//    It works like this:
//    val list = mutableListOf(1, 2, 3, 4, 5)
//    val copyList = mutableListOf<Int>()
//    copyList.addAll(list)


    // Other Useful Functions

//    There are some operations that can be really useful when you work with
//    lists and their contents:

//    list.isEmpty() and list.isNotEmpty() – check whether the list is empty.
//    list.subList(from, to) – creates a smaller list (sublist), which includes
//    items of the original list with the following indexes: from,
//    from + 1, ..., to - 2, to - 1. The element with the index to is not included.

    val numberss = mutableListOf(1, 2, 3, 4, 5)
    var sublist = mutableListOf<Int>()
    if (numbers.isNotEmpty() && numberss.size >= 4) {
        sublist = numberss.subList(1, 4)
    }
    print(sublist) // [2, 3, 4]


//    element in list – checks if an element belongs to the list.
//    list.indexOf(element) – searches for the index of an element in the list.
//    The result of this function is -1 if there is no such element in the list.
//    Otherwise, when we access the list by the calculated index, we get the element.
    val numbersss = mutableListOf(1, 2, 3, 4, 5)
    if (5 in numbersss) {
        println(numbersss.indexOf(5)) // 4
    }
    print(numbersss.indexOf(7)) // -1


//    list.minOrNull() and list.maxOrNull() – search for the minimum and
//    maximum elements in the list.
//    list.sum() – returns the sum of the elements in the list.
//    list.sorted() and list.sortedDescending() – build a sorted list (ascending or descending)
//    from the available list.
    val myNumbers = mutableListOf(1, 2, 3, 4, 5)

    val myVowels = mutableListOf('e', 'a', 'y', 'i', 'u', 'o')

    println(myNumbers.minOrNull()) // 1
    println(myNumbers.maxOrNull()) // 5
    println(myNumbers.sum())      // 15

    println(myVowels.sorted()) // [a, e, i, o, u, y]
    println(myVowels.sortedDescending()) // [y, u, o, i, e, a]
}



fun forLoopAndMutableList() {
    // Simplest Way To Iterate Through Elements Via For Loop
    val animals = readLine()!!.split(" ").map { it }.toMutableList()
    for (animal in animals) {
        println(animal)
    }


    // Iterating By Indices
    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in daysOfWeek.indices){
        println("$index: ${daysOfWeek[index]}")
    }

    // Iterating By Range Indexes
        val weekDays = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
        for (index in 1..5) {
            println("$index: ${weekDays[index]}")
        }

    // Reverse And Step
    val weeDays2 = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in weeDays2.lastIndex downTo 0 step 2) {
        println("$index: ${weeDays2[index]}")
    }

//    Reading Mutable List Element
//    The program below reads integer numbers and prints them in reverse order.
    fun main() {
        val size = readln().toInt()
        val mutList: MutableList<Int> = mutableListOf()
        for (i in 0 until size) {
            mutList.add(readln().toInt())
        }

        for (i in mutList.lastIndex downTo 0) {
            print("${mutList[i]} ")
        }
    }
}


//---------------------------- Multi-dimensional list ----------------------

fun listOfLists() {

//    First, let's figure what we mean by a multi-dimensional list.
//    Basically, we can say that a multi-dimensional list is a list of lists. That is,
//    in order to create a multi-dimensional list, we need to present a list as an element
//    of another list. Eventually, we get a multi-dimensional list.
//    Such lists make it very easy to represent things that have many dimensions:
//    for example, 3D objects with length, height, and width. The universe we live in
//    could be described with four measurements, time being the fourth dimension, so
//    it is 4D. Higher levels, like 5D and so forth, are hard to imagine, but when you put
//    the concept into practice, they turn out to be handy and not too complicated!
//    Let's look at some more down-to-earth examples. A seat in the theater can be
//    indicated with a 2D-list: one index for the row and another one for the number of
//    the seat in that row. If you want to write a game that uses maps, such as Sea Battle,
//    two-dimensional lists will be very helpful in setting coordinates on the map.
//    In addition, some mathematical structures are conveniently represented as
//    multi-dimensional lists.
//    First, let’s take a look at a special case of a multi-dimensional list that is
//    used quite often in practice: a two-dimensional list.

//    While a one-dimensional list can be represented as a single sequence of elements,
//    an intuitive way of representing a two-dimensional list is a matrix or a table.
//    If you're working with matrices or tables in your program, it makes sense to
//    present them in the form of a two-dimensional list.
//    Let's create a two-dimensional mutable list of Int with 3 rows and 4 columns
//    where all elements are 0's (zeros). Here is what it looks like:
    val mutList2D = mutableListOf(
        mutableListOf<Int>(0, 0, 0, 0),
        mutableListOf<Int>(0, 0, 0, 0),
        mutableListOf<Int>(0, 0, 0, 0)
    )


//    You simply define each element of the mutList2D as a list of four zeros! It is easy
//    to picture it like this:
//    0  0	0  0
//    0	 0	0  0
//    0	 0  0  0

//    We can say that the lists with four zero elements are nested in the mutList2D.
//    The list that contains other lists is called the projects.main list.
//    Note an interesting feature: nested lists do not necessarily have to be the same size.
//    In the example below, each new embedded list has a different length:
    val muttList2D = mutableListOf(
        mutableListOf<Int>(0),
        mutableListOf<Int>(1, 2),
        mutableListOf<Int>(3, 4, 5)
    )
//    You can create nested lists with different numbers of elements in the same 2D list.
}


fun accessingElements() {
//    Let’s see how we can access an element of a list. The principle is exactly
//    the same as for one-dimensional lists. Only now we have to write two indices:
//    first, the index of the element of the projects.main list and then, the index of the
//    nested list.
//    Let's get back to our mutList2D for a moment. Suppose we need to access
//    an element that is in the first row and the first column. How do we find this
//    particular element? As you recall, mutList2D is a list of lists. So, start by
//    selecting one of the nested lists by its index in the projects.main list. The principle
//    is similar to a 1D list.
//    First, go to the nested lists and choose the inner list with its index:

    val mutList2D = mutableListOf(
        mutableListOf<Int>(0, 1, 2),   //[0]
        mutableListOf<Int>(3, 4, 5)    //[1]
    )
//    mutList2D[0]	0	1	2
//    mutList2D[1]	3	4	5

//    Second, in this nested list, choose the required element with its index,
//    just like we did with 1D lists:
//    mutList2D[0][0]	mutList2D[0][1]	mutList2D[0][2]
//    0	1 2
//    Let's print mutList2D[0][0]: the element in the first row and the first
//    column of our mutList2D:
    val muttList2D = mutableListOf(
        mutableListOf<Int>(0, 1, 2),   //[0]
        mutableListOf<Int>(3, 4, 5)    //[1]
    )
    println(muttList2D[0][0])	// 0

//    Remember that in all lists indexing starts with 0!
//    The following code will show all the elements of the
//    two-dimensional list mutList2D:
    print(mutList2D[0][0])  // 0
    print(mutList2D[0][1])  // 1
    print(mutList2D[0][2])  // 2
    print(mutList2D[1][0])  // 3
    print(mutList2D[1][1])  // 4
    print(mutList2D[1][2])  // 5
}


fun creating2dListsOfDifferentTypes() {
//    Nested lists don't need to be of type Int: as you remember, Kotlin provides
//    various types of lists. For example, you can create a list of string lists
//    as in the example below.
//    You can also clearly define the type of elements of nested lists:
    val mutListOfString2D = mutableListOf(
        mutableListOf<String>("to", "be", "or"),
        mutableListOf<String>("not", "to", "be")
    )

//    In order to create nested lists of primitives, you can use lists of a
//    certain type as we did for one-dimensional lists: Int, Long, Double, Float, C
//    har, Short, Byte, and Boolean.
//    For example, let's consider creating a mutable list of the character type:
    val mutListOfChar2D = mutableListOf(
        mutableListOf<Char>('A', 'R', 'R'),
        mutableListOf<Char>('A', 'Y', 'S')
    )

//    You can imagine it like this:
//    A	R R
//    A	Y S
//    Besides, nested lists can be of different types. For example, you can create
//    a two-dimensional list that stores both Int and String lists:
    val mutListOfStringAndInt2D = mutableListOf(
        mutableListOf<String>("Practice", "makes", "perfect"),
        mutableListOf<Int>(1, 2)
    )
//    You can create nested lists of different types in the same 2D list.
}


fun featuresOfWorkingWith2dLists() {
//    Let’s look at some useful and interesting features of working with
//    two-dimensional lists. You remember that we can print all the elements
//    of a list as a string using the joinToString() function. For nested lists,
//    it will also work. Only now you must specify the index of the nested list
//    that you want to convert to a string:
    val mutListString = mutableListOf(
        mutableListOf<String>("A", "R", "R", "A", "Y")
    )
    print(mutListString[0].joinToString())    // A, R, R, A, Y

//    In the case of multi-dimensional lists, this will not always be convenient.
//    In order to get the contents of all lists in a single string, you just print
//    the projects.main list:
    val mutListOfChar2D = mutableListOf(
        mutableListOf<Char>('k'),
        mutableListOf<Char>('o', 't'),
        mutableListOf<Char>('l', 'i', 'n'))

    println(mutListOfChar2D)	// [[k], [o, t], [l, i, n]]
}


fun moreThanTwoDimensions() {
//    We are finally ready to deal with more complex concepts. There are lists
//    with more than two dimensions. Even though it is more difficult to understand
//    what it looks like, don’t worry: you will get used to working with them.
//    You can imagine a three-dimensional list like this:
//    [0, 1]	[2, 3]
//    [4, 5]	[6, 7]
//    In each element of a two-dimensional list, you have another nested list.
//    You can imagine it as a cube or a box: it has exactly three dimensions — length,
//    width, and height. Take the following practical situation: imagine that you
//    need to figure out the location of a car in a multi-storey parking lot.
//    Then, you have to set three numbers, the three coordinates: floor, row,
//    and place in a row.
//    The following code creates the three-dimensional mutable list
//    you just saw above:
    val mutList3D = mutableListOf(
        mutableListOf(mutableListOf<Int>(0,1), mutableListOf<Int>(2,3)),
        mutableListOf(mutableListOf<Int>(4,5), mutableListOf<Int>(6,7))
    )
    println(mutList3D)  // [[[0, 1], [2, 3]], [[4, 5], [6, 7]]]

//    Accordingly, in order to refer to an element of such a list, we need
//    three indices:
    println(mutList3D[0][0][1])   // 1
    println(mutList3D[1][0][1])   // 5
    println(mutList3D[1][1][1])   // 7
//    You can create lists with even more dimensions by analogy — 4, 5, 6 dimensions,
//    and so on — as you need. Just remember that an element of a multidimensional
//    list has as many indices as there are dimensions in that list.
}

fun prefixPostfix() {
    // joinToString prefix and postfix
    val numArr = intArrayOf(3, 4, 5)
    println(numArr.joinToString(prefix = "#", postfix = "&"))
}

fun allFunction() {
    val n = readLine()!!.toInt() // read the value of N from the first line

    // read the numbers from the subsequent lines and check if they are sorted in ascending order
    val isSorted = (1..n).all { readLine()!!.toInt() > it - 1 }

    // print the result
    println(if (isSorted) "YES" else "NO")
}





fun main() {
//    mutableList()
//    forLoopAndMutableList()

//    Multidimensional list
    listOfLists()
    accessingElements()
    creating2dListsOfDifferentTypes()
    featuresOfWorkingWith2dLists()
    moreThanTwoDimensions()
}




