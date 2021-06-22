package memento

class History<T> {
    private val history = ArrayList<State<T>>()

    fun push(state: State<T>){
        history.add(state)
    }

    fun pop(): State<T>{
        val lastIndex = history.size - 1
        val lastState = history[lastIndex]

        history.remove(lastState)

        return lastState
    }
}