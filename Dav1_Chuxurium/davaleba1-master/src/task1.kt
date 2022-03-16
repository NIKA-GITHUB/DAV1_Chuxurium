

import kotlin.math.round

fun main(int: Array<String>) {
    var numArray = intArrayOf(2,3,4,5,6)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }
    val average = sum / numArray.size
    println(round(average))

}



