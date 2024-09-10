package Refactor;

import java.io.FilePermission;

public class Main {
    public static void main(String[] args) {
        LocalFile local = new LocalFile("Archivo local",  "Usuario 1",  "Grupo 1");
        DropboxFile dropbox = new DropboxFile("Archivo dropbox",  "Usuario 2",  "Grupo 2");

        FileImporter fileImporter = new FileImporter();
        FilePermissionManager filePermissionManager = new FilePermissionManager();

        fileImporter.importFile(local, "Archivo local importado");
        System.out.println(local.getName());

        fileImporter.importFile(dropbox, "Archivo dropbox importado");
        System.out.println(dropbox.getName());

        System.out.println();

        //Interfaz SupportChangeOwner


    }
}
