package com.aptech.ebookstore.model;

import java.util.List;

public class Category {
    private int id;
    private String name;
    private String description;
    private List<SubCategory> subCategories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public Category(int id, String name, String description, List<SubCategory> subCategories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.subCategories = subCategories;
    }

    public Category() {
    }
}