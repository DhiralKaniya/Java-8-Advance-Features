package com.session.stream;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import com.session.utility.Person;
public class strem_filter {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Person> persons = Arrays.asList( 
				new Person(1, "test1",10),
				new Person(2, "test2",20),
				new Person(3, "test1",30)
				);
		/**
		 * Basic example with stream
		 * 1 :- Filter
		 * 2 :- max, min
		 * 3 :- IntStream and overview about DoubleStream and LongStream
		 * 4 :- ForEach
		 * 5 :- Map to the list, set and map
		 * 6 :- paraellelStream example 
		 */
		
		
		/* printCurrentTime();
		List<String> mydata = Utility.getStringList();
		List<String> filterData = mydata.stream().sorted().collect(Collectors.toList());
		
	
		System.out.println(filterData);
		
		System.out.println(mydata.stream().anyMatch(e->e.equals("test")));
		
		List<Integer> intString = Utility.getIntegerList();
		intString.forEach((n) ->{
			persons.forEach((p)->{
				System.out.println(n + " " + p.toString() );
			});
		});*/
		
		
		//IntStream.range(0, 100).forEach((p)->System.out.println(p));
		
		/*
		//IntStream.range(1, 1000).forEach(n -> System.out.print(n));
		Map<Integer, Person> myHashMap = persons.stream().collect(Collectors.toMap(p->p.id, p->p));
		*/
		
		printCurrentTime();
		simpleProgram();
		printCurrentTime();
		
		paralleProgram();
		printCurrentTime();
		
	}
	public static void printCurrentTime() {
		System.out.println(LocalDateTime.now());
	}
	public static void simpleProgram() {
		List<Integer> listofthousand = get1000IntegerList();
		listofthousand.stream().forEach(System.out::println);
	}
	public static void paralleProgram() throws InterruptedException, ExecutionException {
		
		List<Integer> listofthousand = get1000IntegerList(); 
		ForkJoinPool pool = new ForkJoinPool(10);
		pool.submit(
				()->{
					listofthousand.parallelStream().forEach(System.out::println);
				}
		).get();
		
	}
	private static List<Integer> get1000IntegerList(){
		List<Integer> listofthousand = new ArrayList<Integer>();
		for(int i=0;i<1000;i++) listofthousand.add(i);
		return listofthousand;
	}
}
