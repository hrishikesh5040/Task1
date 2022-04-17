package com.sts.task1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.task1.Entities.FoodProduct;
import com.sts.task1.Services.Impl.FoodProductServiceImpl;

@RestController
public class FoodProductController {
	@Autowired
	private FoodProductServiceImpl foodProductServiceImpl;

	@GetMapping("/api/products")
	private List<FoodProduct> getAllFoodProducts() {
		return foodProductServiceImpl.getAllFoodProducts();
	}

	@GetMapping("/api/products/{id}")
	private Optional<FoodProduct> getFoodProductById(@PathVariable("id") long id) {
		return foodProductServiceImpl.getFoodProductById(id);
	}

	@PostMapping("/api/products")
	private long saveFoodProduct(@RequestBody FoodProduct foodProduct) {
		foodProductServiceImpl.saveFoodProduct(foodProduct);
		return foodProduct.getId();
	}

	@PutMapping("/api/products/{id}")
	private FoodProduct updateFoodProduct(@RequestBody FoodProduct foodProduct) {
		foodProductServiceImpl.saveFoodProduct(foodProduct);
		return foodProduct;
	}

	@DeleteMapping("/api/products/{id}")
	private void deleteFoodProduct(@PathVariable("id") long id) {
		foodProductServiceImpl.deleteFoodProduct(id);
	}
}
