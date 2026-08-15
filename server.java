import java.net.*;
import java.util.*;

public class server{
	
	static Map<String,String> dict=new HashMap<>();
	static{
		        dict.put("tbh", "to be honest");
        dict.put("ig", "I guess");
        dict.put("tbf", "to be fair");
        dict.put("atm", "at the moment");
        dict.put("irl", "in real life");
        dict.put("lol", "laughing out loud");
        dict.put("asap", "as soon as possible");
        dict.put("omg", "oh my god");
        dict.put("ttyl", "talk to you later");
        dict.put("idk", "I don't know");
        dict.put("nvm", "never mind");
        dict.put("idc", "I don't care");
       	}
       	
       	public static void main(String[] args){
       		int port=9999;
       		DatagramServerSocket serversocket=new DatagramServerSocket(port);
       		byte[] recieve=new byte[2048];
       		      while (true) {
            // 1. Prepare an empty packet and block until something arrives
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            serverSocket.receive(receivePacket);
 
            // 2. receive() fills in the sender's address/port -- this is how
            //    we know who to reply to (no accept()/connect() needed)
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
 
            String receivedSentence = new String(
                    receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from " + clientAddress + ":" + clientPort
                    + " -> " + receivedSentence);
 
            // 3. Translate
            String translated = translate(receivedSentence);
            System.out.println("Sending back  -> " + translated);
 
            // 4. Build a reply packet addressed to the same client and send it
            byte[] sendData = translated.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(
                    sendData, sendData.length, clientAddress, clientPort);
            serverSocket.send(sendPacket);
        }
    }
 
    // Replaces every abbreviation word with its formal expansion,
    // preserving surrounding punctuation and original spacing.
    static String translate(String sentence) {
        String[] tokens = sentence.split(" ");
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
 
            // separate leading punctuation, the core word, and trailing punctuation
            int start = 0, end = token.length();
            while (start < end && !Character.isLetterOrDigit(token.charAt(start))) start++;
            while (end > start && !Character.isLetterOrDigit(token.charAt(end - 1))) end--;
 
            String prefix = token.substring(0, start);
            String core = token.substring(start, end);
            String suffix = token.substring(end);
 
            String key = core.toLowerCase();
            String replacement = dict.getOrDefault(key, core);
 
            result.append(prefix).append(replacement).append(suffix);
            if (i != tokens.length - 1) result.append(" ");
        }
 	return out;
 }
}
