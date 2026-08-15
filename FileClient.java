import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileClient{
	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("localhost",5000);
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the file name: ");
		String name=scanner.nextLine();
		
		out.writeUTF(name);
		out.flush();
		
		
		String pid=in.readUTF();
		System.out.println("PID is :"+pid);

		String content=in.readUTF();
		System.out.println(content);
		
		socket.close();
	}
}
		
