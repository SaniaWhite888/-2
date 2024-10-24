fun main() {
    val number = 123 // Замените на любое трехзначное число

    val units = number % 10 // Число единиц
    val tens = (number / 10) % 10 // Число десятков
    val hundreds = number / 100 // Число сотен
    val sum = hundreds + tens + units // Сумма цифр
    val product = hundreds  // Произведение цифр

    println("Число единиц: $units")
    println("Число десятков: $tens")
    println("Сумма цифр: $sum")
    println("Произведение цифр: $product")
}