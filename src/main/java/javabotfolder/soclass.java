package javabotfolder;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

public class soclass {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
    InetAddress host = InetAddress.getLocalHost();
    //        InetAddress hosttwo = new InetAddress;
                System.out.println(host);
    Socket socket = null;
            System.out.println(socket);
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;

    Socket echoSocket = new Socket(host, 1026);
    ServerSocket ss = new ServerSocket();
    SocketAddress endPoint = new InetSocketAddress(host, 1025);
            echoSocket.bind(endPoint);
    //ss = socket.accept();

    //    ss.bind(new InetSocketAddress(host, 4001));
    //
                    System.out.println(ss);
            for(int i=0; i<5;i++){
        //socket = new Socket(s, 1220);
        //write to socket using ObjectOutputStream
        oos = new ObjectOutputStream(echoSocket.getOutputStream());
        System.out.println("Sending request to Socket Server");

        if(i==4)oos.writeObject("exit");
        else oos.writeObject(""+i);
        //read the server response message
        ois = new ObjectInputStream(echoSocket.getInputStream());
        String message = (String) ois.readObject();
        System.out.println("Message: " + message);
        //close resources
        ois.close();
        oos.close();
        Thread.sleep(100);
    }

}}
