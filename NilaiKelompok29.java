package dasprojobsheet7;
import java.util.Scanner;
public class NilaiKelompok29 {
    public static void main(String[] args) {
        int i = 1, j, nilai;
        float totalNilai, rataNilai= 0;
        Scanner sc = new Scanner(System.in);

        while (i<=6) {
            System.out.println("Kelompok " +i);
            totalNilai = 0;
            for (j=1;j<=5;j++) { 
                System.out.print("Nilai dari Kelompok Penilaian " +j+ ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata dari Kelompok " +i+ ": " + rataNilai);
            i++;  
        }
    }
}
