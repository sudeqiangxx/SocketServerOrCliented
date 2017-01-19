import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servers {
	// 设置端口号

	public static int portNo = 8267;

	public static void main(String[] args) {
		ServerSocket s = null;
		Socket socket = null ;
		try {
			s = new ServerSocket(portNo);

			System.out.println("The Server is start: " + s);

			// 阻塞,直到有客户端连接

			socket = s.accept();

			System.out.println("Accept the Client: " + socket);

			// 设置IO句柄

			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter out = new PrintWriter(new BufferedWriter(

					new OutputStreamWriter(socket.getOutputStream())), true);

			while (true)

			{
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
				//连接请求成功
				if(in!=null){
					String str = in.readLine();
					System.out.println("接收app消息："+str);
					if(str!=null){
						System.out.println("接收到客户端的信息"+str);
						out.println("{"+"device"+":"+"{"+"result"+":"+"ok"+"}}");
						out.flush();
					}
					
				}
			
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally

		{

			System.out.println("close the Server socket and the io.");

			try {
				socket.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

		}

	}

}
