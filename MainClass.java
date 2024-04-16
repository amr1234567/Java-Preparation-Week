import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hallo");
        Task2();
    }

    public static void Task1() {
        int Age = 30;
        String CityName = "Cairo";
        double Height = 139.5;
        boolean Raining = true;
    }

    public static void Task2() {
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

    public static void Task3() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Task4V1() {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine().toLowerCase()) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Wrong Day");
                break;
        }
    }

    public static void Task4V2() {
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
