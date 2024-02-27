package object;

public class LastStageRocket extends Rocket  {
    private final String descriptionZeroGravityControl;
    private String name;

    public LastStageRocket(String descriptionZeroGravityControl, String descriptionGravityControl) {
        super(descriptionGravityControl);
        this.descriptionZeroGravityControl = descriptionZeroGravityControl;
    }

    public int TwoControls() {
        return 2;
    }

    public String getОписаниеУправленияВНевесомости() {
    return null;
    }

    public int количествоУправлений() {
        return 2;
    }



    @Override
    public void ForceGravityControl() {

    }
}


