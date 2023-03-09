package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



import streamAPI.database.DataOfPerson;
import streamAPI.model.Person;

public class Testing {
	static List<Integer> tels = List.of(12, 3, 5, 6, 78, 78, 1, 1, 3, 3, 12);
	static List<Integer> numbers = new ArrayList<>(Arrays.asList(113, 23, 43, 45, 36, 67, 18)); 
	static int[] table = {19, 3, 4, 7, 8, 9, 67, 12, 10, 11, 1, 34, 6};
	static List<String> names = Arrays.asList(
			"Ibrahima",
			"Habib",
			"Daouda",
			"Fatou",
			"Ibrahima",
			"Awa",
			"Awa",
			"Daouda",
			"Ibrahima",
			"Habib",
			"penda"
			);
	static int[][] name = {
			{2, 1, 12},
			{23, 34, 56},
			{45, 24}
	};
	public static int sous() {
		 int a = 12;
		 int b = 11;
		 int c = a - b;
		return c;
	}
	public static void main(String[] args) {
	//	System.out.println("Ibrahima votre calcul est egale a "+sous());
//		for (Integer n : numbers) {
//			System.out.println(n);
//		}
		//numbers.forEach(System.out::println);
//		numbers.forEach(number -> {
//			System.out.println(number);
//		});
		DataOfPerson dataOfPerson = new DataOfPerson();
		//dataOfPerson.data().forEach(System.out::println); // show the list of all person
		
		// method to show the list of person have 18 or more than 18
		/*
		List<Person> persons = dataOfPerson.data();
		Stream<Person> p =  persons.stream().filter(person -> person.getAge() >= 18);
		p.forEach(i -> {
			System.out.println(i);
		});
		*/
		// method to show the list of person who have 18 or less 18
		/*
		dataOfPerson.data().stream()
		.filter(p -> p.getAge() <= 18)
		.forEach(System.out::println);
		*/
		// method to show the list of person who have 18 or less 18 limit on the two first persons
		//dataOfPerson.data().stream().filter(p -> p.getAge() <= 18).limit(2).forEach(System.out::println);
		
		// method to show the list of person who have 18 or more then 18 limit on the five first persons
		/*
		List<Person> persons = dataOfPerson.data();
		List<Person> p =  persons.stream().filter(person -> person.getAge() >= 18).limit(5).collect(Collectors.toList());
		p.forEach(i -> {
			System.out.println(i);
		});
		*/
		
		// use IntStream with range
		/*
		IntStream.range(0, 10).forEach(i -> {System.out.println(i);});
		System.out.println("----------------------------------------");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		*/
		
		// use IntStream with iterate to show twenty number which are even number
		/*
		IntPredicate intPredicate = number -> number % 2 == 0;
		IntStream.iterate(0, operand -> operand + 1)
		.filter(intPredicate)
		.limit(20)
		.forEach(System.out::println);
		*/
		//compare by max and min and show the value of the list no repeat
		/*
		Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		System.out.println("----------");
		
		System.out.println(tels.stream().max(Comparator.naturalOrder()).get());
		System.out.println("----------");
		
		List<Integer> number = tels.stream().distinct().collect(Collectors.toList());
		System.out.println(number);
		// show the value of the list no repeat and sorted
		System.out.println("--------------");
		Set<Integer> distinctnumber = tels.stream().distinct().collect(Collectors.toSet());
		System.out.println(distinctnumber);
		*/
		
		//show the list of person by IntStream
		/*
		IntStream.range(0, dataOfPerson.data().size()).forEach(i -> {
			System.out.println(dataOfPerson.data().get(i));
		});
		*/
		
		// how to use the predicate
		/*
		List<Person> persons = new ArrayList<>();
		for (Person p : dataOfPerson.data()) {
			if (p.getAge() > 18) {
				System.out.println(p);
				persons.add(p);
			}
		}
		System.out.println(persons.size());
		
		//--------------------------------------------
		
		List<Person> persons = dataOfPerson.data();
		Predicate<Person> predicatePerson = person -> person.getAge() > 18;
		List<Person> adult =  persons.stream()
		.filter(predicatePerson).collect(Collectors.toList());
		adult.forEach(System.out::println);
		System.out.println(adult.size());
		*/
		
		//convert to double with the map method and calculate the average
		/*
		double orElse = dataOfPerson.data().stream()
			.mapToDouble(Person::getAge).average().orElse(0);
		System.out.println(orElse);
		System.out.println("------------------------------");
		ToDoubleFunction<? super Integer> toDoubleFunction = t -> t;
		tels.stream().mapToDouble(toDoubleFunction).forEach(System.out::println);
		System.out.println("------------------------------");
		double average = tels.stream().mapToDouble(toDoubleFunction).average().orElse(1);
		System.out.println(average);
		*/
		
		//findAny and findFirst same syntax 
		/*
		OptionalInt findAny = Arrays.stream(table).filter(index -> index < 5).findAny();
		System.out.println(findAny.getAsInt());
		*/
		
		// calculate sum
//		long sum = dataOfPerson.data().stream().mapToLong(p -> p.getAge()).sum();
//		System.out.println(sum);
		
		// count the number of person
//		long count = dataOfPerson.data().stream().count();
//		System.out.println(count);
		
//		ToLongFunction<? super Person> age = p -> p.getAge();
//		long asLong = dataOfPerson.data().stream().mapToLongDoubleSummaryStatistics summaryStatistics = numbers.stream()
//		.mapToDouble(number -> number)
//		.summaryStatistics();
//System.out.println(summaryStatistics);
//System.out.println(summaryStatistics.getAverage());
//System.out.println(summaryStatistics.getCount());
//System.out.println(summaryStatistics.getMax());
//System.out.println(summaryStatistics.getMin());
//System.out.(age).max().getAsLong();
//		System.out.println(asLong);
		
//		DoubleSummaryStatistics summaryStatistics = numbers.stream()
//				.mapToDouble(number -> number)
//				.summaryStatistics();
//		System.out.println(summaryStatistics);
//		System.out.println(summaryStatistics.getAverage());
//		System.out.println(summaryStatistics.getCount());
//		System.out.println(summaryStatistics.getMax());
//		System.out.println(summaryStatistics.getMin());
//		System.out.println(summaryStatistics.getSum());
		
		// Grouping the person who have the same name
		/*
		Map<String, List<Person>> collect = dataOfPerson.data().stream()
				.collect(Collectors.groupingBy(p -> p.getLastName()));
		collect.forEach((lastName, group) -> {
			System.out.println(lastName);
			group.forEach(System.out::println);
		});
		*/
		
		//count the number of person who have the same name
//		Map<String, Long> collect = names.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		collect.forEach((name, number) -> System.out.println(name + " -> " + number));
		
		//reduce
		/*
		 int sum = Arrays.stream(table).sum();
		 System.out.println(sum);
		 System.out.println("------------------------------");
		int reduce = Arrays.stream(table).reduce(0, (a, b) -> a + b);
		System.out.println(reduce);
		System.out.println("------------------------------");
		 int reduce2 = Arrays.stream(table).reduce(0, Integer::sum);
		 System.out.println(reduce2);
		 */
		
		//flatMap
//		for (int i = 0; i < name.length; i++) {
//			for (int j = 0; j < name[i].length ; j++) {
//				System.out.println(name[i][j]);
//			}
//		}
//		Arrays.stream(name).flatMap(List::stream).collect(Collectors.toList());
	}
}
