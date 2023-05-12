import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.print("m = ");
		int m = sc.nextInt();
		int arr[] = new int[n*m];
		System.out.print("arr[] = ");
		for(int i=0; i<n*m; i++) {
		    arr[i]=sc.nextInt();
		}
		int ar[][] = new int[n][m];
		int index = 0;
		for(int i=0; i<n; i++) {
		    for(int j=0; j<m; j++) {
		        ar[i][j]=arr[index];
		        index++;
		    }
		}
		System.out.print("[");
		for(int i=0; i<n; i++) {
		    System.out.print("[");
		    for(int j=0; j<m; j++) {
		        System.out.print(ar[i][j]);
		        if(j!=m-1)
		        System.out.print(",");
		    }
		    System.out.print("]");
		    if(i!=n-1)
		        System.out.print(",");
		}
		System.out.print("]");
	}
}
