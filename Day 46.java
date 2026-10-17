import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Bakso");
        System.out.println("4. Soto Ayam");
        System.out.print("Pilih menu (1-4): ");

        int pilihan = input.nextInt();

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
            case 4:
                System.out.println("Anda memilih Soto Ayam");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
