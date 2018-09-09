package ibcontroller;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.*;
import java.net.Socket;

public class SendCommand {
    private static Logger logger = Logger.getLogger(SendCommand.class.getName());

    private void sendCommandToIBController(String host, int port, String command) throws IOException {
        logger.log(Level.INFO, "Sending: " + command);

        Socket s = new Socket(host, port);

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s
                .getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(s
                .getInputStream()));

        out.write(command + "\n");
        out.flush();

        String ack = in.readLine();

        logger.log(Level.INFO, "Received: " + ack);

        out.close();

        in.close();
    }

    public static void main(String args[]) throws IOException {
        new SendCommand().sendCommandToIBController(args[0], Integer.parseInt(args[1]), args[2]);
    }
}
