package object;

import enums.AdjectivesAdverbs;
import interfs.Changable;
import interfs.VRaszveteSil;

public abstract class ObjectName implements Changable{
    String name;

    public ObjectName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String addEnding(String a, String b) {
        return a + b + " ";
    }

    public String addPredl(String b, String a) {
        return a + " " + b;
    }

    public void addAd(AdjectivesAdverbs a){
        System.out.print(a.toString());
    }

}
