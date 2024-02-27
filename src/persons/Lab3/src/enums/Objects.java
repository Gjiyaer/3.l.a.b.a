package enums;

public enum Objects {
    ALBUM("альбом ");
    private final String descr;

    Objects (String des){
        this.descr = des;
    }
    @Override
    public String toString(){
        return descr;
    }
}
