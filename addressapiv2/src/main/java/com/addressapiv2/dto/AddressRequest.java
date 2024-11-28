package com.addressapiv2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class AddressRequest {
	
	private String street;
	private String city;
	private String state;
	private String zipcode;
}
