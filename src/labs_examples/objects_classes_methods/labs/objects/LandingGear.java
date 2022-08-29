package labs_examples.objects_classes_methods.labs.objects;

public class LandingGear {

    private int numberOfWheels;
    private int ageOfWheels;
    private int wheelHealth;

    public LandingGear(int numberOfWheels, int ageOfWheels, int wheelHealth) {
        this.numberOfWheels = numberOfWheels;
        this.ageOfWheels = ageOfWheels;
        this.wheelHealth = wheelHealth;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getAgeOfWheels() {
        return ageOfWheels;
    }

    public void setAgeOfWheels(int ageOfWheels) {
        this.ageOfWheels = ageOfWheels;
    }

    public int getWheelHealth() {
        return wheelHealth;
    }

    public void setWheelHealth(int wheelHealth) {
        this.wheelHealth = wheelHealth;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "numberOfWheels=" + numberOfWheels +
                ", ageOfWheels=" + ageOfWheels +
                ", wheelHealth=" + wheelHealth +
                '}';
    }
}
