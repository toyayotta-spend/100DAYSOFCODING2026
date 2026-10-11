import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur penonton: ");
        int umur = sc.nextInt();
        System.out.print("Apakah mahasiswa? ");
        boolean mahasiswa = sc.nextBoolean();

        int harga;
        if (umur < 12) {
            harga = 30000;
        } else if (umur <= 18) {
            harga = 40000;
        } else {
            harga = 50000;
        }

        System.out.println("Harga tiket sebelum diskon: Rp" + harga);

        int total = harga;
        if (mahasiswa) {
            System.out.println("Diskon mahasiswa 20%");
            total = harga - (harga * 20 / 100);
        } else {
            System.out.println("Tidak ada diskon");
        }

        System.out.println("Total bayar: Rp" + total);
    }
}
