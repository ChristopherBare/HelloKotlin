import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    var day = dayOfTheWeek()
    println("Today is $day.")

    feedTheFish()
}

fun dayOfTheWeek(): String {
    var day = "none"
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> day =  "Sunday"
        2 -> day =  "Monday"
        3 -> day =  "Tuesday"
        4 -> day =  "Wednesday"
        5 -> day =  "Thursday"
        6 -> day =  "Friday"
        7 -> day =  "Saturday"
    }
    return day
}

fun feedTheFish() {
    val day = dayOfTheWeek()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun fishFood(day : String): String {

    return when (day) {
        "Monday" -> "Flakes"
        "Tuesday" -> "Pellets"
        "Wednesday" -> "Redworms"
        "Thursday" -> "Granules"
        "Friday" -> "Mosquitoes"
        "Saturday" -> "Lettuce"
        "Sunday" -> "Plankton"
        else -> "nothing"
    }

}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

fun shouldChangeWater(
        day: String,
        temp: Int = 22,
        dirty: Int = 20) {
    when {
        temp > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}