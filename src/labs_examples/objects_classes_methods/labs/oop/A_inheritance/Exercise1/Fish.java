package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Fish extends Animal{

    protected double length;

    public Fish(String name, double height, double weight, double length) {
        super(name, height, weight);
        this.length = length;
    }

    public void go() {
        System.out.println("The fish is swimming!");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
