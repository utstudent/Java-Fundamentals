package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;

    public Player(String name, int potValue) {
        this.name = name;
        this.hand = new Hand();
        this.potValue = potValue;
    }

    public String getName() {
        return name;
    }
    public Hand getHand() {
        return hand;
    }
    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public void showHand(){
        System.out.println(hand);
    }

    @Override
    public String toString() {
        return "Player:" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue;
    }
}
