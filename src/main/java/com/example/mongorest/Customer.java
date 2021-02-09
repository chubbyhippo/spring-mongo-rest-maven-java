package com.example.mongorest;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {
	
	@Id
	@ToString.Exclude
	private String id;
	
	private String firstName;
	private String lastName;

}
