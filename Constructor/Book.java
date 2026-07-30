class Book{

    int bookId;
    String title;
    String author;
    double price;

    public Book() {
        bookId = 1;
        title = "Java Programing";
        author = "James Gosling";
        price = 599;
    }
    void displayBook(){
        System.out.println("Book ID:"+bookId);
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }

    

    public static void main(String[] args) {
        Book b =new Book();
        b.displayBook();
    }
}