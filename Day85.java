
import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menentukan angka minimal
        int minimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Angka minimal adalah: " + minimal);

    }
}
