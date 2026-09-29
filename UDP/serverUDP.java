import java.io.*;
import java.net.*;
import java.util.*;

public class serverUDP{
	static HashMap<String,String> set=new HashMap<>();
	static{
    		set.put("tbh","to be honest");
    		set.put("ig","I guess");
    		set.put("tbf","to be fair");
    		set.put("atm","at the moment");
    		set.put("irl","in real life");
    		set.put("lol","laughing out loud");
    		set.put("asap","as soon as possible");
    		set.put("omg","oh my god");
    		set.put("ttyl","talk to you later");
    		set.put("idk","I don't know");
    		set.put("nvm","never mind");
	}
	public static void main(String[] args)throws Exception{
		DatagramSocket ss=new DatagramSocket(5500);
		
		byte[] receiveBuffer=new byte[2048];
		
		while(true){
			DatagramPacket receivePacket=new DatagramPacket(receiveBuffer,receiveBuffer.length);
			ss.receive(receivePacket);
			
			InetAddress clientAddress=receivePacket.getAddress();
			int clientPort=receivePacket.getPort();
			
			String sentence=new String(receivePacket.getData(),0,receivePacket.getLength());
			String[] words=sentence.split(" ");
			StringBuilder str=new StringBuilder();
			
			for(String word:words){
				if(set.containsKey(word)){
					str.append(set.get(word)).append(" ");
				}
				else{
					str.append(word).append(" ");
				}
			}
			String f=str.toString();
			byte[] sendData=f.getBytes();
			DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,clientAddress,clientPort);
			ss.send(sendPacket);
		}
	}
}
