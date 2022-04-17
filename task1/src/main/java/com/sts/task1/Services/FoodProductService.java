package com.sts.task1.Services;

import java.util.List;
import java.util.Optional;

import com.sts.task1.Entities.FoodProduct;

public interface FoodProductService {
	// get all Food Products
	public List<FoodProduct> getAllFoodProducts();

	// get Food Product by id
	public Optional<FoodProduct> getFoodProductById(long id);

	// save Food Product
	public void saveFoodProduct(FoodProduct foodProduct);

	// update Food Product
	public void updateFoodProduct(FoodProduct foodProduct, long id);

	// delete Food Product
	public void deleteFoodProduct(long id);
}
