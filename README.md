# Casino War Game

Casino War is a simple card game where the player and the dealer each draw a card, and the one with the higher card value wins. This Java-based implementation of the game features the computer as the dealer or house, and the player starts with an initial balance of $100. The game requires a minimum bet of $10 per round.

## How to Play

- Compile and run the CasinoWar.java file in your Java development environment or terminal. 
- The game will display a welcome message and your current balance.
- Enter your bet for the round (minimum $10, maximum equal to your current balance).
- The program will draw a card for both the player and the dealer, then display the results.
- If your card has a higher value than the dealer's card, you win the round and your bet is added to your balance.
- If the dealer's card has a higher value than your card, you lose the round and your bet is deducted from your balance.
- If both cards have the same value, it's a tie, and your balance remains the same.
- The game continues as long as you have enough money to place the minimum bet ($10).
- If your balance drops below $10, the game ends and displays a game over message.

## Rules

- Card values range from 1 (Ace) to 13 (King). 
- Numbered cards have their face value, and the Ace is considered the lowest value card.
- There are no suits in this simplified version, so only the card values are compared.
- In the case of a tie, no balance is exchanged between the player and the dealer.

## License

This project is open-source and available for personal and educational use.
