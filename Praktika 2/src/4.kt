fun main() {
    val base = 7 // Основание степени
    val exponent = 3 // Показатель степени

    val result = Math.pow(base.toDouble(), exponent.toDouble()).toInt() // Возведение в степень

    println("$base в степени $exponent равно $result")
}