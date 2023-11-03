import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        int[][] numbers = new int[rows][col];

        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The element is found at position: (" + i + " , " + j + ")");
                }

            }

        }
    }
}