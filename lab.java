
import java.util.Arrays;
import java.util.Scanner;

//Library Management (Mini Version)

public class lab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Head First Java",
            "Effective Java",
            "Clean Code",
            "The Pragmatic Programmer",
            "Introduction to Algorithms",
            "Hands-On Machine Learning",
            "Atomic Habits",
            "Deep Work",
            "Mindset",
            "The Alchemist",
            "1984",
            "Rich Dad Poor Dad"
        };

        System.out.println("TOTAL BOOKS :"+Arrays.toString(books));
        System.out.println("TOTAL NO OF AVAILABLE BOOKS :"+books.length);

    }
}