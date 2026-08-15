import java.io.*;
import java.net.*;

public class FileServer{
	public static void main(String[] args) throws Exception{
		ServerSocket ss=new ServerSocket(5000);
		
		while(true){
			Socket socket=ss.accept();
			
			new Thread(()->{
				try{
					DataInputStream in =new DataInputStream(socket.getInputStream());
					DataOutputStream out=new DataOutputStream(socket.getOutputStream());
					
					String fname=in.readUTF();
					long pid=ProcessHandle.current().pid();
					
					out.writeUTF(""+pid);
					
					File file=new File(fname);
					
					if(file.exists()){
						BufferedReader fileReader=new BufferedReader(new FileReader(file));
						StringBuilder content=new StringBuilder();
						String line;
						
						while((line=fileReader.readLine())!=null){
							content.append(line).append("\n");
						}
						fileReader.close();
						out.writeUTF(content.toString());
					}
					else{
						out.writeUTF("File not found");
					}
					out.flush();
					socket.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}).start();
		}
	}
}
