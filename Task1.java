import java.util.Scanner;

public class Task1 {
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            int temp = (int) (Math.random() * 100);
            int tries = 10;
            boolean flag = false;

            while (tries != 0) {
                System.out.print("Enter your Guessed Number:  ");
                int guess = sc.nextInt();

                if (guess < temp) {
                    System.out.println("Your Guess is too Low");
                    tries--;
                    System.out.println("Attempts remaining: " + tries + "\n");
                } else if (guess > temp) {
                    System.out.println("Your Guess is too high");
                    tries--;
                    System.out.println("Attempts remaining: " + tries + "\n");
                } else {
                    flag = true;
                    score++;
                    break;
                }
            }
            if (!flag) {
                System.out.println("You are out of guesses!\nYou lost");
                System.out.println("Score: " + score);
            } else {
                System.out.println("Your Guess is correct!\nYou Win");
                System.out.println("Score: " + score + "\n\n");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        task1();
    }
}
