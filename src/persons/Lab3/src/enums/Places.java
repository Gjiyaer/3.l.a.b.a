package enums;

public enum Places {
    ROOF("крыш"),
    LITTLEHOUSE("маленький домик"),
    HOME("дом"),
    NOTHOME("не дома ");

    private final String descr;
    Places (String des){
        this.descr = des;
    }
    @Override
    public String toString(){
        return descr;
    }
}
