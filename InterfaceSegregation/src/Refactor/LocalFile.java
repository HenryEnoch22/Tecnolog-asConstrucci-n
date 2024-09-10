package Refactor;

public class LocalFile implements SupportChangeOfOwnership, SupportRenaming {
    private String name;
    private String ownerUserName;
    private String ownerGroupName;


    public LocalFile(String name, String ownerUserName, String ownerGroupName) {
        this.name = name;
        this.ownerUserName = ownerUserName;
        this.ownerGroupName = ownerGroupName;
    }

    @Override
    public void changeOwner(String user, String group) {
        ownerUserName = user;
        ownerGroupName = group;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
