public class textBook extends book {
    private String subject;
    private int edition;


    public textBook(String title, String author, int pages, String subject, int edition) {
        super(title, author, pages);
        this.subject = subject;
        this.edition = edition;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }


    public String getSubject() { return subject; }
    public int getEdition() { return edition; }
}

