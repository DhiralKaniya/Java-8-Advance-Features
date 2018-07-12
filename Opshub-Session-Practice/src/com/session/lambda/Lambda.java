package com.session.lambda;

import java.util.Arrays;
import java.util.Comparator;

import com.session.utility.Person;

public class Lambda {

	public static void main(String[] args) {
		Person[] persons = new Person[] {
				new Person(1,"Test1",15),
				new Person(2,"Test2",10),
				new Person(3,"Test3",12)
		};			
	
		
		Arrays.sort(persons, (p1,p2)->p1.getAge()-p2.getAge());
		for (Person person : persons) {
			System.out.println(person);
		}
		
		    
	}
}
