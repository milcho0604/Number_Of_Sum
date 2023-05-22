import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("milcho");

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int sum = 0;
        String B = sc.next();
        for (int i = 0; i < A; i++) {
            sum += B.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}