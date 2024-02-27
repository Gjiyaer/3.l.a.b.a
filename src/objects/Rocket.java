package objects;

import actions.FlightController;

public class Rocket extends AbstractObject implements FlightController
{

   public Rocket(String name) {
        super(name);
    }
    public Rocket(){super("ракета");}


    @Override
    public void controlUnit() {
        System.out.println("управление "+getName()+"для полетов в условиях тяжести и управления для полетов в состоянии невесомости.");
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


}
