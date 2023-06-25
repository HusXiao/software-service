package org.examp.service;



import org.examp.po.Business;

import java.util.List;

public interface BusinessService {

	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

	public Business getBusinessById(Integer businessId);

}
