import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number: ");
            int n = sc.nextInt();
            if (n > 26) {
                System.out.println("patter not possible");
            } else {
                String[] s = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                        "P",
                        "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" " + s[j]);
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();

                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print(s[j] + " ");
                    }
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();

                }
            }
        }
    }
}
