class TransitMovementType: MovementType {
    override fun getEta() {
        println("Calculating ETA (Transit)")
    }

    override fun getDirection() {
        println("Calculating direction (Transit)")
    }

}