package labs_examples.lambdas.labs;
import java.util.function.*;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 */

@FunctionalInterface
interface VoidFunctionInterfaceExample {
    void action();
}

@FunctionalInterface
interface OneParamFunctionInterfaceExample {
    int apply(int x);
}

@FunctionalInterface
interface TwoParamFunctionInterfaceExample {
    double apply(int a, int b);
}

class main{
    public static void main(String[] args) {
        VoidFunctionInterfaceExample voidFunctionInterface = () -> System.out.println("Hello world! -lambda");
        voidFunctionInterface.action();

        VoidFunctionInterfaceExample voidAnonClass = new VoidFunctionInterfaceExample() {
            @Override
            public void action() {
                System.out.println("Hello World! -anon");
            }
        };
        voidAnonClass.action();

        OneParamFunctionInterfaceExample oneParamFunctionInterfaceExample = (int x) -> x*x;
        int x = oneParamFunctionInterfaceExample.apply(9);
        System.out.println(x);

        OneParamFunctionInterfaceExample oneParamAnonClass = new OneParamFunctionInterfaceExample() {
            @Override
            public int apply(int x) {
                return x*x;
            }
        };
        x = oneParamAnonClass.apply(7);
        System.out.println(x);

        TwoParamFunctionInterfaceExample twoParamFunctionInterfaceExample = (int a, int b) -> Double.valueOf(a+b);
        System.out.println(twoParamFunctionInterfaceExample.apply(12,45));

        TwoParamFunctionInterfaceExample twoParamAnonClass = new TwoParamFunctionInterfaceExample() {
            @Override
            public double apply(int a, int b) {
                return Double.valueOf(a+b);
            }
        };
        double d = twoParamAnonClass.apply(34,11);
        System.out.println(d);

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