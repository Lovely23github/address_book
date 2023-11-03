import java.util.Scanner;

public class SingleDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single-digit number from 0-9: ");
        int number = sc.nextInt();


        if (number >= 0 && number <= 9) {
            String[] words = {
                    "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
            };
            String word = words[number];
            System.out.println("Number in word: " + word);
        } else {
            System.out.println("Invalid input. Please enter a single-digit number.");
        }

    }

}

