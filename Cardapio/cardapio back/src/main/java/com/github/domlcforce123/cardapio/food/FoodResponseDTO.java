package com.github.domlcforce123.cardapio.food;

public record FoodResponseDTO(Long id, String tittle, String image, Integer price) {

    public  FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());

    }
}
