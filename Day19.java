public class day19 {
    public static void main(String[] args) {

        // Tipe data besar: double
        double angkaDouble = 125.75;

        // Konversi manual dari double ke int
        int angkaInt = (int) angkaDouble;

        // Menampilkan nilai sebelum dikonversi
        System.out.println("Nilai sebelum dikonversi : " + angkaDouble);

        // Menampilkan nilai setelah dikonversi
        System.out.println("Nilai setelah dikonversi : " + angkaInt);

        // Menampilkan tipe data
        System.out.println("Tipe data awal           : double");
        System.out.println("Tipe data setelah cast   : int");
    }
}
