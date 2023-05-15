package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Book {

     int id, quantity;
     String bookName;
     String auther;


    public Book(int id, String bookName, String auther, int quantity){

        this.id = id;
        this.bookName = bookName;
        this.auther = auther;
        this.quantity = quantity;
    }
    public static void main(String[] args) {

        List<Book> list = new ArrayList<Book>();

        Book b1 = new Book(101,"Let us C","Yashwant Kanetkar", 10);
        Book b2 = new Book(102,"Data Communications and Networking","Forouzan", 4);
        Book b3 = new Book(103,"Operating System","Galvin",6);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book b:list){
            System.out.println(b.id+" "+b.bookName+" "+b.auther+" "+b.quantity);
        }



    }

}
