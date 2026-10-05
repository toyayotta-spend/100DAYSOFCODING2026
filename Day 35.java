import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        boolean hadir;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        System.out.print("Apakah hadir lebih dari 75%? (true/false): ");
        hadir = input.nextBoolean();

        if (nilai >= 60) {
            if (hadir == true) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak lulus karena kehadiran kurang");
            }
        } else {
            System.out.println("Tidak lulus karena nilai kurang");
        }
    }
}
