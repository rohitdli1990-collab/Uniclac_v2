import java.util.Scanner;

public class Unit_Convertor {
    public static void length() {
        System.out.println("Welcome to Length calculator");
        System.out.println("1. Meter(m)");
        System.out.println("2. Centimeter(cm)");
        System.out.println("3. Millimeter(mm)");
        System.out.println("4. Kilometer(km)");
        System.out.println("5. Inch(in)");
        System.out.println("6. Decimeter(Dm)");
        System.out.println("7. Micrometer(um)");
        System.out.println("8. Nanometer(nm)");
        System.out.println("9. Do ammeter(dm)");
        System.out.println("10. Hectometer (hm)");
        System.out.println("11. Megameter");
        System.out.println("12. Thou");
        System.out.println("13. Foot(ft)");
        System.out.println("14. Mile(mile)");
        System.out.println("15. Yard (yard)");
        System.out.println("16. Rod (rod)");
        System.out.println("17. furlong");
        System.out.println("18. Nautical mile");
        System.out.println("19. Astronomical Unit");
        System.out.println("20. Light-year");
        System.out.println("21. Parsec");
        System.out.println("22. Cubit");
        System.out.println("23. Hand");
        System.out.println("24. Fathom");
        System.out.println("Enter your choose:- ");
        Scanner sc = new Scanner(System.in);
        int userchoose = sc.nextInt();

        switch (userchoose) {
            case 1:
                System.out.println("Meter to Centimeter");
                System.out.println("Meter to Millimeter");
                System.out.println("Meter to kilometer");
                System.out.println("Meter to Inch");
                System.out.println("Meter to Decimeter");
                System.out.println("Meter to Micrometer");
                System.out.println("Meter to Nanometer");
                System.out.println("Meter to Do ammeter");
                System.out.println("Meter to Hectometer");
                System.out.println("Meter to Megameter");
                System.out.println("Meter to Thou");
                System.out.println("Meter to Foot");
                System.out.println("Meter to Mile");
                System.out.println("Meter to Yard");
                System.out.println("Meter to Rod");
                System.out.println("Meter to furlong");
                System.out.println("Meter to Nautical mile");
                System.out.println("Meter to Astronomical Unit");
                System.out.println("Meter to Light-year");
                System.out.println("Meter to Parsec");
                System.out.println("Meter to Cubit");
                System.out.println("Meter to Hand");
                System.out.println("Meter to Fathom");
                System.out.println("Enter your Choose:- ");
                int meterChoose = sc.nextInt();
                System.out.println("Enter value in meter:- ");
                float a = sc.nextInt();

                if (meterChoose == 1) {
                    float result = a * 100;
                    System.out.println("the result is:- " + result);
                } else if (meterChoose == 2) {
                    float result = a * 1000;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 3) {
                    double result = (a * 0.001);
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 4) {
                    double result = a * 39.37;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 5) {
                    double result = a * 10;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 6) {
                    double result = a * 1000000;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 7) {
                    double result = a * 0.0000000001;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 8) {
                    double result = a * 0.1;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 9) {
                    double result = a * 0.01;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 10) {
                    double result = a * 0.000001;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 11) {
                    double result = a * 39370.1;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 12) {
                    double result = a * 3.820;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 13) {
                    double result = a * 0.000621371;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 14) {
                    double result = a * 1.09361;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 15) {
                    double result = a * 0.198839;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 16) {
                    double result = a * 0.00497096;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 17) {
                    double result = a * 0.000539957;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 18) {
                    double result = a * 149597870700l;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 19) {
                    double result = a * 9460730472580800l;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 20) {
                    double result = a * (3 * 9460730472580800l);
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 21) {
                    System.out.println("Standard Cubit");
                    System.out.println("Royal Cubit");
                    System.out.println("Enter your Choose:- ");
                    int choose = sc.nextInt();
                    if (choose == 1) {
                        double result = a * 0.457;
                        System.out.println("Your result is:- " + result);
                    } else if (choose == 2) {
                        double result = a * 0.5235;
                        System.out.println("Your result is:- " + result);
                    } else {
                        System.out.println("Invalid input");
                    }
                } else if (meterChoose == 22) {
                    double result = a * 9.84252;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 23) {
                    double result = a * 0.546807;
                    System.out.println("Your result is:- " + result);
                } else {
                    System.out.println("Invalid input! ");
                }

            case 2:
                System.out.println("Centimeter to Meter");
                System.out.println("Centimeter to Millimeter");
                System.out.println("Centimeter to Kilometer");
                System.out.println("centimeter to Inch");
                System.out.println("Centimeter to Decimeter");
                System.out.println("Centimeter to Micrometer");
                System.out.println("centimeter to Nanometer");
                System.out.println("Centimeter to Do ammeter");
                System.out.println("centimeter to Hectometer");
                System.out.println("Centimeter to Megameter");
                System.out.println("Centimeter to thou");
                System.out.println("Centimeter to Foot");
                System.out.println("Centimeter to Mile");
                System.out.println("Centimeter to Yard");
                System.out.println("Centimeter to Rod");
                System.out.println("Centimeter to Furlong");
                System.out.println("Centimeter to Nautical Mile");
                System.out.println("Centimeter to Astronomical unit");
                System.out.println("Centimeter to Light-year");
                System.out.println("Centimeter to Parsec");
                System.out.println("Centimeter to Cubit");
                System.out.println("Centimeter to Hand");
                System.out.println("Centimeter to fathom");
                System.out.println("enter your choose:- ");

                int Centiuser = sc.nextInt();
                System.out.println("Enter your number:- ");
                double b = sc.nextInt();
                if (Centiuser == 1) {
                    double result = b * 0.01;
                    System.out.println("Your result:- " + result);
                } else if (Centiuser == 2) {
                    double result = b * 10;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 3) {
                    double result = b * 0.00001;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 4) {
                    double result = b * 0.393701;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 5) {
                    double result = b * 0.1;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 6) {
                    double result = b * 10000;
                    System.out.println("Your Result is:- " + result);
                } else if (Centiuser == 7) {
                    double result = b * 10000000;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 8) {
                    double result = b * 0.001;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 9) {
                    double result = b * 0.00001;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 10) {
                    double result = b * 0.00000001;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 11) {
                    double result = b * 393.701;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 12) {
                    double result = b * 0.0328084;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 13) {
                    double result = b / 160900;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 14) {
                    double result = b * 0.0109361;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 15) {
                    double result = b * 0.00198839;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 16) {
                    double result = b / 20120;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 17) {
                    double result = b / 185200;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 18) {
                    double result = b * (149597870700l * 0.01);
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 19) {
                    double result = b * (9460730472580l * 0.393701);
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 20) {
                    double result = b * ((9460730472580l * 3.68) * 0.393701);
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 21) {
                    System.out.println("1. Standard Cubit");
                    System.out.println("2. Royal Cubit");

                    int choose = sc.nextInt();

                    if (choose == 1) {
                        double result = b * 44.5;
                        System.out.println("Your result is:- " + result);
                    } else if (choose == 2) {
                        double result = b * 52.5;
                        System.out.println("Your result is:- " + result);
                    }
                } else if (Centiuser == 22) {
                    double result = b * 10.16;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 23) {
                    double result = b * 182.88;
                    System.out.println("Your result is:- " + result);
                } else {
                    System.out.println("Invalid Input");
                }
                sc.close();
                break;

            case 3:
                System.out.println("1. Millimeter to meter");
                System.out.println("2. Millimeter to Centimeter");
                System.out.println("3. Millimeter to Kilometer");
                System.out.println("4. Millimeter to Inch");
                System.out.println("5. Millimeter to Decimeter");
                System.out.println("6. Millimeter to Micrometer");
                System.out.println("7. Millimeter to Nanometer");
                System.out.println("8. Millimeter to Do ammeter");
                System.out.println("9. Millimeter to Hectometer");
                System.out.println("10. Millimeter to Megameter");
                System.out.println("11. Millimeter to Thou");
                System.out.println("12. Millimeter to Foot");
                System.out.println("13. Millimeter to Mile");
                System.out.println("14. Millimeter to yard");
                System.out.println("15. Millimeter to rod");
                System.out.println("16. Millimeter to Furlong");
                System.out.println("17. Millimeter to Nautical Mile");
                System.out.println("18. Millimeter to Astronomical Unit");
                System.out.println("19. Millimeter to Light year");
                System.out.println("20. Millimeter to Parsec");
                System.out.println("21. Millimeter to Cubit");
                System.out.println("22. Millimeter to Hand");
                System.out.println("23. Millimeter to Fathom");
                System.out.println("enter your Choose:- ");
                int milleChoose = sc.nextInt();
                System.out.println("Enter Value of millimeter:- ");
                float c = sc.nextInt();

                if (milleChoose == 1) {
                    double result = c * 0.001;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 2) {
                    double result = c * 0.1;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 3) {
                    double result = c * 0.000001;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 4) {
                    double result = c * 0.0393701;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 5) {
                    double result = c * 0.01;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 6) {
                    double result = c * 1000;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 7) {
                    double result = c * 1000000;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 8) {
                    double result = c * 0.0001;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 9) {
                    double result = c * 0.00001;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 10) {
                    double result = c * 0.000000001;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 11) {
                    double result = c * 39.3701;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 12) {
                    double result = c * 0.00328084;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 13) {
                    double result = c * 0.000000621371;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 14) {
                    double result = c * 0.00109361;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 15) {
                    double result = c * 0.000198839;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 16) {
                    double result = c * 0.00000497096;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 17) {
                    double result = c * 0.000000539957;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 18) {
                    double result = c * 0.000000000000000668459;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 19) {
                    double result = c * 0.0000000000000000001057;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 20) {
                    double result = c * 0.00000000000000000000324078;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 21) {
                    double result = c * 457.2;
                    System.out.println("Your result is:- " + result);
                } else if (milleChoose == 22) {
                    double result = c * 0.00984252;
                    System.out.println("your result is:- " + result);
                } else if (milleChoose == 23) {
                    double result = c * 0.000546807;
                    System.out.println("your result is:- " + result);
                } else {
                    System.out.println("Invalid input!");
                }

            case 4:
                System.out.println("Kilometer to meter");
                System.out.println("Kilometer to Centimeter");
                System.out.println("Kilometer to Millimeter");
                System.out.println("Kilometer to Inch");
                System.out.println("Kilometer to Decimeter");
                System.out.println("Kilometer to micrometer");
                System.out.println("Kilometer to Nanometer");
                System.out.println("kilometer to Do ammeter");
                System.out.println("Kilometer to Hectometer");
                System.out.println("Kilometer to Megameter");
                System.out.println("Kilometer to Thou");
                System.out.println("Kilometer to Foot");
                System.out.println("Kilometer to Mile");
                System.out.println("kilometer to yard");
                System.out.println("kilometer to rod");
                System.out.println("Kilometer to furlong");
                System.out.println("kilometer to Nautical mile");
                System.out.println("Kilometer to Astronomical Unit");
                System.out.println("Kilometer to Light year");
                System.out.println("kilometer to Parsec");
                System.out.println("Kilometer to cubit");
                System.out.println("Kilometer to hand");
                System.out.println("Kilometer to Fathom");
                System.out.println("Enter your Choose:- ");
                int kilouser = sc.nextInt();
                System.out.println("Enter your value of Kilometer");
                double d = sc.nextDouble();

                if (kilouser == 1) {
                    double result = d * 1000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 2) {
                    double result = d * 100000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 3) {
                    double result = d * 1000000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 4) {
                    double result = d * 39370.1;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 5) {
                    double result = d * 10000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 6) {
                    double result = d * 1000000000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 7) {
                    double result = d * 1000000000000L;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 8) {
                    double result = d * 100;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 9) {
                    double result = d * 10;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 10) {
                    double result = d * 0.001;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 11) {
                    double result = d * 39370000;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 12) {
                    double result = d * 3280.84;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 13) {
                    double result = d * 0.621371;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 14) {
                    double result = d * 1093.61;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 15) {
                    double result = d * 198.839;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 16) {
                    double result = d * 4.97096;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 17) {
                    double result = d * 0.539957;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 18) {
                    double result = d * 0.00000000668459;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 19) {
                    double result = d * 0.0000000000001057;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 20) {
                    double result = d * 0.0000000000000324078;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 21) {
                    double result = d * 2187.23;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 22) {
                    double result = d * 9842.52;
                    System.out.println("Your result is:- " + result);
                } else if (kilouser == 23) {
                    double result = d * 546.807;
                    System.out.println("Your result is:- " + result);
                } else {
                    System.out.println("Invaild input");
                    break;
                }

            case 5:
                System.out.println("Inch to meter");
                System.out.println("Inch to centimeter");
                System.out.println("Inch to Millmeter");
                System.out.println("Inch to Kilometer");
                System.out.println("Inch to decimeter");
                System.out.println("Inch to micrometer");
                System.out.println("Inch to Nanometer");
                System.out.println("Inch to Do ammeter");
                System.out.println("Inch to Hectometer");
                System.out.println("Inch to Megameter");
                System.out.println("Inch to Thou");
                System.out.println("Inch to Foot");
                System.out.println("Inch to mile");
                System.out.println("Inch to yard");
                System.out.println("Inch to Rod");
                System.out.println("Inch to Furlong");
                System.out.println("Inch to Nautical mile");
                System.out.println("Inch to Astronomical unit");
                System.out.println("Inch to Light year");
                System.out.println("Inch to Parsec");
                System.out.println("Inch to cubit");
                System.out.println("Inch to Hand");
                System.out.println("Inch to Fathom");
                System.out.println("Enter your choose:- ");
                int Incuser = sc.nextInt();
                System.out.println("Enter value of Inch");
                double e = sc.nextDouble();

                if (Incuser == 1){
                    double result = e * 0.0254;
                    System.out.println("The result is:- " + result);
                } else if (Incuser == 2){
                    double result = e * 2.54;
                    System.out.println("The result is:- " + result);
                } else if (Incuser == 3){
                    double result = e * 25.4;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 4){
                    double result = e * 0.0000254;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 5){
                    double result = e * 0.254;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 6){
                    double result = e * 25400;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 7) {
                    double result = e * 25400000;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 8){
                    double result = e * 0.254;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 9){
                    double result = e * 0.000254;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 10){
                    double result = e * 0.0000000254;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 11){
                    double result = e * 1000;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 12){
                    double result = e * 0.0833333;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 13){
                    double result = e * 0.0000157828;
                    System.out.println("the result is:- " + result);
                } else if (Incuser == 14) {
                    double result = ;
                }
        }
    }
}