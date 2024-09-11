package NoRefactorSuset;

public class DocumentGenerator {
    private InputReader reader = new InputReader();
    private TxFileCreator txt = new TxFileCreator();

    public void makeTxtFile(){
        String content = reader.getContent();
        String name = reader.getFileName();

        this.txt.createFile(name, content);
        System.out.println("Archivo creado exitosamente");
    }
}
