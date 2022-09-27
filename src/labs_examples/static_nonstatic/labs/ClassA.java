package labs_examples.static_nonstatic.labs;


public class ClassA {
    public static void main(String[] args) {
        staticMethod(); // #1
        ClassA obj = new ClassA(); // #2
        obj.nonStaticMethod(); // #2
        ClassB obj2 = new ClassB(); // #3
        obj2.staticMethodB(); // #3
        obj2.nonStaticMethodB(); // #4

        System.out.println("---------------------------------------------");

        obj.initialNonStaticMethod();
    }

    public static void staticMethod(){
        System.out.println("printing staticMethod");
    }

    public void nonStaticMethod(){
        System.out.println("printing nonStaticMethod");
    }

    public void initialNonStaticMethod() {
        nonStaticMethod(); // #5
        ClassB obj = new ClassB(); // #6
        obj.nonStaticMethodB(); // #6
        staticMethod(); // #7
        obj.staticMethodB(); // #8

    }
}
