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
        BiFunctionExample();
        ConsumerExample();
        PredicateExample();
        DoubleFunctionExample();
        DoubleToIntFunctionExample();
        IntSupplierExample();
        ToIntBiFunctionExample();
        IntToDoubleFunctionExample();
    }

    private static void FunctionExample(){
        Function<Integer, Double> sqrRoot = (x) -> Math.sqrt(x);
        System.out.println(sqrRoot.apply(10));
    }

    private static void SupplierExample(){
        Supplier<Boolean> isCool = () -> true;
        System.out.println(isCool.get());
    }

    private static void BiFunctionExample(){
        BiFunction<Integer, Double, Double> biFunction = (x, y) -> {
            Double sum =  x.doubleValue() + y;
            return sum;
        };
        System.out.println(biFunction.apply(5,4.5));
    }

    private static void ConsumerExample(){
        Consumer<String> consumer = (string) -> {
            for (int i =0 ; i< string.length(); i++) {
                System.out.println(string.charAt(i));
            }
        };
        consumer.accept("Hello");
    }

    private static void PredicateExample(){
        Predicate<String> predicate = s -> (s.startsWith("t"));

        System.out.println("Name starts with t? " + predicate.test("talha"));
    }

    private static void DoubleFunctionExample(){
        DoubleFunction<Double> doubleFunction = (x) -> x*2;

        System.out.println(doubleFunction.apply(4.0));
    }

    private static void DoubleToIntFunctionExample(){
        DoubleToIntFunction doubleDoubleToIntFunction = (x) -> (int) (x*3);

        System.out.println(doubleDoubleToIntFunction.applyAsInt(5.0));
    }
    private static void IntSupplierExample(){
        IntSupplier monthsInYear = () -> 12;
        System.out.println(monthsInYear.getAsInt());
    }
    private static void ToIntBiFunctionExample(){
        ToIntBiFunction<Double, Long> toIntBiFunction = (x,y) -> {
          int finalNum = x.intValue() + y.intValue();
          return finalNum;
        };

        System.out.println(toIntBiFunction.applyAsInt(40.9,39l));
    }

    private static void IntToDoubleFunctionExample(){
        IntToDoubleFunction intToDoubleFunction = (x) -> (double) x*4;

        System.out.println(intToDoubleFunction.applyAsDouble(23));
    }
}
