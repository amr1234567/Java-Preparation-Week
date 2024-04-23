package Week3;

public class Week3Class {
   public static int Task1(int[] nums, int searchedNum) {
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == searchedNum)
            if (i < 5)
               continue;
            else {
               index = i;
               break;
            }
      }
      return nums[index];
   }

   public static int Task2Sum(int[] nums) {
      int value = 0;
      for (int i = 0; i < nums.length; i++)
         value += nums[i];
      return value;
   }

   public static double Task2Average(int[] nums) {
      int sum = Task2Sum(nums);
      return (double) sum / nums.length;
   }
}
