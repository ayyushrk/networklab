import java.net.*;
import java.io.*;
import java.util.*;

public class client{
	public static void main(String[] args)throws Exception{
		Socket s=new Socket("localhost",3000);
		Scanner sc=new Scanner(System.in);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		Random r=new Random();
		
		System.out.print("Enter the n: ");
		int n=sc.nextInt();
		out.writeInt(n);
		
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
    				a[i][j]=r.nextInt(1,50);
				out.writeInt(a[i][j]);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		String matrix=in.readUTF();
		System.out.println(matrix);
	}
}
