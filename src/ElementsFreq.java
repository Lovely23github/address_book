public class ElementsFreq {
    public static void main(String[] args){
        int[] arr = {1, 1, 3, 6, 7, 1, 3, 5, 2, 6, 7, 7};

        int[] frequency = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }

            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }

        System.out.println("Element Frequency in the Array:");
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(arr[i] + " occurs " + frequency[i] + " times");
            }
        }
    }
}
