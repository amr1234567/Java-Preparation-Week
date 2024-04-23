package Week4_OOP.Management.Interfaces;

public interface IManagement<T> {
   void Add(T model);

   void Update(int id, T model);

   void Delete(int id);
}
