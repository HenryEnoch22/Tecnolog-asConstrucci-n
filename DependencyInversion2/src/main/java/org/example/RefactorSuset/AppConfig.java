package org.example.RefactorSuset;

public class AppConfig {

    public static DocumentGenerator generateDocumentGenerator() {

        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TextFileCreator(), TextFileCreator.getType());

        InputReader inputReader = new ConsoleReaderInput();
        return new DocumentGenerator(inputReader, registry);
    }
}
