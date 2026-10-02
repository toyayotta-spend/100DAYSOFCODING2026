import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai;
        boolean hadir;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        System.out.print("Apakah mahasiswa hadir? (true/false): ");
        hadir = input.nextBoolean();

        // Operator AND (&&)
        boolean lulusDanHadir = (nilai >= 75) && hadir;

        // Operator OR (||)
        boolean lulusAtauHadir = (nilai >= 75) || hadir;

        // Operator NOT (!)
        boolean tidakHadir = !hadir;

        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai >= 75 AND hadir : " + lulusDanHadir);
        System.out.println("Nilai >= 75 OR hadir  : " + lulusAtauHadir);
        System.out.println("Tidak hadir           : " + tidakHadir);
      
    }
}
