
import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("\n=== HASIL ===");

        System.out.println("Substring: " + nama.substring(0, 3));

        System.out.println("Replace: " + nama.replace("a", "o"));

        System.out.println("Trim: " + nama.trim());

    }
}
