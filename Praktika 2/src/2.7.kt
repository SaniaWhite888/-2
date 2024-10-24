fun main(){
    val a7 = true
    val b7 = false
    val c7 = false

    println("\nЗадание 7")
    println("a) ${a7 || ! (a7 && b7) || c7}") // Истина
    println("б) ${!a7 || a7 && (b7 || c7)}") // Истина
    println("в) ${(a7 || b7 && !c7) && c7}") // Ложь
}