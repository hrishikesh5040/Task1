package com.sts.task1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.task1.Entities.FoodProduct;

@Repository
public interface FoodProductRepository extends JpaRepository<FoodProduct, Long> {
}
