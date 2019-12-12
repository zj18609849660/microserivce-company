package com.microservice.stock.company.rest;

import com.microservice.stock.company.model.Company;
import com.microservice.stock.company.model.IPODetail;
import com.microservice.stock.company.rest.request.CompareCompanyRequest;
import com.microservice.stock.company.rest.response.CompareCompanyRespnose;
import com.microservice.stock.company.service.CompanyService;
import com.microservice.stock.company.service.IPOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    IPOService ipoService;

    @PostMapping("/add")
    public Map<String, String> addNewCompany(@RequestBody Company company) {
        Map<String, String> resultMap = new HashMap<>();
        companyService.addNewCompany(company);
        resultMap.put("addCompanyStatus", "successful");
        return resultMap;
    }

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyService.retrieveAllCompany();
    }

    @PostMapping("/update")
    public Map<String, String> updateCompanyInfo(@RequestBody Company company) {
        Map<String, String> resultMap = new HashMap<>();
        companyService.updateCompanyInformation(company);
        resultMap.put("updateCompanyStatus", "successful");
        return resultMap;
    }

    @GetMapping("/ipo")
    public List<IPODetail> getAllIpo() {
        return ipoService.retrieveAllIpo();
    }

    @PostMapping("/ipo/add")
    public Map<String, String> addNewIpo(@RequestBody IPODetail ipoDetail) {
        Map<String, String> resultMap = new HashMap<>();
        ipoService.insertNewIpo(ipoDetail);
        resultMap.put("addIPOStatus", "successful");
        return resultMap;
    }

    @GetMapping("/search")
    public List<Company> searchCompany(String name){
        return companyService.getCompanyByName(name);
    }

    @PostMapping("/compare")
    public CompareCompanyRespnose compareCompany(@RequestBody CompareCompanyRequest request){
        return companyService.compareCompany(request);
    }
}
