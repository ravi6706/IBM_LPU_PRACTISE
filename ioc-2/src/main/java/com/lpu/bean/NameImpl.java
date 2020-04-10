package com.lpu.bean;

import lombok.Setter;

@Setter
public class NameImpl implements Name {
	
	private Address address;

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return "Ravi";
	}
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return "Kumar";
	}
	@Override
	public String getAddressLine1() {
		// TODO Auto-generated method stub
		return address.getAddressLine1();
	}
	@Override
	public String getAddressLine2() {
		// TODO Auto-generated method stub
		return address.getAddressLine2();
	}

}
