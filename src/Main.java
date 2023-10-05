public class Main {
    public static void main(String[] args) {
        double P, S;
        int n, k;
        P = 1;
        n = 1;

        while (n <= 25) {
            S = 0;
            k = 1;
            while(k <= n){
                S += Math.sqrt(Math.pow(Math.cos(k+n), 2));
                k++;
            }
            P += Math.cos(n) + S;
            n++;
        }
        System.out.println(P);

        P = 1;
        n = 1;
        do {
            S = 0;
            k = 1;
            do {
                S += Math.sqrt(Math.pow(Math.cos(k+n), 2));
                k++;
            } while (k <= n);
            P += Math.cos(n) + S;
            n++;
        } while (n <= 25);
        System.out.println(P);

        P = 1;
        for (n = 1; n <= 25; n++) {
            S = 0;
            for (k = 1; k <= n; k++) {
                S += Math.sqrt(Math.pow(Math.cos(k+n), 2));
            }
            P += Math.cos(n) + S;
        }
        System.out.println(P);

        P = 1;
        for (n = 25; n >= 1; n--) {
            S = 0;
            for (k = n; k >= 1; k--) {
                S += Math.sqrt(Math.pow(Math.cos(k+n), 2));
            }
            P += Math.cos(n) + S;
        }
        System.out.println(P);
    }
}