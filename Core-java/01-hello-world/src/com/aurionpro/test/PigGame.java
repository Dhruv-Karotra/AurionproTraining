package com.aurionpro.test;
import java.util.Random;
import java.util.Scanner;

public class PigGame {
    private static int totalScore = 0;

    public static void main(String[] args) {
        playSinglePlayerPigGame();
    }

    public static void playSinglePlayerPigGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        int turns = 0;

        while (totalScore < 20) {
            int turnScore = 0;
            turns++;
            System.out.println("Turn: " + turns);
            System.out.println("Score of all turns till now : " + playerScore);

            do {
                System.out.print("Do you want to roll (r) or hold (h)? ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("r")) {
                    int roll = random.nextInt(6) + 1;
                    System.out.println("You rolled a " + roll);

                    if (roll == 1) {
                        System.out.println("You rolled a 1. Turn over. You lose all points for this turn!");
                        turnScore = 0;
                        break;
                    } else {
                        turnScore += roll;
                        
                        if (totalScore + turnScore >= 20) {
                            
                            break;
                        }
                    }
                } else if (input.equalsIgnoreCase("h")) {
                    System.out.println("Current Turn Score : " + turnScore);
                    playerScore += turnScore;
                    totalScore += turnScore;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
                }
            } while (true);

            System.out.println("Total Score : " + totalScore);
            System.out.println(); // Add a blank line for better readability
        }

        System.out.println("Congratulations! You win with a score of " + playerScore + " in " + turns + " turns.");
    }
}
