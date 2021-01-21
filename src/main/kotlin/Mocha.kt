class Mocha (private val sugar: Int,
             private val cocoaPowder: Int,
             private val heavyCream: Int,
             private val milk: Int,
             private var hasWhippedCream: Boolean) {
    companion object {private const val basePrice = 3}

    private val whippedCream: Double get() = if (hasWhippedCream) 0.7 else 0.0
    val price: Double get() = basePrice + (heavyCream * 1.7) +
                (sugar * 1.5) + (milk * 1.9) + (cocoaPowder * 1.3)

    override fun toString(): String {
        return "Mocha: with $sugar, $$milk, $cocoaPowder and $heavyCream"
    }
}