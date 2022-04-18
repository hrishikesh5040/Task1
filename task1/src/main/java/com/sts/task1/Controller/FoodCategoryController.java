package com.sts.task1.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.task1.Entities.FoodCategory;
import com.sts.task1.Services.Impl.FoodCategoryServiceImpl;

@RestController
public class FoodCategoryController {
	@Autowired
	private FoodCategoryServiceImpl foodCategoryServiceImpl;

	@GetMapping("/api/categories/page={page}")
	private Page<FoodCategory> getAllFoodCategories(@PathVariable("page") int page) {
		return foodCategoryServiceImpl.getAllFoodCategories(page);
	}

	@GetMapping("/api/categories/{id}")
	private Optional<FoodCategory> getFoodCategoryById(@PathVariable("id") long id) {
		return foodCategoryServiceImpl.getFoodCategoryById(id);
	}

	@PostMapping("/api/categories")
	private long saveFoodCategory(@RequestBody FoodCategory foodCategory) {
		foodCategoryServiceImpl.saveFoodCategory(foodCategory);
		return foodCategory.getId();
	}

	@PutMapping("/api/categories/{id}")
	private FoodCategory updateFoodCategory(@RequestBody FoodCategory foodCategory) {
		foodCategoryServiceImpl.saveFoodCategory(foodCategory);
		return foodCategory;
	}

	@DeleteMapping("/api/categories/{id}")
	private void deleteFoodCategory(@PathVariable("id") long id) {
		foodCategoryServiceImpl.deleteFoodCategory(id);
	}
}
