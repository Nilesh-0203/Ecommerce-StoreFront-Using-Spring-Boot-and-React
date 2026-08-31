package com.nk.productcatalog.config;

import com.nk.productcatalog.model.Category;
import com.nk.productcatalog.model.Product;
import com.nk.productcatalog.repository.CategoryRepository;
import com.nk.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(
            ProductRepository productRepository,
            CategoryRepository categoryRepository) {

        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Clear existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // ============================
        // Create Categories
        // ============================

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(
                Arrays.asList(electronics, clothing, home)
        );

        // ============================
        // Electronics Products
        // ============================

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription(
                "Latest model smartphone with amazing features and powerful performance."
        );
        phone.setImageUrl(
                "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9"
        );
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription(
                "High-performance laptop suitable for work, study and entertainment."
        );
        laptop.setImageUrl(
                "https://images.unsplash.com/photo-1496181133206-80ce9b88a853"
        );
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription(
                "Premium wireless headphones with excellent sound quality."
        );
        headphones.setImageUrl(
                "https://images.unsplash.com/photo-1505740420928-5e560c06d30e"
        );
        headphones.setPrice(149.99);
        headphones.setCategory(electronics);

        Product smartwatch = new Product();
        smartwatch.setName("Smart Watch");
        smartwatch.setDescription(
                "Modern smartwatch with fitness tracking and notifications."
        );
        smartwatch.setImageUrl(
                "https://images.unsplash.com/photo-1523275335684-37898b6baf30"
        );
        smartwatch.setPrice(199.99);
        smartwatch.setCategory(electronics);

        Product camera = new Product();
        camera.setName("Digital Camera");
        camera.setDescription(
                "Professional digital camera for capturing high-quality photos."
        );
        camera.setImageUrl(
                "https://images.unsplash.com/photo-1516035069371-29a1b244cc32"
        );
        camera.setPrice(799.99);
        camera.setCategory(electronics);

        // ============================
        // Clothing Products
        // ============================

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription(
                "Warm and comfortable winter jacket suitable for cold weather."
        );
        jacket.setImageUrl(
                "https://images.unsplash.com/photo-1551028719-00167b16eac5"
        );
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product tshirt = new Product();
        tshirt.setName("Classic T-Shirt");
        tshirt.setDescription(
                "Comfortable cotton t-shirt perfect for everyday wear."
        );
        tshirt.setImageUrl(
                "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
        );
        tshirt.setPrice(29.99);
        tshirt.setCategory(clothing);

        Product jeans = new Product();
        jeans.setName("Denim Jeans");
        jeans.setDescription(
                "Classic denim jeans with a comfortable modern fit."
        );
        jeans.setImageUrl(
                "https://images.unsplash.com/photo-1542272604-787c3835535d"
        );
        jeans.setPrice(59.99);
        jeans.setCategory(clothing);

        Product sneakers = new Product();
        sneakers.setName("Running Sneakers");
        sneakers.setDescription(
                "Lightweight running sneakers designed for comfort and performance."
        );
        sneakers.setImageUrl(
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff"
        );
        sneakers.setPrice(89.99);
        sneakers.setCategory(clothing);

        Product hoodie = new Product();
        hoodie.setName("Cotton Hoodie");
        hoodie.setDescription(
                "Soft cotton hoodie perfect for casual and outdoor activities."
        );
        hoodie.setImageUrl(
                "https://images.unsplash.com/photo-1556821840-3a63f95609a7"
        );
        hoodie.setPrice(49.99);
        hoodie.setCategory(clothing);

        // ============================
        // Home & Kitchen Products
        // ============================

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription(
                "High-speed blender for smoothies, juices and food preparation."
        );
        blender.setImageUrl(
                "https://images.unsplash.com/photo-1570222094114-d054a817e56b"
        );
        blender.setPrice(89.99);
        blender.setCategory(home);

        Product coffeeMaker = new Product();
        coffeeMaker.setName("Coffee Maker");
        coffeeMaker.setDescription(
                "Automatic coffee maker for preparing fresh coffee at home."
        );
        coffeeMaker.setImageUrl(
                "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085"
        );
        coffeeMaker.setPrice(119.99);
        coffeeMaker.setCategory(home);

        Product chair = new Product();
        chair.setName("Modern Chair");
        chair.setDescription(
                "Modern comfortable chair designed for home and office use."
        );
        chair.setImageUrl(
                "https://images.unsplash.com/photo-1503602642458-232111445657"
        );
        chair.setPrice(159.99);
        chair.setCategory(home);

        Product lamp = new Product();
        lamp.setName("Table Lamp");
        lamp.setDescription(
                "Elegant table lamp that adds warm lighting to your room."
        );
        lamp.setImageUrl(
                "https://images.unsplash.com/photo-1507473885765-e6ed057f782c"
        );
        lamp.setPrice(69.99);
        lamp.setCategory(home);

        Product cookware = new Product();
        cookware.setName("Cookware Set");
        cookware.setDescription(
                "Premium cookware set for everyday cooking."
        );
        cookware.setImageUrl(
                "https://images.unsplash.com/photo-1556911220-bff31c812dba"
        );
        cookware.setPrice(199.99);
        cookware.setCategory(home);

        // ============================
        // Save All Products
        // ============================

        productRepository.saveAll(
                Arrays.asList(
                        phone,
                        laptop,
                        headphones,
                        smartwatch,
                        camera,

                        jacket,
                        tshirt,
                        jeans,
                        sneakers,
                        hoodie,

                        blender,
                        coffeeMaker,
                        chair,
                        lamp,
                        cookware
                )
        );

        System.out.println("======================================");
        System.out.println("Product Catalog Data Seeded Successfully!");
        System.out.println("Categories: 3");
        System.out.println("Products: 15");
        System.out.println("======================================");
    }
}