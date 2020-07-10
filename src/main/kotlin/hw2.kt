fun main() {
    print("Вес килограмм: ")
    val weight: String? = readLine()
    print("Рост метров: ")
    val height: String? = readLine()

    val result = bodyMassIndex(weight, height)
    print(result)
}

fun bodyMassIndex(weight: String?, height: String?): String {
    try {
        val index: Float = weight!!.toFloat() / (height!!.toFloat() * height.toFloat())
        return when (index) {
            in 0.0..16.0 -> "Выраженный дифицит массы"
            in 16.1..18.5 -> "Дифицит массы"
            in 18.6..25.0 -> "Норма"
            in 25.1..30.0 -> "Избыточная масса"
            in 30.1..35.0 -> "Ожирение"
            in 35.1..40.0 -> "Резкое ожирение"
            else -> "Очень резкое ожирение"
        }
    } catch (e: Exception) {
        return "Параметры введены неверно!"
    }
}

