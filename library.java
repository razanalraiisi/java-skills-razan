public class library {
    public static void main(String[] args) {

         book book1 = new book("The Hobbit", "J.R.R. Tolkien", 310);
         book book2 = new book("Harry Potter and the chamber of secrets", "JK Rowling", 550);

        textBook text1 = new textBook("Java Programming", "John Smith", 500, "Computer Science", 3);

        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();

        System.out.println("Book 1");
        book1.displayInfo();
        System.out.println("Book 2");
        book2.displayInfo();
        System.out.println("Textbook");
        text1.displayInfo();
    }
}
