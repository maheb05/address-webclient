package com.addressapiv3.service;

import java.util.List;

import com.addressapiv3.dto.AddressRequest;
import com.addressapiv3.dto.AddressResponse;

public interface AdderessService {
	
	public AddressResponse saveAddress(AddressRequest addressRequest);
	public AddressResponse getAddressById(Long id);
	public List<AddressResponse> getAllAddress();
}
