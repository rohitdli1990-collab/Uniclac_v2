import java.util.Scanner;

import javax.swing.ComponentInputMap;

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
        System.out.println("9. Docameter(dm)");
        System.out.println("10. Hectometer (hm)");
        System.out.println("11. Foot(ft)");
        System.out.println("12. Mile(mile)");
        System.out.println("13. Yard (yard)");
        System.out.println("14. Rod (rod)");
        System.out.println("15. furliong");
        System.out.println("16. Nautical mile");
        System.out.println("17. Astronomical Unit");
        System.out.println("18. Light-year");
        System.out.println("19. Parsec");
        System.out.println("20. Cubit");
        System.out.println("21. Hand");
        System.out.println("22. Fathom");
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
                    double result = a * 3.820;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 11) {
                    double result = a * 0.000621371;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 12) {
                    double result = a * 1.09361;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 13) {
                    double result = a * 0.198839;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 14) {
                    double result = a * 0.00497096;
                    System.out.println("your result is:- " + result);
                } else if (meterChoose == 15) {
                    double result = a * 0.000539957;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 16) {
                    double result = a * 6.28;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 17) {
                    double result = a * 12.56;
                    System.out.println("Your result is:- " + result);
                } else if (meterChoose == 18) {
                    int choice;

                    do {
                        System.out.println("\nCircumference Calculator");
                        System.out.println("1. Using Radius");
                        System.out.println("2. Using Diameter");
                        System.out.println("3. Exit");
                        System.out.print("Enter choice: ");

                        while (!sc.hasNextInt()) {
                            System.out.print("Invalid! Enter integer: ");
                            sc.next();
                        }
                        choice = sc.nextInt();

                        if (choice == 1) {
                            double r;

                            System.out.print("Enter radius: ");
                            while (!sc.hasNextDouble()) {
                                System.out.print("Invalid! Enter number: ");
                                sc.next();
                            }
                            r = sc.nextDouble();

                            if (r < 0) {
                                System.out.println("Radius cannot be negative!");
                                continue;
                            }

                            double c = 2 * Math.PI * r;

                            System.out.println("Circumference = " + c);
                        }

                        else if (choice == 2) {
                            double d;

                            System.out.print("Enter diameter: ");
                            while (!sc.hasNextDouble()) {
                                System.out.print("Invalid! Enter number: ");
                                sc.next();
                            }
                            d = sc.nextDouble();

                            if (d < 0) {
                                System.out.println("Diameter cannot be negative!");
                                continue;
                            }

                            double c = Math.PI * d;

                            System.out.println("Circumference = " + c);
                        }

                        else if (choice == 3) {
                            System.out.println("Exiting...");
                        }

                        else {
                            System.out.println("Invalid choice!");
                        }

                    } while (choice != 3);
                } else if (meterChoose == 19) {
                    int choice;

                    do {
                        System.out.println("\nArc Length Calculator");
                        System.out.println("1. Using Radius (Angle in Degrees)");
                        System.out.println("2. Using Radius (Angle in Radians)");
                        System.out.println("3. Using Diameter (Angle in Degrees)");
                        System.out.println("4. Exit");
                        System.out.print("Enter choice: ");

                        while (!sc.hasNextInt()) {
                            System.out.print("Invalid! Enter integer: ");
                            sc.next();
                        }
                        choice = sc.nextInt();

                        // -------- OPTION 1 --------
                        if (choice == 1) {
                            double r, angle;

                            System.out.print("Enter radius: ");
                            r = sc.nextDouble();

                            System.out.print("Enter angle (degrees): ");
                            angle = sc.nextDouble();

                            if (r < 0) {
                                System.out.println("Invalid radius!");
                                continue;
                            }

                            double arc = (Math.PI * r * angle) / 180;
                            System.out.println("Arc Length = " + arc);
                        }

                        // -------- OPTION 2 --------
                        else if (choice == 2) {
                            double r, angle;

                            System.out.print("Enter radius: ");
                            r = sc.nextDouble();

                            System.out.print("Enter angle (radians): ");
                            angle = sc.nextDouble();

                            if (r < 0) {
                                System.out.println("Invalid radius!");
                                continue;
                            }

                            double arc = r * angle;
                            System.out.println("Arc Length = " + arc);
                        }

                        // -------- OPTION 3 --------
                        else if (choice == 3) {
                            double d, angle;

                            System.out.print("Enter diameter: ");
                            d = sc.nextDouble();

                            System.out.print("Enter angle (degrees): ");
                            angle = sc.nextDouble();

                            if (d < 0) {
                                System.out.println("Invalid diameter!");
                                continue;
                            }

                            double arc = (Math.PI * d * angle) / 360;
                            System.out.println("Arc Length = " + arc);
                        }

                        else if (choice == 4) {
                            System.out.println("Exiting...");
                        }

                        else {
                            System.out.println("Invalid choice!");
                        }

                    } while (choice != 4);
                }
            case 2:
                System.out.println("Cennimeter to Meter");
                System.out.println("Centimeter to Millemeter");
                System.out.println("Centimeter to Kilometer");
                System.out.println("centimeter to Inch");
                System.out.println("Centimeter to Decimeter");
                System.out.println("Centimeter to Micrometer");
                System.out.println("centimeter to Nanometer");
                System.out.println("Centimeter to Docameter");
                System.out.println("centimeter to Hectometer");
                System.out.println("Centimeter to Foot");
                System.out.println("Centimeter to Mile");
                System.out.println("Centimeter to Yard");
                System.out.println("Centimeter to Rod");
                System.out.println("Centimeter to Furliong");
                System.out.println("Centimeter to Nautical Mile");
                System.out.println("Centimeter to Radius");
                System.out.println("Centimeter to Diameter");
                System.out.println("Centimeter to Circumference");
                System.out.println("Centimeter to Arc Length");
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
                    double result = b * 0.0328084;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 11) {
                    double result = b / 160900;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 12) {
                    double result = b * 0.0109361;
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 13) {
                    double result = b * 0.00198839;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 14) {
                    double result = b / 20120;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 15) {
                    double result = b / 185200;
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 16) {
                    double result = b * (149597870700l * 0.01);
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 17) {
                    double result = b * (9460730472580l * 0.393701);
                    System.out.println("your result is:- " + result);
                } else if (Centiuser == 18) {
                    double result = b * ((9460730472580l * 3.68) * 0.393701);
                    System.out.println("Your result is:- " + result);
                } else if (Centiuser == 19) {
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
                }
                else if (Centiuser == 20){
                    double result = b*10.16;
                    System.out.println("your result is:- " + result);
                }
                else if (Centiuser == 21){
                    double result = b*182.88;
                    System.out.println("Your result is:- " + result);
                }
                else {
                    System.out.println("Invaild Input");
                }
                sc.close();
                break;

            case 3:
                



        }
    }
}