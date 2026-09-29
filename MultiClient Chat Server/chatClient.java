import java.io.*;
import java.net.*;
import java.util.*;

public class chatClient{
	public static void main(String[] args)throws Exception{
		Socket s=new Socket("localhost",2500);
		Scanner sc=new Scanner(System.in);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		
		System.out.print("Enter the name: ");
		String name=sc.nextLine();
		out.writeUTF(name);
		
		Thread rcv=new Thread(()->{
			try{
				while(true){
					String msg=sc.nextLine();
					out.writeUTF(msg);
				}
			}catch(Exception e){}
		});
		rcv.start();
		
		while(true){
			String msg=in.readUTF();
			System.out.println(msg);
		}
	}
}
