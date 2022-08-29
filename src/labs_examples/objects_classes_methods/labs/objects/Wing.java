package labs_examples.objects_classes_methods.labs.objects;

public class Wing {

    private String wingMaterial;
    private int wingLength;

    public Wing(String wingMaterial, int wingLength) {
        this.wingMaterial = wingMaterial;
        this.wingLength = wingLength;
    }

    public String getWingMaterial() {
        return wingMaterial;
    }

    public void setWingMaterial(String wingMaterial) {
        this.wingMaterial = wingMaterial;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return "Wing{" +
                "wingMaterial='" + wingMaterial + '\'' +
                ", wingWeight=" + wingLength +
                '}';
    }
}
