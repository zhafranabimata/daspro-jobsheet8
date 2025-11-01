import java.util.Scanner;

public class KopiSenja3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jmlCabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + "\n");

            totalPelanggan += jmlPelanggan;
            totalItem += totalItemCabang;
        }

        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");
    }
}
