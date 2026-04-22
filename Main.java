import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int user;
        Basic_clac calc = new Basic_clac();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Uniclac(Universal Calculator)");
        System.out.println("Enter your Choose");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");


        user = sc.nextInt();
        switch (user) {
            case 1:
                System.out.println("Welcome to Basic calculator");
                System.out.println("Enter your Choose ");
                System.out.println("1. addition");
                System.out.println("2. subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Percentage");
                System.out.println("6. Square and Square root");
                System.out.println("7. Cube and Cube Root");

                user = sc.nextInt();
                if (user == 1) {
                    calc.addition();
                } else if (user == 2) {
                    calc.subtraction();
                } else if (user == 3) {
                    calc.multplication();
                } else if (user == 4) {
                    calc.Division();
                } else if (user == 5) {
                    calc.Percentage();
                } else if (user == 6) {
                    calc.Square();
                } else if (user == 7) {
                    calc.cube();
                } else {
                    System.out.println("Erong Input");
                }
                break;

                case 2:
                System.out.println("Welcome to Scientific calciulator");
                System.out.println("enter your choose:- ");
                System.out.println("1. Trignomatric calculation");
                System.out.println("2. Log calculation");
                System.out.println("3. Power calculation");
                System.out.println("4. Factorial calculation");
                System.out.println("5. Constant calculation");
                System.out.println("6. Degree calculatoin");
                System.out.println("7. Radian calculation");z

                sc.close();
                break;

            default:
                break;
        }

    }
}
