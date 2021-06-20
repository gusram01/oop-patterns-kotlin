class Canvas {
    private lateinit var currentTool: Tool

    fun getCurrentTool(): Tool {
        return currentTool
    }

    fun setCurrentTool(value: Tool) {
        currentTool = value
    }

    fun mouseUp(){
        currentTool.mouseUp()
    }
    fun mouseDown(){
        currentTool.mouseDown()
    }
}