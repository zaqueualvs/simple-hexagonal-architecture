package com.alves.backproduto.domain.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ProductPage {
    private List<Product> products = new ArrayList<>();
    private Long totalElements;
    private Integer totalPages;

    public ProductPage() {
    }

    public ProductPage(List<Product> products, Long totalElements, Integer totalPages) {
        this.products = products;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
