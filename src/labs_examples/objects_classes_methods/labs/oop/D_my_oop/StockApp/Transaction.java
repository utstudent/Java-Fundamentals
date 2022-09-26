package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;
import java.util.Date;
public class Transaction {

    Stock stock;
    private double boughtValue; // example: stock price was 100$
    private double boughtAmount; // example: 5 stocks
    private double totalPurchasePrice; // example: 500$ spent
    Date(int year, int month, int date) purchaseDate;

    public Transaction(Stock stock, double boughtValue, double boughtamount, double purchasePrice) { // constructor without date given. Date = today
        this.stock = stock;
        this.boughtValue = boughtValue;
        this.boughtAmount = boughtamount;
        this.totalPurchasePrice = purchasePrice;

        Date(int year, int month, int date) = new Date();
        this.date = today;
    }

    public Transaction(Stock stock, double boughtValue, double boughtamount, double purchasePrice) { // constructor with date given
        this.stock = stock;
        this.boughtValue = boughtValue;
        this.boughtAmount = boughtamount;
        this.totalPurchasePrice = purchasePrice;

        Date(int year, int month, int date) = new Date();
        this.date = date;
    }

    public void buyStock(Stock stock, double boughtAmount, double boughtPrice, double totalPurchasePrice) {
        stock.setCurrentValue(boughtPrice); // updates current value
        stock.setOwnedAmount(stock.getOwnedAmount()+ boughtAmount); // adds to the total owned amount
        stock.setTotalspent(stock.getTotalspent()+totalPurchasePrice); // adds to the total spent
        stock.setAvgBuyValue(stock.getTotalspent()/stock.getOwnedAmount()); // updates avg buy value


        System.out.println("Successfully recorded!");
    }

    public void sellStock(Stock stock) {

    }
}
