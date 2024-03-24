package com.nosk.passwordmanagerservice.enumerator;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LowerCaseLetter {
	A('a'),	B('b'),	C('c'),	D('d'),	E('e'),	F('f'), G('g'),	H('h'),	I('i'),	J('j'),	K('k'),	L('l'),	M('m'),	
	N('n'),	O('o'),	P('p'),	Q('q'),	R('r'),	S('s'),	T('t'),	U('u'),	V('v'), W('w'), X('x'),	Y('y'),	Z('z');
	
	private Character character;

	public static List<Character> getAllCharacters() {
		return Arrays.asList(LowerCaseLetter.values()).stream().map(c -> c.getCharacter()).toList();
	}
	
}
