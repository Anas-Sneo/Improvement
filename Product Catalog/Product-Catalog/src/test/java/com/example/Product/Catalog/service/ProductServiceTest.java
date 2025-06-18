package com.example.Product.Catalog.service;

import com.example.Product.Catalog.model.Product;
import com.example.Product.Catalog.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService service;

    public ProductServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveProduct() {
        Product product = new Product();
        product.setName("Test");
        when(repository.save(any(Product.class))).thenReturn(product);
        Product saved = service.saveProduct(product);
        assertEquals("Test", saved.getName());
    }

    @Test
    void testGetAllProducts() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        assertTrue(service.getAllProducts().isEmpty());
    }

    @Test
    void testDeleteProduct() {
        doNothing().when(repository).deleteById(1L);
        service.deleteProduct(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    void testGetProductById() {
        Product p = new Product(); p.setId(1L);
        when(repository.findById(1L)).thenReturn(Optional.of(p));
        assertNotNull(service.getProductById(1L));
    }
}
