package com.streams.functionnal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapperExample {
    
	public static void main(String[] args) {
	List<User1> users = Arrays.asList(
            new User1("Peter", 20, Arrays.asList("1", "2")),
            new User1("Sam", 40, Arrays.asList("3", "4", "5")),
            new User1("Ryan", 60, Arrays.asList("6")),
            new User1("Adam", 70, Arrays.asList("7", "8"))
    );
	
    System.out.println("Functional Style: ");
    Optional<String> stringOptional = users.stream()
    										.map(user -> user.getPhoneNumbers().stream())
    										.flatMap(stringStream -> stringStream.filter(phonNum -> phonNum.equals("1")))
    										.findAny();
    
    stringOptional.ifPresent(System.out::println);
	
	}
	
    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
