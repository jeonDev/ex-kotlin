package enum

enum class St(val msg: String) {
    A("a"),
    B("b"),
    C("c");

    fun isA() = this == St.A
}