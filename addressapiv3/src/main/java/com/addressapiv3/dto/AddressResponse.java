package com.addressapiv3.dto;

import com.addressapiv3.entity.AddressEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class AddressResponse {

	private Long id;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public AddressResponse(AddressEntity addressEntity) {
		this.id = addressEntity.getId();
		this.street = addressEntity.getStreet();
		this.city = addressEntity.getCity();
		this.state = addressEntity.getState();
		this.zipcode = addressEntity.getZipcode();
	}
}
