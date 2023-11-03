public class AdPattern {
    public static void main(String args[]){
        int n=4;
        //First Upper Half
        for(int i=1;i<=n;i++){
            //First Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n;i>=1;i--) {
            //First Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
