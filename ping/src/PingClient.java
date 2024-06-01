import java.io.*;
import java.net.*;

class PingClient {
    public static void main(String args[]) throws Exception {
        String str;
        Socket s = new Socket("127.0.0.1", 5555);
        BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        for (int c = 0; c < 4; c++) {
            long t1 = System.currentTimeMillis();
            str = "Welcome to network programming world";
            out.println(str);
            System.out.println(dis.readLine());
            long t2 = System.currentTimeMillis();
            System.out.println(";TTL=" + (t2 - t1) + "ms");
        }
        s.close();
    }
}
