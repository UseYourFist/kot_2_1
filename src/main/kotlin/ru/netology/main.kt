package ru.netology

fun main() {
    val amount = 70_000_000
    println(commission(amount).toInt())
}

fun commission(sum: Int): Double {
    val commis = sum * 0.0075
    if (commis > 35_000) {
        return commis
    } else {
        return 35000.00
    }
}