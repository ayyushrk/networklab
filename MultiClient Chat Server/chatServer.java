import java.io.*;
import java.net.*;
import java.util.*;

public class chatServer{
	static Vector<ClientHandler>clients=new Vector<>();
	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(2500);
		
		while(true){
			Socket s=ss.accept();
			ClientHandler ch=new ClientHandler(s);
			clients.add(ch);
			new Thread(ch).start();
		}
	}
}

class ClientHandler implements Runnable{
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	String name;
	ClientHandler(Socket s)throws Exception{
		this.s=s;
		this.dis=new DataInputStream(s.getInputStream());
		this.dos=new DataOutputStream(s.getOutputStream());
		this.name=dis.readUTF();
	}
	public void run(){
		try{
			while(true){
				String msg=dis.readUTF();
				for(ClientHandler c:chatServer.clients){
					if(c!=this){
						c.dos.writeUTF(name+" "+msg);
						c.dos.flush();
					}
				}
			}
		}catch(Exception e){
			chatServer.clients.remove(this);
		}
	}
}
