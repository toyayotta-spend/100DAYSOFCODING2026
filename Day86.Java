import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};
        int cari;
        boolean ditemukan = false;

        System.out.println("Daftar Angka dalam Array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        cari = input.nextInt();

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                System.out.println("Angka ditemukan pada indeks ke-" + i);
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka tidak ditemukan dalam array.");
        }
    }
}
