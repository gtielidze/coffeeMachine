import java.lang.System.`in`
import java.util.*

class CoffeeMachine(private val scanner: Scanner) {

    fun request(): Double {
        println(
            "Please Enter Coffee Type, Available Types: Latte, " +
                    "Cappuccino, Americano, Mocha, Rastvarimi")

        return when (scanner.next()) {
            "Latte" -> Latte(requestSugar(), requestMilk()).price
            "Cappuccino" -> Cappuccino(requestSugar(), requestMilk(), hasCinnamon()).price
            "Americano" -> Americano(requestSugar()).price
            "Mocha" -> Mocha(
                requestSugar(), requestMilk(),
                requestCocoaPowder(), requestHeavyCream(), hasWhippedCream()
            ).price
            "Rastvarimi" -> Rastvarimi(requestSugar(), requestJustJoke()).price
            else -> {
                println("unknown coffee type")
                return 0.0
            }
        }
    }

    private fun hasCinnamon(): Boolean {
        print("Do you want cinnamon, Enter true or false ")
        return scanner.nextBoolean()
    }

    private fun requestSugar(): Int {
        print("Please Enter Sugar Quantity: ")
        return when (val sugar = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }

    private fun requestMilk(): Int {
        print("Please Enter Milk Quantity: ")
        return when (val milk = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> milk
        }
    }

    private fun requestCocoaPowder(): Int {
        print("Please Enter Cocoa Powder Quantity: ")
        return when (val cocoaPowder = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> cocoaPowder
        }
    }

    private fun requestHeavyCream(): Int {
        print("Please Enter Heavy Cream Quantity: ")
        return when (val heavyCream = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> heavyCream
        }
    }

    private fun hasWhippedCream(): Boolean {
        print("Do you want whipped cream, Enter true or false ")
        return scanner.nextBoolean()
    }

    private fun requestJustJoke(): Boolean {
        print("Do you want get a joke? Enter true or false ")
        return scanner.nextBoolean()
    }
}




