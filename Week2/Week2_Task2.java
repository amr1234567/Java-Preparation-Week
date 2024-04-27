package Week2;

import java.util.Scanner;

public class Week2_Task2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter First Number: ");
      double FirstNum = Double.parseDouble(scanner.nextLine());

      System.out.print("Enter Second Number: ");
      double SecondNum = Double.parseDouble(scanner.nextLine());

      System.out.println("The Sum = " + (FirstNum + SecondNum));
      System.out.println("The Difference = " + (FirstNum - SecondNum));
      System.out.println("The product = " + (FirstNum * SecondNum));
      System.out.println("The division = " + (FirstNum / SecondNum));
   }
}
