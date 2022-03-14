// Task #2
fun main() {

    val likes = 61

    val description = if (likes * 10 - (likes / 10) * 100 == 10) "человеку" else "людям"

    println("Понравилось $likes $description")

}