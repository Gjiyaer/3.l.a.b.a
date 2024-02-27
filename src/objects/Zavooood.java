package objects;

import actions.DoAtZavod;

public class Zavooood extends AbstractObject implements DoAtZavod
{

    public Zavooood(String name)
    {
        super(name);
    }

    @Override
    public String toMake(String action) {
        return (getName()+action);
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
