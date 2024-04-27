package Week3;

public class Week3_Task2_Avarege {
   public static void main(String[] args) {
      System.out.println(Task2Average(new int[] { 5, 7, 8, 6, 2, 4, 7, 8 }));
   }

   public static double Task2Average(int[] nums) {
      int sum = Week3_Task2_Sum.Task2Sum(nums);
      return (double) sum / nums.length;
   }
}
