package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck() {
        this.cards = new Card[52];
        this.usedCards = new ArrayList<>();
        populate();
    }

    public void populate(){

        int next = 0;

        for (int suit = 0; suit<4; suit++) {
            for (int value =0 ; value<13; value++) {
                Card card = new Card(suit,value);
                cards[next] = card;
                next++;
            }
        }
    }
}

