fun main() {
    val namOne = intArrayOf(7,8,8,1,2,3,2,5,4,2,0)
    val namTwo = intArrayOf(7,5,1,2,8,7,2,9,3)

    val a1 = namOne.toSet()
    val a2 = namTwo.toSet()

    val result = mutableListOf<Int>()

    for (item in a1){
        if (a2.contains(item)){
            val numRepeats = minOf(namOne.count { it == item },
                namTwo.count { it == item })
            repeat(numRepeats){result.add(item)}
        }
    }
    println(result)
}