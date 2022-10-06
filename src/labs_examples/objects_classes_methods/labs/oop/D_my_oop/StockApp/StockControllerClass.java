package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StockControllerClass {

    public static void main(String[] args) {

        Ledger ledger = new Ledger();
        ArrayList<Stock> stocks = new ArrayList<Stock>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        String filePath = "C:/Users/talha/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/objects_classes_methods/files/stocks.txt";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                stocks.add(mapValuesToStockObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Stock bkng = new Stock("Bookings Holding", "BKNG", 1326);
//        Stock wbd = new Stock("Warner Bros", "WBD", 0.4276);
//        Stock ccl = new Stock("Carnival", "CCL", 0.8024);
//        Stock vtrs = new Stock("Viatris", "VTRS", 6.34);

//        ledger.addTransaction(new Transaction(bkng,2000, 1944.55, 1.0285, true));
//        ledger.addTransaction(new Transaction(bkng,1000, 1860.27, 0.5376, true));
//        ledger.addTransaction(new Transaction(bkng,5000, 1214.74, 4.1161, true));
//        ledger.addTransaction(new Transaction(bkng,5000, 1214.74, 4.1161, true));
//
//        transactions = ledger.transactionsByStock(bkng);

        System.out.println("------------------------");

        for (Transaction transaction: transactions) {
            System.out.println(transaction);
        }

        System.out.println("------------------------");

        for (Stock stock: stocks) {
            System.out.println(stock);
        }

    }

    private static Stock mapValuesToStockObject(String[] values) {
        Stock stock = new Stock();

        stock.setName(values[0]);
        stock.setStockSymbol(values[1]);
        stock.setCurrentValue(Double.parseDouble(values[2]));

        return stock;
    }

    private static Transaction mapValuesToTransactionObject(String[] values) {
        Transaction transaction = new Transaction();

        transaction.stock.setName(values[0]);
        transaction.setBoughtAmount(Double.parseDouble(values[1]));
        transaction.setStockValue(Double.parseDouble(values[2]));
        transaction.setStockAmount(Double.parseDouble(values[3]));
        transaction.setBought(Boolean.parseBoolean(values[4]));

        return transaction;
    }



    public static void buyStock(){


    }
}
