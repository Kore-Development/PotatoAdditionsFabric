package pw.pqtato.potatoadditionsfabric.updatechecker;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import pw.pqtato.potatoadditionsfabric.Reference;

import java.io.*;
import java.net.URL;

public class UpdateChecker {
    public static String checkForUpdate() {

        String currentVersion = "";
        String latestVersion = "";

        // Adding - and then anything will be ignored
        // Example: 1.0.0-STABLE will ignore -STABLE so then it will be 1.0.0
        String[] currentVersionArray = (Reference.VERSION.indexOf("-") >= 0) ? Reference.VERSION.split("-")[0].split("\\.") : Reference.VERSION.split("\\.");
        String[] latestVersionArray = (getVersion().indexOf("-") >= 0) ? getVersion().split("-")[0].split("\\.") : getVersion().split("\\.");

        for(int i = 0; i < currentVersionArray.length; i++)
            currentVersion += currentVersionArray[i]+'.';
        currentVersion = currentVersion.substring(0,(currentVersion.length() - 1));

        for(int i = 0; i < latestVersionArray.length; i++)
            latestVersion += latestVersionArray[i]+'.';
        latestVersion = latestVersion.substring(0,(latestVersion.length() - 1));

        int updateCheck = UpdateChecker.VersionCompare(currentVersion, latestVersion);

        if (updateCheck == 0) {
            return "UP_TO_DATE";
        } else if (updateCheck == 2) {
            return "OUTDATED";
        } else if (updateCheck == 1) {
            return "CURRENT_NEWER_THAN_LATEST";
        } else if (updateCheck == (-1)) {
            return "FAILED";
        } else {
            return "FAILED";
        }
    }

    public static int VersionCompare(String v1,String v2) {
        int v1Len=StringUtils.countMatches(v1,".");
        int v2Len=StringUtils.countMatches(v2,".");

        if(v1Len!=v2Len)
        {
            int count=Math.abs(v1Len-v2Len);
            if(v1Len>v2Len)
                for(int i=1;i<=count;i++)
                    v2+=".0";
            else
                for(int i=1;i<=count;i++)
                    v1+=".0";
        }

        if(v1.equals(v2))
            return 0;

        String[] v1Str=StringUtils.split(v1, ".");
        String[] v2Str=StringUtils.split(v2, ".");
        for(int i=0;i<v1Str.length;i++)
        {
            String str1="",str2="";
            for (char c : v1Str[i].toCharArray()) {
                if(Character.isLetter(c))
                {
                    int u=c-'a'+1;
                    if(u<10)
                        str1+=String.valueOf("0"+u);
                    else
                        str1+=String.valueOf(u);
                }
                else
                    str1+=String.valueOf(c);
            }
            for (char c : v2Str[i].toCharArray()) {
                if(Character.isLetter(c))
                {
                    int u=c-'a'+1;
                    if(u<10)
                        str2+=String.valueOf("0"+u);
                    else
                        str2+=String.valueOf(u);
                }
                else
                    str2+=String.valueOf(c);
            }
            v1Str[i]="1"+str1;
            v2Str[i]="1"+str2;

            int num1=Integer.parseInt(v1Str[i]);
            int num2=Integer.parseInt(v2Str[i]);

            if(num1!=num2)
            {
                if(num1>num2)
                    return 1;
                else
                    return 2;
            }
        }
        return -1;
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