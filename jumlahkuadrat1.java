public class jumlahkuadrat1 {
    public static void main(String[] args) {
        
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            String deret = "";

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;

                deret += kuadrat;
                if (i < n) {
                    deret += " + ";
                }
            }
            System.out.println("n = " + n + " => jumlah kuadrat = " + deret + " = " + jumlah);
        }
    }
}

