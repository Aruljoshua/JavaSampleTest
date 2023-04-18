import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array");
            int s = sc.nextInt();
            System.out.println("enter the array of integers:");
            int[] arr = new int[s];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the target value");
            int k = sc.nextInt();
            int cnt = 0;
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                c = arr[i];
                if (c == k) {
                    // System.out.println("the sub array is the number itself");
                    cnt++;
                }
                // int r = c;
                for (int j = i + 1; j < arr.length; j++) {

                    c = c + arr[j];
                    if (c == k) {
                        cnt++;
                        // System.out.println("the sub array is: ");
                        // for (int j2 = i + 1; j2 < arr.length; j2++) {

                        // if (r != k) {
                        // System.out.print(arr[j2] + " ");
                        // }

                        // r += arr[j];
                        // }
                        // System.out.println();

                    }
                }

            }
            System.out.println("the number of subarrays that satisfy the criterion:" + cnt);
        }
    }
}