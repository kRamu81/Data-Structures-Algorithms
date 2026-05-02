import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            
            // Read the array
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            int count = 1;   // at least one group
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}