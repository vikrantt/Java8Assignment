// Q4) WAP using java 8:
// Collect all  even numbers from a list using stream
import java.util.*;
import java.util.stream.Collectors;
public class Question4 {
    public static void main(String[] args)
    {
        List<Integer> list= new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(list.stream().filter(it-> (it%2==0))
                .collect(Collectors.toList()));
    }

}