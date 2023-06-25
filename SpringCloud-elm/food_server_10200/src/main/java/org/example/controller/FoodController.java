package org.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.example.po.Food;
import org.example.service.FoodService;
import org.example.po.CommonResult;
//@CrossOrigin("*")
@RestController
@RequestMapping("/FoodController")
@RefreshScope //开启动态刷新

public class FoodController {

	@Autowired
	private FoodService foodService;

	@GetMapping("/listFoodByBusinessId/{businessId}")
	public CommonResult<List> listFoodByBusinessId(@PathVariable("businessId") Integer businessId) throws Exception {
		List<Food> list = foodService.listFoodByBusinessId(businessId);
		return new CommonResult(200, "success(10200)", list);
	}
}
