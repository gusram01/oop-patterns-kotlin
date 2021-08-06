package statePattern

import BrushTool
import Canvas
import EraserTool

fun main() {
    val canvas = Canvas()
    canvas.setCurrentTool(EraserTool())
    canvas.mouseUp()
    canvas.mouseDown()

    val canvas2 = Canvas()
    canvas2.setCurrentTool(BrushTool())
    canvas2.mouseUp()
    canvas2.mouseDown()
}