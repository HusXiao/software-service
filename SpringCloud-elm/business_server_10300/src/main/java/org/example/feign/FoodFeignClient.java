package org.example.feign;

import org.example.po.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient注解的fallback属性指定熔断降级方法
@FeignClient(name = "food-server", fallback = FoodFeignClientCallBack.class)
public interface FoodFeignClient {
	@GetMapping("/FoodController/listFoodByBusinessId/{businessId}")
	public CommonResult listFoodByBusinessId(@PathVariable("businessId") Integer businessId);
}
