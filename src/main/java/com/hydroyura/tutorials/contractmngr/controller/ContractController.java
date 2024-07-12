package com.hydroyura.tutorials.contractmngr.controller;

import com.hydroyura.tutorials.contractmngr.models.dto.ContractCreateDTO;
import com.hydroyura.tutorials.contractmngr.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
public class ContractController {


    @Autowired
    private Repository repository;



    @RequestMapping
    public String create() {
        Random random = new Random();
        ContractCreateDTO dto = new ContractCreateDTO()
                .setClient("CLIENT_ID_" + random.nextInt(5000) + "__" + random.nextInt(50000));
        UUID id = repository.createContract(dto);

        return "NEW CONTRACT ID = "  + id;
    }

    @RequestMapping("/document")
    public String getDocument() {
        repository.getDocument(UUID.randomUUID());
        return "!!!!";
    }



}
