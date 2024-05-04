/**
 * switchDemo
 */
public class switchDemo {

    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num = num - 1;
        }
        System.out.println(fact);
    }
}