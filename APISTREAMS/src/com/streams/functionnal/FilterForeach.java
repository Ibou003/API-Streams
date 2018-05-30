package com.streams.functionnal;

import java.util.Arrays;
import java.util.List;

import javax.xml.stream.EventFilter;

public class FilterForeach {
	
	public static void main(String Args []){
		System.out.println("Exemple API Streams Java 8");
		
		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		System.out.println("Java 7 et moin");
		for (String name : names) {
			if(!name.equals("Sam")){
				System.out.println(name);
			}
		}
		
		System.out.println("Java 8 et plus");
		names.stream()
			.filter(FilterForeach::isNotSam)
			.forEach(System.out::println);	
	}
	 private static boolean isNotSam(String name) {
	        return !name.equals("Sam");
	    }

}
