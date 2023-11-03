import java.util.Random;
public class SnakeAndLadderGame {
        public static void main(String[] args) {
            int playerPosition = 0;
            int winningPosition = 100;
            Random random = new Random();

            while (playerPosition < winningPosition) {
                int diceRoll = random.nextInt(6) + 1;  // Roll a fair 6-sided die (1-6)

                // Determine if the player encounters a snake, ladder, or stays in a safe spot
                int option = random.nextInt(3);

                switch (option) {
                    case 0:
                        // Snake: Move the player back by a random number between 1-6
                        int snakeBite = random.nextInt(6) + 1;
                        playerPosition = Math.max(0, playerPosition - snakeBite);
                        break;
                    case 1:
                        // Ladder: Move the player forward by the dice roll
                        playerPosition += diceRoll;
                        break;
                    default:
                        // Safe spot: Just move forward by the dice roll
                        playerPosition += diceRoll;
                }

                // Ensure the player doesn't go beyond the winning position
                if (playerPosition > winningPosition) {
                    playerPosition = winningPosition;
                }

                System.out.println("Player rolled a " + diceRoll + ". Moved to position " + playerPosition);
            }

            System.out.println("Congratulations! Player reached the winning spot at position " + playerPosition);
        }
    }


