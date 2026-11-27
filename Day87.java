
import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {

        // Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Meminta input umur
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Menampilkan hasil
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
