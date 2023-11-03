import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;
            int i = 1;

            while (i <= num) {
                sum += i;
                i++;
            }

            System.out.println("Sum of the first " + num + " natural numbers is: " + sum);
        }

    }
}
