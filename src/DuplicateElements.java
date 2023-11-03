public class DuplicateElements {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 2, 4, 1, 4, 6, 7, 8, 9, 1};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

