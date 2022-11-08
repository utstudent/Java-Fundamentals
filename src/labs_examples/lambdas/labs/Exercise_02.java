package labs_examples.lambdas.labs;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_2{
    public static void main(String[] args) {
        FunctionExample();
        SupplierExample();
    }


    private static void FunctionExample(){
        Function<Integer, Double> sqrRoot = (x) -> Math.sqrt(x);
        System.out.println(sqrRoot.apply(10));
    }

    private static void SupplierExample(){
        Supplier<Boolean> isCool = () -> true;
        System.out.println(isCool.get());
    }
}

