package streams;

import streams.labStreams.Seniority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeUtils {
    public static int sumSalary(List<Employee> employees) {
        return employees.stream().mapToInt(Employee -> Employee.getSalary()).sum();
    }

    public static List<String> sortSalary(List<Employee> employees) {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).map(Employee::getName).collect(Collectors.toList());
    }

    public static Map<String, Employee> toMapNameVsEmp(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::getName, Function.identity(), (e1, e2) -> (e1.getSalary() > e2.getSalary() ? e1 : e2)));
    }


    public static Map<Seniority,Long> groupBySeniority(List<Employee> employees){
        //todo implement this without using if block
        return employees.stream().collect(Collectors.groupingBy(e->Seniority.determineSeniority(e.getSalary()), Collectors.counting()));//employees.stream().collect(Collectors.toMap(Employee::getName, Seniority.determineSeniority((Employee::getSalary))));

    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Anna", 60),
                new Employee("Max", 5), new Employee("Masha", 80));
        Employee anya = new Employee("Anna", 60);
        System.out.println(toMapNameVsEmp(employees));
        System.out.println(groupBySeniority(employees));
    }
}
