package NoRefactorSuset;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class TxFileCreator {
    public void createFile(String content, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            writer.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}