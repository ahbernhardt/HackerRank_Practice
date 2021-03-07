package ThirtyDaysOfCode.Day_13;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    private final int price;

    MyBook(String title, String author, int price) {
        super( title, author );
        this.price = price;
    }

    @Override
    void display() {
        System.out.println( "Title: " + title );
        System.out.println( "Author: " + author);
        System.out.println( "Price: " + price );
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        Book new_novel = new MyBook( title, author, price );
        new_novel.display();
    }
}
