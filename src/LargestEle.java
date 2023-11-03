public class LargestEle {
    public static void main(String[] args){
        int[] arr = {90, 54, 10, 67, 32, 98, 37, 23};


        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + maxElement);
    }
}
