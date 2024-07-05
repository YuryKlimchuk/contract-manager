package com.hydroyura.tutorials.contractmngr.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "documents")
public class Document {

    @Id
    private UUID id;

    private String type;
    private String data;
    private String status;


    public Document() {}


    public UUID getId() {
        return id;
    }

    public Document setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Document setType(String type) {
        this.type = type;
        return this;
    }

    public String getData() {
        return data;
    }

    public Document setData(String data) {
        this.data = data;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Document setStatus(String status) {
        this.status = status;
        return this;
    }
}
