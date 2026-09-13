public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BIODATA ===");

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Tempat tinggal: ");
        String tempatTinggal = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.println("\n=== BIODATA SAYA ===");
        System.out.println("Nama           : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Tempat tinggal : " + tempatTinggal);
        System.out.println("Umur           : " + umur + " tahun");

        input.close();
    }
}
