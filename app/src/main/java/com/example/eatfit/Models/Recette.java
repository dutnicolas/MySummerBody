package com.example.eatfit.Models;

import android.media.Image;

import java.util.List;

public class Recette {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTpscuisson() {
        return tpscuisson;
    }

    public void setTpscuisson(int tpscuisson) {
        this.tpscuisson = tpscuisson;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    private List<String> ingredients;
    private int tpscuisson;//En minute
    private int calories;//Kcal
    private List<Image> images;
}
