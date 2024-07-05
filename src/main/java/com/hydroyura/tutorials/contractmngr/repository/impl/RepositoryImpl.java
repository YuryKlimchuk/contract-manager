package com.hydroyura.tutorials.contractmngr.repository.impl;

import com.hydroyura.tutorials.contractmngr.models.entities.Contract;
import com.hydroyura.tutorials.contractmngr.models.entities.Document;
import com.hydroyura.tutorials.contractmngr.repository.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Transactional
public class RepositoryImpl implements Repository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createContract(Contract c) {
        em.persist(c);
    }

    @Override
    public Document getDocument(UUID contractId) {
        return null;
    }

    @Override
    public Boolean updateDocument(UUID documentId, String data) {
        return null;
    }

    @Override
    public Boolean completeDocument(UUID documentId) {
        return null;
    }
}
