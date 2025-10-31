import java.util.Scanner;

public class Kotak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = sc.nextInt();

        // Hitung lebar kolom berdasarkan panjang digit angka terbesar
        int width = String.valueOf(n).length() + 1; // +1 biar ada spasi antar angka

        for (int i = 1; i <= n; i++) { // baris
            for (int j = 1; j <= n; j++) { // kolom
                // Hitung jarak dari tepi terdekat
                int min = Math.min(Math.min(i, j), Math.min(n - i + 1, n - j + 1));
                int val = n - min + 1;

                // Cetak dengan lebar kolom dinamis
                System.out.printf("%" + width + "d", val);
            }
            System.out.println();
        }
    }
}
