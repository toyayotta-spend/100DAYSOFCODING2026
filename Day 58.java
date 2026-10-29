import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        System.out.println("Angka ganjil:");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap:");
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
