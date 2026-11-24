import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menentukan angka maksimal
        int maksimal = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("Angka maksimal adalah: " + maksimal);
    }
}
