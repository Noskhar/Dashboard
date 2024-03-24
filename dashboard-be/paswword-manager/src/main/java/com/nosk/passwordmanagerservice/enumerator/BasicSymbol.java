package com.nosk.passwordmanagerservice.enumerator;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BasicSymbol {
	FULLSTOP('.'),
	COMMA(','),
	COLON(':'),
	SEMICOLON(';'),
	EXCLAMATION_MARK('!'),
	QUESTION_MARK('?'),
	DOLLAR('$'),
	DASH('-'),
	UNDERSCORE('_');
	
	private Character character;

	public static List<Character> getAllCharacters() {
		return Arrays.asList(BasicSymbol.values()).stream().map(c -> c.getCharacter()).toList();
	}

}
