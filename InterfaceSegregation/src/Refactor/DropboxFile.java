package Refactor;

public class DropboxFile implements SupportRenaming {
    private String name;
    private final String ownerUserName;
    private final String ownerGroupName;


    public DropboxFile(String name, String ownerUserName, String ownerGroupName) {
        this.name = name;
        this.ownerUserName = ownerUserName;
        this.ownerGroupName = ownerGroupName;
    }

    public String getName() {
        return name;
    }

    @Override
    public void rename(String name) {
        this.name = name;
    }
}
