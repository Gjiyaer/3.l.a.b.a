package object;

public class Factory {
    public void manufactureParts(EngineeringDrawing drawing) {
        System.out.println("Фабрика производит детали на основе" + drawing.getType() + " чертежей.");
    }

    public void produceEquipment() {
        System.out.println("Завод производит оборудование.");
    }
}