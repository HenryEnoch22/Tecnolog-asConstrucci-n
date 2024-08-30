package RefactoringSRP;

public class LibraryMember {
    private String name;
    private String memberId;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book){
        System.out.println(book.getTitle() + " ha solicitado el préstamo del libro.");
    }

    public void showBookStatus(Book book){
        System.out.println("El estado actual del libro " + book.isAvailable());
    }
}
