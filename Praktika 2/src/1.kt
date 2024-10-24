fun main() {
    val number = 37 // Замените на любое двузначное число

    val tens = number / 10 // Число десятков
    val units = number % 10 // Число единиц
    val sum = tens + units // Сумма цифр
    val product = tens   // Произведение цифр

            println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")
}
