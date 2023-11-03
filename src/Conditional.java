import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.print("Enter any number:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.print("The factorial of the given number is:"+ fact );

    }
}