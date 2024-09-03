package RefactoringSRP.LibrarySRP;

public class Library {
    private Book book;
    private LibraryMember member;

    public Library(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
    }

    public void lenBook(){
        book.setAvailable(false);
        System.out.println("El libro " + book.getTitle() + " ha sido prestado.");
    }

    public void returnBook(){
        book.setAvailable(true);
        System.out.println("El libro " + book.getTitle() + " ha sido devulto.");
    }

    public void showBookStatus(){
        System.out.println("El estado actual del libro " +  book.isAvailable());
    }
}
