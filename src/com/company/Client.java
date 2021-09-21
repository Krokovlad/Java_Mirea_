package com.company;

public class Client extends AbstractPerson {

    String service;
    double price;

    public Client(String name, String service, double price) {
        super(name);
        this.service = service;
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String think() {
        return null;
    }
}
