fun main() {
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)

    var a = Food()
    var b = Food()
    a.up()
    b.up()
    println("${Food.total}")
}

object Counter {
    var count = 0
    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

// class 안에도 object를 만들 수 있는데, 기존 Java에서 static이랑 비슷하다 생각하면 된다.
// 키워드는 companion object
class Food() {
    companion object {
        var total = 0
    }

    fun up() {
        total++
    }
}