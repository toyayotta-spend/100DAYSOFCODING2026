
import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Masukkan kata yang dicari: ");
        String kata = input.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        // 1. length()
        System.out.println("Panjang nama: " + nama.length());

        // 2. toUpperCase()
        System.out.println("Huruf besar: " + nama.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        // 4. trim()
        System.out.println("Nama tanpa spasi: " + nama.trim());

        // 5. equals()
        System.out.println("Nama sama dengan Artika: "
                + nama.trim().equals("Artika"));

        // 6. equalsIgnoreCase()
        System.out.println("Nama sama tanpa memperhatikan huruf besar/kecil: "
                + nama.trim().equalsIgnoreCase("artika"));

        // 7. contains()
        System.out.println("Kalimat mengandung kata tersebut: "
                + kalimat.contains(kata));

        // 8. replace()
        System.out.println("Mengganti huruf a menjadi o: "
                + nama.replace("a", "o"));

        // 9. substring()
        if (nama.length() >= 3) {
            System.out.println("Tiga huruf pertama: "
                    + nama.substring(0, 3));
        }

        // 10. isEmpty()
        System.out.println("Apakah nama kosong: "
                + nama.isEmpty());
    }
}
