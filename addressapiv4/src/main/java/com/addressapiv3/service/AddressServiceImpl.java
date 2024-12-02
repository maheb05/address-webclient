package com.addressapiv3.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressapiv3.dto.AddressRequest;
import com.addressapiv3.dto.AddressResponse;
import com.addressapiv3.entity.AddressEntity;
import com.addressapiv3.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AdderessService {
	
	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);
	
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
		logger.info("At Get Address By Id");
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
