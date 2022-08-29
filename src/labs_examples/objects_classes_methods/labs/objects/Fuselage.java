package labs_examples.objects_classes_methods.labs.objects;

public class Fuselage {

    private int bodyLength;
    private int bodyWidth;
    private int passengerCapacity;

    public Fuselage(int bodyLength, int bodyWidth, int passengerCapacity) {
        this.bodyLength = bodyLength;
        this.bodyWidth = bodyWidth;
        this.passengerCapacity = passengerCapacity;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getBodyWidth() {
        return bodyWidth;
    }

    public void setBodyWidth(int bodyWidth) {
        this.bodyWidth = bodyWidth;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "bodyLength=" + bodyLength +
                ", bodyWidth=" + bodyWidth +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
