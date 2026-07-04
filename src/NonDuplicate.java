public class NonDuplicate {

        public static int findSingle(int[] arr) {
            int result = 0;

            for (int num : arr) {
                result = result ^ num;
            }

            return result;
        }

        public static void main(String[] args) {

            int[] arr = {4, 1, 2, 1, 2,3,3};

            System.out.println("Non-duplicate element = " + findSingle(arr));
        }
    }

