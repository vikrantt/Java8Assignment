import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String first_name,mid_name,last_name,city;
    long salary;
    public Employee(String first_name,String mid_name,String last_name,String city,long salary){
        this.first_name = first_name;
        this.mid_name = mid_name;
        this.last_name = last_name;
        this.city = city;
        this.salary = salary;
    }
}
class Question4{
    void implement(){
        // List<Integer> lst = new ArrayList<Integer>();
        // for(int i=1;i<50;i++){
        //     lst.add(i);
        // }
//        lst.stream()
//                .filter((a) -> a % 2 == 0)
//                .forEach(System.out::println);
//
        Employee[] employees = {
                new Employee("Shivam","","Kumar","Noida",3000),
                new Employee("Vikram","","Vikrant","Delhi",4000),
                new Employee("Manvendra","Pratap","Singh","Delhi",4500),
                new Employee("Utkarsh","","Chaturvedi","Noida Sector 4",5000),
                new Employee("Vikram","","Vikrant","Delhi",3500)
        };

        List<Employee> list = Arrays.asList(employees);
        List<Employee> l = list.stream()
                .filter((e) -> (e.salary<5000 && e.city=="Delhi"))
                .collect(Collectors.toList());

        List<String> ans = new ArrayList<String>();
         for(Employee i:l){
             ans.add(i.first_name);
         }
         ans = ans.stream()
                 .distinct()
                 .collect(Collectors.toList());
         for (String s:ans){
             System.out.println(s);
         }


    }
}

public class Question4_2
{
    public static void main(String[] args) {
        Question4 obj= new Question4();
        obj.implement();
    }
}