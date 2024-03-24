package com.nosk.passwordmanagerservice.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
	private long id;
	private String serviceName;
	private String username;
	private String password;
	private String email;
	private Date modificationDate;
}
