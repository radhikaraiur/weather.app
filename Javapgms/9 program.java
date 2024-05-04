import java.util.Scanner;

class CheckPrime {
    public static void main(String args[]) {
        int j, x, flag = 1;
        System.out.print("Enter any number :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for (j = 2; j < x; j++) {
            if (x % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The " + x + " is a prime number.");
        } else {
            System.out.println("The " + x + " is not a prime number.");
        }
    }
}