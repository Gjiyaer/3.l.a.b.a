package object;

import enums.Actions;
import enums.Places;
import except.KarlsonActionException;
import interfs.VRaszveteSil;

import java.util.Objects;

public class Karlson extends Character implements VRaszveteSil {
    private Actions action = null;
    private int goodDealscount = 0;
    Hands hand = new Hands();
    private static int reapiting = 0;

    public Karlson(String name, Places p) {
        super(name, p);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 19 + 20);
    }

    @Override
    public String karlsonSay() {
        return "Я мужчина в самом расцвете сил";
    }

    @Override
    public boolean equals(Object obj) {
        return ((obj.hashCode() == hashCode()) && (obj.getClass() == getClass()));
    }

    @Override
    public void doAction(Actions act) {
        switch (act) {
            case HARDWORK -> {
                action = act;
                updateHand(Actions.HARDWORK);
            }
            default -> {
                try {
                    validAction(act.toString());
                } catch (KarlsonActionException e) {
                    System.out.println("К сожалению " + e.getMessage());
                }
            }
        }
    }

    private void validAction(String act) throws KarlsonActionException {
        if (!Objects.equals(act, Actions.HARDWORK.toString())) {
            throw new KarlsonActionException("Карлсон так не умеет!!!");
        }
    }

    private class Hands {
        boolean mozoli = false;

        public void afterHardWork() {
            mozoli = true;
        }

        public void afterSomeRest() {
            mozoli = false;
        }

        public boolean getCond() {
            return mozoli;
        }
    }

    public void lookAtMyHands() {
        if (hand.getCond()) {
            System.out.println("Гляди, я скоро набью себе мозоли на ладошках!");
        } else {
            System.out.println("С руками всё хорошо, продолжаю работу");
        }
    }

    private void updateHand(Actions act) {
        if (act == Actions.HARDWORK) {
            hand.afterHardWork();
        } else {
            hand.afterSomeRest();
        }
    }

    public void doAGoodDeal() {
        goodDealscount += 1;
    }

    public int getGoodDealscount() {
        return goodDealscount;
    }

    public static class checkingTheJustice {
        public checkingTheJustice(Malish mal, Karlson kar) {
            if (mal.getGoodDealscount() < kar.getGoodDealscount()) {
                class NeverRepeat{
                    public void theOnlyOneMeth(){
                        switch (getHow()){
                            case 1 -> System.out.println("Теперь ты должен полететь со мной и помочь мне убрать мою, а то будет несправедливо.");
                            case 0 -> System.out.println("Я говорю, что несправедливо, чтобы я один работал до седьмого пота!");
                        }
                    }
                }
                NeverRepeat never = new NeverRepeat();
                never.theOnlyOneMeth();
            }
        }
    }
    public void justice(Malish mal, Karlson kar){
        checkingTheJustice c = new checkingTheJustice(mal, kar);
    }
    public static int getHow(){
        reapiting += 1;
        return reapiting - 1;
    }
    public void cleaningFloors(Malish mal){
        Karlson anonymous = new Karlson(name, getPlace()) {
            public void whereToClean(){
                System.out.print("убрать ");
                switch (mal.getPlace()) {
                    case HOME -> System.out.println("твою комнату.");
                }
            }
            public void howToClean(Character cha){
                if (cha.getPlace() == Places.HOME){
                    System.out.print("чтобы почище ");
                }
            }
            public void howHardThisIsForMe(Actions act){
                if (act == Actions.HARDWORK){
                    System.out.print("Я из кожи вон лезу, ");
                }
            }

            @Override
            public void doAction(Actions act) {
                howHardThisIsForMe(act);
                howToClean(mal);
                whereToClean();
            }
        };
        anonymous.doAction(Actions.HARDWORK);
    }
}
