package Week4_OOP.Management;

import java.time.Year;

import Week4_OOP.Data.Data;
import Week4_OOP.Management.Interfaces.IManagement;
import Week4_OOP.Models.Magazine;

public class ManagementMagazines implements IManagement<Magazine> {

   @Override
   public void Add(Magazine model) {
      if (model.GetAuthor().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Author Can't be null");
      if (model.GetTitle().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Title Can't be null");
      if (model.GetPublicationYear() > Year.now().getValue())
         throw new NullPointerException("PublicationYear Can't in the feature");
      model.SetId(Data.Magazines.size() + 1);
      Data.Magazines.add(model);
   }

   @Override
   public void Update(int id, Magazine model) {
      boolean magazine = false;
      for (Magazine m : Data.Magazines) {
         if (m.IsIdEqual(id)) {
            magazine = true;
            m.SetAllAttributes(model.GetTitle(), model.GetAuthor(), model.GetPublicationYear());
         }
      }
      if (!magazine)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

   @Override
   public void Delete(int id) {
      boolean magazine = false;
      for (Magazine m : Data.Magazines) {
         if (m.IsIdEqual(id)) {
            magazine = true;
            Data.Magazines.remove(m);
         }
      }
      if (!magazine)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

}
