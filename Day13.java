import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama;
        String jenis;
        String hp;
        double berat;
        int umur;
        double tinggi;

        System.out.print("Masukkan Nama : ");
        nama = sc.nextLine();

        System.out.print("Masukkan Umur : ");
        umur = sc.nextInt();

        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = sc.nextDouble();

        System.out.print("Masukkan Berat Badan : ");
        berat = sc.nextDouble();

        sc.nextLine();

        System.out.print("Masukkan Jenis Kelamin : ");
        jenis = sc.nextLine();

        System.out.print("Masukkan Nomor Telepon : ");
        hp = sc.nextLine();

        System.out.println("\n-----Biodata Saya-----");
        System.out.println("Nama          : " + nama);
        System.out.println("Umur          : " + umur);
        System.out.println("Tinggi Badan  : " + tinggi + " Cm");
        System.out.println("Berat Badan   : " + berat + " Kg");
        System.out.println("Jenis Kelamin : " + jenis);
        System.out.println("Nomor Telepon : " + hp);

        sc.close();
    }
}
