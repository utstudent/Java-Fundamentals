package labs_examples.objects_classes_methods.labs.objects;

public class PowerPlant {

    private String engineMake;
    private int enginePower;
    private String propellerMake;


    public PowerPlant(String engineMake, int enginePower, String propellerMake) {
        this.engineMake = engineMake;
        this.enginePower = enginePower;
        this.propellerMake = propellerMake;
    }

    public String getEngineMake() {
        return engineMake;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getPropellerMake() {
        return propellerMake;
    }

    public void setPropellerMake(String propellerMake) {
        this.propellerMake = propellerMake;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "engineMake='" + engineMake + '\'' +
                ", enginePower=" + enginePower +
                ", propellerMake='" + propellerMake + '\'' +
                '}';
    }
}
