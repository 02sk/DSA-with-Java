public class arrayReversal {
    public static void reverse(int arr[]){
        int start = 0; 
        int end = (arr.length)-1;

        while (start<end) {
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 33, 12, 1, 233}; 
        System.out.print("before reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+  " ");
        }
        System.out.println();
        reverse(arr);
       System.out.print("after reverse : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+  " ");
        }
        System.out.println();
    }
}
