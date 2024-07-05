DROP TABLE IF EXISTS contracts;
CREATE TABLE contracts(
    id                  UUID            NOT NULL        PRIMARY KEY,
    client              VARCHAR(100)    NOT NULL
);

DROP TABLE IF EXISTS documents;
CREATE TABLE documents(
    id                  UUID            NOT NULL        PRIMARY KEY,
    type                VARCHAR(50)     NOT NULL,
    data                TEXT,
    status              VARCHAR(50)     NOT NULL
);

DROP TABLE IF EXISTS documents_contacts;
CREATE TABLE documents_contacts(
    id                  SERIAL          NOT NULL        PRIMARY KEY,
    contract_id         UUID            NOT NULL,
    document_id         UUID            NOT NULL,
    document_order      SERIAL          NOT NULL,

    CONSTRAINT fk_contact
        FOREIGN KEY (contract_id)
        REFERENCES contracts(id),

    CONSTRAINT fk_document
        FOREIGN KEY (document_id)
        REFERENCES documents(id)
);