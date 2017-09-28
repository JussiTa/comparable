package com.isokaju.comparable;

import java.util.Comparator;

public class OrderByAge implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		 return o1.getAge() < o2.getAge() ? 1 : (o1.getAge() > o2.getAge() ? -1 : 0);

		 

	}

}
