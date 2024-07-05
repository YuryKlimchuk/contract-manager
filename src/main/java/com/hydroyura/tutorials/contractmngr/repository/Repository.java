package com.hydroyura.tutorials.contractmngr.repository;

import com.hydroyura.tutorials.contractmngr.models.entities.Contract;
import com.hydroyura.tutorials.contractmngr.models.entities.Document;

import java.util.UUID;

public interface Repository {

    void createContract(Contract c);
    Document getDocument(UUID contractId);
    Boolean updateDocument(UUID documentId, String data);
    Boolean completeDocument(UUID documentId);

}
