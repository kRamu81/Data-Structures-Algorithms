import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int[] A = new int[n];  // Alice's distances
            int[] B = new int[n];  // Bob's distances

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }

            int happyDays = 0;
            for (int i = 0; i < n; i++) {
                if (B[i] <= 2 * A[i] && A[i] <= 2 * B[i]) {
                    happyDays++;
                }
            }

            System.out.println(happyDays);
        }

        sc.close();
    }
}