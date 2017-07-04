package com.spring.example.prototypeBeanInSingletonBean;


public class RequestProcessor {

    private RequestValidator validator;

    public void handleRequest(String requestId) {
        validator.validate(requestId);
        // Process the request and update
    }

    public RequestValidator getValidator() {
        System.out.println(" *** getValidator() called *** ");
        return validator;
    }

    public void setValidator(RequestValidator validator) {
        this.validator = validator;
    }

    @Override
    public String toString() {
        return "RequestProcessor{" +
                "validator=" + validator +
                '}';
    }
}
