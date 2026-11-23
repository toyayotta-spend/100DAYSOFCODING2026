
import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        // Memasukkan angka ke dalam array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menjumlahkan semua elemen array
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        // Menampilkan hasil
        System.out.println("Total penjumlahan: " + total);
      
    }
}
