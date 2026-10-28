
import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Masukkan angka N: ");
        N = input.nextInt();

        System.out.println("Angka ganjil 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
