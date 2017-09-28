package com.isokaju.comparable;

public class Person implements Comparable<Person> {

	private String name;
	private int age;



	public Person(String name, int age){
		this.name= name;
		this.age=age;
		
	
	
		
	}
	
	
	
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
	return this.getName().length() < o.getName().length() ? 1:(this.getName().length()> o.getName().length() ? -1 :0);
	
	
	}
	
	
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
		
		
		
	}
	
	
	
	

}
