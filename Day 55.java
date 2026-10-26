
import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka 1 sampai 10: ");
        int angka = input.nextInt();

        System.out.println("\nContoh Continue:");
        for (int i = 1; i <= angka; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nContoh Break:");
        for (int i = 1; i <= angka; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nContoh Return:");
        tampilkanPesan();

    }

    static void tampilkanPesan() {
        System.out.println("Program menggunakan keyword return.");
        return;
    }
}
