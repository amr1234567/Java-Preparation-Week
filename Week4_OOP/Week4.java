package Week4_OOP;

import Week4_OOP.Management.*;
import Week4_OOP.Models.Book;
import Week4_OOP.Models.Dvd;

public class Week4 {
   public static void main(String[] args) {
      ManagementBooks manageBook = new ManagementBooks();
      manageBook.Add(new Book("Asasf", "safdfsdf", 2014));
      ManagementDvds manageDvd = new ManagementDvds();
      manageDvd.Add(new Dvd("asfdsf", "asdfsdf", 2015));
   }
}
