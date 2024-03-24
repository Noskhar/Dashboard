package com.nosk.passwordmanagerservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasswordGeneratorRequest {

	private List<Integer> charSelections;
	private Integer passwordLength;
}
