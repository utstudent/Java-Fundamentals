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
        ConstructorMethodReference();
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

        SchoolGenerator schoolGenerator = School::new;
        School gables = schoolGenerator.createSchool("Gables", 400, 1908, "Arthur Morgan", "Pinkletown");
        System.out.println(gables.toString());

    }
}

class School{
    private String name;
    private int studentCount;
    private int yearOpened;
    private String principalName;
    private String schoolDisctictName;

    public School(String name, int studentCount, int yearOpened, String principalName, String schoolDisctictName) {
        this.name = name;
        this.studentCount = studentCount;
        this.yearOpened = yearOpened;
        this.principalName = principalName;
        this.schoolDisctictName = schoolDisctictName;
    }

    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", studentCount=" + studentCount +
                ", yearOpened=" + yearOpened +
                ", principalName='" + principalName + '\'' +
                ", schoolDisctictName='" + schoolDisctictName + '\'' +
                '}';
    }
}

@FunctionalInterface
interface SchoolGenerator{
    School createSchool(String name, int studentCount, int yearOpened, String principalName, String schoolDisctictName);
}

