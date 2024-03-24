package com.nosk.passwordmanagerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestPost {

	private String serviceName;
	private String username;
	private String password;
	private String email;
}
