package labs_examples.objects_classes_methods.labs.oop.D_my_oop.StockApp;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StockControllerClass {

    public static void main(String[] args) {

        Ledger ledger = new Ledger();
        ArrayList<Stock> stocks = new ArrayList<Stock>();
        Scanner scanner = new Scanner(System.in);

        String filePath1 = "C:/Users/talha/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/objects_classes_methods/files/stocks.txt";
        String filePath2 = "C:/Users/talha/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/objects_classes_methods/files/transactions.txt";

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath1))) {

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



        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath2))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                ledger.addTransaction(mapValuesToTransactionObject(values,stocks));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hello, welcome to Stock Organizer!");

        while (true) {
            System.out.println("What would you like to do? (enter a number 1-6)");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Look up all transactions for a stock");
            System.out.println("2. Look up all buy transactions");
            System.out.println("3. Look up all sell transactions");
            System.out.println("4. Look up all transactions");
            System.out.println("5. Stock analysis");
            System.out.println("6. Stock information");

            String response = scanner.nextLine();

            if(response.equals("1")){

                System.out.println("Enter the stock symbol you would like to search by: ");
                String response2 = scanner.nextLine();
                System.out.println("Here are all the transactions for " + response2 + ":");
                ArrayList<Transaction> searchedTransactions = ledger.transactionsByStock(response2);

                System.out.println("-------------------------------------------------------------");

                for (Transaction transaction: searchedTransactions) {
                    System.out.print(transaction);
                }
            } else if (response.equals("2")) {
                System.out.println("Under construction...");

            }else if (response.equals("3")) {
                System.out.println("Under construction...");
            }else if (response.equals("4")) {
                System.out.println("Here are all your transactions in the ledger:");
                System.out.println(ledger);

            }else if (response.equals("5")) {
                System.out.println("Under construction...");
            }else if (response.equals("6")) {
                System.out.println("Here are all the stocks: ");
                for (Stock stock: stocks) {
                    System.out.println(stock);
                }

                //System.out.println("What you like to add a new stock:"); // in the future can add "add a new stock" functionality
            }

            System.out.println("-------------------------------------------------------------");
            System.out.println();

            System.out.println("Is there anything else I can do for you? (y for yes/n for no)");
            String response3 = scanner.nextLine();
            if((response3.equals("n"))){
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    private static Stock mapValuesToStockObject(String[] values) {
        Stock stock = new Stock();

        stock.setName(values[0]);
        stock.setStockSymbol(values[1]);
        stock.setCurrentValue(Double.parseDouble(values[2]));

        return stock;
    }

    private static Transaction mapValuesToTransactionObject(String[] values, ArrayList<Stock> stocks) {
        Transaction transaction = new Transaction();


        transaction.setStock(lookupStock(stocks,values[0]));
        transaction.setBoughtAmount(Double.parseDouble(values[1]));
        transaction.setStockValue(Double.parseDouble(values[2]));
        transaction.setStockAmount(Double.parseDouble(values[3]));
        transaction.setBought(Boolean.parseBoolean(values[4]));

        return transaction;
    }

    private static Stock lookupStock(ArrayList<Stock> stocks, String stockSymbol){
        for(Stock stock: stocks){
            if (stock.getStockSymbol().equals(stockSymbol)){
                return stock;
                }
            }
        return null;
    }

    public static void buyStock(){


    }
}
