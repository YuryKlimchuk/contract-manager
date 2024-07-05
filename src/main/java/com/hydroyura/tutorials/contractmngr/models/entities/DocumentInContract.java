package com.hydroyura.tutorials.contractmngr.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "documents_contacts")
public class DocumentInContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "document_order")
    private Integer documentOrder;

    @ManyToOne
    private Document document;

    @ManyToOne
    private Contract contract;


    public DocumentInContract() {}


    public Integer getId() {
        return id;
    }

    public DocumentInContract setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getDocumentOrder() {
        return documentOrder;
    }

    public DocumentInContract setDocumentOrder(Integer documentOrder) {
        this.documentOrder = documentOrder;
        return this;
    }

    public Document getDocument() {
        return document;
    }

    public DocumentInContract setDocument(Document document) {
        this.document = document;
        return this;
    }

    public Contract getContract() {
        return contract;
    }

    public DocumentInContract setContract(Contract contract) {
        this.contract = contract;
        return this;
    }
}
