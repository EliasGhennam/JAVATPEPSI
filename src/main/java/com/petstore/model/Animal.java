package com.petstore.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Fish.class, name = "FISH"),
        @JsonSubTypes.Type(value = Cat.class, name = "CAT")
})
@JsonIgnoreProperties({"petStore"})
@Getter
@Setter
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
