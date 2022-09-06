package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Mammal implements MammalBehvaior{

    protected boolean isConscious;

    public Mammal(){}
    public Mammal(boolean isConscious) {
        this.isConscious = isConscious;
    }

    public void go(){
        System.out.println("The mammal is running!");
    };

    public void stop(){
        System.out.println("The mammal is stopping!");
    };
    public boolean isConscious() {
        return isConscious;
    }

    public void setConscious(boolean conscious) {
        isConscious = conscious;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "isConscious=" + isConscious +
                '}';
    }
}
