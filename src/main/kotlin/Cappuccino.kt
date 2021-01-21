class Cappuccino(private val sugar: Int,
                 private val milk: Int,
                 private var hasCinnamon: Boolean) {
    companion object {private const val basePrice = 2}
    private val cinnamonPrice: Double get() = if (hasCinnamon) 0.5 else 0.0

    val price: Double get() = basePrice + cinnamonPrice + (sugar * 1.5) + (milk * 1.9)

    override fun toString(): String {
        return "Cappuccino: with $sugar and $$milk"
    }
}