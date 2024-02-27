package objects;

public enum Places
{
    CAVE("пещеру"),
    SCINCETOWN("Научный городок"),
    AROUNDMOON("вокруг Луны"),
    MOON("Луну");


    private String place;

    Places(String place)
    {
        this.place = place;
    }

    @Override
    public String toString()
    {
        return place;
    }
}
