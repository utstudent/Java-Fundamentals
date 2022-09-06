package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class MammalController {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("Rammus", 50, 400);
        Cat myCat = new Cat("Nil", 10, 20, 2);
        Fish myFish = new Fish("Nemo", 2, 3, 5);

        myFish.go();
        myCat.go();
        myAnimal.go();

    }
}
