package memento

class Editor {
    lateinit var content: String

    fun createState(): State<String> {
        return State<String>(content)
    }

    fun restore(state: State<String>){
        content = state.content
    }
}