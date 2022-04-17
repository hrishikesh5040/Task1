package com.sts.task1.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.task1.Entities.FoodCategory;
import com.sts.task1.Repositories.FoodCategoryRepository;
import com.sts.task1.Services.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
	@Autowired
	private FoodCategoryRepository foodCategoryRepository;

	@Override
	public List<FoodCategory> getAllFoodCategories() {
		return foodCategoryRepository.findAll();
	}

	@Override
	public Optional<FoodCategory> getFoodCategoryById(long id) {
		return foodCategoryRepository.findById(id);
	}

	@Override
	public void saveFoodCategory(FoodCategory foodCategory) {
		foodCategoryRepository.save(foodCategory);
	}

	@Override
	public void updateFoodCategory(FoodCategory foodCategory, long id) {
		foodCategoryRepository.save(foodCategory);
	}

	@Override
	public void deleteFoodCategory(long id) {
		foodCategoryRepository.deleteById(id);
	}
}
