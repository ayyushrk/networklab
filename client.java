import java.net.*;
import java.util.Scanner;

public class client{
	public static void main(String[] args){
		int serverport=9999;
		String serverIP="127.0.0.1";
		
		DatagramSocket clientsocket=new DatagramSocket();
		InetAdress serveradd = InetAddress.getByName(serverIP);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String sentence=scanner.nextLine();
		
		byte[] send=sentence.getBytes();
		DatagaramPacket sendPacket=new DatagramPacket(send,send.length,serveradd,serverport);
		clientsocket.send(sendPacket);
		
		byte[] recieve=new byte[2048];
		DatagramPacket recieve=new DatagramPacket(recieve,recieve.length);
		clientsocket.receive(recieve);
		
        	String translated = new String(receivePacket.getData(), 0, receivePacket.getLength());
       		System.out.println("Translated sentence: " + translated);
 
        	clientSocket.close();
    }
}
 
