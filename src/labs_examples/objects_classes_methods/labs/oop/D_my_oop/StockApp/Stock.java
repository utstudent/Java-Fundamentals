package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

public class Stock {

    private String name;
    private double avgBuyValue;
    private double currentValue;
    private double ownedAmount;
    private double totalspent;

    public Stock(String name, double currentValue) {
        this.name = name;
        this.currentValue = currentValue;
    }

    public double getTotalspent() {
        return totalspent;
    }

    public void setTotalspent(double totalspent) {
        this.totalspent = totalspent;
    }

    public double getAvgBuyValue() {
        return avgBuyValue;
    }

    public void setAvgBuyValue(double avgBuyValue) {
        this.avgBuyValue = avgBuyValue;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getOwnedAmount() {
        return ownedAmount;
    }

    public void setOwnedAmount(double ownedAmount) {
        this.ownedAmount = ownedAmount;
    }
}
