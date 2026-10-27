import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Masukkan N: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
