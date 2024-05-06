package Week5_exceptions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        for (;;){
            System.out.println("Enter First Number");
            try {
                num1 = Integer.parseInt(input.nextLine());
                break;
            }catch (Exception ex){
                System.out.println("Please Enter a valid integer");
            }
        }
        for (;;){
            System.out.println("Enter Second Number");
            try {
                num2 = Integer.parseInt(input.nextLine());
                break;
            }catch (Exception ex){
                System.out.println("Please Enter a valid integer");
            }
        }
        System.out.println("the sum = "+ (num1+num2));
    }
}
