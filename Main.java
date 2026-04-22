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

                int user1 = sc.nextInt();
                if (user1 == 1) {
                    calc.addition();
                } else if (user1 == 2) {
                    calc.subtraction();
                } else if (user1 == 3) {
                    calc.multplication();
                } else if (user1 == 4) {
                    calc.Division();
                } else if (user1 == 5) {
                    calc.Percentage();
                } else if (user1 == 6) {
                    calc.Square();
                } else if (user1 == 7) {
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
                System.out.println("7. Radian calculation");
                System.out.println("8. Gradian calculator");
                System.out.println("9. Inverse_Trignometric");
                System.out.println("10. Permutation_and_Combinations_Calculator");

                int user2 = sc.nextInt();

                switch (user2) {
                    case 1:
                        Scientific_clac.Trignomatric();
                        break;

                    case 2:
                        Scientific_clac.Log();
                        break;
                    
                    case 3:
                        Scientific_clac.Power();
                        break;

                    case 4:
                        Scientific_clac.factorial();
                        break;

                    case 5:
                        Scientific_clac.Constants();
                        break;
                    
                    case 6:
                        Scientific_clac.Degrees();
                        break;

                    case 7:
                        Scientific_clac.Radian();
                        break;
                    
                    case 8:
                        Scientific_clac.Gradian();
                        break;

                    case 9:
                        Scientific_clac.Inverse_Trigonometric();
                        break;

                    case 10 :
                        Scientific_clac.Permutation_and_Combinations_Calculator();
                        break;
                
                    default:
                        break;
                }

                sc.close();
                break;

            default:
                break;
        }

    }
}
