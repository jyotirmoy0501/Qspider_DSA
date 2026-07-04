import java.util.Arrays;
public class frequencystringCount {

        public static void main(String[] args){
            String num = "jyotirmoy";
            frequency(num);
        }
        public static void frequency(String num) {
            int[] arr = new int[26];
            for (int i = 0; i < num.length(); i++) {
                char id = num.charAt(i);
                arr[id - 97]++;
              //  arr[id - 'a']++;

            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.println((char) (i + 'a') + " -> " + arr[i]);
                }
            }
        }
    }

