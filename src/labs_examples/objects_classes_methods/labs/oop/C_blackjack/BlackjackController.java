package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {

        playBlackJack();


    }

    public static void playBlackJack(){

        Deck deck = new Deck();

        boolean unique = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player 1's name: ");
        String name = scanner.nextLine();

        Player player1 = new Player(name, 100);
        Player player2 = new Player("AI", 100);
        System.out.println(player1);


        while(true) {

            System.out.println("How much do you want to bet? ");
            int betAmount = Integer.valueOf(scanner.nextLine());

            deck.deal(player1);
            deck.deal(player1);
            deck.deal(player2);
            deck.deal(player2);

            System.out.println(player1.getHand());


            while (true) {
                System.out.println("Do you want to draw another card? (y or n)");
                String answer = scanner.nextLine();

                if (answer.equals("y")) {
                    deck.deal(player1);
                }
                System.out.println(player1.getHand());

                boolean aiAnswer = player2.computerAI();

                if (aiAnswer == true) {
                    deck.deal(player2);
                    System.out.println("AI draws a card");
                } else {
                    System.out.println("AI did not draw a card");
                }

                if (!answer.equals("y") && aiAnswer == false) {
                    unique = false;
                    break;
                }

                if (player1.getHand().getHandValue() > 21 && player2.getHand().getHandValue() > 21) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Draw! " + "AI's hand value was "+ player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~");
                    unique = true;
                    break;
                } else if (player1.getHand().getHandValue() == player2.getHand().getHandValue()) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Draw! " + "AI's hand value was "+ player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~");
                    unique = true;
                    break;
                } else if (player1.getHand().getHandValue() > 21) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Busted, you lose! " + "AI's hand value was "+ player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~");
                    unique = true;
                    player1.losePotValue(betAmount);
                    player2.gainPotValue(betAmount);
                    break;
                } else if (player2.getHand().getHandValue() > 21) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ AI Busted, you win! "+ "AI's hand value was " + player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~");
                    unique = true;
                    player2.losePotValue(betAmount);
                    player1.gainPotValue(betAmount);
                    break;
                }
            }

            if (!unique) {
                if (player1.getHand().getHandValue() > player2.getHand().getHandValue()) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ You win!" + " AI's hand value was " + player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~");
                    player2.losePotValue(betAmount);
                    player1.gainPotValue(betAmount);
                } else {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ You lose!" + " AI's hand value was " + player2.getHand().getHandValue() + " ~~~~~~~~~~~~~~~~~~~~~~" );
                    player1.losePotValue(betAmount);
                    player2.gainPotValue(betAmount);
                }
            }

            if (player1.getPotValue()<=0) {
                System.out.println("You went broke, Goodbye!");
                break;
            }

            System.out.println();
            System.out.println("Do you want to play again? (y or n)");
            System.out.println();
            System.out.println(player1);
            if (scanner.nextLine().equals("n")){
                break;
            }
            deck.usedCards.clear();
            player1.getHand().clear();
            player2.getHand().clear();
        }


    }
}
