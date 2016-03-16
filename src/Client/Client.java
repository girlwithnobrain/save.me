package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created by ariel on 16.03.2016.
 */
public class Client {
    public Client (String ip, String port, String password){
        try{
            System.out.println("Trying to connect to " + ip + " on port " + port);
            Socket client = new Socket(ip, Integer.parseInt(port));
            System.out.println("Connected to " + client.getRemoteSocketAddress());
            System.out.println(client.getLocalPort());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());
            while (true){
                System.out.println(in.readUTF());
            }
        }catch (Exception e){e.printStackTrace();}
    }
}
