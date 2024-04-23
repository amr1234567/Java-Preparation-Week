package Week4_OOP.Management;

import java.time.Year;

import Week4_OOP.Data.Data;
import Week4_OOP.Management.Interfaces.IManagement;
import Week4_OOP.Models.Book;

public class ManagementBooks implements IManagement<Book> {

   @Override
   public void Add(Book model) {
      if (model.GetAuthor().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Author Can't be null");
      if (model.GetTitle().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Title Can't be null");
      if (model.GetPublicationYear() > Year.now().getValue())
         throw new NullPointerException("PublicationYear Can't in the feature");
      model.SetId(Data.Books.size() + 1);
      Data.Books.add(model);
   }

   @Override
   public void Update(int Id, Book model) {
      boolean book = false;
      for (Book b : Data.Books) {
         if (b.IsIdEqual(Id)) {
            book = true;
            b.SetAllAttributes(model.GetTitle(), model.GetAuthor(), model.GetPublicationYear());
         }
      }
      if (!book)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

   @Override
   public void Delete(int Id) {
      boolean book = false;
      for (Book b : Data.Books) {
         if (b.IsIdEqual(Id)) {
            book = true;
            Data.Books.remove(b);
         }
      }
      if (!book)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

}
