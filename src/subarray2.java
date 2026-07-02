public class subarray2 {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 8, 4, 9};
        int k = 3;

        int overallMaxOdd = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {

            int maxOdd = Integer.MIN_VALUE;

            for (int j = i; j < i + k; j++) {

                if (arr[j] % 2 != 0 && arr[j] > maxOdd) {
                    maxOdd = arr[j];
                }
            }


            if (maxOdd > overallMaxOdd) {
                overallMaxOdd = maxOdd;
            }
        }

        if (overallMaxOdd == Integer.MIN_VALUE) {
            System.out.println("No odd number");
        } else {
            System.out.println("hi");
            System.out.println("Maximum Odd = " + overallMaxOdd);
        }
    }
}