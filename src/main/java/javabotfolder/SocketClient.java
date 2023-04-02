package javabotfolder;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

//
//        //get the localhost IP address, if server is running on some other IP, you need to use that
//        InetAddress host = InetAddress.getLocalHost();
//        Socket socket = null;
//        ObjectOutputStream oos = null;
//        ObjectInputStream ois = null;
//
//        for
//                (int i=0; i <5;i++){
//            //establish socket connection to server
//        try {
//            socket = new Socket(host.getHostName(), 9876);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //write to socket using ObjectOutputStream
//        try {
//            oos = new ObjectOutputStream(socket.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Sending request to Socket Server");
//            if(i==4) {
//                try {
//                    oos.writeObject("exit");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            else {
//                try {
//                    oos.writeObject(""+i);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            //read the server response message
//        try {
//            ois = new ObjectInputStream(socket.getInputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String message = null;
//        try {
//            message = (String) ois.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Message: " + message);
//            //close resources
//        try {
//            ois.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public SocketClient() throws UnknownHostException {
//    }
//}
//

}
