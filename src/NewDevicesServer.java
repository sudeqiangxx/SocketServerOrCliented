import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NewDevicesServer {
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(8267);
			Socket client=null;
			boolean flag=true;
			while (flag) {
				System.out.println("等待与客户端连接...");
				client=server.accept();
				System.out.println("与客户端连接成功");
				new Thread(new ThreadServerSocket(client)).start();;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
