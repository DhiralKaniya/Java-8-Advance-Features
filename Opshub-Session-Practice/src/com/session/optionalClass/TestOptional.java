package com.session.optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.session.utility.Person;

public class TestOptional {
	static List<Person> persons = Arrays.asList( 
			new Person(1, "test1",10),
			new Person(2, "test2",20),
			new Person(3, "test1",30)
			);
	
	public static Optional<Person> findPersonById(int id){
		for (Person person : persons) {
			if(person.getId() == id)
				return Optional.of(person);
		}
		return Optional.empty();
	}
	public static void main(String[] args) {
		Optional<Person> person1 = findPersonById(1);
		Optional<Person> person5  = findPersonById(5);
		
		
		System.out.println("Person 1 present : " + person1.isPresent());
		System.out.println("Person 5 present : " + person5.isPresent());
		
		person1.ifPresent(TestOptional::printPerson);
		
		person5.ifPresent(TestOptional::printPerson);
		Person p = person5.orElse(new Person(5,"Default Person",30));
		System.out.println(p);
		
	}
	public static void printPerson(Person p) {
		System.out.println(p);
	}
	public static void personNotFounded() {
		System.out.println("Person not founded");
	}
}
