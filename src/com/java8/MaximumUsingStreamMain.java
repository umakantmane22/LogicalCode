// filter all the employee whose age is greater than 20

package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class MaximumUsingStreamMain {

	public static void main(String args[]) {
		List<Employee> employeeList = createEmployeeList();
		System.out.println("List of all employees");
		//System.out.println(Arrays.toString(employeeList.toArray()));
		for(Employee employee:employeeList) {
			//System.out.println(employee);
		}
		// Q 1- filter all the employee whose age is greater than 20
		
	/*	List<String> employeeFilteredList = 
				employeeList.stream()
				.filter(e -> e.getAge() > 20)
				.map(Employee::getName)
				.collect(Collectors.toList());
*/
		List<String> employeeFilteredList=
				employeeList.stream()
				.filter(e-> e.getAge() > 20)
				.map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println("Filter all the employee whose age is greater than 20");
		employeeFilteredList.forEach((name) -> System.out.println(name));
		
		// Q 2- list of employees, count number of employees with age 25?
		
		long count=employeeList.stream()
				.filter(e -> e.getAge()>25)
				.count();
		System.out.println("list of employees, count number of employees with age 25? => "+count);
		
		// Q 3- find the employee with name “Mary”.
		
		Optional<Employee> e1=employeeList.stream()
				.filter(e -> e.getName().equalsIgnoreCase("Mary"))
				.findAny();
		if(e1.isPresent()) {
			System.out.println("employee with name “Mary");
			System.out.println(e1.get());
		}
		
		// Q 4- find maximum age of employee?
		
		OptionalInt max=employeeList.stream()
				.mapToInt(e -> e.getAge())
				.max();
		System.out.println("max age of employee=> "+ max);
		
		// Q 5- sort all the employee on the basis of age? 

		// try and find solution
		
		// Q 6- Join the all employee names with “,” 
		
		List<String> employeeNames=employeeList.stream()
				.map(e -> e.getName())
				//.map(Employee::getName)
				.collect(Collectors.toList());
		String employeeNamesStr= String.join(",", employeeNames);
		System.out.println("Join the all employee names with “,”");
        System.out.println("Employees are: "+employeeNamesStr);
        
        // Q 7- the list of employee, group them by employee name?
        
        Map<String, List<Employee>> map=employeeList.stream()
        		.collect(Collectors.groupingBy(Employee::getName));
        System.out.println("group them by employee name");
        map.forEach(
        		(name,employeeListTemp)
        		->System.out.println("Name: "+name+" ==>"+employeeListTemp));

        // Q 8- remove the duplicate elements from the list.
        
        Set<Employee> uniqueList =employeeList.stream()
        		.distinct()
        		.collect(Collectors.toSet());
        System.out.println("uniqueEmployee..");
        uniqueList.forEach(uniqueEmployee -> System.out.println(uniqueEmployee));
        
      //Q 9- square them and filter the numbers 
        //which are greater 10000 and then find average of them.
        
        OptionalDouble average=employeeList.stream()
        		.mapToDouble(e->e.getAge()*e.getAge())
        		.filter(e->e>100)
        		.average();
        System.out.println("which are greater 10000 and then find average of them..");
        if(average.isPresent())
            System.out.println(average.getAsDouble());

	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Stephan", 18);
		Employee e5 = new Employee("Gary", 26);
		Employee e6 = new Employee("Gary", 27);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}

}
