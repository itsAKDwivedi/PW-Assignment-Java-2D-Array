import java.util.*;
public class ReverseMatrixRow
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.print("m = ");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.print("arr[] = ");
		for(int i=0; i<n; i++) {
		    for(int j=0; j<m; j++) {
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(int i=0; i<n; i++) {
		    int low = 0, high = m-1;
		    while(low<high) {
		        int temp = arr[i][low];
		        arr[i][low] = arr[i][high];
		        arr[i][high] = temp;
		        low++;
		        high--;
		    }
		}
		for(int i=0; i<n; i++) {
		    for(int j=0; j<m; j++) {
		       System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
