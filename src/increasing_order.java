public class increasing_order {
    public  static void main(String[] args){
        int arr=12345;
        int  d=10;
        while(arr>=10){
            int temp=arr%10;
            if(d>temp){
                d=temp;

                System.out.println("T");

            }
            else{
                System.out.println("F");
                break;
            }
            arr=arr/10;
        }


    }
}
