public class circular_prime {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i=2; i<n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

            int n = 113;
            int temp = n;
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            int p = (int) Math.pow(10, count - 1);
            temp = n;
            boolean circular = true;
            for (int i = 0; i <count; i++) {

                if (!isPrime(temp)) {
                    circular = false;
                    break;
                }
                int first = temp / p;
                int rest = temp % p;

                temp = rest * 10 + first;
            }

            if (circular)
                System.out.println("Circular Prime");
            else
                System.out.println("Not Circular Prime");
        }
    }