package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import org.example.java8.model.Person;

public class SumAndAverage {

	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		int sum = people.stream()
				.mapToInt(p -> p.getAge())
				.sum();

		System.out.println("Total of Ages: " + sum);

		OptionalDouble avg = people.stream()
				.mapToInt(p -> p.getAge())
				.average();

		if(avg.isPresent()){
			System.out.println("Average: " + avg.getAsDouble());
		}else{
			System.out.println("Average wasn't calculated");
		}
						
	}
	
}