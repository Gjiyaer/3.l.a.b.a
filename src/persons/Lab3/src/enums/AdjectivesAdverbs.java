package enums;

public enum AdjectivesAdverbs {
    ONCE("Лишь однажды "),
    BADLY("ужасно "),
    LONGAGO("давно "),
    CALM("спокойна");
    private final String descr;

    AdjectivesAdverbs(String des){
        this.descr  = des;
    }

    @Override
    public String toString(){
        return descr;
    }
}
