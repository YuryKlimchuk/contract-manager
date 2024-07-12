package com.hydroyura.tutorials.contractmngr.models.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String client;


    public Contract() {}


    public UUID getId() {
        return id;
    }

    public Contract setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getClient() {
        return client;
    }

    public Contract setClient(String client) {
        this.client = client;
        return this;
    }
}
