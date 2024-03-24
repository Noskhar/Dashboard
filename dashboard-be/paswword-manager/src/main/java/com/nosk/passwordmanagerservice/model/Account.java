package com.nosk.passwordmanagerservice.model;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	@Id
	@GeneratedValue(generator = "sequence-generator")
	@GenericGenerator(name = "sequence-generator", type = org.hibernate.id.enhanced.SequenceStyleGenerator.class, parameters = {
			@Parameter(name = "sequence_name", value = "account_sequence"),
			@Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1") })
	private long id;
	private String serviceName;
	private String username;
	private String password;
	private String email;
	private Date modificationDate;
}
