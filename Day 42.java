
import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, potongan, gajiBersih;

        System.out.print("Masukkan gaji pokok: Rp ");
        gajiPokok = input.nextDouble();

        if (gajiPokok >= 5000000) {
            potongan = gajiPokok * 0.10;
        } else {
            potongan = gajiPokok * 0.05;
        }

        gajiBersih = gajiPokok - potongan;

        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Potongan    : Rp " + potongan);
        System.out.println("Gaji Bersih : Rp " + gajiBersih);
    }
}
