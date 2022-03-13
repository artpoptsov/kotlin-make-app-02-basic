// Task #1
fun main() {

    val amount = 100_00
    val minCommission = 35_00
    val payCommissionPercent = 75

    val payCommission = amount * payCommissionPercent / 10_000
    val finalCommission = if (payCommission >= minCommission) payCommission else minCommission

    println("Сумма перевода: $amount коп.")
    println("Размер комиссии: $finalCommission коп.")

}