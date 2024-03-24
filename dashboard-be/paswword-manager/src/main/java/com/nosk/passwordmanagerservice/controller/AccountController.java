package com.nosk.passwordmanagerservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nosk.passwordmanagerservice.dto.AccountRequestPost;
import com.nosk.passwordmanagerservice.dto.AccountRequestPut;
import com.nosk.passwordmanagerservice.dto.AccountResponse;
import com.nosk.passwordmanagerservice.service.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AccountController {

	private final AccountService accountService;
	
	@GetMapping("/accounts")
	@ResponseStatus(HttpStatus.OK)
	public List<AccountResponse> getAllAccounts() {
		return accountService.getAllAccounts();
	}
	
	@PostMapping("/accounts")
	@ResponseStatus(HttpStatus.CREATED)
	public void createAccount(@RequestBody AccountRequestPost accountRequestPost) {
		accountService.createAccount(accountRequestPost);
	}
	
	@PutMapping("/accounts")
	@ResponseStatus(HttpStatus.OK)
	public void editAccount(@RequestBody AccountRequestPut accountRequestPut) {
		accountService.editAccount(accountRequestPut);
	}
	
	@DeleteMapping("/accounts/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAccount(@PathVariable("id") Long id) {
		accountService.deleteAccount(id);
	}
}
