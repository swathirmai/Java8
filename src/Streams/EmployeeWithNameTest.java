package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeWithNameTest {

	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		String name = "Mary";

		Optional<Employee> employeeFilteredList = employeeList.stream().filter(val->val.getName().equals(name)).findAny();
		if(employeeFilteredList.isPresent()) {
			System.out.println(employeeFilteredList.get());
		}
	}

	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();

		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",29);
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
