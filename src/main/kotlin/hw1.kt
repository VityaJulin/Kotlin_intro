fun main() {
    print("Enter your total sale: ")
    val totalSale = readLine()

    print("Enter your current sale: ")
    val amount = readLine()

    print("Exclusive author press 1, else press 2: ")
    val exclusive = when (readLine()) {
        "1" -> true
        else -> false
    }

    try {
        val fee = calculateFee(amount, totalSale, exclusive)
        println("Your fee is: $fee%")
    } catch (e: Exception) {
        print("Incorrect input!")
    }
}

fun calculateFee(amount: String?, total: String?, exclusive: Boolean = false): Int {
    val percent = when (total?.toInt()) {
        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        else -> 15
    }

    return when (exclusive) {
        true -> percent - 5
        else -> percent
    }
}
