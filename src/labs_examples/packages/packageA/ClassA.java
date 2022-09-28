package labs_examples.packages.packageA;
import static labs_examples.packages.packageB.ClassB.classBmethodOne;
// import static labs_examples.packages.packageB.ClassB.classBmethodTwo; // this method is not allowed to be imported due to protected modifier

public class ClassA {

    public static void main(String[] args) {

        classAmethodOne();
        classBmethodOne();

        classAmethodTwo();
        // classBmethodTwo(); // this method is not allowed to be run from the package B, inside package A due to its protected access modifier
    }

    public static void classAmethodOne(){
        System.out.println("printing Class A, Method one");
    }

    protected static void classAmethodTwo(){
        System.out.println("printing Class A, Method two");
    }
}
