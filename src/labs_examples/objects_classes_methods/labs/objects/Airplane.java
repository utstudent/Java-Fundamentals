package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    private double fuelCapacity;
    private double currentFuelLevel;
    private String planeColor;
    private Fuselage fuselage;
    private LandingGear landingGear;
    private Wing wing;
    private PowerPlant powerPlant;

    public Airplane(double fuelCapacity, double currentFuelLevel, String planeColor, Fuselage fuselage, LandingGear landingGear, Wing wing, PowerPlant powerPlant) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.planeColor = planeColor;
        this.fuselage = fuselage;
        this.landingGear = landingGear;
        this.wing = wing;
        this.powerPlant = powerPlant;
    }

    public Airplane(double fuelCapacity, double currentFuelLevel, String planeColor) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.planeColor = planeColor;
    }

    public Airplane(Fuselage fuselage, LandingGear landingGear, Wing wing, PowerPlant powerPlant) {
        this.fuselage = fuselage;
        this.landingGear = landingGear;
        this.wing = wing;
        this.powerPlant = powerPlant;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public String getPlaneColor() {
        return planeColor;
    }

    public void setPlaneColor(String planeColor) {
        this.planeColor = planeColor;
    }

    public Fuselage getFuselage() {
        return fuselage;
    }

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public PowerPlant getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(PowerPlant powerPlant) {
        this.powerPlant = powerPlant;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", planeColor='" + planeColor + '\'' +
                ", \nfuselage=" + fuselage +
                ", \nlandingGear=" + landingGear +
                ", \nwing=" + wing +
                ", \npowerPlant=" + powerPlant +
                '}';
    }
}
