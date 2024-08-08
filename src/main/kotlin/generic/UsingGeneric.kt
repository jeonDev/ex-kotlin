package generic

// val : 불변 & var : 가변
class UsingGeneric<T : A> (val t : T) {
    fun doShout () {
        t.shout()
    }
}