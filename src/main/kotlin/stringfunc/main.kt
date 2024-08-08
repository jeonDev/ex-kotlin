package stringfunc

fun main() {
    val test = "a.b.c.d"
    println(test.length)

    var spl = test.split(".")
    println(spl)

    // 배열 값들을 string 으로 합쳐줌
    println(spl.joinToString())
    println(spl.joinToString("-"))

    // 시작 단어 bool
    println(test.startsWith("a."))
    // 끝 단어 bool
    println(test.endsWith(".d"))
    // 포함 단어 bool
    println(test.contains("b.c"))
}