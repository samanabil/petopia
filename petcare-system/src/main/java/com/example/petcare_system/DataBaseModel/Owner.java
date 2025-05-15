package com.example.petcare_system.DataBaseModel;

//I Used the JPA imports
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "owners")  // This maps the class to the "owners" table in the database
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer owner_ID; // Field name matches the column in the database

    private String owner_name;
    private String owner_phone;
    private String owner_email;
    private String owner_address;
    private String owner_city;

    // Getters and Setters for all fields
    public Integer getOwner_ID() {
        return owner_ID;
    }

    public void setOwner_ID(Integer owner_ID) {
        this.owner_ID = owner_ID;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(String owner_phone) {
        this.owner_phone = owner_phone;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public String getOwner_city() {
        return owner_city;
    }

    public void setOwner_city(String owner_city) {
        this.owner_city = owner_city;
    }
}
