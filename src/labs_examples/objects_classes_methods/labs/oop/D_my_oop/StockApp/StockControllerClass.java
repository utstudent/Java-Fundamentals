package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

public class StockControllerClass {

    public static void main(String[] args) {

        Ledger ledger = new Ledger();

        Stock apple = new Stock("Apple", "AAPL", 100);
        Stock tesla = new Stock("Tesla", "TSLA", 150);
        Stock microsoft = new Stock("Microsoft", "MSFT", 125);

        ledger.addTransaction(new Transaction(apple, 100, 5, true));
        ledger.addTransaction(new Transaction(apple, 110, 3, true));
        ledger.addTransaction(new Transaction(apple, 120, 7, true));

        ledger.addTransaction(new Transaction(tesla, 270, 3, true));


    }


    public static void buyStock(){


    }
}
