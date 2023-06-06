import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class JavaProject6Test {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Nataraja G", 8000));
		empList.add(new Employee(2, "Nagesh Y", 15000));
		empList.add(new Employee(3, "Vasu V", 2500));
		empList.add(new Employee(4, "Amar", 12500));

		// In the given example, we are creating a stream of a fixed number of employee
		// whose salary are greater than 10000.
		System.out.println("************Filter********************");
		empList.stream().filter(emp -> emp.getSalary() > 10000).forEach(System.out::println);

		// empList.stream().sorted().map<Employee>(String::toUpperCase).forEach(System.out::println);
		System.out.println("************Sorted********************");
		empList.stream().sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
				.forEach(System.out::println);
		
		
		IntSummaryStatistics stats = empList.stream().mapToInt((emp) -> emp.getSalary()) .summaryStatistics();

		
		System.out.println("************Get emp Max salary********************");
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("************Get emp Min salary********************");
		System.out.println("Lowest prime number in List : " + stats.getMin()); 
		System.out.println("************Get all emp Sum of  salary********************");
		System.out.println("Sum of all prime numbers : " + stats.getSum()); 
		System.out.println("************Get emp avg salary********************");
		System.out.println("Average of all prime numbers : " + stats.getAverage());

		
		
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		// Count the empty strings
		
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.printf("List %s has %d empty strings %n", strList, count);
		
		// Count String with length more than 3 
		long num = strList.stream() .filter(x -> x.length()> 3) .count(); 
		System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

		// Count number of String which startswith "a" 
		count = strList.stream() .filter(x -> x.startsWith("a")) .count(); 
		System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);

		
		
		 

		
	}

	/*
	 * public void whenFilterEmployees_thenGetFilteredStream() { Integer[] empIds =
	 * { 1, 2, 3, 4 };
	 * 
	 * List<Employee> employees = Stream.of(empIds)
	 * .map(employeeRepository::findById) .filter(e -> e != null) .filter(e ->
	 * e.getSalary() > 200000) .collect(Collectors.toList());
	 * 
	 * assertEquals(Arrays.asList(arrayOfEmps[2]), employees); }
	 */

}
