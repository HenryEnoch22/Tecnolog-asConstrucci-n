package SRP;

import SRP.Library.Library;

public class Main {
    public static void main(String[] args) {
        Library libreria1 = new Library("Fundamentos de Sistemas Opeartivos", "JVergara", true, "Henry", "1");
        libreria1.showBookStatus();
        libreria1.lendBook();
        libreria1.showBookStatus();
        libreria1.returnBook();
        libreria1.showBookStatus();

    }
}
