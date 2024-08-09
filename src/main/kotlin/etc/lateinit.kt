package etc

fun main() {
    var t = ABC()
    println(t.test())
    t.a = "zxc"
    println(t.test())
}

class ABC {
    lateinit var a: String

    fun test() :String {
        // a가 초기화 되었는지 체크
        if (::a.isInitialized) {
            return a
        } else {
            return "null"
        }
    }
}