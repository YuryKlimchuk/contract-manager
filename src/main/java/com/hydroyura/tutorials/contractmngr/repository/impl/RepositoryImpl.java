package com.hydroyura.tutorials.contractmngr.repository.impl;

import com.hydroyura.tutorials.contractmngr.models.dto.ContractCreateDTO;
import com.hydroyura.tutorials.contractmngr.models.entities.Contract;
import com.hydroyura.tutorials.contractmngr.models.entities.Document;
import com.hydroyura.tutorials.contractmngr.repository.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Component
//@Transactional
public class RepositoryImpl implements Repository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public UUID createContract(ContractCreateDTO dto) {
        Contract c = new Contract();
        c.setClient(dto.getClient());
        em.persist(c);
        return c.getId();
    }

    @Override
    @Transactional
    public Document getDocument(UUID contractId) {
        String q = """
            SELECT * from documents
                INNER JOIN documents_contacts 
                    ON documents.id = documents_contacts.document_id
                WHERE contract_id = '%s';     
        """;

        String uuid = "997d7cfd-55de-4720-8cea-7d0a2ec12bd2";

        Query query = em.createNativeQuery(q.formatted(uuid.toString()));
        List res = query.getResultList();

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
