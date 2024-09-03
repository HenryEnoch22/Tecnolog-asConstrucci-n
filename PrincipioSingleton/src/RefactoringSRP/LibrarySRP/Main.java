package RefactoringSRP.LibrarySRP;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Ing. Software", "JV", true);
        LibraryMember member = new LibraryMember("Henry", "2");
        Library usbi = new Library(book, member);

        usbi.showBookStatus();
        usbi.lenBook();
        usbi.showBookStatus();
        usbi.returnBook();
        usbi.showBookStatus();
    }



}
