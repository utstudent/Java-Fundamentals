package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

public class Stock {
    private String name;
    private String stockSymbol;
    private double currentValue;
    private int marketCap;
    public Stock(String name, String stockSymbol, double currentValue) {
        this.name = name;
        this.currentValue = currentValue;
        this.stockSymbol = stockSymbol;
    }
    public double getCurrentValue() {
        return currentValue;
    }
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    public String getName() {
        return name;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
}
