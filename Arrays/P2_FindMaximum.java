
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in); 
		int T = s.nextInt(); 
		while(T-->0){
		    int n = s.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = s.nextInt();
		    }
		    int max = a[0];
		    for(int i=1;i<n;i++){
		        if(a[i]>max){
		            max = a[i];
		        }
		    }
		    System.out.println(max);
		}
	}
}