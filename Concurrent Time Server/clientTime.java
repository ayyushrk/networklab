import java.io.*;
import java.net.*;
import java.util.*;

public class clientTime{
	public static void main(String[] args)throws Exception{
		DatagramSocket s=new DatagramSocket();
		int port=1500;
		InetAddress serverAddress=InetAddress.getByName("localhost");
		
		String req="GET_TIME";
		byte[] sendData=req.getBytes();
		DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,serverAddress,port);
		s.send(sendPacket);
		
		byte[] receiveData=new byte[2048];
		DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
		s.receive(receivePacket);
		
		String time=new String(receivePacket.getData(),0,receivePacket.getLength());
		System.out.println(time);
	}
}
