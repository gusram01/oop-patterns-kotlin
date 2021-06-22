package memento

fun main() {
    val editor = Editor()
    val history = History<String>()

    editor.content = "a"
    history.push(editor.createState())
    editor.content = "b"
    history.push(editor.createState())
    editor.content = "c"
    history.push(editor.createState())

    editor.restore(history.pop())
    editor.restore(history.pop())

    print(editor.content)
}