fun main() {
    println("Введите сумму покупки")
    val amount = readLine()?.toInt()
    println("Ваша скидка составила ${amount?.let { DiscotCount.DiscontCount(it,true) }} руб")
}