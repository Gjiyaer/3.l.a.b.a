import enume.Function;
import object.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("SpaceX") {
            @Override
            public void ForceGravityControl() {

            }
        };

        Zeznoka zeznoka = new Zeznoka();

        boolean hasLunite = zeznoka.findLuniteInCaves("Пещеры на луне");
        String planDescription = zeznoka.planDescription(hasLunite);

        System.out.println("Наличие лунита в пещерах на Луне: " + hasLunite);
        System.out.println("Описание плана: " + planDescription);

        Factory factory = new Factory();
        EngineeringDrawing drawing = new EngineeringDrawing("металлическими");
        factory.manufactureParts(drawing);
        factory.produceEquipment();

        Engineers engineers = new Engineers();
        engineers.workOnBlueprints(drawing);

        rocket.launch();
        rocket.fly();
        System.out.println(rocket.toString());

        List<Function> functions = Arrays.asList(Function.FUNCTION_1, Function.FUNCTION_2, Function.FUNCTION_3);
        Device device = new Device(functions);
        System.out.println(device.getFunctionDescription(1));
    }
}