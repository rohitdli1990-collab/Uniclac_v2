import java.util.Scanner;

public class Scientific_clac {
    public static void Trignomatric() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nTrigonometric Calculator");
            System.out.println("1. sin(x)");
            System.out.println("2. cos(x)");
            System.out.println("3. tan(x)");
            System.out.println("4. cosec(x)");
            System.out.println("5. sec(x)");
            System.out.println("6. cot(x)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {
                double angle;

                System.out.print("Enter angle in degrees: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                angle = sc.nextDouble();

                // Convert to radians
                double rad = Math.toRadians(angle);

                double result = 0;

                switch (choice) {
                    case 1:
                        result = Math.sin(rad);
                        System.out.println("sin(" + angle + ") = " + result);
                        break;

                    case 2:
                        result = Math.cos(rad);
                        System.out.println("cos(" + angle + ") = " + result);
                        break;

                    case 3:
                        // tan undefined at 90 + k*180
                        if (Math.cos(rad) == 0) {
                            System.out.println("tan undefined!");
                        } else {
                            result = Math.tan(rad);
                            System.out.println("tan(" + angle + ") = " + result);
                        }
                        break;

                    case 4:
                        if (Math.sin(rad) == 0) {
                            System.out.println("cosec undefined!");
                        } else {
                            result = 1 / Math.sin(rad);
                            System.out.println("cosec(" + angle + ") = " + result);
                        }
                        break;

                    case 5:
                        if (Math.cos(rad) == 0) {
                            System.out.println("sec undefined!");
                        } else {
                            result = 1 / Math.cos(rad);
                            System.out.println("sec(" + angle + ") = " + result);
                        }
                        break;

                    case 6:
                        if (Math.sin(rad) == 0) {
                            System.out.println("cot undefined!");
                        } else {
                            result = 1 / Math.tan(rad);
                            System.out.println("cot(" + angle + ") = " + result);
                        }
                        break;
                }
            }

            else if (choice == 7) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }

    public static void Log() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nLogarithm Calculator");
            System.out.println("1. log10(x)");
            System.out.println("2. ln(x)");
            System.out.println("3. log base b (log_b x)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                double x;

                System.out.print("Enter value (x): ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                x = sc.nextDouble();

                if (x <= 0) {
                    System.out.println("Log undefined for x <= 0!");
                    continue;
                }

                // -------- OPTION 1 --------
                if (choice == 1) {
                    double result = Math.log10(x);
                    System.out.println("log10(" + x + ") = " + result);
                }

                // -------- OPTION 2 --------
                else if (choice == 2) {
                    double result = Math.log(x); // natural log
                    System.out.println("ln(" + x + ") = " + result);
                }

                // -------- OPTION 3 --------
                else if (choice == 3) {
                    double base;

                    System.out.print("Enter base (b): ");
                    while (!sc.hasNextDouble()) {
                        System.out.print("Invalid! Enter number: ");
                        sc.next();
                    }
                    base = sc.nextDouble();

                    if (base <= 0 || base == 1) {
                        System.out.println("Invalid base! (b > 0 and b ≠ 1)");
                        continue;
                    }

                    double result = Math.log(x) / Math.log(base);

                    System.out.println("log base " + base + " (" + x + ") = " + result);
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void Power() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nPower Calculator");
            System.out.println("1. Calculate x^y");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice == 1) {
                double x, y;

                System.out.print("Enter base (x): ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                x = sc.nextDouble();

                System.out.print("Enter exponent (y): ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                y = sc.nextDouble();

                double result = Math.pow(x, y);

                System.out.println("Result = " + result);
            }

            else if (choice == 2) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 2);

        sc.close();
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nFactorial Calculator");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice == 1) {
                int n;

                System.out.print("Enter a number: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer: ");
                    sc.next();
                }
                n = sc.nextInt();

                if (n < 0) {
                    System.out.println("Factorial not defined for negative numbers!");
                    continue;
                }

                long fact = 1;

                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }

                System.out.println("Factorial of " + n + " = " + fact);
            }

            else if (choice == 2) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 2);

        sc.close();
    }

    public static void Constants() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nConstants Calculator");
            System.out.println("1. Mathematical Constants");
            System.out.println("2. Physical Constants");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- MATHEMATICAL --------
            if (choice == 1) {
                System.out.println("\n--- Mathematical Constants ---");
                System.out.println("Pi (π) = " + Math.PI);
                System.out.println("Euler's Number (e) = " + Math.E);
                System.out.println("Golden Ratio (φ) ≈ 1.618");
                System.out.println("√2 ≈ " + Math.sqrt(2));
            }

            // -------- PHYSICAL --------
            else if (choice == 2) {
                System.out.println("\n--- Physical Constants ---");
                System.out.println("Speed of Light (c) = 3 x 10^8 m/s");
                System.out.println("Gravitational Acceleration (g) = 9.8 m/s^2");
                System.out.println("Planck Constant (h) ≈ 6.626 x 10^-34 Js");
                System.out.println("Avogadro Number = 6.022 x 10^23");
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    public static void Degrees() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nDegree Converter");
            System.out.println("1. Degree to Radian");
            System.out.println("2. Radian to Degree");
            System.out.println("3. Decimal Degree to DMS");
            System.out.println("4. DMS to Decimal Degree");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- 1. Degree to Radian --------
            if (choice == 1) {
                double degree;

                System.out.print("Enter degree: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                degree = sc.nextDouble();

                double radian = Math.toRadians(degree);

                System.out.println("Radian = " + radian);
            }

            // -------- 2. Radian to Degree --------
            else if (choice == 2) {
                double radian;

                System.out.print("Enter radian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                radian = sc.nextDouble();

                double degree = Math.toDegrees(radian);

                System.out.println("Degree = " + degree);
            }

            // -------- 3. Decimal Degree to DMS --------
            else if (choice == 3) {
                double degree;

                System.out.print("Enter decimal degree: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                degree = sc.nextDouble();

                int d = (int) degree;
                double minPart = (degree - d) * 60;
                int m = (int) minPart;
                double s = (minPart - m) * 60;

                System.out.println("DMS = " + d + "° " + m + "' " + s + "\"");
            }

            // -------- 4. DMS to Decimal Degree --------
            else if (choice == 4) {
                int d, m;
                double s;

                System.out.print("Enter Degrees: ");
                d = sc.nextInt();

                System.out.print("Enter Minutes: ");
                m = sc.nextInt();

                System.out.print("Enter Seconds: ");
                s = sc.nextDouble();

                double degree = d + (m / 60.0) + (s / 3600.0);

                System.out.println("Decimal Degree = " + degree);
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void Radian() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nRadian Converter");
            System.out.println("1. Radian to Degree");
            System.out.println("2. Degree to Radian");
            System.out.println("3. Radian to Gradian");
            System.out.println("4. Gradian to Radian");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- 1. Radian to Degree --------
            if (choice == 1) {
                double rad;

                System.out.print("Enter radian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                rad = sc.nextDouble();

                double degree = Math.toDegrees(rad);

                System.out.println("Degree = " + degree);
            }

            // -------- 2. Degree to Radian --------
            else if (choice == 2) {
                double degree;

                System.out.print("Enter degree: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                degree = sc.nextDouble();

                double rad = Math.toRadians(degree);

                System.out.println("Radian = " + rad);
            }

            // -------- 3. Radian to Gradian --------
            else if (choice == 3) {
                double rad;

                System.out.print("Enter radian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                rad = sc.nextDouble();

                double grad = rad * 200 / Math.PI;

                System.out.println("Gradian = " + grad);
            }

            // -------- 4. Gradian to Radian --------
            else if (choice == 4) {
                double grad;

                System.out.print("Enter gradian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                grad = sc.nextDouble();

                double rad = grad * Math.PI / 200;

                System.out.println("Radian = " + rad);
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
    public static void Gradian(){
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nGradian Converter");
            System.out.println("1. Gradian to Degree");
            System.out.println("2. Degree to Gradian");
            System.out.println("3. Gradian to Radian");
            System.out.println("4. Radian to Gradian");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- 1. Gradian to Degree --------
            if (choice == 1) {
                double grad;

                System.out.print("Enter gradian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                grad = sc.nextDouble();

                double degree = grad * 0.9;

                System.out.println("Degree = " + degree);
            }

            // -------- 2. Degree to Gradian --------
            else if (choice == 2) {
                double degree;

                System.out.print("Enter degree: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                degree = sc.nextDouble();

                double grad = degree / 0.9;

                System.out.println("Gradian = " + grad);
            }

            // -------- 3. Gradian to Radian --------
            else if (choice == 3) {
                double grad;

                System.out.print("Enter gradian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                grad = sc.nextDouble();

                double rad = grad * Math.PI / 200;

                System.out.println("Radian = " + rad);
            }

            // -------- 4. Radian to Gradian --------
            else if (choice == 4) {
                double rad;

                System.out.print("Enter radian: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                rad = sc.nextDouble();

                double grad = rad * 200 / Math.PI;

                System.out.println("Gradian = " + grad);
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void Inverse_Trigonometric(){
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nInverse Trigonometric Calculator");
            System.out.println("1. sin⁻¹(x)  [arcsin]");
            System.out.println("2. cos⁻¹(x)  [arccos]");
            System.out.println("3. tan⁻¹(x)  [arctan]");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                double x;

                System.out.print("Enter value x: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                x = sc.nextDouble();

                double rad = 0;

                // -------- arcsin --------
                if (choice == 1) {
                    if (x < -1 || x > 1) {
                        System.out.println("sin⁻¹(x) undefined for x outside [-1,1]");
                        continue;
                    }

                    rad = Math.asin(x);
                    System.out.println("sin⁻¹(" + x + ") = " + rad + " rad");
                    System.out.println("sin⁻¹(" + x + ") = " + Math.toDegrees(rad) + "°");
                }

                // -------- arccos --------
                else if (choice == 2) {
                    if (x < -1 || x > 1) {
                        System.out.println("cos⁻¹(x) undefined for x outside [-1,1]");
                        continue;
                    }

                    rad = Math.acos(x);
                    System.out.println("cos⁻¹(" + x + ") = " + rad + " rad");
                    System.out.println("cos⁻¹(" + x + ") = " + Math.toDegrees(rad) + "°");
                }

                // -------- arctan --------
                else if (choice == 3) {
                    rad = Math.atan(x);
                    System.out.println("tan⁻¹(" + x + ") = " + rad + " rad");
                    System.out.println("tan⁻¹(" + x + ") = " + Math.toDegrees(rad) + "°");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close(); 
    }
    public static void Permutation_and_Combinations_Calculator(){
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nPermutation & Combination Calculator");
            System.out.println("1. Permutation (nPr)");
            System.out.println("2. Combination (nCr)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                int n, r;

                System.out.print("Enter n: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer: ");
                    sc.next();
                }
                n = sc.nextInt();

                System.out.print("Enter r: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer: ");
                    sc.next();
                }
                r = sc.nextInt();

                if (n < 0 || r < 0 || r > n) {
                    System.out.println("Invalid values! Use n >= r >= 0");
                    continue;
                }

                long factN = 1, factR = 1, factNR = 1;

                for (int i = 1; i <= n; i++)
                    factN *= i;

                for (int i = 1; i <= r; i++)
                    factR *= i;

                for (int i = 1; i <= (n - r); i++)
                    factNR *= i;

                // -------- Permutation --------
                if (choice == 1) {
                    long nPr = factN / factNR;

                    System.out.println("Permutation (" + n + "P" + r + ") = " + nPr);
                }

                // -------- Combination --------
                else if (choice == 2) {
                    long nCr = factN / (factR * factNR);

                    System.out.println("Combination (" + n + "C" + r + ") = " + nCr);
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}