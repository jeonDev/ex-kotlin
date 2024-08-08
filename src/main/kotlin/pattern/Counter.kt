package pattern

class Counter(var listener: EventListener) {
    fun count() {
        for (i in 0..20) {
            if (i % 5 == 0) {
                listener.onEvent(i)
            }
        }
    }
}