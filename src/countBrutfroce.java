public class countBrutfroce {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 7, 8, 5, 0, 1, 2, 0, 1, 3, 5};
        frequency(num);
    }

    public static void frequency(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j])
                    count++;

            }
            System.out.println("count of " + num[i] + ":" + count);
        }

    }
}
