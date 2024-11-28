package com.addressapiv1.service;

import java.util.List;

import com.addressapiv1.dto.AddressRequest;
import com.addressapiv1.dto.AddressResponse;

public interface AdderessService {
	
	public AddressResponse saveAddress(AddressRequest addressRequest);
	public AddressResponse getAddressById(Long id);
	public List<AddressResponse> getAllAddress();
	
}
