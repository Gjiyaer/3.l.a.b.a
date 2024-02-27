package enums;

public enum Actions {
    DREAM("мечтать "),
    SCARE("испугалась и вызвала пожарников"),
    COULD("можно было только "),
    HARDWORK("работал до седьмого пота "),
    UNDERSTAND("поймет ли ");


    private final String descr;

    Actions(String des){
        this.descr  = des;
    }

    @Override
    public String toString(){
        return descr;
    }
}
