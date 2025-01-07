package com.ecommerce.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.ecommerce.service.Product;
import com.ecommerce.service.ProductService;

class ProductServiceTest {

    ProductService productService;

    @BeforeEach
    void setup() {
        productService = new ProductService();
    }

    @Test
    @DisplayName("Test adding a product")
    void testAddProduct() {
        Product product = new Product("Laptop", 1000.00, 2);
        productService.addProduct(product);

        assertEquals(1, productService.getProducts().size(), "Product list size should be 1");
        assertEquals("Laptop", productService.getProducts().get(0).getName(), "Product name should be 'Laptop'");
    }

    @Test
    @DisplayName("Test retrieving a product by name")
    void testGetProductByName() {
        Product product = new Product("Laptop", 1000.00, 2);
        productService.addProduct(product);

        Product retrievedProduct = productService.getProductByName("Laptop");
        assertNotNull(retrievedProduct, "Retrieved product should not be null");
        assertEquals("Laptop", retrievedProduct.getName(), "Product name should match");
    }

    @Test
    @DisplayName("Test exception when product is not found")
    void testGetProductByNameNotFound() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> productService.getProductByName("Tablet"));

        assertEquals("Product not found", exception.getMessage(), "Exception message should match");
    }

    @Test
    @DisplayName("Test total cost calculation")
    void testCalculateTotalCost() {
        productService.addProduct(new Product("Laptop", 1000.00, 2));
        productService.addProduct(new Product("Mouse", 50.00, 3));

        double totalCost = productService.calculateTotalCost();
        assertEquals(2150.00, totalCost, "Total cost should be 2150.00");
    }

    @ParameterizedTest
    @CsvSource({
        "Laptop, 1000.00, 2",
        "Mouse, 50.00, 3",
        "Keyboard, 70.00, 1"
    })
    @DisplayName("Test adding multiple products using parameterized test")
    void testAddMultipleProducts(String name, double price, int quantity) {
        Product product = new Product(name, price, quantity);
        productService.addProduct(product);

        Product retrievedProduct = productService.getProductByName(name);
        assertNotNull(retrievedProduct, "Retrieved product should not be null");
        assertEquals(name, retrievedProduct.getName(), "Product name should match");
        assertEquals(price, retrievedProduct.getPrice(), "Product price should match");
        assertEquals(quantity, retrievedProduct.getQuantity(), "Product quantity should match");
    }
}
