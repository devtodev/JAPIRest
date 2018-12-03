package com.m2m.api;

import com.m2m.dto.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceApi {
	
	
	@RequestMapping(value="/device", method=RequestMethod.GET)
	 public Device getById(){ 
	        return new Device(13l);
	 }
}
