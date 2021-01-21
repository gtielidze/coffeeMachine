import java.lang.System.`in`
import java.util.*

fun main(args: Array<String>){
    val coffeeMachine = CoffeeMachine(Scanner(`in`))
    val price = coffeeMachine.request()
    println(price)
}