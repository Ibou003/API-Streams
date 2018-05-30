package com.streams.functionnal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
	public static void main(String Args[]) {
		System.out.println("Exemple API Streams Java 8");

		List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
		System.out.println("Java 7 et moin");
		for (String name : names) {
			if (!name.equals("Sam")) {
				User user = new User(name);
				System.out.println(user.toString());
			}
		}

		System.out.println("Java 8 et plus");
		names.stream().filter(MapperExample::isNotSam)
						.map(User::new)
				.forEach(System.out::println);
		
		List<User> userList = names.stream().filter(MapperExample::isNotSam)
				.map(User::new)
		.collect(Collectors.toList());
		
		System.out.println(userList);
	}

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}

}
