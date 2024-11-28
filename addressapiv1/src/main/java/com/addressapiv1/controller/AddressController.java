package com.addressapiv1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressapiv1.dto.AddressRequest;
import com.addressapiv1.dto.AddressResponse;
import com.addressapiv1.service.AdderessService;

@RestController
@RequestMapping("/address/api")
@CrossOrigin(origins = "http://localhost:8080")
public class AddressController {
	
	
	@Autowired
	AdderessService adderessService;
	
	@PostMapping("/saveadress")
	public AddressResponse saveAddress(@RequestBody AddressRequest addressRequest) {
		
		return adderessService.saveAddress(addressRequest);
	}
	
	@GetMapping("/getaddress/{id}")
	public AddressResponse getAddressById(@PathVariable Long id) {
		return adderessService.getAddressById(id);
	}
	
	@GetMapping("/all")
	public List<AddressResponse> getAllAddress(){
		return adderessService.getAllAddress();
	}
	
}
