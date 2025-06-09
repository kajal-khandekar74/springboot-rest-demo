package com.thinkconstructor.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructor.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService 
{	
	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) 
	{
		return  cloudVendor;
		//  new CloudVendor("c1","Vendor 1",
		//  "Address one","xxxx");
	}
	
	@PostMapping
	public String createCloudvendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully"; 
	}
	
	@PutMapping
	public String updateCloudvendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor updated Successfully"; 
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudvendorDetails(String vendorId)
	{
		this.cloudVendor = null;
		return "Cloud Vendor Deleted Successfully"; 
	}
	
}
