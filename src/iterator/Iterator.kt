package iterator

interface Iterator<T> {
    fun next()
    fun current(): T
    fun hasNext(): Boolean
}