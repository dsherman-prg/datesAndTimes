import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    // Initialize variables
    val date = LocalDateTime.now()
    val yearFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val currentYear = date.format(yearFormat)
    val holdFullMoon: LocalDateTime = LocalDateTime.of(2021,8, 22,5,2, 15)
    var fullMoon = holdFullMoon
    var tempDate: LocalDateTime

    // Loop through possible full moons until one after the current date is reached
    do {
        // Store the most recent checked one for later
        tempDate = fullMoon
        // Add the approximate time till next full moon to current one
        fullMoon = fullMoon.plusDays(29)
        fullMoon = fullMoon.plusHours(12)
        fullMoon = fullMoon.plusMinutes(44)
    // Stop the loop when the next full moon is after the current date
    }while (fullMoon.isBefore(date))

    // Format the last and next full moon into mm/dd/yyyy format
    val lastFullMoon = tempDate.format(yearFormat)
    val nextFullMoon = fullMoon.format(yearFormat)

    // Print the info to the user
    println("Today's date is: $currentYear")
    println("The last full moon was: $lastFullMoon")
    println("The next full moon will be: $nextFullMoon")
}


