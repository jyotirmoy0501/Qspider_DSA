
import java.util.Scanner;
public class Evilnumber {
   public  static boolean isEvil(int n) {
            int count = 0;

            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n = n / 2;
            }

            return count % 2 == 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (isEvil(n)) {
                System.out.println(n + " is an Evil Number.");
            } else {
                System.out.println(n + " is not an Evil Number.");
            }
        }
    }

