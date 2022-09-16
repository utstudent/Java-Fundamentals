package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;
import java.util.Random;
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

    public void deal(Player player){

        int randomNum = (int)Math.floor(Math.random()*(52-1+1)+1);

        Hand playerHand = player.getHand();

        while (true) {
            if (!usedCards.contains(randomNum)){

                playerHand.addCard(cards[randomNum]);

                usedCards.add(randomNum);
                break;
            }
        }

    }
}

