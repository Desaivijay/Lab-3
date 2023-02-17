import kotlin.random.Random

class Die(private val type: String, private val sides: Int) {
    private var currentValue = 1

    init {
        println("Creating a $type with $sides sides...")
    }

    fun roll() {
        currentValue = Random.nextInt(1, sides + 1)
    }

    fun getCurrentValue(): Int {
        return currentValue
    }

    fun setCurrentValue(newValue: Int) {
        currentValue = newValue
    }

    fun getType(): String {
        return type
    }
}