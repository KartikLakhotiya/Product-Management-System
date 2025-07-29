package com.boostmytool.beststore.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.apache.tomcat.util.descriptor.web.MultipartDef;
import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Brand name is required")
    private String brand;

    @NotEmpty(message = "Category is required")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 10, message = "The description must be at least 10 characters.")
    @Size(max = 200, message = "The description cannot exceed 200 characters.")
    private String description;

    private MultipartFile imageFile;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
