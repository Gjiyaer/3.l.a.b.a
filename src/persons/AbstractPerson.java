package persons;

import actions.DoAt;
import actions.Moveable;
import actions.Voicable;
import objects.AbstractObject;

public abstract class AbstractPerson implements Moveable, Voicable, DoAt
{
    private String name;

    AbstractPerson(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public abstract boolean equals(Object obj);
    /**
     {
     if(this == obj) return true;
     return !(obj.getClass() != this.getClass());
     }
     */

    public abstract boolean hashcode(Object obj);


    /**
     * {
     * return (this.hashcode() == obj.hashcode());
     * }
     */


}
