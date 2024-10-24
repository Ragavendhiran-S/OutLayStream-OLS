package com.outlaystream.expensetracker.service;


import com.outlaystream.expensetracker.model.Category;
import com.outlaystream.expensetracker.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Collection<Category> allCategories() {
        return categoryRepository.findAll();
    }

    public ResponseEntity<Category> get(Long id) {
        return categoryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    public ResponseEntity<Category> create(Category category) throws URISyntaxException {
        Category result = categoryRepository.save(category);
        URI location = new URI("/api/v1/categories/" + result.getId());
        return ResponseEntity.created(location).body(result);
    }

    public ResponseEntity<Category> update(Long id, Category category) {
        if (!categoryRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        category.setId(id); // Set the ID of the category to be updated
        Category updatedCategory = categoryRepository.save(category);
        return ResponseEntity.ok(updatedCategory);
    }

    public ResponseEntity<Void> delete(Long id) {
        if (!categoryRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        categoryRepository.deleteById(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}
