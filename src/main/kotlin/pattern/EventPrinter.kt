package pattern

class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        println(count)
    }

    fun start() {
        var count = Counter(this)
        count.count()
    }
}