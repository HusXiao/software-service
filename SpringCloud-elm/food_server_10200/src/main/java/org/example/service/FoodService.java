package org.example.service;
import java.util.List;
import org.example.po.Food;
public interface FoodService {
 public List<Food> listFoodByBusinessId(Integer businessId);
}