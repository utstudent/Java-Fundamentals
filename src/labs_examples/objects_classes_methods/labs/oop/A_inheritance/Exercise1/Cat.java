package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Cat extends Animal{

    protected double whiskersLength;

    public Cat(String name, double height, double weight, double whiskersLength) {
        super(name, height, weight);
        this.whiskersLength = whiskersLength;
    }

    public void go(){
        System.out.println("The cat is running!");
    }

    public double getWhiskersLength() {
        return whiskersLength;
    }

    public void setWhiskersLength(double whiskersLength) {
        this.whiskersLength = whiskersLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "whiskersLength=" + whiskersLength +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
