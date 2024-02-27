package object;

import enums.Actions;
import enums.AdjectivesAdverbs;
import enums.Objects;
import enums.Places;
import except.NullPointerInCharacterObject;

import static enums.Places.HOME;
import static enums.Places.ROOF;

public class Malish extends Character{
    private Objects object;
    int goodDealscount = 0;
    public Malish(String name, Places place, Objects object){
        super(name, place);
        this.object = object;
    }

    public void takeAway(){
        try {
            canHeTakeAway();
            Objects j = object;
            object = null;
            System.out.print("отложил "+j.toString());
        }
        catch(NullPointerInCharacterObject e) {
            System.out.println(e.getMessage());
        }
    }
    public void dreaming(Actions a, Places p){
        changePlace(p);
        doAction(a);
    }

    public void visitPlace(String pr, Places p){
        System.out.print(pr + " " + p.toString());
        changePlace(p);
    }
    public boolean compareAge(AdjectivesAdverbs a){
        switch (a){
            case LONGAGO -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
    public void comparePast(AdjectivesAdverbs a) {
        switch (a) {
            case LONGAGO -> System.out.print("Это было давно ");
            default -> System.out.print("Сейчас ");
        }
        if (compareAge(a)){
            System.out.print(", " + name + " " + "стал старше ");
        }
        else {
            System.out.print("сейчас лет ");
        }
    }
    public void canMalishClimb(Places p){
        if (compareAge(AdjectivesAdverbs.LONGAGO)){
            System.out.print("может залезть ");
            System.out.print(addPredl(addEnding(ROOF.toString(), "у"), "на"));
        }
    }
    public String askYourself(Actions a, Character b){
        System.out.print("поймёт ли ");
        return b.getName()+"?";
    }
    public void gdeMama(Mama m){
        switch (m.getPlace()){
            case HOME -> System.out.print(m.name + " " + addEnding(HOME.toString(), "a"));
            default -> System.out.print(m.name + " " + addPredl(addEnding(HOME.toString(), "a"), "не"));
        }
    }
    public void canIAsk(Character m){
        switch (m.getPlace()) {
            case HOME -> System.out.print("надо спросить ");
            default -> System.out.print("нельзя спросить ");
        }
    }
    public void refuse(Mama m){
        if (m.isAngry()){
            System.out.print("Лучше было бы мне отказаться");
        }
    }
    @Override
    public void doAction(Actions act) {
        super.doAction(act);
    }

    public void canHeTakeAway(){
            if (object == null) {
                throw new NullPointerInCharacterObject("Ничего нет в руках!");
            }
    }
    public void doAGoodDeal(){
        goodDealscount += 1;
    }
    public int getGoodDealscount(){
        return goodDealscount;
    }
}
