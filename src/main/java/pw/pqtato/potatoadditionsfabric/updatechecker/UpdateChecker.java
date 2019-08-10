package pw.pqtato.potatoadditionsfabric.updatechecker;

import com.google.gson.Gson;
import pw.pqtato.potatoadditionsfabric.Reference;

import java.io.*;
import java.net.URL;

public class UpdateChecker {
    public static String checkForUpdate() {

        String[] currentVersion = Reference.VERSION.split("\\.");
        String[] latestVersion = getVersion().split("\\.");

        return currentVersion[0]+currentVersion[1]+currentVersion[2]+latestVersion[0]+latestVersion[1]+latestVersion[2];
    }

    public static String getVersion() {
        Gson gson = new Gson();
        try {
            UpdateClass update = gson.fromJson(new FileReader(getJson()), UpdateClass.class);
            return update.latest;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getDownloadURL() {
        Gson gson = new Gson();
        try {
            UpdateClass update = gson.fromJson(new FileReader(getJson()), UpdateClass.class);
            return update.download;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String getJson() {
        try{

            //create a temp file
            File temp = File.createTempFile("tempfile", ".json");

            //write it
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write(URLReader.main(new URL("https://potatoadditions-storage.glitch.me/update/fabric.json")));
            bw.close();

            return temp.getPath();
        }catch(IOException e){

            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
