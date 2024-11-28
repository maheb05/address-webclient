package com.addressapiv2.service;

import java.util.List;

import com.addressapiv2.dto.AddressRequest;
import com.addressapiv2.dto.AddressResponse;

public interface AdderessService {
	
	public AddressResponse saveAddress(AddressRequest addressRequest);
	public AddressResponse getAddressById(Long id);
	public List<AddressResponse> getAllAddress();
}
