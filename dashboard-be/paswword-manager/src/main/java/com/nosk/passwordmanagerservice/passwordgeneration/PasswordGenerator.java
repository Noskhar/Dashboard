package com.nosk.passwordmanagerservice.passwordgeneration;

import java.security.SecureRandom;
import java.util.List;

import com.nosk.passwordmanagerservice.enumerator.BasicSymbol;
import com.nosk.passwordmanagerservice.enumerator.Digit;
import com.nosk.passwordmanagerservice.enumerator.ExtendedSymbol;
import com.nosk.passwordmanagerservice.enumerator.LowerCaseLetter;
import com.nosk.passwordmanagerservice.enumerator.UpperCaseLetter;

public class PasswordGenerator {

	public static final Character[] BASIC_SYMBOLS = (Character[]) BasicSymbol.getAllCharacters().toArray();
	public static final Character[] DIGITS = (Character[]) Digit.getAllCharacters().toArray();
	public static final Character[] LOWERCASE = (Character[]) LowerCaseLetter.getAllCharacters().toArray();
	public static final Character[] UPPERCASE = (Character[]) UpperCaseLetter.getAllCharacters().toArray();
	public static final Character[] EXTENDED_SYMBOLS = (Character[]) ExtendedSymbol.getAllCharacters().toArray();

	public String generatePassword(List<Integer> charSelections, Integer passwordLength) {
		int size = charSelections.size();
		SecureRandom random = new SecureRandom();
		Integer[] selectionArray = (Integer[]) charSelections.toArray();
		String password = "";
		
		
		for (int i = 0; passwordLength.compareTo(i) > 0; i++) {
			int choice = selectionArray[random.nextInt(size)];
			Character character = null;
			switch (choice) {
				case 0:	// Basic Symbols
					character = BASIC_SYMBOLS[random.nextInt(BASIC_SYMBOLS.length)];
					break;
				case 1:	// Digits
					character = DIGITS[random.nextInt(DIGITS.length)];
					break;
				case 2:	// Lowercase Letters
					character = LOWERCASE[random.nextInt(LOWERCASE.length)];
					break;
				case 3: // Uppercase Letters
					character = UPPERCASE[random.nextInt(UPPERCASE.length)];
					break;
				case 4:	// Extended Symbols
					character = EXTENDED_SYMBOLS[random.nextInt(EXTENDED_SYMBOLS.length)];
					break;
			}
			password += character;
		}
		
		
		return password;
	}

}
