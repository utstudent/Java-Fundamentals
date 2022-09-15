package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {

    private char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    private int suit;

    private String[] values = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private int cardValue;

    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suits[suit] +
                ", cardValue=" + values[cardValue] +
                '}';
    }
}
