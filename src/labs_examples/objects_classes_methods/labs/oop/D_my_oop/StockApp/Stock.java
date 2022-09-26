package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

public class Stock {
    private String name;
    private double currentValue;
    public Stock(String name, double currentValue) {
        this.name = name;
        this.currentValue = currentValue;
    }
    public double getCurrentValue() {
        return currentValue;
    }
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

}
