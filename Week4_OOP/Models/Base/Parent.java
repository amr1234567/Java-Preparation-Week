package Week4_OOP.Models.Base;

public class Parent {

   protected int id;
   protected String Title;
   protected String Author;
   protected int PublicationYear;

   public Parent(String title, String author, int publicationYear) {
      this.Author = author;
      this.Title = title;
      this.PublicationYear = publicationYear;
   }

   public void SetId(int id) {
      this.id = id;
   }

   public int GetId() {
      return this.id;
   }

   public void SetAuthor(String Author) {
      this.Author = Author;
   }

   public String GetAuthor() {
      return this.Author;
   }

   public void SetTitle(String Title) {
      this.Title = Title;
   }

   public String GetTitle() {
      return this.Title;
   }

   public void SetPublicationYear(int publicationYear) {
      this.PublicationYear = publicationYear;
   }

   public int GetPublicationYear() {
      return this.PublicationYear;
   }

   public boolean IsIdEqual(int id) {
      return id == this.id;
   }

   public void SetAllAttributes(int Id, String title, String author, int publicationYear) {
      this.Author = author;
      this.Title = title;
      this.PublicationYear = publicationYear;
      this.id = Id;
   }

   public void SetAllAttributes(String title, String author, int publicationYear) {
      this.Author = author;
      this.Title = title;
      this.PublicationYear = publicationYear;
   }
}
