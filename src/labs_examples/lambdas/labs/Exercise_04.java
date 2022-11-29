package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *
 */

class Example {
    public static void main(String[] args) {
        // 1)
        IntStream
                .range(1, 15)
                .forEach(System.out::print);

        System.out.println();

        System.out.println("--------------------------");

        // 2)
        int sum = IntStream.range(1, 6).sum();
        System.out.println(sum);

        System.out.println("--------------------------");

        // 3)
        int [] nums = {5,23,2,14,1,24};

        Integer sum3 = Arrays.stream(nums).map(x -> x+2).sum();

        System.out.println(sum3);
        System.out.println("--------------------------");

        // 4
        int avg = (int) Arrays.stream(nums).filter(x -> x<10).average().getAsDouble();
        System.out.println(avg);

        System.out.println("--------------------------");

        // 5
        int sum5 = Arrays.stream(nums).reduce(0,(int a, int b) -> a+b);
        System.out.println(sum5);

        System.out.println("--------------------------");

        // 6
        try{
            String StringTextFile = "C:\\Users\\talha\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";
            Stream<String> textFileLines = Files.lines(Paths.get(StringTextFile));

            textFileLines.forEach(System.out::println);
        }
        catch (IOException ioexception) {
            System.out.println(ioexception);
        }
        System.out.println("--------------------------");

        // 7
        try{
            String StringTextFile = "C:\\Users\\talha\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";
            Stream<String> textFileLines = Files.lines(Paths.get(StringTextFile));

            textFileLines.map(x -> x.split(",")).forEach(x -> System.out.println(x[1]));

        }catch (IOException ioexception) {
            System.out.println(ioexception);
        }
        System.out.println("--------------------------");

        //8
        try{
            String StringTextFile = "C:\\Users\\talha\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";
            Stream<String> textFileLines = Files.lines(Paths.get(StringTextFile));

            //double total = (double) textFileLines.map(x -> x.split(",")).reduce(0.0,(Double a, Double b) -> a+b);

        }catch (IOException ioexception) {
            System.out.println(ioexception);
        }
        System.out.println("--------------------------");

        //9 get help

    }
}