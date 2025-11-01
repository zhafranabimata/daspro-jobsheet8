import java.util.Scanner;

public class 2Kotak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (NILAI MINIMAL 3) = "); 
        int n = sc.nextInt(); 
        
        for(int iOuter=1; iOuter<=n; iOuter++){ 
            for(int i=1; i<=n; i++) { 
                System.out.printf("%2d", n); 
                int lebar;
                lebar = n * 2 - 2;
                if (iOuter > 1 && iOuter <= n - 1) {
                    System.out.printf("%"+lebar+"d", n);
                    break;
                }
            }   
            System.out.println(); 
        } 
        sc.close();
    }
}