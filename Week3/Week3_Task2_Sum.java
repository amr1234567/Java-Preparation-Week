package Week3;

public class Week3_Task2_Sum {
   public static void main(String[] args) {
      System.out.println(Task2Sum(new int[] { 5, 7, 8, 6, 2, 4, 7, 8 }));
   }

   public static int Task2Sum(int[] nums) {
      int value = 0;
      for (int i = 0; i < nums.length; i++)
         value += nums[i];
      return value;
   }
}
