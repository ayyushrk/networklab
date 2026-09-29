import java.io.*;
import java.net.*;
import java.util.*;

public class clientFile{	
	public static void main(String[] args)throws Exception{
		Socket s=new Socket("localhost",1200);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		out.writeUTF(name);
		out.flush();
		
		String pid=in.readUTF();
		System.out.println("PID: "+pid);
		String content=in.readUTF();
		System.out.println(content);
	}
}
