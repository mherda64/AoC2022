
fun main() {

    val dayNumber = "05"

    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInputAsLines("Day${dayNumber}_test")
    check(part1(testInput) == 4512)
    check(part2(testInput) == 1924)

    val input = readInputAsLines("Day${dayNumber}")
    println(part1(input))
    println(part2(input))
}
