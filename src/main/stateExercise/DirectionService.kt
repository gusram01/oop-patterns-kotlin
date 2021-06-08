class DirectionService {
    private lateinit var travelMode: MovementType

    fun getEta() {
        travelMode.getEta()
    }

    fun getDirection() {
        travelMode.getDirection()
    }

    fun getTravelMode(): MovementType {
        return travelMode
    }

    fun setTravelMode(travelMode: MovementType) {
        this.travelMode = travelMode
    }
}