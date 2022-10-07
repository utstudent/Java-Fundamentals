package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

import java.util.ArrayList;

public class Ledger {
    private ArrayList<Transaction> transactions;

    public Ledger() {
        this.transactions = new ArrayList<Transaction>();
    }
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
    public ArrayList<Transaction> transactionsByStock(String stockSymbol) {

        ArrayList<Transaction> thisArray = new ArrayList<Transaction>();

        for(Transaction transaction: transactions) {
            if (stockSymbol.toUpperCase().equals(transaction.stock.getStockSymbol().toUpperCase())) {
                thisArray.add(transaction);
            }
        }

        return thisArray;
    }

    @Override
    public String toString() {
        return "All transactions= \n" + transactions;
    }
}
