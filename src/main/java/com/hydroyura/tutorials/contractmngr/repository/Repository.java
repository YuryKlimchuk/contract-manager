package com.hydroyura.tutorials.contractmngr.repository;

import com.hydroyura.tutorials.contractmngr.models.dto.ContractCreateDTO;
import com.hydroyura.tutorials.contractmngr.models.entities.Document;

import java.util.UUID;

public interface Repository {

    UUID createContract(ContractCreateDTO dto);
    Document getDocument(UUID contractId);
    Boolean updateDocument(UUID documentId, String data);
    Boolean completeDocument(UUID documentId);

}
