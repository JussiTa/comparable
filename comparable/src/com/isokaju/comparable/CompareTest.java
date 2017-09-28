package com.isokaju.comparable;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class CompareTest implements Comparator<Person> {
	
	public CompareTest(){
		persons.add(new Person("Jussi",40));
		persons.add(new Person("Anu",39));
		persons.add(new Person ("Jenny",5));
		
		
		
	}
	
	private ArrayList<Person> persons = new ArrayList<Person>(); 

	public static void main(String[] args) {
		
		CompareTest test = new CompareTest();
		
		
		
		Collections.sort(test.persons, test);
		System.out.println("Sorting OrderByName");
		
		for(Person p: test.persons){
			
			System.out.println("Name: "+ p.getName()+" age: "+ p.getAge());
		}
		OrderByAge oba = new OrderByAge();
		
		Collections.sort(test.persons, oba);
		System.out.println("Sorting OrderByAge");
		
			for(Person p: test.persons){
			
			    System.out.println("Name: "+ p.getName()+" age: "+ p.getAge());
		}
		
		Collections.sort(test.persons);
		System.out.println("Natural sorting");

		for(Person p: test.persons){
		
		    System.out.println("Name: "+ p.getName()+" age: "+ p.getAge());
	}
		
		
		
		
			
		
		
	}

	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
