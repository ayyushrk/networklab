import java.io.*;
import java.net.*;
import java.util.*;

public class serverTime{
	public static void main(String[] args)throws Exception{
		DatagramSocket ss=new DatagramSocket(1500);
		
		while(true){
			byte[] receiveBuffer=new byte[2048];
			DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,receiveBuffer.length);
			ss.receive(receivePacket);
			
			InetAddress clientAddress=receivePacket.getAddress();
			int port=receivePacket.getPort();
			
			new Thread(()->{
				try{
					String time=new Date().toString();
					byte[] sendData=time.getBytes();
					DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,clientAddress,port);
					ss.send(sendPacket);
				}catch(Exception e){}
			}).start();
		}
	}
}
