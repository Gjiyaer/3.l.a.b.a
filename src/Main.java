import actions.FlightController;
import objects.Places;
import objects.Plan;
import objects.Rocket;
import objects.Zavooood;
import persons.GroupPerson;
import persons.Person;

public class Main {

    public static void main(String[] args) {
        Person znayka = new Person("Знайка ");
        Person fuksiya = new Person("Фуксия ");
        Person sledochka = new Person("Следочка ");
        Person noknower = new Person("Незнайки ");
        Person donut = new Person("Пончика");

        GroupPerson groupEngineers = new GroupPerson("Группа инженеров-конструкторов ");
        GroupPerson group = new GroupPerson("они ");

        Plan chertezi = new Plan("Чертежи");

        FlightController rocket = new Rocket();

        Zavooood differentFabrics = new Zavooood("различные заводы ");


        System.out.println(znayka.talk());
        znayka.controlUnit(rocket);
        znayka.doSomethind("надеялся, что по прибытии на " + Places.MOON+", ");
        group.doSomethind("обнаружат в какой нибудь из " + Places.CAVE + " залежи лунита.\n");
        znayka.doSomethind("надеялся, что обладая же хоть небольшим кусояком лунита, нетрудно будет соорудить" +
                " \nприбор невесомости, что крайне облегчит полеты " + Places.AROUNDMOON+" и поиски " + znayka.getName() +
                "и " + donut.getName() + ".\n");
        znayka.doSomethind("закончил, работу по созданию эскиза, тогда "+
                fuksiya.getName()+"и "+sledochka.getName()+"отправились в " + Places.SCINCETOWN+".\n");
        groupEngineers.doSomethind("включилась в работу, которые начали делать подробные чертежи отдельных узлов ракеты.\n");
        chertezi.moveTo(" эти направились на " + differentFabrics.toMake("для выполнения отдельных отливок, поковок, штамповок, а" +
                " \nтакже для изготовления разнообразной аппаратуры для управления космическим кораблем."));

    }
}