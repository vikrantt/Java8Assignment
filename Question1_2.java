//Increment the number by 1 and return incremented value Parameter (int) Return int
public class Question1_2 {
    static int count = 1;
 
    public static void main(String[] args) {
        Myinterface1 myinterfacel=(x)->count++;
        System.out.println( "Increment by 1 = "+myinterfacel.display(1));
        System.out.println("Increment by 1 = "+myinterfacel.display(1));
        System.out.println("Increment by 1 = "+myinterfacel.display(1));
        System.out.println( "Increment by 1 = "+myinterfacel.display(1));
        }
}
 
interface Myinterface1 {
    int display(int x);
}