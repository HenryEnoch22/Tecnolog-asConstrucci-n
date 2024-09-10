package Refactor;

public class FilePermissionManager {
    public void transferFile(SupportChangeOfOwnership file, String ownerUserName, String ownerGroupName){
        file.changeOwner(ownerUserName, ownerGroupName);
    }
}
