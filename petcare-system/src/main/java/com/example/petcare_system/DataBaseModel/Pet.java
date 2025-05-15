package com.example.petcare_system.DataBaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pet_ID;

    @ManyToOne
    private Owner owner;

    private String pet_name;
    private String pet_breed;
    private String pet_birthdate;
    private String pet_gender;
    private Double pet_weight;
    private String pet_color;

    // Getters and Setters
    public Integer getPet_ID() {
        return pet_ID;
    }

    public void setPet_ID(Integer pet_ID) {
        this.pet_ID = pet_ID;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_breed() {
        return pet_breed;
    }

    public void setPet_breed(String pet_breed) {
        this.pet_breed = pet_breed;
    }

    public String getPet_birthdate() {
        return pet_birthdate;
    }

    public void setPet_birthdate(String pet_birthdate) {
        this.pet_birthdate = pet_birthdate;
    }

    public String getPet_gender() {
        return pet_gender;
    }

    public void setPet_gender(String pet_gender) {
        this.pet_gender = pet_gender;
    }

    public Double getPet_weight() {
        return pet_weight;
    }

    public void setPet_weight(Double pet_weight) {
        this.pet_weight = pet_weight;
    }

    public String getPet_color() {
        return pet_color;
    }

    public void setPet_color(String pet_color) {
        this.pet_color = pet_color;
    }
}