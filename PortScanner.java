import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class PortScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter host: ");
        String host = sc.nextLine();

        System.out.print("Enter starting port: ");
        int startPort = sc.nextInt();

        System.out.print("Enter ending port: ");
        int endPort = sc.nextInt();

        System.out.println("\nScanning " + host + "...\n");

        for (int port = startPort; port <= endPort; port++) {

            try {
                Socket socket = new Socket();

                socket.connect(
                    new InetSocketAddress(host, port),
                    200
                );

                System.out.println("Port " + port + " → OPEN");

                socket.close();

            } catch (Exception e) {
                // Port is closed or unreachable
            }
        }

        System.out.println("\nScan completed.");

        sc.close();
    }
}