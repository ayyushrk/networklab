import java.io.*;
import java.net.*;
import java.util.*;

public class TimeClient{
	public static void main(String[] args) throws Exception{
		int serverPort= 5000;
		
		DatagramSocket socket=new DatagramSocket();
		InetAddress serverAddress=InetAddress.getByName("localhost");
		
		byte[] sendData="GET_TIME".getBytes();
		
		DatagramPacket request=new DatagramPacket(sendData,sendData.length,serverAddress,serverPort);
		socket.send(request);
		
		byte[] receiveData=new byte[1024];
		
		DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
		socket.receive(receivePacket);
		
		String time=new String(receivePacket.getData(),0,receivePacket.getLength());
		
		System.out.println("Time received: "+time);
		socket.close();
	}
}
