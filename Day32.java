import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai1, nilai2;

        System.out.print("Masukkan nilai pertama: ");
        nilai1 = input.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        nilai2 = input.nextInt();

        // Operator aritmatika
        int penjumlahan = nilai1 + nilai2;
        int pengurangan = nilai1 - nilai2;
        int perkalian = nilai1 * nilai2;

        // Operator perbandingan
        boolean lebihBesar = nilai1 > nilai2;
        boolean samaDengan = nilai1 == nilai2;

        // Operator logika
        boolean kondisi = nilai1 > 0 && nilai2 > 0;

        System.out.println("\n=== HASIL ===");
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);

        System.out.println("Nilai pertama > nilai kedua: " + lebihBesar);
        System.out.println("Nilai pertama == nilai kedua: " + samaDengan);

        System.out.println("Kedua nilai lebih dari 0: " + kondisi);
      
    }
}
