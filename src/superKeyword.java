
class father{
String name="smith";
}
class son extends father{
    String name="allen";
    public void printChildDetails(){
        System.out.println(name);//allen
    }
    public void printParentDetails(){
        System.out.println(super.name);//smith
    }
}
public class superKeyword
{
    public static void main(String[] args){
        son s=new son();
        s.printChildDetails();
        s.printParentDetails();
    }
}
