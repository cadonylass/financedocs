package javabotfolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;


import java.io.*;
import java.net.*;
    class Proxy_Server {
        public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
                //get the localhost IP address, if server is running on some other IP, you need to use that
//                InetAddress host = InetAddress.getLocalHost();
//        //        InetAddress hosttwo = new InetAddress;
//                System.out.println(host);
//                Socket socket = null;
//            System.out.println(socket);
//                ObjectOutputStream oos = null;
//                ObjectInputStream ois = null;
//
//            Socket echoSocket = new Socket(host, 1220);
//                    ServerSocket ss = new ServerSocket();
//            SocketAddress endPoint = new InetSocketAddress(host, 1220);
//            echoSocket.bind(endPoint);
//            //ss = socket.accept();
//
//        //    ss.bind(new InetSocketAddress(host, 4001));
//                   //
//                    System.out.println(ss);
//            for(int i=0; i<5;i++){
//                    //socket = new Socket(s, 1220);
//                    //write to socket using ObjectOutputStream
//                    oos = new ObjectOutputStream(echoSocket.getOutputStream());
//                    System.out.println("Sending request to Socket Server");
//
//            if(i==4)oos.writeObject("exit");
//            else oos.writeObject(""+i);
//            //read the server response message
//            ois = new ObjectInputStream(echoSocket.getInputStream());
//            String message = (String) ois.readObject();
//            System.out.println("Message: " + message);
//            //close resources
//            ois.close();
//            oos.close();
//            Thread.sleep(100);
//                }

//            ServerSocketserverSocket = new ServerSocket();
//            ServerSocketserverSocket = new ServerSocket();
////Binding the SocketAddress with inetAddress and port
//            SocketAddressendPoint=new InetSocketAddress(inetAddress, port);
////bind() method  the ServerSocket to the specified socket address
//            serverSocket.bind(endPoint);
//            ServerSocketserverSocket serversoc = new ServerSocket();
////Binding the SocketAddress with inetAddress and port
//            SocketAddressendPoint=new InetSocketAddress(inetAddress, port);
////bind() method  the ServerSocket to the specified socket address
//            serverSocket.bind(endPoint);
            try {
                String Proxy_Host = "Our Proxy Server";
                int Remote_Port = 1025;
                int Local_Port = 1026;
                // Printing the start-up message
                System.out.println("Starting proxy for " + Proxy_Host + ":" + Remote_Port
                        + " on port " + Local_Port);
                // start the server
                Run_Server(Proxy_Host, Remote_Port, Local_Port);
            }
            catch (Exception e)
            {
                System.err.println(e);
            }
        }


        public static void Run_Server(String Proxy_Host, int Remote_Port, int Local_Port) throws IOException {
            // Create a ServerSocket to listen connections
            ServerSocket Server_Socket = new ServerSocket(Local_Port);
            final byte[] Request = new byte[1024];
            byte[] Reply = new byte[4096];
            while (true) {
                Socket Socket_Client = null,
                        Socket_Server = null;
                try {
                    // wait for a connection on the local port
                    Socket_Client = Server_Socket.accept();
                    final InputStream InputStreamClient = Socket_Client.getInputStream();
                    final OutputStream OutputStreamClient = Socket_Client.getOutputStream();

                    // Create the connection to the real server.
                    try {
                        Socket_Server = new Socket(Proxy_Host, Remote_Port);
                    }
                    catch (IOException e) {
                        PrintWriter out = new PrintWriter(OutputStreamClient);
                        out.print("The Proxy Server could not connect to " + Proxy_Host + ":"
                                + Remote_Port + ":\n" + e + "\n");
                        out.flush();
                        Socket_Client.close();
                        continue;
                    }


                    final InputStream InputStreamServer = Socket_Server.getInputStream();
                    final OutputStream OutputStreamServer = Socket_Server.getOutputStream();

                    // The thread to read the client's requests and to pass them
                    Thread New_Thread = new Thread() {
                        public void run() {
                            int Bytes_Read;
                            try {
                                while ((Bytes_Read = InputStreamClient.read(Request)) != -1) {
                                    OutputStreamServer.write(Request, 0, Bytes_Read);
                                    OutputStreamServer.flush();
                                }
                            }//145.40.129.13
                            catch (IOException e) {
                            }

                            // Close the connections
                            try {
                                OutputStreamServer.close();
                            }
                            catch (IOException e) {
                            }
                        }
                    };

                    // client-to-server request thread
                    New_Thread.start();
                    // Read server's responses and pass them to the client.
                    int Bytes_Read;
                    try {
                        while ((Bytes_Read = InputStreamServer.read(Reply)) != -1) {
                            OutputStreamClient.write(Reply, 0, Bytes_Read);
                            OutputStreamClient.flush();
                        }
                    }
                    catch (IOException e) {
                    }
                    // Close the connection
                    OutputStreamClient.close();
                }
                catch (IOException e) {
                    System.err.println(e);
                }
                finally {
                    try {
                        if (Socket_Server != null)
                            Socket_Server.close();
                        if (Socket_Client != null)
                            Socket_Client.close();
                    }
                    catch (IOException e) {
                    }
                }
            }
        }
    }

    //make sure the bot is using ip
//        private final Object target;
//
//        public invochandler(Object target) {
//            this.target = target;
//        }
//
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            return method.invoke(target, args);
//        }
//    }



//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }
