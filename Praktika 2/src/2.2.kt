fun main(){
    val x2 = false
    val y2 = true
    val z2 = false

    println("\nЗадание 2")
    println("a) ${x2 || z2}") // Ложь
    println("б) ${x2 && y2}") // Ложь
    println("в) ${x2 && z2}") // Ложь
}