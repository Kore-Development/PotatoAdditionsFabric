package pw.pqtato.potatoadditionsfabric;

import pw.pqtato.potatoadditionsfabric.updatechecker.UpdateChecker;

public class ModUpdateNotifier {
    public static String getUpdateMessage() {
        String updateCheck = UpdateChecker.checkForUpdate();

        if (updateCheck == "FAILED") {
            return "The automatic update checker has failed. This is probably an error.";
        } else if (updateCheck == "UP_TO_DATE") {
            return null;
        } else if (updateCheck == "OUTDATED") {
            return "There is an update available! Download at "+UpdateChecker.getDownloadURL();
        } else if (updateCheck == "CURRENT_NEWER_THAN_LATEST") {
            return "The version you are using is newer than the latest version. You are probably using an unreleased version.";
        }

        return null;
    }
}
