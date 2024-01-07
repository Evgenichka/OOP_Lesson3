import java.io.Console;
import java.util.List;

public class Main {


    public void Main(String [] args)
    {
        Book b1 = new Book("Война и мир", "Л.Н. Толстой", 1869);
    }
        Book b2 = new Book();
        Book b3 = new Book("Анна Каренина", "Л.Н. Толстой", 1875);
        Book b4 = new Book();
        Book b5 = new Book("Отцы и дети", "Л.Н. Толстой", 1999);
        Book b6 = new Book();
        Library.library lib1 = new Library.library(); // создание новой библиотек
        lib1.books.Add(b1); // добавление книг в коллекцию библиотеки
        lib1.books.AddRange(new Book[] { b2, b3, b4, b5 });
        List<Book> res = lib1.fnd("Л.Н. Толстой");
        void foreach (Book b in res)
        {
            b.GetInformation();
        }
        Console.ReadKey();


        }
