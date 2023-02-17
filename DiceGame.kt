import Die

fun main() {

    val d6 = Die("default d6", 6)
    val d20 = Die("d20", 20)
    val percentile = Die("percentile die (a special d10)", 10)

    println("The current side up for ${d6.getType()} is ${d6.getCurrentValue()}")
    println("The current side up for ${d20.getType()} is ${d20.getCurrentValue()}")
    println("The current side up for ${percentile.getType()} is ${percentile.getCurrentValue()}")

    println("\nTesting the roll method\n")
    d6.roll()
    println("Rolling the ${d6.getType()}...")
    println("The new value is ${d6.getCurrentValue()}")
    d20.roll()
    println("Rolling the ${d20.getType()}...")
    println("The current side up for ${d20.getType()} is ${d20.getCurrentValue()}")

    percentile.roll()
    println("Rolling the ${percentile.getType()}... ")
    println("The new value is ${percentile.getCurrentValue()}")

    d20.setCurrentValue(20)
    println("\nSetting the ${d20.getType()} to show 20...")
    println("The side up is now ${d20.getCurrentValue()}.\n")

    var count = 0
    var matching = true
    val d6Array = Array(5) { Die("d6", 6) }

    while (matching) {
        d6Array.forEach { die ->
            die.roll()
        }
        count++
        matching = d6Array.map { it.getCurrentValue() }.distinct().size == 1
    }

    println("Creating 5 ${d6.getType()}s...")
    println("YAHTZEE! It took $count rolls.")

    // Second output
    println("The ${d6.getType()} and ${d20.getType()} values matched both times, so here's a second output")
    d6.roll()
    d20.setCurrentValue(d6.getCurrentValue())
    println("The current side up for ${d6.getType()} is ${d6.getCurrentValue()}")
    println("The current side up for ${d20.getType()} is ${d20.getCurrentValue()}")
}


