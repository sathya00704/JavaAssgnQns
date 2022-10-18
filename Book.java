import java.util.*;
public class Book {
    String BKName;
    int BKId;
    String BKAuthor;

    Book(String name, int id, String author)//Parametrised Constructor
    {
        BKName = name;
        BKId = id;
        BKAuthor = author;
    }

    void BKUpdateDetails(String name, int id, String author)
    {
        BKName = name;
        BKId = id;
        BKAuthor = author;
    }

    void BKDisplay()
    {
        System.out.println("Book ID = " + BKId);
        System.out.println("Book Name = " + BKName);
        System.out.println("Book Author = " + BKAuthor);
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int id;
        String name,author;

        System.out.print("Enter Book ID=");
        id = obj.nextInt();

        System.out.print("Enter Book Name=");
        name = obj.next();

        System.out.print("Enter Book Author=");
        author = obj.next();

        Book para3 = new Book(name, id, author);
        //Book b = new Book();

        para3.BKDisplay();

        //For Updation
        System.out.println("Enter details for updation:");
        System.out.print("Enter new Book ID=");
        id = obj.nextInt();

        System.out.print("Enter new Book Name=");
        name = obj.next();

        System.out.print("Enter new Book Author=");
        author = obj.next();

        para3.BKUpdateDetails(name, id, author);
        System.out.println("Details after updation");
        para3.BKDisplay();
    }
}
