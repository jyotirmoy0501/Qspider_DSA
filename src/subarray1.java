public class subarray1 {
        public static void main(String[] args) {

            int[] arr = {3, 5, 2, 1, 8, 4, 9};
            int k = 3;

            for (int i = 0; i <= arr.length - k; i++) {
                int sum = 0;

                for (int j = i; j < i + k; j++) {
                    sum += arr[j];
                }

                System.out.println("Sum = " + sum);
            }
        }
    }

