
import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kota: ");
        String kota = input.nextLine();

        System.out.println("\n=== HASIL STRING ===");

        System.out.println("Nama asli       : " + nama);
        System.out.println("Panjang nama    : " + nama.length());
        System.out.println("Huruf kapital   : " + nama.toUpperCase());
        System.out.println("Huruf kecil     : " + nama.toLowerCase());

        System.out.println("Kota asli       : " + kota);
        System.out.println("Huruf kapital   : " + kota.toUpperCase());
        System.out.println("Huruf kecil     : " + kota.toLowerCase());

    }
}
