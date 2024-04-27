package Week3;

public class Week3_Task1 {
   public static void main(String[] args) {
      System.out.println(Task1(new int[] { 5, 7, 8, 9, 5, 2, 7 }, 2));
   }

   public static int Task1(int[] nums, int searchedNum) {
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == searchedNum) {
            if (i < 5)
               continue;
            index = i;
            break;
         }
      }
      return nums[index];
   }
}
