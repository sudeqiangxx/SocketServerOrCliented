  
	import java.io.BufferedReader;  
	import java.io.IOException;  
	import java.io.InputStreamReader;  
	import java.io.PrintWriter;  
	import java.net.ServerSocket;  
	import java.net.Socket;  
	  
	public class ServerClient extends Thread {  
	    private Socket client;  
	  
	    public ServerClient(Socket c) {  
	        this.client = c;  
	    }  
	  
	    public void run() {  
	        try {  
	            BufferedReader in = new BufferedReader(new InputStreamReader(  
	                    client.getInputStream()));  
	            PrintWriter out = new PrintWriter(client.getOutputStream());  
	            // Mutil User but can't parallel  
	  
	           
	                String str = in.readLine();  
	                while (str!=null) {  
	             if(str!=null){
	            	   System.out.println("接收到客户端的信息"+str);
						out.println("{"+"device"+":"+"{"+"result"+":"+"ok"+"}}");
		                out.flush();  
	             }
	             
	                if ("end".equals(str))  {
	                	 break; 	
	                } 
	            }  
	            client.close();  
	        } catch (IOException ex) {  
	        } finally {  
	        }  
	    }  
	  
	    public static void main(String[] args) throws IOException {  
	        ServerSocket server = new ServerSocket(8267);  
	        System.out.println("等待客户端连接");
	        while (true) {  
	            // transfer location change Single User or Multi User  
	        	
	            ServerClient mc = new ServerClient(server.accept());  
	            mc.start();  
	        }  
	    }  
	}  

