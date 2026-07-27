class Book{
    
    int bookid;
    String title;
    String author;
    float price;

    public static int details(int bookid,String title,String author,float price){
        System.out.println("TITLE :"+title);
        System.out.println("AUTHOR :"+author);
        System.out.println("PRICE :"+price);
        System.out.println("BOOKID :"+bookid);
        return bookid;
    }
    
    public static void main(String[] args) {
        Book b = new Book();

        b.bookid = 121;
        b.title = "the english book";
        b.author = "students book";
        b.price = 1212f;


        int result = details(b.bookid, b.title, b.author, b.price);
        System.out.println(result);
        
    }

}