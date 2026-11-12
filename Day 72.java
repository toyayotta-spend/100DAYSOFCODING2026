import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("=== PROGRAM PENJUMLAHAN ANGKA ===");

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;

        }

        System.out.println("----------------------------");
        System.out.println("Total penjumlahan: " + total);
        System.out.println("Program selesai.");

    }
}
