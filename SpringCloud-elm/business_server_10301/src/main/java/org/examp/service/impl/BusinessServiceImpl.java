package org.examp.service.impl;

import org.examp.mapper.BusinessMapper;
import org.examp.po.Business;
import org.examp.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BusinessServiceImpl implements BusinessService {


	@Autowired
	private BusinessMapper businessMapper;


	@Override
	public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
	    return businessMapper.listBusinessByOrderTypeId(orderTypeId);
	}

	@Override
	public Business getBusinessById(Integer businessId) {
		return businessMapper.getBusinessById(businessId);
	}

}
