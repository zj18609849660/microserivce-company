package com.microservice.stock.company.rest.request;

public class CompareCompanyRequest {

    private String company1;
    private String company2;
    private String fromPeroid;
    private String toPeroid;

    public String getCompany1() {
        return company1;
    }

    public void setCompany1(String company1) {
        this.company1 = company1;
    }

    public String getCompany2() {
        return company2;
    }

    public void setCompany2(String company2) {
        this.company2 = company2;
    }

    public String getFromPeroid() {
        return fromPeroid;
    }

    public void setFromPeroid(String fromPeroid) {
        this.fromPeroid = fromPeroid;
    }

    public String getToPeroid() {
        return toPeroid;
    }

    public void setToPeroid(String toPeroid) {
        this.toPeroid = toPeroid;
    }
}
