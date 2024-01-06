package com.github.domlcforce123.cardapio;

import com.github.domlcforce123.cardapio.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
