package enume;

public enum Function {
    FUNCTION_1("Функция 1"),
    FUNCTION_2("Функция 2"),
    FUNCTION_3("Функция 3");

    private String description;

    Function(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}