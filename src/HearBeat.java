import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class HearBeat {

    private static final String TAG=HearBeat.class.getSimpleName();

    public  boolean deviceHearBeat(String ip,int port){
        boolean result=false;
        Socket socket=new Socket();
        PrintStream  outprint = null;
        DataInputStream inputPrint = null;
        long lianjiqian=0;
        InetSocketAddress isa=new InetSocketAddress(ip,port);
        try {
        	 lianjiqian=System.currentTimeMillis();
             
             
            socket.connect(isa,1500);
            long lianjihou=System.currentTimeMillis();
            System.out.println("连接成功：连接时间："+(lianjihou-lianjiqian));
            outprint= new PrintStream(socket.getOutputStream());
            inputPrint=new DataInputStream(socket.getInputStream());
            System.out.println("socket = " + socket);

            // 设置IO句柄

            BufferedReader in = new BufferedReader(new InputStreamReader(socket

                          .getInputStream()));

            PrintWriter out = new PrintWriter(new BufferedWriter(

                          new OutputStreamWriter(socket.getOutputStream())), true);

            out.println("call");
            try {
				Thread.sleep(2000);
				String str = in.readLine();
	            System.out.println(str);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("连接失败：连接时间："+(System.currentTimeMillis()-lianjiqian));
        }



        finally {
            if (outprint!=null){
                outprint.close();
                outprint=null;
            }
            if (inputPrint!=null){
                try {
                    inputPrint.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                inputPrint=null;
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                socket=null;
            }
        }


        return result;
    }
}
