public class Day4 {
    public static void main(String[] args) {

        byte pensil = 10;
        short buku = 20;
        int harga = 5000;
        long uang = 100000;

        System.out.println("Tipe Data Numerik Bilangan Bulat");
        System.out.println("--------------------------------");
        System.out.println("Jumlah pensil : " + pensil);
        System.out.println("Jumlah buku   : " + buku);
        System.out.println("Harga pensil  : " + harga);
        System.out.println("Uang          : " + uang);

        System.out.println("Total pensil dan buku : " + (pensil + buku));
        System.out.println("Sisa uang              : " + (uang - harga));
    }
}
