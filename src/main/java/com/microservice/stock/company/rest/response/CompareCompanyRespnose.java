package com.microservice.stock.company.rest.response;

import java.util.List;

public class CompareCompanyRespnose {
    private List<String> company1Data;
    private List<String> company2Data;

    public List<String> getCompany1Data() {
        return company1Data;
    }

    public void setCompany1Data(List<String> company1Data) {
        this.company1Data = company1Data;
    }

    public List<String> getCompany2Data() {
        return company2Data;
    }

    public void setCompany2Data(List<String> company2Data) {
        this.company2Data = company2Data;
    }
}
