
fun main() {

//    List(3) { readln().split(' ').map(String::toInt) }.run {
//        val xyFree = mutableListOf((1..5).toMutableList(), (1..5).toMutableList())
//        map { xyFree[0] -= it[0]; xyFree[1] -= it[1] }
//        xyFree.map { println(it.joinToString(" ")) }
//    }

    List(3) { "2 3".split(' ').map(String::toInt) }.run {
        val xyFree = mutableListOf((1..5).toMutableList(), (1..5).toMutableList())
        map { xyFree[0] -= it[0]; xyFree[1] -= it[1] }
//        xyFree.map { println(it.joinToString(" ")) }
    }




}











