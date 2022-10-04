package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

import java.util.ArrayList;

public class StockControllerClass {

    public static void main(String[] args) {

        Ledger ledger = new Ledger();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        Stock bkng = new Stock("Bookings Holding", "BKNG", 1326);
        Stock wbd = new Stock("Warner Bros", "WBD", 0.4276);
        Stock ccl = new Stock("Carnival", "CCL", 0.8024);
        Stock vtrs = new Stock("Viatris", "VTRS", 6.34);

        ledger.addTransaction(new Transaction(bkng,2000, 1944.55, 1.0285, true));
        ledger.addTransaction(new Transaction(bkng,1000, 1860.27, 0.5376, true));
        ledger.addTransaction(new Transaction(bkng,5000, 1214.74, 4.1161, true));
        ledger.addTransaction(new Transaction(bkng,5000, 1214.74, 4.1161, true));

        transactions = ledger.transactionsByStock(bkng);

        System.out.println("------------------------");

        for (Transaction transaction: transactions) {
            System.out.println(transaction);
        }

    }


    public static void buyStock(){


    }
}
