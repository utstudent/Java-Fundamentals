package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;
import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Transaction {
    public Stock stock;
    private double boughtAmount; // example: bought 500$ worth
    private double stockValue; // example: stock price was 100$
    private double stockAmount; // example: 5 stocks
    private boolean bought; // true if bought
    private LocalDate purchaseDate;

    public Transaction() {
    }
    public Transaction(Stock stock, double boughtAmount, double stockValue, double stockAmount, boolean bought) { // constructor without date given. Date = today
        this.stock = stock;
        this.boughtAmount = boughtAmount;
        this.stockValue = stockValue;
        this.stockAmount = stockAmount;
        this.bought = bought;
        this.purchaseDate = java.time.LocalDate.now();
        System.out.println("Successfully recorded!");
        this.stock.setCurrentValue(stockValue);

    }
    public Transaction(Stock stock, double boughtAmount, double stockValue, double stockAmount, boolean bought, LocalDate purchaseDate) { // constructor with date given
        this.stock = stock;
        this.boughtAmount = boughtAmount;
        this.stockValue = stockValue;
        this.stockAmount = stockAmount;
        this.bought = bought;
        this.purchaseDate = purchaseDate;
        System.out.println("Successfully recorded!");
        this.stock.setCurrentValue(stockValue);
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

//    public void setStock(String stock) {
//        this.stock.setName(stock);
//    }

    public double getBoughtAmount() {
        return boughtAmount;
    }

    public void setBoughtAmount(double boughtAmount) {
        this.boughtAmount = boughtAmount;
    }

    public double getStockValue() {
        return stockValue;
    }

    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

    public double getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(double stockAmount) {
        this.stockAmount = stockAmount;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "stock=" + stock +
                ", boughtAmount=" + boughtAmount +
                ", stockValue=" + stockValue +
                ", stockAmount=" + stockAmount +
                ", bought=" + bought +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
