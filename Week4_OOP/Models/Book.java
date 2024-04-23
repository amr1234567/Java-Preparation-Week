package Week4_OOP.Models;

import Week4_OOP.Models.Base.Parent;

public class Book extends Parent {
   public Book(String title, String author, int publicationYear) {
      super(title, author, publicationYear);
   }
}
