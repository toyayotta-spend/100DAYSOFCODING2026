import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan semua elemen array
        System.out.println("\nIsi elemen array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
