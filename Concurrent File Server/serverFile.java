import java.io.*;
import java.net.*;
import java.util.*;

public class serverFile{	
	public static void main(String[] args)throws Exception{
		ServerSocket ss=new ServerSocket(1200);
		
		
		
		while(true){
			Socket s=ss.accept();
			DataInputStream in=new DataInputStream(s.getInputStream());
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			long pid = ProcessHandle.current().pid();
			out.writeUTF(String.valueOf(pid));
			new Thread(()->{
				try{
					String name=in.readUTF().trim();
					File file=new File(name);
					if(file.exists()){
						BufferedReader fr=new BufferedReader(new FileReader(file));
						String line;
						StringBuilder str=new StringBuilder();
						while((line=fr.readLine())!=null){
							str.append(line).append("\n");
						}
						out.writeUTF(str.toString());
						out.flush();
					}
					else{
						out.writeUTF("File Not Found");
						out.flush();
					}
				}catch(Exception e){}
			}).start();
		}
	}
}
