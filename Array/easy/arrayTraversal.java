import java.util.*;

public class arrayTraversal {

    public static void arrayTraverse(int marks[]) {
        System.out.print("Marks in the array : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        arrayTraverse(marks);
    }
}