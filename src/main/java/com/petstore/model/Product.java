package com.petstore.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @ManyToMany(mappedBy = "products")
    private List<PetStore> petStores;
}