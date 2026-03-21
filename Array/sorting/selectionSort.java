public class selectionSort {
    public static void SelectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 6, 3, 23, 5 };
        SelectionSort(arr);

    }
}