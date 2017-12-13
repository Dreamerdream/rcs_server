package com.juphoon.rcsrunner.service.impl;

import com.juphoon.rcsrunner.entity.CaseProcess;
import com.juphoon.rcsrunner.mapper.CaseProcessMapper;
import com.juphoon.rcsrunner.service.ICaseProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/7.
 * @Description:
 */
@Service
public class CaseProcessServiceImpl implements ICaseProcessService {
    @Autowired
    private CaseProcessMapper caseProcessMapper;

    @Override
    public List<CaseProcess> findAll() {
        return caseProcessMapper.findAll();
    }

    @Override
    public List<CaseProcess> findByCaseId(String caseId) {
        return caseProcessMapper.findByCaseId(caseId);
    }
}
