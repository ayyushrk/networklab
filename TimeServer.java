import java.io.*;
import java.net.*;
import java.util.Date;

public class TimeServer{
	public static void main(String[] args) throws Exception{
		DatagramSocket socket=new DatagramSocket(5000);
		System.out.println("Server Started");
		
		byte[] receiveData=new byte[1024];
		
		while(true){
			DatagramPacket req=new DatagramPacket(receiveData,receiveData.length);
			
			socket.receive(req);
			
			InetAddress clientAddress=req.getAddress();
			
			int clientPort=req.getPort();
			
			new Thread(()->{
				try{
					String time=new Date().toString();
					byte[] sendData=time.getBytes();
					
					DatagramPacket reply=new DatagramPacket(sendData,sendData.length,clientAddress,clientPort);
					socket.send(reply);
					System.out.println("Time sent");
				}catch(Exception e){
					e.printStackTrace();
					}
				}).start();
		}
	}
}
