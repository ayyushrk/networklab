import java.util.Scanner;

public class Demoscanner{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter matrix size N:");
		int n = scanner.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println("Enter");
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println(matrix);
		System.out.println("You entered: "+n);
		scanner.close();
	}
}
