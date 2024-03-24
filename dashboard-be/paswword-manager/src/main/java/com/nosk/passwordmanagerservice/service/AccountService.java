package com.nosk.passwordmanagerservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nosk.passwordmanagerservice.dto.AccountRequestPost;
import com.nosk.passwordmanagerservice.dto.AccountRequestPut;
import com.nosk.passwordmanagerservice.dto.AccountResponse;
import com.nosk.passwordmanagerservice.model.Account;
import com.nosk.passwordmanagerservice.repository.AccountRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AccountService {

	private final AccountRepository accountRepository;

	public List<AccountResponse> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map(this::mapToAccountResponse).toList();
	}

	private AccountResponse mapToAccountResponse(Account account) {
		return AccountResponse.builder().id(account.getId()).serviceName(account.getServiceName())
				.username(account.getUsername()).password(account.getPassword()).email(account.getEmail())
				.modificationDate(account.getModificationDate()).build();
	}

	public void createAccount(AccountRequestPost accountRequestPost) {
		Account account = Account.builder().serviceName(accountRequestPost.getServiceName())
				.username(accountRequestPost.getUsername()).password(accountRequestPost.getPassword())
				.email(accountRequestPost.getEmail()).modificationDate(new Date()).build();

		accountRepository.save(account);
		log.info("Account {} is saved correctly", account.getId());
	}

	public void editAccount(AccountRequestPut accountRequestPut) {
		Account account = Account.builder().id(accountRequestPut.getId())
				.serviceName(accountRequestPut.getServiceName()).username(accountRequestPut.getUsername())
				.password(accountRequestPut.getPassword()).email(accountRequestPut.getEmail())
				.modificationDate(new Date()).build();

		accountRepository.save(account);
		log.info("Account {} is updated correctly", account.getId());
	}
	
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);
		log.info("Account {} is deleted correctly", id);
	}
}
