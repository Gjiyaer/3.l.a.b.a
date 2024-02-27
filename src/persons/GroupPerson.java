package persons;

public class GroupPerson extends AbstractPerson
{
    public GroupPerson(String nameGroup) {
        super(nameGroup);
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

        return null;
    }

    @Override
    public void doSomethind(String action) {
        System.out.print(getName()+ action);
    }
}
