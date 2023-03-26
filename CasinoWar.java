import java.util.Scanner;
import java.util.Random;

public class CasinoWar {

    public static void main(String[] args) {
        // Initialize player balance and bet amount
        int playerBalance = 100;
        int betAmount;
        // Create a scanner object for user input and a random object for card drawing
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Casino War!");

        // Continue playing as long as the player has enough money
        while (playerBalance >= 10) {
            System.out.println("You have $" + playerBalance + ".");
            System.out.print("Enter your bet (minimum $10): ");
            // Get the player's bet
            betAmount = scanner.nextInt();

            // Check if the bet amount is valid
            if (betAmount < 10 || betAmount > playerBalance) {
                System.out.println("Invalid bet amount. Please try again.");
                continue;
            }

            // Draw a card for the player and dealer
            int playerCard = random.nextInt(13) + 1;
            int dealerCard = random.nextInt(13) + 1;

            // Show the player and dealer's cards
            System.out.println("You drew a " + getCardName(playerCard) + ".");
            System.out.println("Dealer drew a " + getCardName(dealerCard) + ".");

            // Compare the cards and update the player's balance
            if (playerCard > dealerCard) {
                System.out.println("You win!");
                playerBalance += betAmount;
            } else if (playerCard < dealerCard) {
                System.out.println("Dealer wins!");
                playerBalance -= betAmount;
            } else {
                System.out.println("It's a tie!");
            }
        }

        // Game over if the player doesn't have enough money to continue
        System.out.println("You don't have enough money to continue. Game over!");
        scanner.close();
    }

    // Method to get the card's name based on its value
    public static String getCardName(int cardValue) {
        String cardName;
        switch (cardValue) {
            case 1:
                cardName = "Ace";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";
                break;
            default:
                cardName = Integer.toString(cardValue);
                break;
        }
        return cardName;
    }
}
