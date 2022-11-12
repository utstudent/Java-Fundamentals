package labs_examples.lambdas.labs;
import java.util.Arrays;
import java.util.function.*;


/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 * do this friday
 *
 */


public class Exercise_03{

    public static void main(String[] args) {

        StaticMethodReference();
        InstanceMethodReference();

    }


    private static void StaticMethodReference(){
        Function<Integer, Double> sqrRoot = (x) -> Math.sqrt(x);
        System.out.println(sqrRoot.apply(10));

        Function<Integer, Double> sqrRootMR = Math :: sqrt;
        System.out.println(sqrRootMR.apply(12));
    }

    private static void InstanceMethodReference(){
        String[] strings = {"Me","myself","I","me"};

        Arrays.sort(strings, String :: compareToIgnoreCase);

        for (String string: strings){
            System.out.println(string);
        }
    }

    private static void ConstructorMethodReference(){
        BiFunction<Integer, Double, Double> biFunction = (x, y) -> {
            Double sum =  x.doubleValue() + y;
            return sum;
        };
        System.out.println(biFunction.apply(5,4.5));

        BiFunction<Integer, Double, Double> biFunctionCM = Double::new;
        Double d = biFunctionCM.apply(5,4.5);
    }
}

