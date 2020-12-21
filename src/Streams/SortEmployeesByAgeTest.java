package Streams;

import java.util.ArrayList;
import java.util.List;

public class SortEmployeesByAgeTest {

	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		employeeList.sort((e1,e2)->e1.getAge()-e2.getAge());
		employeeList.forEach(System.out::println);
	}


	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();

		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}
}
