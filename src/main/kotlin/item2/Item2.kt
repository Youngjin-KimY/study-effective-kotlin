package item2// item 2
// make scope of variable small!!!

class item2 {
    // num 1. bad case
    fun badUpdateWeather(degree: Int) {
        val description: String
        val color: Int
        if(degree < 5) {
            description = "cold"
            color = Color.BLUE.ordinal
        } else if (degree < 23) {
            description = "mild"
            color = Color.YELLOW.ordinal
        } else {
            description = "hot"
            color = Color.RED.ordinal
        }
        // ....
    }

    // num 2. better than num 1
    fun littleBetterUpdateWeather(degree: Int) {
        val (description, color) = when {
            degree < 5 -> "cold" to Color.BLUE.ordinal
            degree < 23 -> "mild" to Color.YELLOW.ordinal
            else -> "hot" to Color.RED.ordinal
        }
        // ....
    }


}

enum class Color
{
    BLUE, RED, YELLOW
}