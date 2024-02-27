import object.*;

import static enums.Objects.*;
import static enums.Actions.*;
import static enums.AdjectivesAdverbs.*;
import static enums.Places.*;


public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish("Малыш", HOME, ALBUM);
        Karlson karlson = new Karlson("Карлсон", LITTLEHOUSE);
        Mama mama = new Mama("мама", NOTHOME);

        System.out.println("— Глухая тетеря!");
        karlson.doAGoodDeal();
        karlson.justice(malish, karlson);
        karlson.doAction(HARDWORK);
        karlson.lookAtMyHands();
        karlson.cleaningFloors(malish);
        karlson.justice(malish, karlson);


        malish.printName();
        malish.takeAway();
        System.out.println(". ");
        malish.doAction("Полететь ", "ом", "с", karlson);
        malish.visitPlace("в", LITTLEHOUSE);
        System.out.print("-- ");
        malish.doAction(COULD);
        malish.dreaming(DREAM, LITTLEHOUSE);
        System.out.println("! ");
        malish.addAd(ONCE);
        malish.printName();
        malish.doAction("посетил", "а", "", karlson);
        System.out.println(". ");
        System.out.print("Но в тот раз ");
        mama.checkWhereMalish(malish);
        System.out.println(". ");
        malish.printName();
        System.out.print("погрузился в размышления ");
        System.out.println(". ");
        malish.comparePast(LONGAGO);
        System.out.print("и ");
        malish.canMalishClimb(ROOF);
        System.out.println(".");
        System.out.print("Но ");
        System.out.println(malish.askYourself(UNDERSTAND, mama));
        System.out.print("Ведь ");
        malish.gdeMama(mama);
        System.out.print(", ");
        malish.canIAsk(mama);
        System.out.println(".");
        malish.refuse(mama);
        System.out.println(".");
    }
}
