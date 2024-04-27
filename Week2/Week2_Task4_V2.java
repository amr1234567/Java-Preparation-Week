package Week2;

import java.util.Scanner;

public class Week2_Task4_V2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine().toLowerCase();
      if (input.equals("monday"))
         System.out.println(1);
      else if (input.equals("tuesday"))
         System.out.println(2);
      else if (input.equals("wednesday"))
         System.out.println(3);
      else if (input.equals("thursday"))
         System.out.println(4);
      else if (input.equals("friday"))
         System.out.println(5);
      else if (input.equals("saturday"))
         System.out.println(6);
      else if (input.equals("sunday"))
         System.out.println(7);
      else
         System.out.println("Wrong Day");
   }
}
