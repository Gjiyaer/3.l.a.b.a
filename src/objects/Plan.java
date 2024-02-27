package objects;

import actions.Moveable;

public class Plan extends AbstractObject implements Moveable {


    public Plan(String name) {
        super(name);
    }

    @Override
    public void moveTo(String action) {
        System.out.println(getName() + action);
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
