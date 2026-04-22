import java.util.Scanner;

public class Basic_clac {
    public void addition() {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input count with validation
        System.out.print("Enter count: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter integer: ");
            sc.next();
        }
        n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        // Taking inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }

            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Allow editing before final output
        while (true) {
            System.out.print("Do you want to edit a number? (y/n): ");
            String choice = sc.next().trim().toLowerCase();

            if (choice.equals("n") || choice.equals("no")) {
                break;
            }

            if (choice.equals("y") || choice.equals("yes")) {
                System.out.print("Enter index to edit (1-" + n + "): ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer index: ");
                    sc.next();
                }

                int index = sc.nextInt() - 1;
                if (index < 0 || index >= n) {
                    System.out.println("Index out of range.");
                    continue;
                }

                System.out.print("Enter new value for number " + (index + 1) + ": ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer: ");
                    sc.next();
                }

                sum -= arr[index];
                arr[index] = sc.nextInt();
                sum += arr[index];
            } else {
                System.out.println("Please answer 'y' or 'n'.");
            }
        }

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.print("Numbers entered: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }

    public void subtraction() {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input count with validation
        System.out.print("Enter count: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter integer: ");
            sc.next();
        }
        n = sc.nextInt();

        int arr[] = new int[n];

        // Taking inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }

            arr[i] = sc.nextInt();
        }

        // Subtraction logic
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            result -= arr[i];
        }

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.print("Numbers entered: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nResult (Subtraction) = " + result);

        sc.close();
    }

    public void multplication() {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input count with validation
        System.out.print("Enter count: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter integer: ");
            sc.next();
        }
        n = sc.nextInt();

        int arr[] = new int[n];

        // Taking inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }

            arr[i] = sc.nextInt();
        }

        // Multiplication logic
        long result = 1;

        for (int i = 0; i < n; i++) {
            result *= arr[i];
        }

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.print("Numbers entered: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nResult (Multiplication) = " + result);

        sc.close();
    }

    public void Division() {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input count with validation
        System.out.print("Enter count: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter integer: ");
            sc.next();
        }
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Count must be greater than 0!");
            return;
        }

        double arr[] = new double[n];

        // Taking inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            while (!sc.hasNextDouble()) {
                System.out.print("Invalid! Enter number: ");
                sc.next();
            }

            arr[i] = sc.nextDouble();
        }

        // Division logic
        double result = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }
            result /= arr[i];
        }

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.print("Numbers entered: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nResult (Division) = " + result);

        sc.close();
    }

    public void Percentage() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nPercentage Calculator");
            System.out.println("1. Percentage of a Number");
            System.out.println("2. Total Percentage (Marks)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- OPTION 1 --------
            if (choice == 1) {
                double number, percent;

                System.out.print("Enter number: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                number = sc.nextDouble();

                System.out.print("Enter percentage (%): ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                percent = sc.nextDouble();

                double result = (number * percent) / 100.0;

                System.out.println("Result = " + result);
            }

            // -------- OPTION 2 --------
            else if (choice == 2) {
                int n;

                System.out.print("Enter number of subjects: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Invalid! Enter integer: ");
                    sc.next();
                }
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Invalid count!");
                    continue;
                }

                double marks[] = new double[n];
                double total = 0;

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter marks of subject " + (i + 1) + ": ");

                    while (!sc.hasNextDouble()) {
                        System.out.print("Invalid! Enter number: ");
                        sc.next();
                    }

                    marks[i] = sc.nextDouble();
                    total += marks[i];
                }

                double percentage = total / n;

                System.out.println("\n--- Output ---");
                System.out.print("Marks: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(marks[i] + " ");
                }

                System.out.println("\nTotal = " + total);
                System.out.println("Percentage = " + percentage + "%");
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

    public void Square() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nSquare & Square Root Calculator");
            System.out.println("1. Square of a Number");
            System.out.println("2. Square Root of a Number");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- OPTION 1 --------
            if (choice == 1) {
                double num;

                System.out.print("Enter number: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                num = sc.nextDouble();

                double square = num * num;

                System.out.println("Square = " + square);
            }

            // -------- OPTION 2 --------
            else if (choice == 2) {
                double num;

                System.out.print("Enter number: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                num = sc.nextDouble();

                if (num < 0) {
                    System.out.println("Square root of negative number is not real!");
                    continue;
                }

                double root = Math.sqrt(num);

                System.out.println("Square Root = " + root);
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

    public void cube() {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nCube & Cube Root Calculator");
            System.out.println("1. Cube of a Number");
            System.out.println("2. Cube Root of a Number");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid! Enter integer: ");
                sc.next();
            }
            choice = sc.nextInt();

            // -------- OPTION 1 --------
            if (choice == 1) {
                double num;

                System.out.print("Enter number: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                num = sc.nextDouble();

                double cube = num * num * num;

                System.out.println("Cube = " + cube);
            }

            // -------- OPTION 2 --------
            else if (choice == 2) {
                double num;

                System.out.print("Enter number: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid! Enter number: ");
                    sc.next();
                }
                num = sc.nextDouble();

                double root = Math.cbrt(num); // handles negative too

                System.out.println("Cube Root = " + root);
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