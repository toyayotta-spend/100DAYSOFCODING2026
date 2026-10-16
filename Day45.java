import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Bakso");
        System.out.print("Masukkan pilihan (1-3): ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
