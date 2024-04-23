package Week4_OOP.Management;

import java.time.Year;

import Week4_OOP.Data.Data;
import Week4_OOP.Management.Interfaces.IManagement;
import Week4_OOP.Models.Dvd;

public class ManagementDvds implements IManagement<Dvd> {

   @Override
   public void Add(Dvd model) {
      if (model.GetAuthor().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Author Can't be null");
      if (model.GetTitle().equals(null) || model.GetAuthor().equals(""))
         throw new NullPointerException("Title Can't be null");
      if (model.GetPublicationYear() > Year.now().getValue())
         throw new NullPointerException("PublicationYear Can't in the feature");
      model.SetId(Data.Dvds.size() + 1);
      Data.Dvds.add(model);
   }

   @Override
   public void Update(int Id, Dvd model) {
      boolean dvd = false;
      for (Dvd d : Data.Dvds) {
         if (d.IsIdEqual(Id)) {
            dvd = true;
            d.SetAllAttributes(model.GetTitle(), model.GetAuthor(), model.GetPublicationYear());
         }
      }
      if (!dvd)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

   @Override
   public void Delete(int Id) {
      boolean dvd = false;
      for (Dvd d : Data.Dvds) {
         if (d.IsIdEqual(Id)) {
            dvd = true;
            Data.Dvds.remove(d);
         }
      }
      if (!dvd)
         throw new NullPointerException("Dvd with this id Can't be found");
   }

}
