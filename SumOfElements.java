import java.util.*;
public class SumOfElements
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
		int range[][] = new int[2][2];
		System.out.print("range = ");
		for(int i=0; i<2; i++) {
		    for(int j=0; j<2; j++) {
		        range[i][j]=sc.nextInt();
		    }
		}
		int sum = 0;
		for(int i=range[0][0]; i<=range[0][1]; i++) {
		    for(int j=range[1][0]; j<=range[1][1]; j++) {
		        sum+=arr[i][j];
		    }
		}
		System.out.print(sum);
	}
}
