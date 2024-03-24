package com.nosk.passwordmanagerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosk.passwordmanagerservice.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
