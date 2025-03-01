package com.petstore.model;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private AnimalType type;

    @ManyToOne
    @JoinColumn(name = "petstore_id")
    private PetStore petStore;
}
