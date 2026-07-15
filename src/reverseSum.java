//everse Number & Sum of Prime Numbers Between the Number and Its Reverse
import java.util.Scanner;
public class reverseSum {

    public static int sumOfPrime(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        int start = Math.min(n, rev);
        int end = Math.max(n, rev);

        int sum = 0;
        for (int i = start; i <= end; i++) {

            if (i < 2)
                continue;

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumOfPrime(n));

        sc.close();
    }
}