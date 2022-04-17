package com.sts.task1.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.task1.Entities.FoodProduct;
import com.sts.task1.Repositories.FoodProductRepository;
import com.sts.task1.Services.FoodProductService;

@Service
public class FoodProductServiceImpl implements FoodProductService {
	@Autowired
	private FoodProductRepository foodProductRepository;

	@Override
	public List<FoodProduct> getAllFoodProducts() {
		return foodProductRepository.findAll();
	}

	@Override
	public Optional<FoodProduct> getFoodProductById(long id) {
		return foodProductRepository.findById(id);
	}

	@Override
	public void saveFoodProduct(FoodProduct foodProduct) {
		foodProductRepository.save(foodProduct);
	}

	@Override
	public void updateFoodProduct(FoodProduct foodProduct, long id) {
		foodProductRepository.save(foodProduct);
	}

	@Override
	public void deleteFoodProduct(long id) {
		foodProductRepository.deleteById(id);
	}
}
