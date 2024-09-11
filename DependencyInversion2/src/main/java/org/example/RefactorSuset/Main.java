package org.example.RefactorSuset;
public class Main {
    public static void main(String[] args) {
        DocumentGenerator documentCreator = AppConfig.generateDocumentGenerator();
        documentCreator.generateDocument();
    }
}