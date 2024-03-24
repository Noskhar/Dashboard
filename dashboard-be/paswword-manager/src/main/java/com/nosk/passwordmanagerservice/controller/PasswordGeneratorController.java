package com.nosk.passwordmanagerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nosk.passwordmanagerservice.dto.PasswordGeneratorRequest;
import com.nosk.passwordmanagerservice.passwordgeneration.PasswordGenerator;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PasswordGeneratorController {

	private final PasswordGenerator passwordGenerator;

	@PostMapping("/passwordGenerator")
	@ResponseStatus(HttpStatus.OK)
	public String generatePassword(@RequestBody PasswordGeneratorRequest passwordGeneratorRequest) {
		return passwordGenerator.generatePassword(passwordGeneratorRequest.getCharSelections(),
				passwordGeneratorRequest.getPasswordLength());
	}

}
