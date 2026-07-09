
public class flowerProblem {
        public static void main(String[] args) {
            int[] flowerbed = {1, 0, 0, 0, 1};
            int n = 1;
            int count = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0 &&
                        (i == 0 || flowerbed[i - 1] == 0) &&
                        (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
            if (count >= n)
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
