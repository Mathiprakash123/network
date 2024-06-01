

import java.io.*;
import java.net.*;

class PingServer {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(5555);
        Socket s = ss.accept();
        BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        for (int c = 0; c < 4; c++) {
            String str = dis.readLine();
            out.println("Reply from" + InetAddress.getLocalHost() + ";Length" + str.length());
        }
        s.close();
        ss.close();
    }
}

