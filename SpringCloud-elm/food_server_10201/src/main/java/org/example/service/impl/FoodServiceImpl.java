package org.example.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.mapper.FoodMapper;
import org.example.po.Food;
import org.example.service.FoodService;
@Service
public class FoodServiceImpl implements FoodService{
 
 
	@Autowired
	 private FoodMapper foodMapper;
	
	@Override
	 public List<Food> listFoodByBusinessId(Integer businessId) {
		return foodMapper.listFoodByBusinessId(businessId);
	}
	
}