// Q5)Implement multiple inheritance with default method inside interface.
interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}
public class Question5 implements Clickable, Accessible {
    public static void main(String[] args) {
        Question5 button = new Question5();
        button.click();
        button.access();
    }

}