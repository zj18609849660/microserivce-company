package com.microservice.stock.company.service;

import com.microservice.stock.company.dao.IPORepository;
import com.microservice.stock.company.entity.IPODetailEntity;
import com.microservice.stock.company.model.IPODetail;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class IPOService {
    @Autowired
    IPORepository ipoRepository;

    @Transactional
    public List<IPODetail> retrieveAllIpo() {
        List<IPODetail> ipos = new ArrayList<>();
        List<IPODetailEntity> ipoList = ipoRepository.findAllByOrderByOpenDate();
        if (CollectionUtils.isNotEmpty(ipoList)) {
            ipoList.forEach(ipoItem -> {
                IPODetail ipoObj = new IPODetail();
                BeanUtils.copyProperties(ipoItem, ipoObj);
                ipos.add(ipoObj);
            });
        }
        return ipos;
    }

    @Transactional
    public void insertNewIpo(IPODetail ipoDetail){
        IPODetailEntity ipoDetailEntity = new IPODetailEntity();
        BeanUtils.copyProperties(ipoDetail,ipoDetailEntity);
        ipoRepository.saveAndFlush(ipoDetailEntity);
    }
}
