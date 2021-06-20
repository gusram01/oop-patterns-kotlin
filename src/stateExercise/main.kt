package stateExercise

import DirectionService
import WalkMovementType

fun main() {
    val currentMode = DirectionService()
    currentMode.setTravelMode(WalkMovementType())
    currentMode.getEta()
    currentMode.getDirection()
}