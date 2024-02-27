package object;

import enums.Actions;
import enums.Objects;
import enums.Places;
import interfs.*;

public class Character extends ObjectName {
    private Places place;

    public Character(String name, Places a) {
        super(name);
        this.place = a;
    }

    public void retObject(Objects obj) {
        System.out.print(obj.toString());
    }

    public void doAction(Actions act) {
        System.out.print(act.toString());
    }

    public Places getPlace() {
        return place;
    }

    public void doAction(String act, String end, String predlog, Character a) {
        System.out.print(act);
        System.out.print(addPredl(addEnding(a.getName(), end), predlog));
    }

    @Override
    public String toString() {
        return name;
    }

    public void printName() {
        System.out.print(toString() + " ");
    }

    public void changePlace(Places move) {
        this.place = move;
    }

    @Override
    public String addEnding(String a, String b) {
        return super.addEnding(a, b);
    }

    @Override
    public String addPredl(String a, String b) {
        return super.addPredl(a, b);
    }

}
