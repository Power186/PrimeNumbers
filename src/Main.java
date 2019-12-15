import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int on;
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Prime or Composite");
            System.out.println("2. All Prime Numbers");
            System.out.println("3. Exit");
            System.out.println("Enter an option: ");
            on = scan.nextInt();
            switch (on) {
                case 1:
                    // Option 1
                    System.out.println("Enter a number: ");
                    int Num = scan.nextInt();
                    if (Num == 0) {
                        System.out.println("Neither Prime nor Composite");
                    } else if (Num == 1) {
                        System.out.println("Neither Prime nor Composite");
                    } else if (Num == -1) {
                        System.out.println("Prime");
                    } else if (Num >= 2) {
                        System.out.println("Prime");
                    } else if (Num <= -2) {
                        System.out.println("Composite Number");
                    } else {
                        System.out.println("Invalid: error");
                    }
                    break;
                case 2:
                    // Option 2
                    System.out.println("Enter a number: ");
                    int start = scan.nextInt();
                    System.out.println("Enter another number: ");
                    int end = scan.nextInt();
                    System.out.println("Prime numbers: ");
                    while (start < end) {
                        boolean flag = false;

                        for (int i = 2; i <= start / 2; ++i) {
                            if (start % i == 0) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag)
                            System.out.println(start + " ");
                        ++start;
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("ERROR: INVALID");
            }
        }
    }
}
