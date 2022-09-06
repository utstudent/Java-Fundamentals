package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Animal extends Mammal {

    protected String name;
    protected double height;
    protected double weight;
    protected int age;

    public Animal() {
    }

    public Animal(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = 0;
    }

    public void go() {
        System.out.println("The animal is running!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
