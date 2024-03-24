package com.nosk.passwordmanagerservice.enumerator;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExtendedSymbol {
	FULLSTOP('.'),
	COMMA(','),
	COLON(':'),
	SEMICOLON(';'),
	EXCLAMATION_MARK('!'),
	QUESTION_MARK('?'),
	DOLLAR('$'),
	DASH('-'),
	UNDERSCORE('_'),
	FORWARD_SLASH('/'),
	BACKSLASH('\\'),
	OPEN_PARENTHESYS('('),
	CLOSED_PARENTHESYS(')'),
	OPEN_SQUARE_BRACKET('['),
	CLOSED_SQUARE_BRACKET(']'),
	OPEN_CURLY_BRACKET('{'),
	CLOSED_CURLY_BRACKET('}'),
	AT('@'),
	OCTOTHORPE('#'),
	PERCENT('%'),
	AMPERSAND('&'),
	ASTERISK('*'),
	EQUAL('='),
	PLUS('+'),
	PIPE('|');
	
	private Character character;

	public static List<Character> getAllCharacters() {
		return Arrays.asList(ExtendedSymbol.values()).stream().map(c -> c.getCharacter()).toList();
	}
	
}
