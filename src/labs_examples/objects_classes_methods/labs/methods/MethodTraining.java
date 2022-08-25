package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        add(a,b);

        System.out.println("a is " + a + " and b is " + b);


        Person talha = new Person(21, "Talha");
        System.out.println(talha.toString());

        talha.ageUp();
        System.out.println(talha.toString());

    }

    public static void add(int a, int b) {
        a = a+b;
        System.out.println(a);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public void ageUp() {
            this.age = this.age + 1;
        }
    }




}
