public class Missingnum {
    public static void main(String[] args) {

        int[] arr = {0, 3, 1, 5, 4};

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);
    }
}