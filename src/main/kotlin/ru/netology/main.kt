package ru.netology

fun main() {
    val amount = 70_000_00
    println(commission(amount))
}

fun commission(sum: Int): Int {
    val commis = sum * 0.075
    if (commis > 35_00) {
        return commis.toInt()
    } else {
        return 35_00
    }
}