public class sLargestAndsSmallest {
    public static int sLargest(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if ((arr[i] <= largest) && (arr[i] != largest)) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    public static void main(String[] args) {
        // 1, 23, 212, 233, 233
        int[] arr = { 1, 23, 212, 233, 233 };
        System.out.println(sLargest(arr));
    }
}
