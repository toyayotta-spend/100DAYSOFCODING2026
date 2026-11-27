
import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];

        // Memasukkan data ke array
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan data
        System.out.println("\nDaftar Nilai:");

        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
            total += nilai[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / nilai.length;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

    }
}
