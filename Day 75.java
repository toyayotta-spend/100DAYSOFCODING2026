
import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nama pembanding: ");
        String pembanding = input.nextLine();

        System.out.print("Masukkan kata yang ingin dicari: ");
        String kata = input.nextLine();

        System.out.println("\n=== HASIL PENGECEKAN STRING ===");

        System.out.println("Apakah nama sama persis: "
                + nama.equals(pembanding));

        System.out.println("Apakah nama sama tanpa memperhatikan huruf besar/kecil: "
                + nama.equalsIgnoreCase(pembanding));
        
        System.out.println("Apakah nama mengandung kata tersebut: "
                + nama.contains(kata));

        System.out.println("Apakah nama kosong: "
                + nama.isEmpty());
    }
}
