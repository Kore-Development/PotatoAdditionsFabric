package pw.pqtato.potatoadditionsfabric.updatechecker;

import com.google.gson.Gson;
import pw.pqtato.potatoadditionsfabric.Reference;

import java.io.*;
import java.net.URL;

public class UpdateChecker {
    public static String checkForUpdate() {

        // Work in Progress

        String currentVersion = "";
        String latestVersion = "";

        // Adding - and then anything will be ignored
        // Example: 1.0.0-STABLE will ignore -STABLE so then it will be 1.0.0
        String[] currentVersionArray = (Reference.VERSION.indexOf("-") >= 0) ? Reference.VERSION.split("-")[0].split("\\.") : Reference.VERSION.split("\\.");
        String[] latestVersionArray = (getVersion().indexOf("-") >= 0) ? getVersion().split("-")[0].split("\\.") : getVersion().split("\\.");

        // Will change to compare versions
        for(int i = 0; i < currentVersionArray.length; i++)
            currentVersion += currentVersionArray[i]+'.';
        currentVersion = currentVersion.substring(0,(currentVersion.length() - 1));

        for(int i = 0; i < latestVersionArray.length; i++)
            latestVersion += latestVersionArray[i]+'.';
        latestVersion = latestVersion.substring(0,(latestVersion.length() - 1));


        // When status is added status will be either "UP_TO_DATE" or "OUTDATED"
        return "\nCurrent version: "+currentVersion+"\nLatest version: "+latestVersion+"\n";
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