public class day21 {
    public static void main(String[] args) {

        // Data dalam bentuk String
        String angka = "25";
        String desimal = "75.5";
        String huruf = "A";
        String benarSalah = "true";

        // Mengubah String menjadi tipe data primitif
        int nilaiInt = Integer.parseInt(angka);
        double nilaiDouble = Double.parseDouble(desimal);
        char nilaiChar = huruf.charAt(0);
        boolean nilaiBoolean = Boolean.parseBoolean(benarSalah);

        // Menampilkan hasil
        System.out.println("String angka: " + angka);
        System.out.println("Setelah menjadi int: " + nilaiInt);

        System.out.println("String desimal: " + desimal);
        System.out.println("Setelah menjadi double: " + nilaiDouble);

        System.out.println("String huruf: " + huruf);
        System.out.println("Setelah menjadi char: " + nilaiChar);

        System.out.println("String benar/salah: " + benarSalah);
        System.out.println("Setelah menjadi boolean: " + nilaiBoolean);
    }
}
