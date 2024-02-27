package object;

public class Zeznoka {
    public boolean findLuniteInCaves(String position) {
        return position.equals("Пещеры на луне");
    }

    public String planDescription(boolean hasLunite) {
        if (hasLunite) {
            return "С помощью небольшого кусочка лунита можно добиться удивительных результатов!";
        } else {
            return "Не удается найти лунит, необходимый для плана.";
        }
    }
}