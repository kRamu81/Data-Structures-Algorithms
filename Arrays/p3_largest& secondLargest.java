import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max = 0;
            int smax = 0;
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    smax = max;
                    max = a[i];
                }
                
                if(a[i]> smax && max != a[i]){
                    smax = a[i];
                }
            }
            
            System.out.println(max+smax);
            
        }
    }
}
