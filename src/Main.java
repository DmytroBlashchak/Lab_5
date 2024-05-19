import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your mode here. If you don't know about modes, type 6 to get help: ");
            int mode = scanner.nextInt();
            try {
                mainObject.cases(mode);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid mode number.");
            }

        }
    }

    private void cases(int mode) {
        switch (mode) {
            case 1:
                Rectangular();
                return;
            case 2:
                SecondEx();
                return;
            case 3:
                PrintOutArray();
                return;
            case 4:
                MaxAray();
                return;
            case 5:
                System.out.println("Good bye! See you soon!");
                System.exit(0);
            case 6:
                System.out.println("1 - get the area of a rectangle");
                System.out.println("2 - finds a maximum from three numbers");
                System.out.println("3 - Prints your numbers");
                System.out.println("4 - Prints your max number");
                System.out.println("5 - End program");
                System.out.println("6 - commands\n");
                return;
        }
    }

    private void Rectangular() {
        System.out.println("You chose the area of a rectangular calculator");
        AreaSolver receive = new AreaSolver();
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle: ");
        int length = Integer.parseInt(sides.nextLine());
        System.out.println("Enter the width of your rectangle: ");
        int width = Integer.parseInt(sides.nextLine());
        receive.rectangle(length, width);
    }

    private void SecondEx() {
        FindSmallestOne taker = new FindSmallestOne();
        Scanner holder = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int firstNum = Integer.parseInt(holder.nextLine());
        System.out.println("Please enter your second number:");
        int secondNum = Integer.parseInt(holder.nextLine());
        System.out.println("Please enter your third number:");
        int thirdNum = Integer.parseInt(holder.nextLine());
        taker.finder(firstNum, secondNum, thirdNum);
    }
    public void PrintOutArray() {
        Scanner takeAray = new Scanner(System.in);
        System.out.println("How much numbers do you need to print?:");
        int size = takeAray.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = takeAray.nextInt();
        }
        System.out.println("Your numbers is: ");
        for (int i = 0; i < size; i++) {
            System.out.println("" +numbers[i]);
        }
    }

    public void MaxAray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you use?: ");
        int len = scanner.nextInt(); // Отримати кількість чисел у масиві
        double[] arr = new double[len]; // Задекларувати масив з введеною довжиною

        System.out.println("Enter you numbers:");
        for (int i = 0; i < len; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }

        double max = arr[0];

        for (int i = 1; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max+"\n");
    }
}