import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the coordinates of the first point (x1 y1):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            System.out.println("Enter the coordinates of the second point (x2 y2):");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            System.out.println("The length of the line is: " + length);
        }
    }

