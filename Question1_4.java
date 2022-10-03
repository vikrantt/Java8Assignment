//Convert a string to uppercase and return . Parameter (String) Return (String)
public class Question1_4 {
    public static void main(String[]args)
    {
    Myinterface3 myinterface3=(a)->a.toUpperCase();
    System.out.println(myinterface3.concat("Vikram Vikrant"));
    }
    }
    interface Myinterface3{
    String concat (String a);
 
}