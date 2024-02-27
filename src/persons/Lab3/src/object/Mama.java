package object;

import enums.Actions;
import enums.Places;

import static enums.AdjectivesAdverbs.*;

public class Mama extends Character{
    public Mama(String name, Places a) {
        super(name, a);
    }
    private void alarm(){
        System.out.print(name + " " +  BADLY.toString());
        doAction(Actions.SCARE);
    }
    public void checkWhereMalish(Malish a){
        switch (a.getPlace()) {
            case HOME -> System.out.print(name + " " + CALM.toString());
            default -> alarm();
        }
    }
    public boolean isAngry(){
        return true;
    }
}

