package com.session.methodInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.session.utility.Person;

public class TestProgram {
	
	
	public static void main(String[] args) {
		
		Person[] persons =new Person[] {
				new Person(1,"Test1",20),
				new Person(2,"Test10",10),
				new Person(3,"Test3",30)
		};
		
		//static method as a reference 
		Arrays.sort(persons, Person::compareByAge);
		printPerson(persons);
		
		//instance method reference 
		TestProgram tp = new TestProgram(); 
		Arrays.sort(persons, tp::compareByName);
		printPerson(persons);
		
		
		//constructor reference
		PersonInterface person = Person::new;
		person.getPerson(10,"Test",30);
	}
	public int compareByName(Person p1, Person p2) {
		return p2.getName().compareTo(p1.getName());
	}
	public static void printPerson(Person[] person) {
		for (Person person2 : person) {
			System.out.println(person2);
		}
	}
}
