package persons;

import actions.FlightController;

public class Person extends AbstractPerson{

    private FlightController controller;

    public void setController(FlightController controller){this.controller = controller;}

    public Person(String name) {
        super(name);
    }

    @Override
    public void moveTo(String action) {
        System.out.println(getName()+action);
    }

    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        return !(obj.getClass() != this.getClass());
    }

    public boolean hashcode(Object obj)

    {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public String talk() {
        return (getName() +"предложил что последняя ступень ракеты должна была иметь двоякое управление, а именно: ");
    }

    public void controlUnit(FlightController controller) {
    controller.controlUnit();
    }

    @Override
    public void doSomethind(String action) {
        System.out.print(getName()+ action);
    }
}
