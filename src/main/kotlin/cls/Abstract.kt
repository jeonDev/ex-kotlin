fun main() {
    var a = Rabbit()
    a.eat()
    a.sniff()
}

abstract class AbstractAnimal {
    abstract fun eat()

    fun sniff() {
        println("킁킁")
        eat()
    }
}

class Rabbit : AbstractAnimal() {
    override fun eat() {
        println("awd");
    }
}