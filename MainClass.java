import Week4_OOP.Management.*;
import Week4_OOP.Models.Book;
import Week4_OOP.Models.Dvd;
import Week4_OOP.Models.Magazine;
import Week1.Week1Class;
import Week2.Week2Class;

public class MainClass {
    public static void main(String[] args) {
        Week1Class.Task();
        Week2Class.Task1();
        Week2Class.Task2();
        Week2Class.Task3();
        Week2Class.Task4V1();
        Week2Class.Task4V2();
        ManagementDvds dvds = new ManagementDvds();
        ManagementBooks Books = new ManagementBooks();
        ManagementMagazines Magazines = new ManagementMagazines();
        dvds.Add(new Dvd("Valorant", "Riot", 2017));
        Books.Add(new Book("Valorant", "Riot", 2017));
        Magazines.Add(new Magazine("Valorant", "Riot", 2017));
        dvds.Delete(1);
    }

}
