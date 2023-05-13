import java.util.*;
public class SortedMatrixElementSearch
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
		System.out.print("x = ");
		int x = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int low = 0, high = m-1;
		    while(low<high) {
		        int mid = (low+high)/2;
		        if(arr[i][mid]>x)
		            high = mid-1;
		        else if(arr[i][mid]<x)
		            low = mid + 1;
		        else if(arr[i][mid]==x){
		            System.out.println("Row = "+(i+1));
		            System.out.println("Column = "+(mid+1));
		            return;
		        }
		    }
		}
		System.out.print(-1);
	}
}
