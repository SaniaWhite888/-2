fun main(){
    val a3 = true
    val b3 = false
    val c3 = false

    println("\nЗадание 3")
    println("a) ${!a3 && b3}") // Ложь
    println("б) ${a3 || !b3}") // Истина
    println("в) ${a3 && b3 || c3}") // Ложь
}