// Task #2
fun main() {

    val likes = 111

    val description = if (likes % 10  == 1 && likes % 100 != 11 ) "человеку" else "людям"

    println("Понравилось $likes $description")

}