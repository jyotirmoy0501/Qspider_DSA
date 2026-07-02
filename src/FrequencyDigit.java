public class FrequencyDigit {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 7, 8, 5, 0, 1, 2, 0, 1, 3, 5};
        int[] freq = new int[10];

        for (int i = 0; i < num.length; i++) {
            freq[num[i]]++;
        }
            System.out.println("Digit\tFrequency");
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    System.out.println(i + "\t" + freq[i]);
                }
            }
        }
    }

