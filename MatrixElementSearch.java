import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.print("m = ");
		int m = sc.nextInt();
		System.out.print("x = ");
		int x = sc.nextInt();
		int arr[][] = new int[n][m];
		System.out.print("arr[][] = ");
		for(int i=0; i<n; i++) {
		  for(int j=0; j<m; j++) {
		      arr[i][j]=sc.nextInt();
		  }
		}
		for(int i=0; i<n; i++) {
		    for(int j=0; j<m; j++) {
		        if(arr[i][j]==x) {
		        System.out.println("Row = "+(i+1));
		        System.out.println("Column = "+(j+1));
		        return;
		        }
		    }
		}
		System.out.print(-1);
	}
}
