package com.example.mongorest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {

    @Id
//	@ToString.Exclude
    private String id;

    private String firstName;
    private String lastName;

}
