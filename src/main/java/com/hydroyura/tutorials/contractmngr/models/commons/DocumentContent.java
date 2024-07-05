package com.hydroyura.tutorials.contractmngr.models.commons;

public class DocumentContent {

    private String header;
    private String body;
    private String bottom;


    public DocumentContent() {}


    public String getHeader() {
        return header;
    }

    public DocumentContent setHeader(String header) {
        this.header = header;
        return this;
    }

    public String getBody() {
        return body;
    }

    public DocumentContent setBody(String body) {
        this.body = body;
        return this;
    }

    public String getBottom() {
        return bottom;
    }

    public DocumentContent setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }
}
