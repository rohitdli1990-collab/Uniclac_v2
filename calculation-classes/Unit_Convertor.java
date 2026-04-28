import java.util.Scanner;

public class Unit_Convertor{
    public static void length(){
        System.out.println("Welcome to Length calculator");
        System.out.println("1. Meter(m)");
        System.out.println("2. Centimeter(cm)");
        System.out.println("3. Millimeter(mm)");
        System.out.println("4. Kilometer(km)");
        System.out.println("5. Inch(in)");
        System.out.println("6. Decimeter(Dm)");
        System.out.println("7. Micrometer(um)");
        System.out.println("8. Nanometer(nm)");
        System.out.println("9. Foot(ft)");
        System.out.println("10 .Mile(mile)");
        System.out.println("Enter your choose:- ");
        Scanner sc = new Scanner(System.in);
        int userchoose = sc.nextInt();

        switch (userchoose) {
            case 1:
                System.out.println("1. Meter to Centimeter");
                System.out.println("2. Meter to Millemeter");
                System.out.println("3. Meter to kilometer");
                System.out.println("4. Meter to Inch");
                System.out.println("5. Meter to Decimeter");
                System.out.println();
        }
        sc.close();
    }
}