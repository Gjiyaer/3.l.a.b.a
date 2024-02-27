package object;
import enume.Function;

import java.util.List;

public class Device {
    private List<Function> functions;

    public Device(List<Function> functions) {
        this.functions = functions;
    }

    public String getFunctionDescription(int index) {
        if (index >= 0 && index < functions.size()) {
            return functions.get(index).getDescription();
        } else {
            return "Функция не найдена.";
        }
    }
}