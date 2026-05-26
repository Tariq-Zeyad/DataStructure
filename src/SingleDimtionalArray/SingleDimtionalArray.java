package SingleDimtionalArray;


import java.util.Scanner;

public class SingleDimtionalArray {
    public static int addNumber(int[] numbers, int size, Scanner input) {
        if (size < numbers.length) {
            System.out.print("Enter number to add: ");
            int num = input.nextInt();
            numbers[size] = num;
            size++;
            System.out.println("Number Added Successfully...");
        } else {
            System.out.println("Array is Full...");
        }
        return size;
    }
    public static void displayNumbers(int[] numbers, int size) {
        System.out.println("Numbers in Array:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
    public static void updateNumber(int[] numbers, int size, Scanner input) {
        System.out.print("Enter Index of Element to Update: ");
        int index = input.nextInt();

        if (index >= 0 && index < size) {
            System.out.print("Enter new Value: ");
            int newValue = input.nextInt();
            numbers[index] = newValue;
            System.out.println("Updated Successfully...");
        } else {
            System.out.println("Invalid Index!");
        }
    }

    public static int deleteNumber(int[] numbers, int size, Scanner input) {
        System.out.print("Enter Index of Element to Delete: ");
        int del = input.nextInt();

        if (del >= 0 && del < size) {
            for (int i = del; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            size--;
            System.out.println("Deleted Successfully...");
        } else {
            System.out.println("Invalid Index!");
        }

        return size;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        int size = 0;
        boolean run = true;
        while (run) {
            System.out.println("\n-------------- Array Operations --------------");
            System.out.println("1 - Add");
            System.out.println("2 - Display");
            System.out.println("3 - Update");
            System.out.println("4 - Delete");
            System.out.println("5 - Exit");
            System.out.println("----------------------------------------------");
            System.out.print("Enter Selected Value: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    char addAgain;
                    do {
                        size = addNumber(numbers, size, input);
                        if (size >= numbers.length) ;
                        System.out.print("Do you want to perform Add again? (y/n): ");
                        addAgain = input.next().charAt(0);
                    } while (addAgain == 'y' || addAgain == 'Y');
                    break;
                case 2:
                    displayNumbers(numbers, size);
                    break;
                case 3:
                    char updateAgain;
                    do {
                        updateNumber(numbers, size, input);
                        System.out.print("Do you want to perform Update again? (y/n): ");
                        updateAgain = input.next().charAt(0);
                    } while (updateAgain == 'y' || updateAgain == 'Y');
                    break;
                case 4:
                    char deleteAgain;
                    do {
                        size = deleteNumber(numbers, size, input);
                        System.out.print("Do you want to perform Delete again? (y/n): ");
                        deleteAgain = input.next().charAt(0);
                    } while (deleteAgain == 'y' || deleteAgain == 'Y');
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        }

    }
}
