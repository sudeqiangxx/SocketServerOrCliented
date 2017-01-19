import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class Client {
	public static  void  main(String[] args){
		HearBeat hearbeat=new HearBeat();
       String ip="192.168.200.119";
       int port=8267;
       Socket socket=null;
       PrintStream  outprint = null;
       DataInputStream inputPrint = null;
     
      
       
       
       
       try {
    	   socket=new Socket(ip,port);
    	   outprint= new PrintStream(socket.getOutputStream());
		 inputPrint=new DataInputStream(socket.getInputStream());
	     System.out.println("socket = " + socket);
	  // 设置IO句柄

         BufferedReader in = new BufferedReader(new InputStreamReader(socket

                       .getInputStream()));

         PrintWriter out = new PrintWriter(new BufferedWriter(

                       new OutputStreamWriter(socket.getOutputStream())), true);

         out.println("call");
         out.flush();
         
         try {
			Thread.sleep(1000);
			if(in!=null){
				String ss=in.readLine();
				System.out.println("接收到消息："+ss);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         in.close();
         out.close();
         socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      

//       hearbeat.deviceHearBeat(ip, port);
//		String sb="device/156889783";
//		String result=sb.substring(7, sb.length());
//		System.out.println("result:"+result);
//		
		StringBuilder sb=new StringBuilder();
        sb.append("{").append("\"device\":").append("{").append("\"result\": \"ok\"").append("}}");
        System.out.println("字符串校正："+sb.toString());
		

    }
	
	
//	public static SQLiteDatabase database; 
//
//	public static SQLiteDatabase database;[java] view plaincopyprint?
//			String DB_PATH = "/data/data/com.example.mymap/databases/"; 
//	        String DB_NAME = "wifi.db"；
//
//	        // 检查 SQLite 数据库文件是否存在  
//	        if ((new File(DB_PATH + DB_NAME)).exists() == false) { 
//	            // 如 SQLite 数据库文件不存在，再检查一下 database 目录是否存在  
//	            File f = new File(DB_PATH); 
//	            // 如 database 目录不存在，新建该目录  
//	            if (!f.exists()) { 
//	                f.mkdir(); 
//	            } 
//	 
//	 
//	            try { 
//	                // 得到 assets 目录下我们实现准备好的 SQLite 数据库作为输入流  
//	                InputStream is = getBaseContext().getAssets().open(DB_NAME); 
//	                // 输出流  
//	                OutputStream os = new FileOutputStream(DB_PATH + DB_NAME); 
//	 
//	 
//	                // 文件写入  
//	                byte[] buffer = new byte[1024]; 
//	                int length; 
//	                while ((length = is.read(buffer)) > 0) { 
//	                    os.write(buffer, 0, length); 
//	                } 
//	 
//	 
//	                // 关闭文件流  
//	                os.flush(); 
//	                os.close(); 
//	                is.close(); 
//	            } catch (Exception e) { 
//	                e.printStackTrace(); 
//	            } 
//	        } 
}

