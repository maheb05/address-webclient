package com.addressapiv1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressapiv1.dto.AddressRequest;
import com.addressapiv1.dto.AddressResponse;
import com.addressapiv1.entity.AddressEntity;
import com.addressapiv1.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AdderessService {

	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public AddressResponse saveAddress(AddressRequest addressRequest) {
		
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setStreet(addressRequest.getStreet());
		addressEntity.setCity(addressRequest.getCity());
		addressEntity.setState(addressRequest.getState());
		addressEntity.setZipcode(addressRequest.getZipcode());
		
		addressRepository.save(addressEntity);
		
		return new AddressResponse(addressEntity);
	}

	@Override
	public AddressResponse getAddressById(Long id) {
		
		AddressEntity addressResponse = addressRepository.findById(id).get();
		return new AddressResponse(addressResponse);
	}

	@Override
	public List<AddressResponse> getAllAddress() {
		return addressRepository.findAll()
				.stream()
				.map(AddressResponse::new)
				.collect(Collectors.toList());
	}
	
}
