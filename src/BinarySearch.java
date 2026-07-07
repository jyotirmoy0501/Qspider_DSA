public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4,5};
        int i;
        int temp = 5;
        for (i = 0; i < num.length - 1; i++) {
            int start=0;
            int end=num.length-1;
            while(start<=end){
                int mid=(end+start)/2;
                if(num[mid]==temp) {
                    System.out.println("element found in index "+mid);
                    return;
                }
                    else if(temp>num[mid]){
                    start=mid+1;

                    }
                    else {
                    end=mid-1;
                }
                }
            }
        System.out.println("element not found");
    }
}
