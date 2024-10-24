fun main(){
    val x5 = true
    val y5 = true
    val z5 = false

    println("\nЗадание 5")
    println("a) ${!x5 && y5}") // Ложь
    println("б) ${x5 || !y5}") // Истина
    println("в) ${x5 || y5 && z5}") // Истина
}