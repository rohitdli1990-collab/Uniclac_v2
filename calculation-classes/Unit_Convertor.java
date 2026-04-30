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
        System.out.println("9. Docameter(dm)");
        System.out.println("10. Hectometer (hm)");
        System.out.println("11. Foot(ft)");
        System.out.println("12. Mile(mile)");
        System.out.println("13. Yard (yard)");
        System.out.println("14. Rod (rod)");
        System.out.println("15. furliong");
        System.out.println("16. Nautical mile");
        System.out.println("17. Radius(r)");
        System.out.println("18. Diameter (d)");
        System.out.println("19. Circumference");
        System.out.println("20. Arc Length");
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
                System.out.println("6. Meter to Micrometer");
                System.out.println("7. Meter to Nanometer");
                System.out.println("8. Meter to Docameter");
                System.out.println("9. Meter to Hectometer");
                System.out.println("10. Meter to Foot");
                System.out.println("11. Meter to Mile");
                System.out.println("12. Meter to Yard");
                System.out.println("13. Meter to Rod");
                System.out.println("14. Meter to furliong");
                System.out.println("15. Meter to Nautical mile");
                System.out.println("16. Meter to Radius");
                System.out.println("17. Meter to Diameter");
                System.out.println("18. Meter to Circumference");
                System.out.println("19. Meter to Arc Length");
                System.out.println("Enter your Choose:- ");
                int meterChoose = sc.nextInt();
                System.out.println("Enter value in meter:- ");
                float a = sc.nextInt();

                if (meterChoose == 1) {
                    float result = a*100;
                    System.out.println("the result is:- " + result);
                }
                else if (meterChoose == 2){
                    float result = a*1000;
                    System.out.println("Your result is:- " + result);
                }
                else if (meterChoose == 3){
                    double result = (a*0.001);
                    System.out.println("Your result is:- " + result);
                }
                else if (meterChoose == 4){
                    
                }
        }
        sc.close();
    }
}