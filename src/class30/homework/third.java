package class30.homework;

import java.util.Map;
import java.util.TreeMap;

public class third {
    /*3)Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format: John Smith=$100000
*/
    public static void main(String[] args) {
        Map<String,Double>employee=new TreeMap<>();
        employee.put("John Smith",120000.00);
        employee.put("Mehmet Cengiz",132000.00);
        employee.put("Jacky Chan",123000.00);

        System.out.println(employee);

    }
}
