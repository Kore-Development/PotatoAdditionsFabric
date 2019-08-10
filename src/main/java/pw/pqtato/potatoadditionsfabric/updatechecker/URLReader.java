package pw.pqtato.potatoadditionsfabric.updatechecker;

import java.net.*;
import java.io.*;

public class URLReader {
    public static String main(URL url) throws Exception {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String response = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            response += (inputLine + "\n");
        in.close();

        return response;
    }
}
