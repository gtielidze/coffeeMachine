class Rastvarimi (private val sugar: Int,
                  private var justJoke:Boolean) {
    companion object {private const val basePrice = 1.2}
    val price: Double get() = basePrice + (sugar * 1.5)
    private val getJoke = if (justJoke) println("Go Here --> https://ibb.co/0CZ4Lgb " +
            "plus bonus book Here --> https://we.tl/t-YK9fDKMPbt")
    else println("Why so serious?")

    override fun toString(): String {
        return "rastvarimi: with $sugar and $getJoke"

    }
}