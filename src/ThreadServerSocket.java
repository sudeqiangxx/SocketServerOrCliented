import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ThreadServerSocket implements Runnable {
	private Socket client=null;
	public ThreadServerSocket (Socket client) {
		this.client=client;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int recvMsgSize=0;
			byte[] receiveBuf=new byte[1024*8];
			System.out.println("我是线程"+this);
			PrintStream out=new PrintStream(client.getOutputStream());
			BufferedReader buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
			boolean flag=true;
			while(flag){
				String str=buf.readLine();
				if(str==null||"".equals(str)){
					flag=false;
				}else{
					System.out.println("接收到app端发送的消息："+str);
					out.println("{"+"device"+":"+"{"+"result"+":"+"ok"+"}}");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
