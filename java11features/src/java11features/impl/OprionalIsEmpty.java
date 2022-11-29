package java11features.impl;

import java.util.Optional;

public class OprionalIsEmpty {

	public static void main(String[] args) {
		
		Optional of = Optional.of("  ");
		of=of.empty();
		System.out.println(of.isEmpty());
	}
}
