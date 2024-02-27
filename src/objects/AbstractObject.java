package objects;

public abstract class AbstractObject
{

    private String name;
    AbstractObject(String name){this.name = name;}

    public String getName(){return name;}
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
