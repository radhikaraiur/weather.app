import java.util.Scanner;

class oddEven {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number you want check:");
        n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("the given number" + n + "is even");
        } else {
            System.out.println("the given number" + n + "is odd");
        }
    }
}
