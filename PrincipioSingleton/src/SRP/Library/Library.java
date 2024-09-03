package SRP.Library;

import RefactoringSRP.LibrarySRP.Book;

public class Library {
    public String title;
    public String author;
    public boolean isAviable;
    public String memberName;
    public String memberID;
    public Book book;
//    public LibraryMember member;

    public Library(String title, String author, boolean isAviable, String memberName, String memberID) {
        this.title = title;
        this.author = author;
        this.isAviable = isAviable;
        this.memberName = memberName;
        this.memberID = memberID;
        ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAviable() {
        return isAviable;
    }

    public void setAviable(boolean aviable) {
        isAviable = aviable;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void lendBook(){
        if(isAviable){
            isAviable = false;
            System.out.println("El librio " + title + " no está disponible.");
        }else{
            System.out.println("El librio " + title + " está disponible.");
        }
    }

    public void returnBook(){
        isAviable = true;
        System.out.println("El libro " + title + " ha sido devulto.");
    }

    public void borrowBook(){
        System.out.println(memberName + " ha solicitado el préstamo del libro.");
    }

    public void showBookStatus(){
        System.out.println("El estado actual del libro " + isAviable());
    }

}

