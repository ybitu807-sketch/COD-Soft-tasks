import java.util.Scanner;
public class GuessGame {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int secret = (int)(Math.random() * 100) + 1;
int guess;
int tries = 0;
System.out.println("Guess a number between 1 and 100");
do {
System.out.print("Enter your guess: ");
guess = sc.nextInt();
tries++;
if (guess > secret) {
System.out.println("Too high!");
} 
else if (guess < secret) { 
System.out.println("Too low!");
} 
else {
System.out.println("Correct! You guessed it in " + tries + " tries.");
}
} while (guess != secret);
sc.close();
}
}