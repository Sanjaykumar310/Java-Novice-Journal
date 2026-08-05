class Book{

    int bookId;
    String title;
    String author;
    String publisher;
    double price;

    public Book() {
        this(123, "The jorney of sanjay");
    }

    Book(int bookId,String title){
        this(123,"The jorney of sanjay","sanjay","kumar",12000);
    }

    public Book(int bookId, String title, String author, String publisher, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    void displayBook(){
        System.out.println("Book ID :"+bookId);
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Publisher :"+publisher);
        System.out.println("Price :"+price);
    }
    

    public static void main(String[] args) {
        Book b = new Book();
        b.displayBook();
    }
}