// Task #3
fun main() {

    val lastBuy = 10_050_00
    val discontGradeOneRub = 100_00
    val discontGradeTwoPrecent = 5
    val musicLover = true
    var currentBuy = 10_320_00

    if (lastBuy in 0..1000_00)  {
        currentBuy = currentBuy
    } else if (lastBuy in 1_001_00..10_000_00){
        currentBuy = currentBuy - discontGradeOneRub
    } else if (lastBuy >= 10_001_00){
        currentBuy = (currentBuy * (100 - discontGradeTwoPrecent)) / 100
    }

    if (musicLover == true) currentBuy = currentBuy * (100 - 1)
    val currentBuyRub = currentBuy / 10_000.0

    println("Итоговая стоимость составила $currentBuyRub руб.")
}