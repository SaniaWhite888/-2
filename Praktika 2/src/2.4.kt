fun main(){
    val x4 = true
    val y4 = true
    val z4 = false

    println("\nЗадание 4")
    println("a) ${!x4 && y4}") // Ложь
    println("б) ${x4 || !y4}") // Истина
    println("в) ${x4 || y4 && z4}") // Истина
}