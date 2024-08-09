package map

fun main() {
    var a : MutableMap<Int, String> = mutableMapOf()
    a[1] = "a"
    a[2] = "b"

    for (i in a) {
        println("${i.key} ${i.value}")
    }
    a.remove(1)

    println(a)
    println(a[2])
}