package etc

// 클래스에 has(), equals(), toString(), copy(), componentX()을 자동으로 구현해주는 클래스
fun main() {
    var va = A("a", 123)
    println(va == A("a", 123))
    println(va)

    val vb = B("a", 123)

    println(vb == B("a",123))
    println(vb)

    println(vb.copy())
    println(vb.copy(name = "b"))
    println(vb.copy(id = 234))

    val list = listOf <B> (
        B("a", 123),
        B("b", 234),
        B("c", 345)
    )

    for ((a, b) in list) {
        println("$a $b")
    }
}

class A(val name: String, val id: Int)
data class B(val name:String, val id: Int)