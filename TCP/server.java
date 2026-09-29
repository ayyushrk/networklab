import java.io.*;
import java.net.*;
import java.util.*;

public class server{
	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(3000);
		Socket s=ss.accept();
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		
		int n=in.readInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=in.readInt();
			}
		}
		
		boolean isUp=true,isLo=true;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]!=0 && i>j){
					isUp=false;
				}
				if(a[i][j]!=0 && i<j){
					isLo=false;
				}
			}
		}
		
		boolean isDi=isUp && isLo;
		if(isDi){
			out.writeUTF("Diagonal matrix");
		}
		else if(isLo){
			out.writeUTF("Lower Triangular matrix");
		}
		else if(isUp){
			out.writeUTF("Upper triangular matrix");
		}
		else{
			out.writeUTF("None of the matrix");
		}
		out.flush();
	}
}
