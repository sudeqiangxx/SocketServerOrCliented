import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppClient {
	public static void main(String[] args) {
		try{
		Socket s = new Socket("127.0.0.1",8267);  
        
        //构建IO  
        InputStream is = s.getInputStream();  
        OutputStream os = s.getOutputStream();  
          
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));  
        PrintStream out=new PrintStream(os);
        //向服务器端发送一条消息  
        if(out!=null){
        	 out.print("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");  
        	 out.flush();
        }
       
          
        //读取服务器返回的消息  
        BufferedReader br = new BufferedReader(new InputStreamReader(is));  
        String mess = br.readLine();  
        System.out.println("服务器："+mess);  
    } catch (UnknownHostException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  
	}
}