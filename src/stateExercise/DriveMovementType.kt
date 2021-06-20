class DriveMovementType: MovementType {
    override fun getEta() {
        println("Calculating ETA (Driving)")
    }

    override fun getDirection() {
        println("Calculating direction (Driving)")
    }

}