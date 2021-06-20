package statePattern

import Canvas
import EraserTool

fun main() {
    val canvas = Canvas()
    canvas.setCurrentTool(EraserTool())
    canvas.mouseUp()
    canvas.mouseDown()
}