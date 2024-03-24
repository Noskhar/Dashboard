package com.nosk.passwordmanagerservice.enumerator;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Digit {
	ZERO('0'),
	ONE('1'),
	TWO('2'),
	THREE('3'),
	FOUR('4'),
	FIVE('5'),
	SIX('6'),
	SEVEN('7'),
	EIGHT('8'),
	NINE('9');
	
	private Character character;

	public static List<Character> getAllCharacters() {
		return Arrays.asList(Digit.values()).stream().map(c -> c.getCharacter()).toList();
	}	
}
