package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.example.feign.FoodFeignClient;
import org.example.po.Business;
import org.example.po.CommonResult;
import org.example.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RequestMapping("/BusinessController")
@RefreshScope //开启动态刷新
public class BusinessController {

	@Autowired
	private BusinessService businessService;

	@Qualifier("org.example.feign.FoodFeignClient")
	@Autowired
	private FoodFeignClient foodFeignClient;

	@GetMapping("/listBusinessByOrderTypeId/{orderTypeId}")
	public CommonResult<List> listBusinessByOrderTypeId(@PathVariable("orderTypeId") Integer orderTypeId)
			throws Exception {
		List<Business> list = businessService.listBusinessByOrderTypeId(orderTypeId);

		return new CommonResult(200, "success", list);
	}

	@GetMapping("/getBusinessById/{businessId}")
	public CommonResult<Business> getBusinessById(@PathVariable("businessId") Integer businessId)
			throws Exception {
		Business business = businessService.getBusinessById(businessId);
		// 在商家微服务中调用食品微服务
		CommonResult<List> result = foodFeignClient.listFoodByBusinessId(businessId);
		// 如果食品微服务返回降级响应，那么就返回空集合
		if (result.getCode() == 200) {
			business.setFoodList(result.getResult());
		} else {
			business.setFoodList(new ArrayList());
		}
		return new CommonResult(200, "success", business);
	}
}
