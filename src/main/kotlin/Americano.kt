class Americano (private val sugar: Int) {
    companion object {private const val basePrice = 1.2}
    val price: Double get() = basePrice + (sugar * 1.5)

    override fun toString(): String {
        return "Americano: with $sugar"

    }
}
