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
    public ArrayList<Transaction> transactionsByStock(Stock searchedStock) {

        ArrayList<Transaction> thisArray = new ArrayList<Transaction>();

        for(Transaction transaction: transactions) {
            if (searchedStock.getName().equals(transaction.stock.getName())) {
                thisArray.add(transaction);
            }
        }

        return thisArray;
    }

    @Override
    public String toString() {
        return "Ledger{" +
                "transactions=" + transactions +
                '}';
    }
}
