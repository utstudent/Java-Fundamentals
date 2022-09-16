package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck deck = new Deck();

        for (Card card: deck.cards) {
            System.out.println(card);
        }

        Player player1 = new Player("Yavuz", 100);
        Player player2 = new Player("Talha", 100);

        deck.deal(player1);
        deck.deal(player1);

        player1.showHand();

        System.out.println();

        System.out.println(player1);

    }
}
