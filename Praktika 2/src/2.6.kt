fun main(){
    val x6 = false
    val y6 = false
    val z6 = true

    println("\nЗадание 6")
    println("a) ${x6 || y6 && !z6}") // Ложь
    println("б) ${!x6 && !y6}") // Истина
    println("в) ${! (x6 && z6) || y6}") // Истина
    println("г) ${x6 && !y6 || z6}") // Истина
    println("д) ${x6 && (!y6 || z6)}") // Ложь
    println("е) ${x6 || (! (y6 || z6))}") // Ложь
}