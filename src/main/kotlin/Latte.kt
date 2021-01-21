class Latte (private val sugar: Int,
             private val milk: Int) {
    companion object {private const val basePrice = 1.7}
    val price: Double get() = basePrice + (sugar * 1.5) + (milk * 1.9)

    override fun toString(): String {
        return "Latte: with $sugar and $$milk"
    }
}