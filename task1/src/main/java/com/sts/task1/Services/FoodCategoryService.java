package com.sts.task1.Services;

import java.util.List;
import java.util.Optional;

import com.sts.task1.Entities.FoodCategory;

public interface FoodCategoryService {
	// get all Food Categories
	public List<FoodCategory> getAllFoodCategories();

	// get Food Category by id
	public Optional<FoodCategory> getFoodCategoryById(long id);

	// save Food Category
	public void saveFoodCategory(FoodCategory foodCategory);

	// update Food Category
	public void updateFoodCategory(FoodCategory foodCategory, long id);

	// delete Food Category
	public void deleteFoodCategory(long id);
}
