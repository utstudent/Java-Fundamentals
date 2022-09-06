package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Dog extends Animal{

    protected String color;

    public Dog(String name, double height, double weight, String color) {
        super(name, height, weight);
        this.color = color;
    }

    public void go() {
        System.out.println("The dog is running");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
