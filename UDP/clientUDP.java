import java.io.*;
import java.net.*;
import java.util.*;

public class clientUDP{
	public static void main(String[] args)throws Exception{
		DatagramSocket s=new DatagramSocket();
		Scanner sc=new Scanner(System.in);
		int port =5500;
		String name="localhost";
		
		InetAddress serverAddress=InetAddress.getByName(name);
		
		String sentence=sc.nextLine();
		byte[] sendData=sentence.getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,serverAddress,port);
		s.send(sendPacket);
		
		byte[] receiveBuffer=new byte[2048];
		DatagramPacket receivePacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);
		s.receive(receivePacket);
		String f=new String(receivePacket.getData(),0,receivePacket.getLength());
		System.out.println(f);
	}
}
