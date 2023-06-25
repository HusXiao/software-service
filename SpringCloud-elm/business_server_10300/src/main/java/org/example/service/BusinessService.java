package org.example.service;

import java.util.List;

import org.example.po.Business;

public interface BusinessService {

	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

	public Business getBusinessById(Integer businessId);

}
