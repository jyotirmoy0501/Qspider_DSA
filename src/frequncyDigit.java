public class frequncyDigit {
    public static void main(String[] args){
        long num = 12317850120135L;
    frequency(num);
    }
    public static void frequency(long num){
        int[] arr=new int[10];
        while(num!=0){
            int id=(int)(num%10);
            arr[id]++;
            num/=10;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println("count of "+i+ " is "+arr[i]);
        }
    }
}
