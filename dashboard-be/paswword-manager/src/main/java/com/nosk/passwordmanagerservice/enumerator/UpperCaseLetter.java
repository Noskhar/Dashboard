package com.nosk.passwordmanagerservice.enumerator;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UpperCaseLetter {
	A('A'),	B('B'),	C('C'),	D('D'),	E('E'),	F('F'), G('G'),	H('H'),	I('I'),	J('J'),	K('K'),	L('L'),	M('M'),	
	N('N'),	O('O'),	P('P'),	Q('Q'),	R('R'),	S('S'),	T('T'),	U('U'),	V('V'), W('W'), X('X'),	Y('Y'),	Z('Z');
	
	private Character character;

	public static List<Character> getAllCharacters() {
		return Arrays.asList(UpperCaseLetter.values()).stream().map(c -> c.getCharacter()).toList();
	}
	
}
