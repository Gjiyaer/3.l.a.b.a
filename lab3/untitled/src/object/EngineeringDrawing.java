package object;


public class EngineeringDrawing<EngineeringDrawingType> {
    private EngineeringDrawingType type;

    public EngineeringDrawing(EngineeringDrawingType type) {
        this.type = type;
    }

    public EngineeringDrawingType getType() {
        return type;
    }
}