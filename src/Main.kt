fun main() {
    print("Первый массив: ")
    val a1 = readln().split(" ").map { it.toInt() }
    print("Второй массив: ")
    val a2 = readln().split(" ").map { it.toInt() }

    val f1 = a1.groupingBy { it }.eachCount()
    val f2 = a2.groupingBy { it }.eachCount()

    val result = f1.flatMap { (num, count) ->
        List(minOf(count, f2[num] ?: 0)) { num }
    }.sorted()

    println("Пересечение: ${result.joinToString()}")
}