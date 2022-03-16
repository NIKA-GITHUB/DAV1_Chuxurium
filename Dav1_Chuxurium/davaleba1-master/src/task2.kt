

fun main(args: Array<String>) {
    val word = "vio oiv"

    var reversWord = ""
    var length = word.length

    for (i in (length - 1) downTo 0) {
        reversWord = reversWord + word[i]
    }

    if (word.equals(reversWord, ignoreCase = true)) {
        println("True vio")
    } else {
        println("False")
    }
}