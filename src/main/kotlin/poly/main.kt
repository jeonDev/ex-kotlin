package poly

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if (b is Cola) {
        b.washD() // if문 안에서 일시적 캐스팅
    }

    // Cola로 캐스팅된 c 동시에 b도 캐스팅이 된다.
    var c = b as Cola
    c.washD()
    b.washD()
}