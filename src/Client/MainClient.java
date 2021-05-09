package Client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MainClient {
    public static final int SC_WIDTH = 1280;
    public static final int SC_HEIGHT = 720;

    public static void main(String[] args) throws IOException {
        Socket c_socket = new Socket("localhost", 8888);
        InputStream input_data = c_socket.getInputStream();

        byte[] receiveBuff = new byte[100];
        input_data.read(receiveBuff);
        System.out.println(new String(receiveBuff));
        new DynamicBeat();
    }
}
